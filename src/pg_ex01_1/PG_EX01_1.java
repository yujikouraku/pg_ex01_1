/*  PG基礎 課題1
 *  2017/08/01
 */
package pg_ex01_1;

public class PG_EX01_1 {

	public static void main(String[] args) {
		// 変数定義
		int count;
		// 初期値
		count=0;
		// 処理開始
		for (int i = 0;i < 100;i++){
			count++;
			if (count % 12 == 0){
				System.out.printf("◆" + " ");
			}else if(count % 3 == 0){
				System.out.printf("△" + " ");
			}else if(count % 4 == 0){
				System.out.printf("□" + " ");
			}else{
				System.out.print(count  + " ");
			}
		}
	}
}
