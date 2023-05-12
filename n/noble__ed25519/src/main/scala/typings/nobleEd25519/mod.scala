package typings.nobleEd25519

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@noble/ed25519", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CURVE {
    
    @JSImport("@noble/ed25519", "CURVE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/ed25519", "CURVE.Gx")
    @js.native
    def Gx: js.BigInt = js.native
    inline def Gx_=(x: js.BigInt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Gx")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/ed25519", "CURVE.Gy")
    @js.native
    def Gy: js.BigInt = js.native
    inline def Gy_=(x: js.BigInt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Gy")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/ed25519", "CURVE.a")
    @js.native
    def a: js.BigInt = js.native
    inline def a_=(x: js.BigInt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("a")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/ed25519", "CURVE.d")
    @js.native
    def d: js.BigInt = js.native
    inline def d_=(x: js.BigInt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("d")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/ed25519", "CURVE.h")
    @js.native
    def h: Double = js.native
    inline def h_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("h")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/ed25519", "CURVE.n")
    @js.native
    def n: js.BigInt = js.native
    inline def n_=(x: js.BigInt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("n")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/ed25519", "CURVE.p")
    @js.native
    def p: js.BigInt = js.native
    inline def p_=(x: js.BigInt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("p")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@noble/ed25519", "ExtendedPoint")
  @js.native
  open class ExtendedPoint protected ()
    extends StObject
       with Point {
    def this(ex: js.BigInt, ey: js.BigInt, ez: js.BigInt, et: js.BigInt) = this()
  }
  object ExtendedPoint {
    
    @JSImport("@noble/ed25519", "ExtendedPoint")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@noble/ed25519", "ExtendedPoint.BASE")
    @js.native
    val BASE: Point = js.native
    
    /* static member */
    @JSImport("@noble/ed25519", "ExtendedPoint.ZERO")
    @js.native
    val ZERO: Point = js.native
    
    /* static member */
    inline def fromAffine(p: AffinePoint): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAffine")(p.asInstanceOf[js.Any]).asInstanceOf[Point]
    
    /* static member */
    inline def fromHex(hex: Hex): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[Point]
    inline def fromHex(hex: Hex, strict: Boolean): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Point]
  }
  
  object etc {
    
    @JSImport("@noble/ed25519", "etc")
    @js.native
    val ^ : js.Any = js.native
    
    inline def bytesToHex(b: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToHex")(b.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def concatBytes(arrs: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concatBytes")(arrs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def hexToBytes(hex: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBytes")(hex.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def invert(num: js.BigInt): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(num.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    inline def invert(num: js.BigInt, md: js.BigInt): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(num.asInstanceOf[js.Any], md.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    
    inline def mod(a: js.BigInt): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    inline def mod(a: js.BigInt, b: js.BigInt): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    
    inline def randomBytes(len: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(len.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def sha512Async(messages: js.typedarray.Uint8Array*): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512Async")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    @JSImport("@noble/ed25519", "etc.sha512Sync")
    @js.native
    def sha512Sync: Sha512FnSync = js.native
    inline def sha512Sync_=(x: Sha512FnSync): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha512Sync")(x.asInstanceOf[js.Any])
  }
  
  inline def getPublicKey(priv: Hex): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(priv.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def getPublicKeyAsync(priv: Hex): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKeyAsync")(priv.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def sign(msg: Hex, privKey: Hex): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(msg.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def signAsync(msg: Hex, privKey: Hex): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("signAsync")(msg.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  object utils {
    
    @JSImport("@noble/ed25519", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getExtendedPublicKey(priv: Hex): ExtK = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtendedPublicKey")(priv.asInstanceOf[js.Any]).asInstanceOf[ExtK]
    
    inline def getExtendedPublicKeyAsync(priv: Hex): js.Promise[ExtK] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtendedPublicKeyAsync")(priv.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ExtK]]
    
    inline def precompute(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("precompute")().asInstanceOf[Point]
    inline def precompute(w: Double): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("precompute")(w.asInstanceOf[js.Any]).asInstanceOf[Point]
    inline def precompute(w: Double, p: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("precompute")(w.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Point]
    inline def precompute(w: Unit, p: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("precompute")(w.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def randomPrivateKey(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomPrivateKey")().asInstanceOf[js.typedarray.Uint8Array]
  }
  
  inline def verify(s: Hex, m: Hex, p: Hex): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(s.asInstanceOf[js.Any], m.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def verifyAsync(s: Hex, m: Hex, p: Hex): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyAsync")(s.asInstanceOf[js.Any], m.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
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
  
  trait ExtK extends StObject {
    
    var head: js.typedarray.Uint8Array
    
    var point: Point
    
    var pointBytes: js.typedarray.Uint8Array
    
    var prefix: js.typedarray.Uint8Array
    
    var scalar: js.BigInt
  }
  object ExtK {
    
    inline def apply(
      head: js.typedarray.Uint8Array,
      point: Point,
      pointBytes: js.typedarray.Uint8Array,
      prefix: js.typedarray.Uint8Array,
      scalar: js.BigInt
    ): ExtK = {
      val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], pointBytes = pointBytes.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], scalar = scalar.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtK]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtK] (val x: Self) extends AnyVal {
      
      inline def setHead(value: js.typedarray.Uint8Array): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPointBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "pointBytes", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: js.typedarray.Uint8Array): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setScalar(value: js.BigInt): Self = StObject.set(x, "scalar", value.asInstanceOf[js.Any])
    }
  }
  
  type Hex = js.typedarray.Uint8Array | String
  
  @js.native
  trait Point extends StObject {
    
    def add(other: Point): Point = js.native
    
    def clearCofactor(): Point = js.native
    
    def double(): Point = js.native
    
    def equals(other: Point): Boolean = js.native
    
    val et: js.BigInt = js.native
    
    val ex: js.BigInt = js.native
    
    val ey: js.BigInt = js.native
    
    val ez: js.BigInt = js.native
    
    def is0(): Boolean = js.native
    
    def isSmallOrder(): Boolean = js.native
    
    def isTorsionFree(): Boolean = js.native
    
    def mul(n: js.BigInt): Point = js.native
    def mul(n: js.BigInt, safe: Boolean): Point = js.native
    
    def multiply(scalar: js.BigInt): Point = js.native
    
    def negate(): Point = js.native
    
    def toAffine(): AffinePoint = js.native
    
    def toHex(): String = js.native
    
    def toRawBytes(): js.typedarray.Uint8Array = js.native
    
    def x: js.BigInt = js.native
    
    def y: js.BigInt = js.native
  }
  
  type Sha512FnSync = js.UndefOr[js.Function1[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
}
