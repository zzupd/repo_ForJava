package pkg;

public class Main {

	public static void main(String[] args) {
		
		Ref ref = new Ref();
		System.out.println(ref.mtd());
		System.out.println("OK!!");

	}
	
	public static void mtd() {
		System.out.println("메서드입니다.");
	}

}
