package typings.mz

import org.scalablytyped.runtime.Instantiable0
import typings.mz.mzStrings.base64
import typings.mz.mzStrings.compressed
import typings.mz.mzStrings.der
import typings.mz.mzStrings.dsa
import typings.mz.mzStrings.ec
import typings.mz.mzStrings.hex
import typings.mz.mzStrings.hybrid
import typings.mz.mzStrings.latin1
import typings.mz.mzStrings.pem
import typings.mz.mzStrings.rsa
import typings.mz.mzStrings.uncompressed
import typings.node.Anon_PrivateKey
import typings.node.Buffer
import typings.node.NodeJS.ArrayBufferView
import typings.node.cryptoMod.BinaryLike
import typings.node.cryptoMod.CipherCCM
import typings.node.cryptoMod.CipherCCMOptions
import typings.node.cryptoMod.CipherCCMTypes
import typings.node.cryptoMod.CipherGCM
import typings.node.cryptoMod.CipherGCMOptions
import typings.node.cryptoMod.CipherGCMTypes
import typings.node.cryptoMod.CipherKey
import typings.node.cryptoMod.DSAKeyPairKeyObjectOptions
import typings.node.cryptoMod.DSAKeyPairOptions
import typings.node.cryptoMod.DecipherCCM
import typings.node.cryptoMod.DecipherGCM
import typings.node.cryptoMod.ECKeyPairKeyObjectOptions
import typings.node.cryptoMod.ECKeyPairOptions
import typings.node.cryptoMod.HashOptions
import typings.node.cryptoMod.HexBase64Latin1Encoding
import typings.node.cryptoMod.KeyLike
import typings.node.cryptoMod.KeyPairKeyObjectResult
import typings.node.cryptoMod.KeyPairSyncResult
import typings.node.cryptoMod.PrivateKeyInput
import typings.node.cryptoMod.PublicKeyInput
import typings.node.cryptoMod.RSAKeyPairKeyObjectOptions
import typings.node.cryptoMod.RSAKeyPairOptions
import typings.node.cryptoMod.RsaPrivateKey
import typings.node.cryptoMod.RsaPublicKey
import typings.node.cryptoMod.ScryptOptions
import typings.node.cryptoMod.SignPrivateKeyInput
import typings.node.cryptoMod.VerifyKeyWithOptions
import typings.node.streamMod.TransformOptions
import typings.node.streamMod.WritableOptions
import typings.std.DataView
import typings.std.Error
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", JSImport.Namespace)
@js.native
object cryptoMod extends js.Object {
  @js.native
  class CertificateCls ()
    extends typings.node.cryptoMod.CertificateCls
  
  @js.native
  class Cipher protected ()
    extends typings.node.cryptoMod.Cipher
  
  @js.native
  class Decipher protected ()
    extends typings.node.cryptoMod.Decipher
  
  @js.native
  class DiffieHellman protected ()
    extends typings.node.cryptoMod.DiffieHellman
  
  @js.native
  class ECDH protected ()
    extends typings.node.cryptoMod.ECDH
  
  @js.native
  class Hash protected ()
    extends typings.node.cryptoMod.Hash
  
  @js.native
  class Hmac protected ()
    extends typings.node.cryptoMod.Hmac
  
  @js.native
  class KeyObject protected ()
    extends typings.node.cryptoMod.KeyObject
  
  @js.native
  class Signer protected ()
    extends typings.node.cryptoMod.Signer
  
  @js.native
  class Verify protected ()
    extends typings.node.cryptoMod.Verify
  
