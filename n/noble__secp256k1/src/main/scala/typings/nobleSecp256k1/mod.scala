package typings.nobleSecp256k1

import org.scalablytyped.runtime.Instantiable2
import typings.nobleSecp256k1.anon.TypeofSchnorrSignature
import typings.nobleSecp256k1.nobleSecp256k1Booleans.`false`
import typings.nobleSecp256k1.nobleSecp256k1Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@noble/secp256k1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<{  a :bigint,   b :bigint,   P :bigint,   n :bigint,   h :bigint,   Gx :bigint,   Gy :bigint,   beta :bigint}> */
  object CURVE {
    
    @JSImport("@noble/secp256k1", "CURVE.Gx")
    @js.native
    val Gx: js.BigInt = js.native
    
    @JSImport("@noble/secp256k1", "CURVE.Gy")
    @js.native
    val Gy: js.BigInt = js.native
    
    @JSImport("@noble/secp256k1", "CURVE.P")
    @js.native
    val P: js.BigInt = js.native
    
    @JSImport("@noble/secp256k1", "CURVE.a")
    @js.native
    val a: js.BigInt = js.native
    
    @JSImport("@noble/secp256k1", "CURVE.b")
    @js.native
    val b: js.BigInt = js.native
    
    @JSImport("@noble/secp256k1", "CURVE.beta")
    @js.native
    val beta: js.BigInt = js.native
    
    @JSImport("@noble/secp256k1", "CURVE.h")
    @js.native
    val h: js.BigInt = js.native
    
    @JSImport("@noble/secp256k1", "CURVE.n")
    @js.native
    val n: js.BigInt = js.native
  }
  
  @JSImport("@noble/secp256k1", "Point")
  @js.native
  open class Point protected () extends StObject {
    def this(x: js.BigInt, y: js.BigInt) = this()
    
    var _WINDOW_SIZE: js.UndefOr[Double] = js.native
    
    def _setWindowSize(windowSize: Double): Unit = js.native
    
    def add(other: Point): Point = js.native
    
    def assertValidity(): Unit = js.native
    
    def double(): Point = js.native
    
    def equals(other: Point): Boolean = js.native
    
    def hasEvenY(): Boolean = js.native
    
    def multiply(scalar: js.BigInt): Point = js.native
    def multiply(scalar: Double): Point = js.native
    
    def multiplyAndAddUnsafe(Q: Point, a: js.BigInt, b: js.BigInt): js.UndefOr[Point] = js.native
    
    def negate(): Point = js.native
    
    def subtract(other: Point): Point = js.native
    
    def toHex(): String = js.native
    def toHex(isCompressed: Boolean): String = js.native
    
    def toHexX(): String = js.native
    
    def toRawBytes(): js.typedarray.Uint8Array = js.native
    def toRawBytes(isCompressed: Boolean): js.typedarray.Uint8Array = js.native
    
    def toRawX(): js.typedarray.Uint8Array = js.native
    
    val x: js.BigInt = js.native
    
    val y: js.BigInt = js.native
  }
  /* static members */
  object Point {
    
    @JSImport("@noble/secp256k1", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/secp256k1", "Point.BASE")
    @js.native
    def BASE: Point = js.native
    inline def BASE_=(x: Point): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/secp256k1", "Point.ZERO")
    @js.native
    def ZERO: Point = js.native
    inline def ZERO_=(x: Point): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/secp256k1", "Point.fromCompressedHex")
    @js.native
    def fromCompressedHex: Any = js.native
    inline def fromCompressedHex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromCompressedHex")(x.asInstanceOf[js.Any])
    
    inline def fromHex(hex: Hex): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[Point]
    
    inline def fromPrivateKey(privateKey: PrivKey): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivateKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Point]
    
    inline def fromSignature(msgHash: Hex, signature: Sig, recovery: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSignature")(msgHash.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], recovery.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    @JSImport("@noble/secp256k1", "Point.fromUncompressedHex")
    @js.native
    def fromUncompressedHex: Any = js.native
    inline def fromUncompressedHex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromUncompressedHex")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@noble/secp256k1", "Signature")
  @js.native
  open class Signature protected () extends StObject {
    def this(r: js.BigInt, s: js.BigInt) = this()
    
    def assertValidity(): Unit = js.native
    
    def hasHighS(): Boolean = js.native
    
    def normalizeS(): Signature = js.native
    
    val r: js.BigInt = js.native
    
    val s: js.BigInt = js.native
    
    def toCompactHex(): String = js.native
    
    def toCompactRawBytes(): js.typedarray.Uint8Array = js.native
    
    def toDERHex(): String = js.native
    def toDERHex(isCompressed: Boolean): String = js.native
    
    def toDERRawBytes(): js.typedarray.Uint8Array = js.native
    def toDERRawBytes(isCompressed: Boolean): js.typedarray.Uint8Array = js.native
    
    def toHex(): String = js.native
    
    def toRawBytes(): js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object Signature {
    
    @JSImport("@noble/secp256k1", "Signature")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromCompact(hex: Hex): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCompact")(hex.asInstanceOf[js.Any]).asInstanceOf[Signature]
    
    inline def fromDER(hex: Hex): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDER")(hex.asInstanceOf[js.Any]).asInstanceOf[Signature]
    
    inline def fromHex(hex: Hex): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[Signature]
  }
  
  inline def getPublicKey(privateKey: PrivKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def getPublicKey(privateKey: PrivKey, isCompressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(privateKey.asInstanceOf[js.Any], isCompressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def getSharedSecret(privateA: PrivKey, publicB: PubKey): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getSharedSecret")(privateA.asInstanceOf[js.Any], publicB.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def getSharedSecret(privateA: PrivKey, publicB: PubKey, isCompressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getSharedSecret")(privateA.asInstanceOf[js.Any], publicB.asInstanceOf[js.Any], isCompressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def recoverPublicKey(msgHash: Hex, signature: Sig, recovery: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPublicKey")(msgHash.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], recovery.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def recoverPublicKey(msgHash: Hex, signature: Sig, recovery: Double, isCompressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPublicKey")(msgHash.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], recovery.asInstanceOf[js.Any], isCompressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  object schnorr {
    
    @JSImport("@noble/secp256k1", "schnorr")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/secp256k1", "schnorr.Signature")
    @js.native
    def Signature: TypeofSchnorrSignature & (Instantiable2[/* r */ js.BigInt, /* s */ js.BigInt, SchnorrSignature]) = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@noble/secp256k1", "schnorr.Signature")
    @js.native
    open class SignatureCls protected ()
      extends StObject
         with SchnorrSignature {
      def this(r: js.BigInt, s: js.BigInt) = this()
      
      /* CompleteClass */
      override def assertValidity(): Unit = js.native
      
      /* CompleteClass */
      override val r: js.BigInt = js.native
      
      /* CompleteClass */
      override val s: js.BigInt = js.native
      
      /* CompleteClass */
      override def toHex(): String = js.native
      
      /* CompleteClass */
      override def toRawBytes(): js.typedarray.Uint8Array = js.native
    }
    
    inline def Signature_=(
      x: TypeofSchnorrSignature & (Instantiable2[/* r */ js.BigInt, /* s */ js.BigInt, SchnorrSignature])
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Signature")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/secp256k1", "schnorr.getPublicKey")
    @js.native
    def getPublicKey: js.Function1[/* privateKey */ PrivKey, js.typedarray.Uint8Array] = js.native
    inline def getPublicKey(privateKey: PrivKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def getPublicKey_=(x: js.Function1[/* privateKey */ PrivKey, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPublicKey")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/secp256k1", "schnorr.sign")
    @js.native
    def sign: js.Function3[
        /* msg */ Hex, 
        /* privKey */ PrivKey, 
        /* auxRand */ js.UndefOr[Hex], 
        js.Promise[js.typedarray.Uint8Array]
      ] = js.native
    inline def sign(msg: Hex, privKey: PrivKey): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(msg.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    inline def sign(msg: Hex, privKey: PrivKey, auxRand: Hex): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(msg.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any], auxRand.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    @JSImport("@noble/secp256k1", "schnorr.signSync")
    @js.native
    def signSync: js.Function3[
        /* msg */ Hex, 
        /* privKey */ PrivKey, 
        /* auxRand */ js.UndefOr[Hex], 
        js.typedarray.Uint8Array
      ] = js.native
    inline def signSync(msg: Hex, privKey: PrivKey): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("signSync")(msg.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def signSync(msg: Hex, privKey: PrivKey, auxRand: Hex): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("signSync")(msg.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any], auxRand.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def signSync_=(
      x: js.Function3[
          /* msg */ Hex, 
          /* privKey */ PrivKey, 
          /* auxRand */ js.UndefOr[Hex], 
          js.typedarray.Uint8Array
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("signSync")(x.asInstanceOf[js.Any])
    
    inline def sign_=(
      x: js.Function3[
          /* msg */ Hex, 
          /* privKey */ PrivKey, 
          /* auxRand */ js.UndefOr[Hex], 
          js.Promise[js.typedarray.Uint8Array]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sign")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/secp256k1", "schnorr.verify")
    @js.native
    def verify: js.Function3[/* signature */ Hex, /* message */ Hex, /* publicKey */ Hex, js.Promise[Boolean]] = js.native
    inline def verify(signature: Hex, message: Hex, publicKey: Hex): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(signature.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @JSImport("@noble/secp256k1", "schnorr.verifySync")
    @js.native
    def verifySync: js.Function3[/* signature */ Hex, /* message */ Hex, /* publicKey */ Hex, Boolean] = js.native
    inline def verifySync(signature: Hex, message: Hex, publicKey: Hex): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySync")(signature.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def verifySync_=(x: js.Function3[/* signature */ Hex, /* message */ Hex, /* publicKey */ Hex, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verifySync")(x.asInstanceOf[js.Any])
    
    inline def verify_=(x: js.Function3[/* signature */ Hex, /* message */ Hex, /* publicKey */ Hex, js.Promise[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verify")(x.asInstanceOf[js.Any])
  }
  
  inline def sign(msgHash: Hex, privKey: PrivKey): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(msgHash.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def sign(msgHash: Hex, privKey: PrivKey, opts: OptsNoRecov): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(msgHash.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  inline def sign(msgHash: Hex, privKey: PrivKey, opts: OptsRecov): js.Promise[js.Tuple2[js.typedarray.Uint8Array, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(msgHash.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.typedarray.Uint8Array, Double]]]
  
  inline def signSync(msgHash: Hex, privKey: PrivKey): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("signSync")(msgHash.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def signSync(msgHash: Hex, privKey: PrivKey, opts: OptsNoRecov): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("signSync")(msgHash.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def signSync(msgHash: Hex, privKey: PrivKey, opts: OptsRecov): js.Tuple2[js.typedarray.Uint8Array, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("signSync")(msgHash.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.typedarray.Uint8Array, Double]]
  
  object utils {
    
    @JSImport("@noble/secp256k1", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/secp256k1", "utils._bigintTo32Bytes")
    @js.native
    def bigintTo32Bytes: js.Function1[/* num */ js.BigInt, js.typedarray.Uint8Array] = js.native
    
    inline def bigintTo32Bytes(num: js.BigInt): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("_bigintTo32Bytes")(num.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def bigintTo32Bytes_=(x: js.Function1[/* num */ js.BigInt, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_bigintTo32Bytes")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/secp256k1", "utils.bytesToHex")
    @js.native
    def bytesToHex: js.Function1[/* uint8a */ js.typedarray.Uint8Array, String] = js.native
    inline def bytesToHex(uint8a: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToHex")(uint8a.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def bytesToHex_=(x: js.Function1[/* uint8a */ js.typedarray.Uint8Array, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytesToHex")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/secp256k1", "utils.concatBytes")
    @js.native
    def concatBytes: js.Function1[/* repeated */ js.typedarray.Uint8Array, js.typedarray.Uint8Array] = js.native
    inline def concatBytes(arrays: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concatBytes")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.Uint8Array]
    inline def concatBytes_=(x: js.Function1[/* repeated */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concatBytes")(x.asInstanceOf[js.Any])
    
    inline def hashToPrivateKey(hash: Hex): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hashToPrivateKey")(hash.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("@noble/secp256k1", "utils.hexToBytes")
    @js.native
    def hexToBytes: js.Function1[/* hex */ String, js.typedarray.Uint8Array] = js.native
    inline def hexToBytes(hex: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBytes")(hex.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def hexToBytes_=(x: js.Function1[/* hex */ String, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hexToBytes")(x.asInstanceOf[js.Any])
    
    inline def hmacSha256(key: js.typedarray.Uint8Array, messages: js.typedarray.Uint8Array*): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("hmacSha256")(scala.List(key.asInstanceOf[js.Any]).`++`(messages.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    @JSImport("@noble/secp256k1", "utils.hmacSha256Sync")
    @js.native
    def hmacSha256Sync: HmacFnSync = js.native
    inline def hmacSha256Sync_=(x: HmacFnSync): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacSha256Sync")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/secp256k1", "utils.invert")
    @js.native
    def invert: js.Function2[/* number */ js.BigInt, /* modulo */ js.UndefOr[js.BigInt], js.BigInt] = js.native
    inline def invert(number: js.BigInt): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(number.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    inline def invert(number: js.BigInt, modulo: js.BigInt): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(number.asInstanceOf[js.Any], modulo.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    inline def invert_=(x: js.Function2[/* number */ js.BigInt, /* modulo */ js.UndefOr[js.BigInt], js.BigInt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invert")(x.asInstanceOf[js.Any])
    
    inline def isValidPrivateKey(privateKey: PrivKey): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPrivateKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("@noble/secp256k1", "utils.mod")
    @js.native
    def mod: js.Function2[/* a */ js.BigInt, /* b */ js.UndefOr[js.BigInt], js.BigInt] = js.native
    inline def mod(a: js.BigInt): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    inline def mod(a: js.BigInt, b: js.BigInt): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    inline def mod_=(x: js.Function2[/* a */ js.BigInt, /* b */ js.UndefOr[js.BigInt], js.BigInt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mod")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/secp256k1", "utils._normalizePrivateKey")
    @js.native
    def normalizePrivateKey: js.Function1[/* key */ PrivKey, js.BigInt] = js.native
    
    inline def normalizePrivateKey(key: PrivKey): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("_normalizePrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    inline def normalizePrivateKey_=(x: js.Function1[/* key */ PrivKey, js.BigInt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_normalizePrivateKey")(x.asInstanceOf[js.Any])
    
    inline def precompute(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("precompute")().asInstanceOf[Point]
    inline def precompute(windowSize: Double): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("precompute")(windowSize.asInstanceOf[js.Any]).asInstanceOf[Point]
    inline def precompute(windowSize: Double, point: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("precompute")(windowSize.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Point]
    inline def precompute(windowSize: Unit, point: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("precompute")(windowSize.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def randomBytes(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")().asInstanceOf[js.typedarray.Uint8Array]
    inline def randomBytes(bytesLength: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(bytesLength.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def randomPrivateKey(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomPrivateKey")().asInstanceOf[js.typedarray.Uint8Array]
    
    inline def sha256(messages: js.typedarray.Uint8Array*): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    @JSImport("@noble/secp256k1", "utils.sha256Sync")
    @js.native
    def sha256Sync: Sha256FnSync = js.native
    inline def sha256Sync_=(x: Sha256FnSync): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha256Sync")(x.asInstanceOf[js.Any])
    
    inline def taggedHash(tag: String, messages: js.typedarray.Uint8Array*): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("taggedHash")(scala.List(tag.asInstanceOf[js.Any]).`++`(messages.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    inline def taggedHashSync(tag: String, messages: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("taggedHashSync")(scala.List(tag.asInstanceOf[js.Any]).`++`(messages.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.typedarray.Uint8Array]
  }
  
  inline def verify(signature: Sig, msgHash: Hex, publicKey: PubKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(signature.asInstanceOf[js.Any], msgHash.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(signature: Sig, msgHash: Hex, publicKey: PubKey, opts: VOpts): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(signature.asInstanceOf[js.Any], msgHash.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Entropy = Hex | `true`
  
  type Hex = js.typedarray.Uint8Array | String
  
  type HmacFnSync = js.UndefOr[
    js.Function2[
      /* key */ js.typedarray.Uint8Array, 
      /* repeated */ js.typedarray.Uint8Array, 
      js.typedarray.Uint8Array
    ]
  ]
  
  trait OptsNoRecov
    extends StObject
       with OptsOther {
    
    var recovered: js.UndefOr[`false`] = js.undefined
  }
  object OptsNoRecov {
    
    inline def apply(): OptsNoRecov = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptsNoRecov]
    }
    
    extension [Self <: OptsNoRecov](x: Self) {
      
      inline def setRecovered(value: `false`): Self = StObject.set(x, "recovered", value.asInstanceOf[js.Any])
      
      inline def setRecoveredUndefined: Self = StObject.set(x, "recovered", js.undefined)
    }
  }
  
  trait OptsOther extends StObject {
    
    var canonical: js.UndefOr[Boolean] = js.undefined
    
    var der: js.UndefOr[Boolean] = js.undefined
    
    var extraEntropy: js.UndefOr[Entropy] = js.undefined
  }
  object OptsOther {
    
    inline def apply(): OptsOther = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptsOther]
    }
    
    extension [Self <: OptsOther](x: Self) {
      
      inline def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      inline def setCanonicalUndefined: Self = StObject.set(x, "canonical", js.undefined)
      
      inline def setDer(value: Boolean): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
      inline def setDerUndefined: Self = StObject.set(x, "der", js.undefined)
      
      inline def setExtraEntropy(value: Entropy): Self = StObject.set(x, "extraEntropy", value.asInstanceOf[js.Any])
      
      inline def setExtraEntropyUndefined: Self = StObject.set(x, "extraEntropy", js.undefined)
    }
  }
  
  trait OptsRecov
    extends StObject
       with OptsOther {
    
    var recovered: `true`
  }
  object OptsRecov {
    
    inline def apply(): OptsRecov = {
      val __obj = js.Dynamic.literal(recovered = true)
      __obj.asInstanceOf[OptsRecov]
    }
    
    extension [Self <: OptsRecov](x: Self) {
      
      inline def setRecovered(value: `true`): Self = StObject.set(x, "recovered", value.asInstanceOf[js.Any])
    }
  }
  
  type PrivKey = Hex | js.BigInt | Double
  
  type PubKey = Hex | Point
  
  trait SchnorrSignature extends StObject {
    
    def assertValidity(): Unit
    
    val r: js.BigInt
    
    val s: js.BigInt
    
    def toHex(): String
    
    def toRawBytes(): js.typedarray.Uint8Array
  }
  object SchnorrSignature {
    
    inline def apply(
      assertValidity: () => Unit,
      r: js.BigInt,
      s: js.BigInt,
      toHex: () => String,
      toRawBytes: () => js.typedarray.Uint8Array
    ): SchnorrSignature = {
      val __obj = js.Dynamic.literal(assertValidity = js.Any.fromFunction0(assertValidity), r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], toHex = js.Any.fromFunction0(toHex), toRawBytes = js.Any.fromFunction0(toRawBytes))
      __obj.asInstanceOf[SchnorrSignature]
    }
    
    extension [Self <: SchnorrSignature](x: Self) {
      
      inline def setAssertValidity(value: () => Unit): Self = StObject.set(x, "assertValidity", js.Any.fromFunction0(value))
      
      inline def setR(value: js.BigInt): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setS(value: js.BigInt): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setToHex(value: () => String): Self = StObject.set(x, "toHex", js.Any.fromFunction0(value))
      
      inline def setToRawBytes(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "toRawBytes", js.Any.fromFunction0(value))
    }
  }
  
  type Sha256FnSync = js.UndefOr[js.Function1[/* repeated */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  
  type Sig = Hex | Signature
  
  type U8A = js.typedarray.Uint8Array
  
  trait VOpts extends StObject {
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object VOpts {
    
    inline def apply(): VOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VOpts]
    }
    
    extension [Self <: VOpts](x: Self) {
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
