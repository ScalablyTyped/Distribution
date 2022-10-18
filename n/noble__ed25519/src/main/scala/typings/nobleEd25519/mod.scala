package typings.nobleEd25519

import typings.nobleEd25519.anon.Head
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@noble/ed25519", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<{  a :bigint,   d :bigint,   P :bigint,   l :bigint,   n :bigint,   h :bigint,   Gx :bigint,   Gy :bigint}> */
  object CURVE {
    
    @JSImport("@noble/ed25519", "CURVE.Gx")
    @js.native
    val Gx: js.BigInt = js.native
    
    @JSImport("@noble/ed25519", "CURVE.Gy")
    @js.native
    val Gy: js.BigInt = js.native
    
    @JSImport("@noble/ed25519", "CURVE.P")
    @js.native
    val P: js.BigInt = js.native
    
    @JSImport("@noble/ed25519", "CURVE.a")
    @js.native
    val a: js.BigInt = js.native
    
    @JSImport("@noble/ed25519", "CURVE.d")
    @js.native
    val d: js.BigInt = js.native
    
    @JSImport("@noble/ed25519", "CURVE.h")
    @js.native
    val h: js.BigInt = js.native
    
    @JSImport("@noble/ed25519", "CURVE.l")
    @js.native
    val l: js.BigInt = js.native
    
    @JSImport("@noble/ed25519", "CURVE.n")
    @js.native
    val n: js.BigInt = js.native
  }
  
  object curve25519 {
    
    @JSImport("@noble/ed25519", "curve25519")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/ed25519", "curve25519.BASE_POINT_U")
    @js.native
    def BASE_POINT_U: String = js.native
    inline def BASE_POINT_U_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE_POINT_U")(x.asInstanceOf[js.Any])
    
    inline def scalarMult(privateKey: Hex, publicKey: Hex): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarMult")(privateKey.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def scalarMultBase(privateKey: Hex): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("scalarMultBase")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  }
  
  inline def getPublicKey(privateKey: PrivKey): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def getSharedSecret(privateKey: PrivKey, publicKey: Hex): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSharedSecret")(privateKey.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def sign(message: Hex, privateKey: Hex): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  object sync {
    
    @JSImport("@noble/ed25519", "sync")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/ed25519", "sync.getExtendedPublicKey")
    @js.native
    def getExtendedPublicKey: js.Function1[/* key */ PrivKey, Head] = js.native
    inline def getExtendedPublicKey(key: PrivKey): Head = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtendedPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[Head]
    inline def getExtendedPublicKey_=(x: js.Function1[/* key */ PrivKey, Head]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getExtendedPublicKey")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/ed25519", "sync.getPublicKey")
    @js.native
    def getPublicKey: js.Function1[/* privateKey */ PrivKey, js.typedarray.Uint8Array] = js.native
    inline def getPublicKey(privateKey: PrivKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def getPublicKey_=(x: js.Function1[/* privateKey */ PrivKey, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPublicKey")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/ed25519", "sync.sign")
    @js.native
    def sign: js.Function2[/* message */ Hex, /* privateKey */ Hex, js.typedarray.Uint8Array] = js.native
    inline def sign(message: Hex, privateKey: Hex): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def sign_=(x: js.Function2[/* message */ Hex, /* privateKey */ Hex, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sign")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/ed25519", "sync.verify")
    @js.native
    def verify: js.Function3[/* sig */ SigType, /* message */ Hex, /* publicKey */ PubKey, Boolean] = js.native
    inline def verify(sig: SigType, message: Hex, publicKey: PubKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(sig.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def verify_=(x: js.Function3[/* sig */ SigType, /* message */ Hex, /* publicKey */ PubKey, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verify")(x.asInstanceOf[js.Any])
  }
  
  object utils {
    
    @JSImport("@noble/ed25519", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/ed25519", "utils.TORSION_SUBGROUP")
    @js.native
    def TORSION_SUBGROUP: js.Array[String] = js.native
    inline def TORSION_SUBGROUP_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TORSION_SUBGROUP")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/ed25519", "utils.bytesToHex")
    @js.native
    def bytesToHex: js.Function1[/* uint8a */ js.typedarray.Uint8Array, String] = js.native
    inline def bytesToHex(uint8a: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToHex")(uint8a.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def bytesToHex_=(x: js.Function1[/* uint8a */ js.typedarray.Uint8Array, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytesToHex")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/ed25519", "utils.concatBytes")
    @js.native
    def concatBytes: js.Function1[/* repeated */ js.typedarray.Uint8Array, js.typedarray.Uint8Array] = js.native
    inline def concatBytes(arrays: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concatBytes")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.Uint8Array]
    inline def concatBytes_=(x: js.Function1[/* repeated */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concatBytes")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/ed25519", "utils.getExtendedPublicKey")
    @js.native
    def getExtendedPublicKey: js.Function1[/* key */ PrivKey, js.Promise[Head]] = js.native
    inline def getExtendedPublicKey(key: PrivKey): js.Promise[Head] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtendedPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Head]]
    inline def getExtendedPublicKey_=(x: js.Function1[/* key */ PrivKey, js.Promise[Head]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getExtendedPublicKey")(x.asInstanceOf[js.Any])
    
    inline def hashToPrivateScalar(hash: Hex): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("hashToPrivateScalar")(hash.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    
    @JSImport("@noble/ed25519", "utils.hexToBytes")
    @js.native
    def hexToBytes: js.Function1[/* hex */ String, js.typedarray.Uint8Array] = js.native
    inline def hexToBytes(hex: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBytes")(hex.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def hexToBytes_=(x: js.Function1[/* hex */ String, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hexToBytes")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/ed25519", "utils.invert")
    @js.native
    def invert: js.Function2[/* number */ js.BigInt, /* modulo */ js.UndefOr[js.BigInt], js.BigInt] = js.native
    inline def invert(number: js.BigInt): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(number.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    inline def invert(number: js.BigInt, modulo: js.BigInt): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(number.asInstanceOf[js.Any], modulo.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    inline def invert_=(x: js.Function2[/* number */ js.BigInt, /* modulo */ js.UndefOr[js.BigInt], js.BigInt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invert")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/ed25519", "utils.mod")
    @js.native
    def mod: js.Function2[/* a */ js.BigInt, /* b */ js.UndefOr[js.BigInt], js.BigInt] = js.native
    inline def mod(a: js.BigInt): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    inline def mod(a: js.BigInt, b: js.BigInt): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    inline def mod_=(x: js.Function2[/* a */ js.BigInt, /* b */ js.UndefOr[js.BigInt], js.BigInt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mod")(x.asInstanceOf[js.Any])
    
    inline def precompute(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("precompute")().asInstanceOf[Point]
    inline def precompute(windowSize: Double): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("precompute")(windowSize.asInstanceOf[js.Any]).asInstanceOf[Point]
    inline def precompute(windowSize: Double, point: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("precompute")(windowSize.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Point]
    inline def precompute(windowSize: Unit, point: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("precompute")(windowSize.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def randomBytes(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")().asInstanceOf[js.typedarray.Uint8Array]
    inline def randomBytes(bytesLength: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(bytesLength.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def randomPrivateKey(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomPrivateKey")().asInstanceOf[js.typedarray.Uint8Array]
    
    inline def sha512(messages: js.typedarray.Uint8Array*): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    @JSImport("@noble/ed25519", "utils.sha512Sync")
    @js.native
    def sha512Sync: Sha512FnSync = js.native
    inline def sha512Sync_=(x: Sha512FnSync): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha512Sync")(x.asInstanceOf[js.Any])
  }
  
  inline def verify(sig: SigType, message: Hex, publicKey: PubKey): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(sig.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @js.native
  trait ExtendedPoint extends StObject {
    
    def add(other: ExtendedPoint): ExtendedPoint = js.native
    
    def double(): ExtendedPoint = js.native
    
    def equals(other: ExtendedPoint): Boolean = js.native
    
    def fromRistrettoBytes(): Unit = js.native
    
    def fromRistrettoHash(): Unit = js.native
    
    def isSmallOrder(): Boolean = js.native
    
    def isTorsionFree(): Boolean = js.native
    
    def multiply(scalar: js.BigInt): ExtendedPoint = js.native
    def multiply(scalar: js.BigInt, affinePoint: Point): ExtendedPoint = js.native
    def multiply(scalar: Double): ExtendedPoint = js.native
    def multiply(scalar: Double, affinePoint: Point): ExtendedPoint = js.native
    
    def multiplyUnsafe(scalar: js.BigInt): ExtendedPoint = js.native
    def multiplyUnsafe(scalar: Double): ExtendedPoint = js.native
    
    def negate(): ExtendedPoint = js.native
    
    /* private */ var precomputeWindow: Any = js.native
    
    def subtract(other: ExtendedPoint): ExtendedPoint = js.native
    
    val t: js.BigInt = js.native
    
    def toAffine(): Point = js.native
    def toAffine(invZ: js.BigInt): Point = js.native
    
    def toRistrettoBytes(): Unit = js.native
    
    /* private */ var wNAF: Any = js.native
    
    val x: js.BigInt = js.native
    
    val y: js.BigInt = js.native
    
    val z: js.BigInt = js.native
  }
  
  type Hex = js.typedarray.Uint8Array | String
  
  @js.native
  trait Point extends StObject {
    
    var _WINDOW_SIZE: js.UndefOr[Double] = js.native
    
    def _setWindowSize(windowSize: Double): Unit = js.native
    
    def add(other: Point): Point = js.native
    
    def equals(other: Point): Boolean = js.native
    
    def isTorsionFree(): Boolean = js.native
    
    def multiply(scalar: js.BigInt): Point = js.native
    def multiply(scalar: Double): Point = js.native
    
    def negate(): Point = js.native
    
    def subtract(other: Point): Point = js.native
    
    def toHex(): String = js.native
    
    def toRawBytes(): js.typedarray.Uint8Array = js.native
    
    def toX25519(): js.typedarray.Uint8Array = js.native
    
    val x: js.BigInt = js.native
    
    val y: js.BigInt = js.native
  }
  
  type PrivKey = Hex | js.BigInt | Double
  
  type PubKey = Hex | Point
  
  @js.native
  trait RistrettoPoint extends StObject {
    
    def add(other: RistrettoPoint): RistrettoPoint = js.native
    
    /* private */ val ep: Any = js.native
    
    def equals(other: RistrettoPoint): Boolean = js.native
    
    def multiply(scalar: js.BigInt): RistrettoPoint = js.native
    def multiply(scalar: Double): RistrettoPoint = js.native
    
    def multiplyUnsafe(scalar: js.BigInt): RistrettoPoint = js.native
    def multiplyUnsafe(scalar: Double): RistrettoPoint = js.native
    
    def subtract(other: RistrettoPoint): RistrettoPoint = js.native
    
    def toHex(): String = js.native
    
    def toRawBytes(): js.typedarray.Uint8Array = js.native
  }
  
  type Sha512FnSync = js.UndefOr[js.Function1[/* repeated */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  
  type SigType = Hex | Signature
  
  trait Signature extends StObject {
    
    def assertValidity(): this.type
    
    val r: Point
    
    val s: js.BigInt
    
    def toHex(): String
    
    def toRawBytes(): js.typedarray.Uint8Array
  }
  object Signature {
    
    inline def apply(
      assertValidity: () => Signature,
      r: Point,
      s: js.BigInt,
      toHex: () => String,
      toRawBytes: () => js.typedarray.Uint8Array
    ): Signature = {
      val __obj = js.Dynamic.literal(assertValidity = js.Any.fromFunction0(assertValidity), r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], toHex = js.Any.fromFunction0(toHex), toRawBytes = js.Any.fromFunction0(toRawBytes))
      __obj.asInstanceOf[Signature]
    }
    
    extension [Self <: Signature](x: Self) {
      
      inline def setAssertValidity(value: () => Signature): Self = StObject.set(x, "assertValidity", js.Any.fromFunction0(value))
      
      inline def setR(value: Point): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setS(value: js.BigInt): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setToHex(value: () => String): Self = StObject.set(x, "toHex", js.Any.fromFunction0(value))
      
      inline def setToRawBytes(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "toRawBytes", js.Any.fromFunction0(value))
    }
  }
}