  /** @deprecated since v10.0.0 */
  val DEFAULT_ENCODING: String = js.native
  /** @deprecated since v10.0.0 */
  val fips: Boolean = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: String, password: BinaryLike): typings.node.cryptoMod.Cipher = js.native
  def createCipher(algorithm: String, password: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): CipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherGCMTypes, password: BinaryLike): CipherGCM = js.native
  def createCipher(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): CipherGCM = js.native
  def createCipheriv(algorithm: String, key: CipherKey): typings.node.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): typings.node.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: String, key: CipherKey, iv: BinaryLike): typings.node.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: Null, options: CipherCCMOptions): CipherCCM = js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): CipherCCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: Null, options: CipherGCMOptions): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: String, password: BinaryLike): typings.node.cryptoMod.Decipher = js.native
  def createDecipher(algorithm: String, password: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): DecipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherGCMTypes, password: BinaryLike): DecipherGCM = js.native
  def createDecipher(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): DecipherGCM = js.native
  def createDecipheriv(algorithm: String, key: BinaryLike): typings.node.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: String, key: BinaryLike, iv: Null, options: TransformOptions): typings.node.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: String, key: BinaryLike, iv: BinaryLike): typings.node.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: String, key: BinaryLike, iv: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: BinaryLike, iv: Null, options: CipherCCMOptions): DecipherCCM = js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: BinaryLike, iv: BinaryLike, options: CipherCCMOptions): DecipherCCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: BinaryLike): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: BinaryLike, iv: Null, options: CipherGCMOptions): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: BinaryLike, iv: BinaryLike): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: BinaryLike, iv: BinaryLike, options: CipherGCMOptions): DecipherGCM = js.native
  def createDiffieHellman(prime_length: Double): typings.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: Double, generator: Double): typings.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: Double, generator: ArrayBufferView): typings.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding): typings.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(
    prime: String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: String,
    generator_encoding: HexBase64Latin1Encoding
  ): typings.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: Double): typings.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: ArrayBufferView): typings.node.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: ArrayBufferView): typings.node.cryptoMod.DiffieHellman = js.native
  def createECDH(curve_name: String): typings.node.cryptoMod.ECDH = js.native
  def createHash(algorithm: String): typings.node.cryptoMod.Hash = js.native
  def createHash(algorithm: String, options: HashOptions): typings.node.cryptoMod.Hash = js.native
  def createHmac(algorithm: String, key: BinaryLike): typings.node.cryptoMod.Hmac = js.native
  def createHmac(algorithm: String, key: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Hmac = js.native
  def createPrivateKey(key: String): typings.node.cryptoMod.KeyObject = js.native
  def createPrivateKey(key: Buffer): typings.node.cryptoMod.KeyObject = js.native
  def createPrivateKey(key: PrivateKeyInput): typings.node.cryptoMod.KeyObject = js.native
  def createPublicKey(key: String): typings.node.cryptoMod.KeyObject = js.native
  def createPublicKey(key: Buffer): typings.node.cryptoMod.KeyObject = js.native
  def createPublicKey(key: typings.node.cryptoMod.KeyObject): typings.node.cryptoMod.KeyObject = js.native
  def createPublicKey(key: PublicKeyInput): typings.node.cryptoMod.KeyObject = js.native
  def createSecretKey(key: Buffer): typings.node.cryptoMod.KeyObject = js.native
  def createSign(algorithm: String): typings.node.cryptoMod.Signer = js.native
  def createSign(algorithm: String, options: WritableOptions): typings.node.cryptoMod.Signer = js.native
  def createVerify(algorithm: String): typings.node.cryptoMod.Verify = js.native
  def createVerify(algorithm: String, options: WritableOptions): typings.node.cryptoMod.Verify = js.native
  def generateKeyPairSync(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def generateKeyPairSync(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def generateKeyPairSync(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  @JSName("generateKeyPairSync")
  def generateKeyPairSync_dsa(`type`: dsa, options: DSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
  @JSName("generateKeyPairSync")
  def generateKeyPairSync_ec(`type`: ec, options: ECKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
  @JSName("generateKeyPairSync")
  def generateKeyPairSync_rsa(`type`: rsa, options: RSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
  def getCiphers(): js.Array[String] = js.native
  def getCurves(): js.Array[String] = js.native
  def getDiffieHellman(group_name: String): typings.node.cryptoMod.DiffieHellman = js.native
  def getHashes(): js.Array[String] = js.native
  def pbkdf2(password: String, salt: String, iterations: Double, keylen: Double): js.Promise[Buffer] = js.native
  def pbkdf2(password: String, salt: String, iterations: Double, keylen: Double, digest: String): js.Promise[Buffer] = js.native
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, _]
  ): Unit = js.native
  def pbkdf2(password: String, salt: Buffer, iterations: Double, keylen: Double): js.Promise[Buffer] = js.native
  def pbkdf2(password: String, salt: Buffer, iterations: Double, keylen: Double, digest: String): js.Promise[Buffer] = js.native
  def pbkdf2(
    password: String,
    salt: Buffer,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, _]
  ): Unit = js.native
  def pbkdf2(password: Buffer, salt: String, iterations: Double, keylen: Double): js.Promise[Buffer] = js.native
  def pbkdf2(password: Buffer, salt: String, iterations: Double, keylen: Double, digest: String): js.Promise[Buffer] = js.native
  def pbkdf2(
    password: Buffer,
    salt: String,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, _]
  ): Unit = js.native
  def pbkdf2(password: Buffer, salt: Buffer, iterations: Double, keylen: Double): js.Promise[Buffer] = js.native
  def pbkdf2(password: Buffer, salt: Buffer, iterations: Double, keylen: Double, digest: String): js.Promise[Buffer] = js.native
  def pbkdf2(
    password: Buffer,
    salt: Buffer,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, _]
  ): Unit = js.native
  def pbkdf2(
    password: BinaryLike,
    salt: BinaryLike,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* derivedKey */ Buffer, _]
  ): Unit = js.native
  def pbkdf2Sync(password: BinaryLike, salt: BinaryLike, iterations: Double, keylen: Double, digest: String): Buffer = js.native
  def pseudoRandomBytes(size: Double): Buffer = js.native
  def pseudoRandomBytes(
    size: Double,
    callback: js.Function2[(/* err */ Error) | typings.node.Error | Null, /* buf */ Buffer, Unit]
  ): Unit = js.native
  @JSName("pseudoRandomBytes")
  def pseudoRandomBytes_Promise(size: Double): js.Promise[Buffer] = js.native
  def publicDecrypt(key: KeyLike, buffer: ArrayBufferView): Buffer = js.native
  def publicDecrypt(key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = js.native
  def publicDecrypt(key: RsaPublicKey, buffer: ArrayBufferView): Buffer = js.native
  def publicEncrypt(key: KeyLike, buffer: ArrayBufferView): Buffer = js.native
  def publicEncrypt(key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = js.native
  def publicEncrypt(key: RsaPublicKey, buffer: ArrayBufferView): Buffer = js.native
  def randomBytes(size: Double): Buffer = js.native
  def randomBytes(
    size: Double,
    callback: js.Function2[(/* err */ Error) | typings.node.Error | Null, /* buf */ Buffer, Unit]
  ): Unit = js.native
  @JSName("randomBytes")
  def randomBytes_Promise(size: Double): js.Promise[Buffer] = js.native
  def randomFill(
    buffer: DataView,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ DataView, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: DataView,
    offset: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ DataView, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: DataView,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ DataView, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Float32Array,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Float32Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Float32Array,
    offset: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Float32Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Float32Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Float32Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Float64Array,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Float64Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Float64Array,
    offset: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Float64Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Float64Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Float64Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Int16Array,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Int16Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Int16Array,
    offset: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Int16Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Int16Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Int16Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Int32Array,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Int32Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Int32Array,
    offset: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Int32Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Int32Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Int32Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Int8Array,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Int8Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Int8Array,
    offset: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Int8Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Int8Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Int8Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint16Array,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Uint16Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint16Array,
    offset: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Uint16Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint16Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Uint16Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint32Array,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Uint32Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint32Array,
    offset: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Uint32Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint32Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Uint32Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint8Array,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Uint8Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint8Array,
    offset: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Uint8Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint8Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Uint8Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint8ClampedArray,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Uint8ClampedArray, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint8ClampedArray,
    offset: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Uint8ClampedArray, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint8ClampedArray,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* buf */ Uint8ClampedArray, Unit]
  ): Unit = js.native
  def randomFillSync(buffer: DataView): DataView = js.native
  def randomFillSync(buffer: DataView, offset: Double): DataView = js.native
  def randomFillSync(buffer: DataView, offset: Double, size: Double): DataView = js.native
  def randomFillSync(buffer: Float32Array): Float32Array = js.native
  def randomFillSync(buffer: Float32Array, offset: Double): Float32Array = js.native
  def randomFillSync(buffer: Float32Array, offset: Double, size: Double): Float32Array = js.native
  def randomFillSync(buffer: Float64Array): Float64Array = js.native
  def randomFillSync(buffer: Float64Array, offset: Double): Float64Array = js.native
  def randomFillSync(buffer: Float64Array, offset: Double, size: Double): Float64Array = js.native
  def randomFillSync(buffer: Int16Array): Int16Array = js.native
  def randomFillSync(buffer: Int16Array, offset: Double): Int16Array = js.native
  def randomFillSync(buffer: Int16Array, offset: Double, size: Double): Int16Array = js.native
  def randomFillSync(buffer: Int32Array): Int32Array = js.native
  def randomFillSync(buffer: Int32Array, offset: Double): Int32Array = js.native
  def randomFillSync(buffer: Int32Array, offset: Double, size: Double): Int32Array = js.native
  def randomFillSync(buffer: Int8Array): Int8Array = js.native
  def randomFillSync(buffer: Int8Array, offset: Double): Int8Array = js.native
  def randomFillSync(buffer: Int8Array, offset: Double, size: Double): Int8Array = js.native
  def randomFillSync(buffer: Uint16Array): Uint16Array = js.native
  def randomFillSync(buffer: Uint16Array, offset: Double): Uint16Array = js.native
  def randomFillSync(buffer: Uint16Array, offset: Double, size: Double): Uint16Array = js.native
  def randomFillSync(buffer: Uint32Array): Uint32Array = js.native
  def randomFillSync(buffer: Uint32Array, offset: Double): Uint32Array = js.native
  def randomFillSync(buffer: Uint32Array, offset: Double, size: Double): Uint32Array = js.native
  def randomFillSync(buffer: Uint8Array): Uint8Array = js.native
  def randomFillSync(buffer: Uint8Array, offset: Double): Uint8Array = js.native
  def randomFillSync(buffer: Uint8Array, offset: Double, size: Double): Uint8Array = js.native
  def randomFillSync(buffer: Uint8ClampedArray): Uint8ClampedArray = js.native
  def randomFillSync(buffer: Uint8ClampedArray, offset: Double): Uint8ClampedArray = js.native
  def randomFillSync(buffer: Uint8ClampedArray, offset: Double, size: Double): Uint8ClampedArray = js.native
  def scrypt(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: Double,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
  def scrypt(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ typings.node.Error | Null, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
  def scryptSync(password: BinaryLike, salt: BinaryLike, keylen: Double): Buffer = js.native
  def scryptSync(password: BinaryLike, salt: BinaryLike, keylen: Double, options: ScryptOptions): Buffer = js.native
  def sign(algorithm: js.UndefOr[scala.Nothing], data: ArrayBufferView, key: KeyLike): Buffer = js.native
  def sign(algorithm: js.UndefOr[scala.Nothing], data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = js.native
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPrivateKey()`][].
    */
  def sign(algorithm: String, data: ArrayBufferView, key: KeyLike): Buffer = js.native
  def sign(algorithm: String, data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = js.native
  def sign(algorithm: Null, data: ArrayBufferView, key: KeyLike): Buffer = js.native
  def sign(algorithm: Null, data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = js.native
  def timingSafeEqual(a: ArrayBufferView, b: ArrayBufferView): Boolean = js.native
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: ArrayBufferView,
    key: KeyLike,
    signature: ArrayBufferView
  ): Buffer = js.native
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: ArrayBufferView,
    key: VerifyKeyWithOptions,
    signature: ArrayBufferView
  ): Buffer = js.native
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPublicKey()`][].
    */
  def verify(algorithm: String, data: ArrayBufferView, key: KeyLike, signature: ArrayBufferView): Buffer = js.native
  def verify(algorithm: String, data: ArrayBufferView, key: VerifyKeyWithOptions, signature: ArrayBufferView): Buffer = js.native
  def verify(algorithm: Null, data: ArrayBufferView, key: KeyLike, signature: ArrayBufferView): Buffer = js.native
  def verify(algorithm: Null, data: ArrayBufferView, key: VerifyKeyWithOptions, signature: ArrayBufferView): Buffer = js.native
  @js.native
  object Certificate
    extends Instantiable0[typings.node.cryptoMod.Certificate] {
    def apply(): typings.node.cryptoMod.Certificate = js.native
  }
  
  /* static members */
  @js.native
  object ECDH extends js.Object {
    def convertKey(key: BinaryLike, curve: String): Buffer | String = js.native
    def convertKey(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding): Buffer | String = js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: base64,
      format: compressed
    ): Buffer | String = js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: base64,
      format: hybrid
    ): Buffer | String = js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: base64,
      format: uncompressed
    ): Buffer | String = js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: hex,
      format: compressed
    ): Buffer | String = js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: hex,
      format: hybrid
    ): Buffer | String = js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: hex,
      format: uncompressed
    ): Buffer | String = js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: latin1,
      format: compressed
    ): Buffer | String = js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: latin1,
      format: hybrid
    ): Buffer | String = js.native
    def convertKey(
      key: BinaryLike,
      curve: String,
      inputEncoding: HexBase64Latin1Encoding,
      outputEncoding: latin1,
      format: uncompressed
    ): Buffer | String = js.native
    @JSName("convertKey")
    def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: base64): Buffer | String = js.native
    @JSName("convertKey")
    def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: hex): Buffer | String = js.native
    @JSName("convertKey")
    def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: latin1): Buffer | String = js.native
  }
  
  @js.native
  object constants extends js.Object {
    val ALPN_ENABLED: Double = js.native
    val DH_CHECK_P_NOT_PRIME: Double = js.native
    val DH_CHECK_P_NOT_SAFE_PRIME: Double = js.native
    val DH_NOT_SUITABLE_GENERATOR: Double = js.native
    val DH_UNABLE_TO_CHECK_GENERATOR: Double = js.native
    val ENGINE_METHOD_ALL: Double = js.native
    val ENGINE_METHOD_CIPHERS: Double = js.native
    val ENGINE_METHOD_DH: Double = js.native
    val ENGINE_METHOD_DIGESTS: Double = js.native
    val ENGINE_METHOD_DSA: Double = js.native
    val ENGINE_METHOD_EC: Double = js.native
    val ENGINE_METHOD_NONE: Double = js.native
    val ENGINE_METHOD_PKEY_ASN1_METHS: Double = js.native
    val ENGINE_METHOD_PKEY_METHS: Double = js.native
    val ENGINE_METHOD_RAND: Double = js.native
    val ENGINE_METHOD_RSA: Double = js.native
    // https://nodejs.org/dist/latest-v10.x/docs/api/crypto.html#crypto_crypto_constants
    val OPENSSL_VERSION_NUMBER: Double = js.native
    val POINT_CONVERSION_COMPRESSED: Double = js.native
    val POINT_CONVERSION_HYBRID: Double = js.native
    val POINT_CONVERSION_UNCOMPRESSED: Double = js.native
    val RSA_NO_PADDING: Double = js.native
    val RSA_PKCS1_OAEP_PADDING: Double = js.native
    val RSA_PKCS1_PADDING: Double = js.native
    val RSA_PKCS1_PSS_PADDING: Double = js.native
    /** Causes the salt length for RSA_PKCS1_PSS_PADDING to be determined automatically when verifying a signature. */
    val RSA_PSS_SALTLEN_AUTO: Double = js.native
    /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the digest size when signing or verifying. */
    val RSA_PSS_SALTLEN_DIGEST: Double = js.native
    /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the maximum permissible value when signing data. */
    val RSA_PSS_SALTLEN_MAX_SIGN: Double = js.native
    val RSA_SSLV23_PADDING: Double = js.native
    val RSA_X931_PADDING: Double = js.native
    /** Applies multiple bug workarounds within OpenSSL. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html for detail. */
    val SSL_OP_ALL: Double = js.native
    /** Allows legacy insecure renegotiation between OpenSSL and unpatched clients or servers. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
    val SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: Double = js.native
    /** Attempts to use the server's preferences instead of the client's when selecting a cipher. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
    val SSL_OP_CIPHER_SERVER_PREFERENCE: Double = js.native
    /** Instructs OpenSSL to use Cisco's "speshul" version of DTLS_BAD_VER. */
    val SSL_OP_CISCO_ANYCONNECT: Double = js.native
    /** Instructs OpenSSL to turn on cookie exchange. */
    val SSL_OP_COOKIE_EXCHANGE: Double = js.native
    /** Instructs OpenSSL to add server-hello extension from an early version of the cryptopro draft. */
    val SSL_OP_CRYPTOPRO_TLSEXT_BUG: Double = js.native
    /** Instructs OpenSSL to disable a SSL 3.0/TLS 1.0 vulnerability workaround added in OpenSSL 0.9.6d. */
    val SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: Double = js.native
    /** Instructs OpenSSL to always use the tmp_rsa key when performing RSA operations. */
    val SSL_OP_EPHEMERAL_RSA: Double = js.native
    /** Allows initial connection to servers that do not support RI. */
    val SSL_OP_LEGACY_SERVER_CONNECT: Double = js.native
    val SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER: Double = js.native
    val SSL_OP_MICROSOFT_SESS_ID_BUG: Double = js.native
    /** Instructs OpenSSL to disable the workaround for a man-in-the-middle protocol-version vulnerability in the SSL 2.0 server implementation. */
    val SSL_OP_MSIE_SSLV2_RSA_PADDING: Double = js.native
    val SSL_OP_NETSCAPE_CA_DN_BUG: Double = js.native
    val SSL_OP_NETSCAPE_CHALLENGE_BUG: Double = js.native
    val SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG: Double = js.native
    val SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG: Double = js.native
    /** Instructs OpenSSL to disable support for SSL/TLS compression. */
    val SSL_OP_NO_COMPRESSION: Double = js.native
    val SSL_OP_NO_QUERY_MTU: Double = js.native
    /** Instructs OpenSSL to always start a new session when performing renegotiation. */
    val SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: Double = js.native
    val SSL_OP_NO_SSLv2: Double = js.native
    val SSL_OP_NO_SSLv3: Double = js.native
    val SSL_OP_NO_TICKET: Double = js.native
    val SSL_OP_NO_TLSv1: Double = js.native
    val SSL_OP_NO_TLSv1_1: Double = js.native
    val SSL_OP_NO_TLSv1_2: Double = js.native
    val SSL_OP_PKCS1_CHECK_1: Double = js.native
    val SSL_OP_PKCS1_CHECK_2: Double = js.native
    /** Instructs OpenSSL to always create a new key when using temporary/ephemeral DH parameters. */
    val SSL_OP_SINGLE_DH_USE: Double = js.native
    /** Instructs OpenSSL to always create a new key when using temporary/ephemeral ECDH parameters. */
    val SSL_OP_SINGLE_ECDH_USE: Double = js.native
    val SSL_OP_SSLEAY_080_CLIENT_DH_BUG: Double = js.native
    val SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG: Double = js.native
    val SSL_OP_TLS_BLOCK_PADDING_BUG: Double = js.native
    val SSL_OP_TLS_D5_BUG: Double = js.native
    /** Instructs OpenSSL to disable version rollback attack detection. */
    val SSL_OP_TLS_ROLLBACK_BUG: Double = js.native
    /** Specifies the active default cipher list used by the current Node.js process  (colon-separated values). */
    val defaultCipherList: String = js.native
    /** Specifies the built-in default cipher list used by Node.js (colon-separated values). */
    val defaultCoreCipherList: String = js.native
  }
  
  @js.native
  object generateKeyPair extends js.Object {
    def apply(
      `type`: dsa,
      options: DSAKeyPairKeyObjectOptions,
      callback: js.Function3[
          /* err */ typings.node.Error | Null, 
          /* publicKey */ typings.node.cryptoMod.KeyObject, 
          /* privateKey */ typings.node.cryptoMod.KeyObject, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      `type`: dsa,
      options: DSAKeyPairOptions[der | pem, der | pem],
      callback: js.Function3[
          typings.node.Error | Null, 
          (/* publicKey */ Buffer) | (/* publicKey */ String), 
          (/* privateKey */ Buffer) | (/* privateKey */ String), 
          Unit
        ]
    ): Unit = js.native
    def apply(
      `type`: ec,
      options: ECKeyPairKeyObjectOptions,
      callback: js.Function3[
          /* err */ typings.node.Error | Null, 
          /* publicKey */ typings.node.cryptoMod.KeyObject, 
          /* privateKey */ typings.node.cryptoMod.KeyObject, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      `type`: ec,
      options: ECKeyPairOptions[der | pem, der | pem],
      callback: js.Function3[
          typings.node.Error | Null, 
          (/* publicKey */ Buffer) | (/* publicKey */ String), 
          (/* privateKey */ Buffer) | (/* privateKey */ String), 
          Unit
        ]
    ): Unit = js.native
    def apply(
      `type`: rsa,
      options: RSAKeyPairKeyObjectOptions,
      callback: js.Function3[
          /* err */ typings.node.Error | Null, 
          /* publicKey */ typings.node.cryptoMod.KeyObject, 
          /* privateKey */ typings.node.cryptoMod.KeyObject, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      `type`: rsa,
      options: RSAKeyPairOptions[der | pem, der | pem],
      callback: js.Function3[
          typings.node.Error | Null, 
          (/* publicKey */ Buffer) | (/* publicKey */ String), 
          (/* privateKey */ Buffer) | (/* privateKey */ String), 
          Unit
        ]
    ): Unit = js.native
    def __promisify__(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): js.Promise[Anon_PrivateKey] = js.native
    def __promisify__(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): js.Promise[Anon_PrivateKey] = js.native
    def __promisify__(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): js.Promise[Anon_PrivateKey] = js.native
    @JSName("__promisify__")
    def __promisify___dsa(`type`: dsa, options: DSAKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
    @JSName("__promisify__")
    def __promisify___ec(`type`: ec, options: ECKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
    @JSName("__promisify__")
    def __promisify___rsa(`type`: rsa, options: RSAKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
  }
  
}

