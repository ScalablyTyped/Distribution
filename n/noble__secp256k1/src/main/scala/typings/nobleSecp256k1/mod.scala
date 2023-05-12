package typings.nobleSecp256k1

import typings.nobleSecp256k1.anon.ExtraEntropy
import typings.nobleSecp256k1.anon.LowS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@noble/secp256k1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CURVE {
    
    @JSImport("@noble/secp256k1", "CURVE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/secp256k1", "CURVE.Gx")
    @js.native
    def Gx: js.BigInt = js.native
    inline def Gx_=(x: js.BigInt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Gx")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/secp256k1", "CURVE.Gy")
    @js.native
    def Gy: js.BigInt = js.native
    inline def Gy_=(x: js.BigInt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Gy")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/secp256k1", "CURVE.a")
    @js.native
    def a: js.BigInt = js.native
    inline def a_=(x: js.BigInt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("a")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/secp256k1", "CURVE.b")
    @js.native
    def b: js.BigInt = js.native
    inline def b_=(x: js.BigInt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/secp256k1", "CURVE.n")
    @js.native
    def n: js.BigInt = js.native
    inline def n_=(x: js.BigInt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("n")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/secp256k1", "CURVE.p")
    @js.native
    def p: js.BigInt = js.native
    inline def p_=(x: js.BigInt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("p")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@noble/secp256k1", "ProjectivePoint")
  @js.native
  open class ProjectivePoint protected ()
    extends StObject
       with Point {
    def this(px: js.BigInt, py: js.BigInt, pz: js.BigInt) = this()
  }
  object ProjectivePoint {
    
    @JSImport("@noble/secp256k1", "ProjectivePoint")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@noble/secp256k1", "ProjectivePoint.BASE")
    @js.native
    val BASE: Point = js.native
    
    /* static member */
    @JSImport("@noble/secp256k1", "ProjectivePoint.ZERO")
    @js.native
    val ZERO: Point = js.native
    
    /* static member */
    inline def fromAffine(p: AffinePoint): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAffine")(p.asInstanceOf[js.Any]).asInstanceOf[Point]
    
    /* static member */
    inline def fromHex(hex: Hex): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[Point]
    
    /* static member */
    inline def fromPrivateKey(k: PrivKey): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivateKey")(k.asInstanceOf[js.Any]).asInstanceOf[Point]
  }
  
  @JSImport("@noble/secp256k1", "Signature")
  @js.native
  open class Signature protected () extends StObject {
    def this(r: js.BigInt, s: js.BigInt) = this()
    def this(r: js.BigInt, s: js.BigInt, recovery: Double) = this()
    
    def addRecoveryBit(rec: Double): Signature = js.native
    
    def assertValidity(): this.type = js.native
    
    def hasHighS(): Boolean = js.native
    
    val r: js.BigInt = js.native
    
    def recoverPublicKey(msgh: Hex): Point = js.native
    
    val recovery: js.UndefOr[Double] = js.native
    
    val s: js.BigInt = js.native
    
    def toCompactHex(): String = js.native
    
    def toCompactRawBytes(): js.typedarray.Uint8Array = js.native
  }
  object Signature {
    
    @JSImport("@noble/secp256k1", "Signature")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromCompact(hex: Hex): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCompact")(hex.asInstanceOf[js.Any]).asInstanceOf[Signature]
  }
  
  object etc {
    
    @JSImport("@noble/secp256k1", "etc")
    @js.native
    val ^ : js.Any = js.native
    
    inline def bytesToHex(b: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToHex")(b.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def bytesToNumberBE(b: js.typedarray.Uint8Array): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToNumberBE")(b.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    
    inline def concatBytes(arrs: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concatBytes")(arrs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/secp256k1", "etc.hashToPrivateKey")
    @js.native
    def hashToPrivateKey: js.Function1[/* hash */ Hex, js.typedarray.Uint8Array] = js.native
    inline def hashToPrivateKey(hash: Hex): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hashToPrivateKey")(hash.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def hashToPrivateKey_=(x: js.Function1[/* hash */ Hex, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hashToPrivateKey")(x.asInstanceOf[js.Any])
    
    inline def hexToBytes(hex: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBytes")(hex.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def hmacSha256Async(key: js.typedarray.Uint8Array, msgs: js.typedarray.Uint8Array*): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("hmacSha256Async")(scala.List(key.asInstanceOf[js.Any]).`++`(msgs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    @JSImport("@noble/secp256k1", "etc.hmacSha256Sync")
    @js.native
    def hmacSha256Sync: HmacFnSync = js.native
    inline def hmacSha256Sync_=(x: HmacFnSync): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacSha256Sync")(x.asInstanceOf[js.Any])
    
    inline def invert(num: js.BigInt): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(num.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    inline def invert(num: js.BigInt, md: js.BigInt): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(num.asInstanceOf[js.Any], md.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    
    inline def mod(a: js.BigInt): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    inline def mod(a: js.BigInt, b: js.BigInt): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    
    inline def numberToBytesBE(num: js.BigInt): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToBytesBE")(num.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def randomBytes(len: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(len.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  }
  
  inline def getPublicKey(privKey: PrivKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(privKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def getPublicKey(privKey: PrivKey, isCompressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(privKey.asInstanceOf[js.Any], isCompressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def getSharedSecret(privA: Hex, pubB: Hex): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getSharedSecret")(privA.asInstanceOf[js.Any], pubB.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def getSharedSecret(privA: Hex, pubB: Hex, isCompressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getSharedSecret")(privA.asInstanceOf[js.Any], pubB.asInstanceOf[js.Any], isCompressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def sign(msgh: Hex, priv: Hex): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(msgh.asInstanceOf[js.Any], priv.asInstanceOf[js.Any])).asInstanceOf[Signature]
  inline def sign(msgh: Hex, priv: Hex, opts: ExtraEntropy): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(msgh.asInstanceOf[js.Any], priv.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Signature]
  
  inline def signAsync(msgh: Hex, priv: Hex): js.Promise[Signature] = (^.asInstanceOf[js.Dynamic].applyDynamic("signAsync")(msgh.asInstanceOf[js.Any], priv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signature]]
  inline def signAsync(msgh: Hex, priv: Hex, opts: ExtraEntropy): js.Promise[Signature] = (^.asInstanceOf[js.Dynamic].applyDynamic("signAsync")(msgh.asInstanceOf[js.Any], priv.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signature]]
  
  object utils {
    
    @JSImport("@noble/secp256k1", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isValidPrivateKey(key: Hex): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def normPrivateKeyToScalar(p: PrivKey): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("normPrivateKeyToScalar")(p.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    
    inline def precompute(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("precompute")().asInstanceOf[Point]
    inline def precompute(w: Double): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("precompute")(w.asInstanceOf[js.Any]).asInstanceOf[Point]
    inline def precompute(w: Double, p: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("precompute")(w.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Point]
    inline def precompute(w: Unit, p: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("precompute")(w.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def randomPrivateKey(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomPrivateKey")().asInstanceOf[js.typedarray.Uint8Array]
  }
  
  inline def verify(sig: Hex, msgh: Hex, pub: Hex): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(sig.asInstanceOf[js.Any], msgh.asInstanceOf[js.Any], pub.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(sig: Hex, msgh: Hex, pub: Hex, opts: LowS): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(sig.asInstanceOf[js.Any], msgh.asInstanceOf[js.Any], pub.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(sig: SigLike, msgh: Hex, pub: Hex): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(sig.asInstanceOf[js.Any], msgh.asInstanceOf[js.Any], pub.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(sig: SigLike, msgh: Hex, pub: Hex, opts: LowS): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(sig.asInstanceOf[js.Any], msgh.asInstanceOf[js.Any], pub.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait AffinePoint extends StObject {
    
    var x: js.BigInt
    
    var y: js.BigInt
  }
  object AffinePoint {
    
    inline def apply(x: js.BigInt, y: js.BigInt): AffinePoint = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[AffinePoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AffinePoint] (val x: Self) extends AnyVal {
      
      inline def setX(value: js.BigInt): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: js.BigInt): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Bytes = js.typedarray.Uint8Array
  
  type Hex = js.typedarray.Uint8Array | String
  
  type HmacFnSync = js.UndefOr[
    js.Function2[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.typedarray.Uint8Array]
  ]
  
  @js.native
  trait Point extends StObject {
    
    def add(other: Point): Point = js.native
    
    def aff(): AffinePoint = js.native
    
    def assertValidity(): Point = js.native
    
    def double(): Point = js.native
    
    def equals(other: Point): Boolean = js.native
    
    def mul(n: js.BigInt): Point = js.native
    def mul(n: js.BigInt, safe: Boolean): Point = js.native
    
    def mulAddQUns(R: Point, u1: js.BigInt, u2: js.BigInt): Point = js.native
    
    def multiply(n: js.BigInt): Point = js.native
    
    def negate(): Point = js.native
    
    def ok(): Point = js.native
    
    val px: js.BigInt = js.native
    
    val py: js.BigInt = js.native
    
    val pz: js.BigInt = js.native
    
    def toAffine(): AffinePoint = js.native
    
    def toHex(): String = js.native
    def toHex(isCompressed: Boolean): String = js.native
    
    def toRawBytes(): js.typedarray.Uint8Array = js.native
    def toRawBytes(isCompressed: Boolean): js.typedarray.Uint8Array = js.native
    
    def x: js.BigInt = js.native
    
    def y: js.BigInt = js.native
  }
  
  type PrivKey = Hex | js.BigInt
  
  trait SigLike extends StObject {
    
    var r: js.BigInt
    
    var s: js.BigInt
  }
  object SigLike {
    
    inline def apply(r: js.BigInt, s: js.BigInt): SigLike = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[SigLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SigLike] (val x: Self) extends AnyVal {
      
      inline def setR(value: js.BigInt): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setS(value: js.BigInt): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
}
