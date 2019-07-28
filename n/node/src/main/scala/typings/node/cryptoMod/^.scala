package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.Error
import typings.node.nodeStrings.der
import typings.node.nodeStrings.dsa
import typings.node.nodeStrings.ec
import typings.node.nodeStrings.pem
import typings.node.nodeStrings.rsa
import typings.node.streamMod.TransformOptions
import typings.node.streamMod.WritableOptions
import typings.std.DataView
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

@JSImport("crypto", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** @deprecated since v10.0.0 */
  val DEFAULT_ENCODING: java.lang.String = js.native
  /** @deprecated since v10.0.0 */
  val fips: Boolean = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: java.lang.String, password: BinaryLike): Cipher = js.native
  def createCipher(algorithm: java.lang.String, password: BinaryLike, options: TransformOptions): Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): CipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherGCMTypes, password: BinaryLike): CipherGCM = js.native
  def createCipher(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): CipherGCM = js.native
  def createCipheriv(algorithm: java.lang.String, key: CipherKey): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: CipherKey, iv: Null, options: TransformOptions): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: CipherKey, iv: BinaryLike): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: CipherKey, iv: BinaryLike, options: TransformOptions): Cipher = js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: Null, options: CipherCCMOptions): CipherCCM = js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): CipherCCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: Null, options: CipherGCMOptions): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: java.lang.String, password: BinaryLike): Decipher = js.native
  def createDecipher(algorithm: java.lang.String, password: BinaryLike, options: TransformOptions): Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): DecipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherGCMTypes, password: BinaryLike): DecipherGCM = js.native
  def createDecipher(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): DecipherGCM = js.native
  def createDecipheriv(algorithm: java.lang.String, key: BinaryLike): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: BinaryLike, iv: Null, options: TransformOptions): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: BinaryLike, iv: BinaryLike): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: BinaryLike, iv: BinaryLike, options: TransformOptions): Decipher = js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: BinaryLike, iv: Null, options: CipherCCMOptions): DecipherCCM = js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: BinaryLike, iv: BinaryLike, options: CipherCCMOptions): DecipherCCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: BinaryLike): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: BinaryLike, iv: Null, options: CipherGCMOptions): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: BinaryLike, iv: BinaryLike): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: BinaryLike, iv: BinaryLike, options: CipherGCMOptions): DecipherGCM = js.native
  def createDiffieHellman(prime_length: Double): DiffieHellman = js.native
  def createDiffieHellman(prime_length: Double, generator: Double): DiffieHellman = js.native
  def createDiffieHellman(prime_length: Double, generator: Binary): DiffieHellman = js.native
  def createDiffieHellman(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding): DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: java.lang.String,
    generator_encoding: HexBase64Latin1Encoding
  ): DiffieHellman = js.native
  def createDiffieHellman(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding, generator: Double): DiffieHellman = js.native
  def createDiffieHellman(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding, generator: Binary): DiffieHellman = js.native
  def createDiffieHellman(prime: Binary): DiffieHellman = js.native
  def createECDH(curve_name: java.lang.String): ECDH = js.native
  def createHash(algorithm: java.lang.String): Hash = js.native
  def createHash(algorithm: java.lang.String, options: TransformOptions): Hash = js.native
  def createHmac(algorithm: java.lang.String, key: BinaryLike): Hmac = js.native
  def createHmac(algorithm: java.lang.String, key: BinaryLike, options: TransformOptions): Hmac = js.native
  def createPrivateKey(key: java.lang.String): KeyObject = js.native
  def createPrivateKey(key: Buffer): KeyObject = js.native
  def createPrivateKey(key: PrivateKeyInput): KeyObject = js.native
  def createPublicKey(key: java.lang.String): KeyObject = js.native
  def createPublicKey(key: Buffer): KeyObject = js.native
  def createPublicKey(key: KeyObject): KeyObject = js.native
  def createPublicKey(key: PublicKeyInput): KeyObject = js.native
  def createSecretKey(key: Buffer): KeyObject = js.native
  def createSign(algorithm: java.lang.String): Signer = js.native
  def createSign(algorithm: java.lang.String, options: WritableOptions): Signer = js.native
  def createVerify(algorithm: java.lang.String): Verify = js.native
  def createVerify(algorithm: java.lang.String, options: WritableOptions): Verify = js.native
  def generateKeyPair(
    `type`: dsa,
    options: DSAKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ Buffer) | (/* privateKey */ java.lang.String), 
      Unit
    ]
  ): Unit = js.native
  def generateKeyPair(
    `type`: ec,
    options: ECKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ Buffer) | (/* privateKey */ java.lang.String), 
      Unit
    ]
  ): Unit = js.native
  def generateKeyPair(
    `type`: rsa,
    options: RSAKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ Buffer) | (/* privateKey */ java.lang.String), 
      Unit
    ]
  ): Unit = js.native
  def generateKeyPairSync(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[java.lang.String, java.lang.String] = js.native
  def generateKeyPairSync(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[java.lang.String, java.lang.String] = js.native
  def generateKeyPairSync(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[java.lang.String, java.lang.String] = js.native
  @JSName("generateKeyPairSync")
  def generateKeyPairSync_dsa(`type`: dsa, options: DSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
  @JSName("generateKeyPairSync")
  def generateKeyPairSync_ec(`type`: ec, options: ECKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
  @JSName("generateKeyPairSync")
  def generateKeyPairSync_rsa(`type`: rsa, options: RSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
  @JSName("generateKeyPair")
  def generateKeyPair_dsa(
    `type`: dsa,
    options: DSAKeyPairKeyObjectOptions,
    callback: js.Function3[/* err */ Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
  ): Unit = js.native
  @JSName("generateKeyPair")
  def generateKeyPair_ec(
    `type`: ec,
    options: ECKeyPairKeyObjectOptions,
    callback: js.Function3[/* err */ Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
  ): Unit = js.native
  @JSName("generateKeyPair")
  def generateKeyPair_rsa(
    `type`: rsa,
    options: RSAKeyPairKeyObjectOptions,
    callback: js.Function3[/* err */ Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
  ): Unit = js.native
  def getCiphers(): js.Array[java.lang.String] = js.native
  def getCurves(): js.Array[java.lang.String] = js.native
  def getDiffieHellman(group_name: java.lang.String): DiffieHellman = js.native
  def getHashes(): js.Array[java.lang.String] = js.native
  def pbkdf2(
    password: BinaryLike,
    salt: BinaryLike,
    iterations: Double,
    keylen: Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ Error | Null, /* derivedKey */ Buffer, _]
  ): Unit = js.native
  def pbkdf2Sync(
    password: BinaryLike,
    salt: BinaryLike,
    iterations: Double,
    keylen: Double,
    digest: java.lang.String
  ): Buffer = js.native
  def privateDecrypt(private_key: KeyLike, buffer: Binary): Buffer = js.native
  def privateDecrypt(private_key: RsaPrivateKey, buffer: Binary): Buffer = js.native
  def privateEncrypt(private_key: KeyLike, buffer: Binary): Buffer = js.native
  def privateEncrypt(private_key: RsaPrivateKey, buffer: Binary): Buffer = js.native
  def pseudoRandomBytes(size: Double): Buffer = js.native
  def pseudoRandomBytes(size: Double, callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
  def publicDecrypt(public_key: KeyLike, buffer: Binary): Buffer = js.native
  def publicDecrypt(public_key: RsaPublicKey, buffer: Binary): Buffer = js.native
  def publicEncrypt(public_key: KeyLike, buffer: Binary): Buffer = js.native
  def publicEncrypt(public_key: RsaPublicKey, buffer: Binary): Buffer = js.native
  def randomBytes(size: Double): Buffer = js.native
  def randomBytes(size: Double, callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]): Unit = js.native
  def randomFill(buffer: DataView, callback: js.Function2[/* err */ Error | Null, /* buf */ DataView, Unit]): Unit = js.native
  def randomFill(
    buffer: DataView,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ DataView, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: DataView,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ DataView, Unit]
  ): Unit = js.native
  def randomFill(buffer: Float32Array, callback: js.Function2[/* err */ Error | Null, /* buf */ Float32Array, Unit]): Unit = js.native
  def randomFill(
    buffer: Float32Array,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Float32Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Float32Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Float32Array, Unit]
  ): Unit = js.native
  def randomFill(buffer: Float64Array, callback: js.Function2[/* err */ Error | Null, /* buf */ Float64Array, Unit]): Unit = js.native
  def randomFill(
    buffer: Float64Array,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Float64Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Float64Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Float64Array, Unit]
  ): Unit = js.native
  def randomFill(buffer: Int16Array, callback: js.Function2[/* err */ Error | Null, /* buf */ Int16Array, Unit]): Unit = js.native
  def randomFill(
    buffer: Int16Array,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Int16Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Int16Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Int16Array, Unit]
  ): Unit = js.native
  def randomFill(buffer: Int32Array, callback: js.Function2[/* err */ Error | Null, /* buf */ Int32Array, Unit]): Unit = js.native
  def randomFill(
    buffer: Int32Array,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Int32Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Int32Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Int32Array, Unit]
  ): Unit = js.native
  def randomFill(buffer: Int8Array, callback: js.Function2[/* err */ Error | Null, /* buf */ Int8Array, Unit]): Unit = js.native
  def randomFill(
    buffer: Int8Array,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Int8Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Int8Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Int8Array, Unit]
  ): Unit = js.native
  def randomFill(buffer: Uint16Array, callback: js.Function2[/* err */ Error | Null, /* buf */ Uint16Array, Unit]): Unit = js.native
  def randomFill(
    buffer: Uint16Array,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint16Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint16Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint16Array, Unit]
  ): Unit = js.native
  def randomFill(buffer: Uint32Array, callback: js.Function2[/* err */ Error | Null, /* buf */ Uint32Array, Unit]): Unit = js.native
  def randomFill(
    buffer: Uint32Array,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint32Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint32Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint32Array, Unit]
  ): Unit = js.native
  def randomFill(buffer: Uint8Array, callback: js.Function2[/* err */ Error | Null, /* buf */ Uint8Array, Unit]): Unit = js.native
  def randomFill(
    buffer: Uint8Array,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint8Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint8Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint8Array, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint8ClampedArray,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint8ClampedArray, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint8ClampedArray,
    offset: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint8ClampedArray, Unit]
  ): Unit = js.native
  def randomFill(
    buffer: Uint8ClampedArray,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Uint8ClampedArray, Unit]
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
    callback: js.Function2[/* err */ Error | Null, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
  def scrypt(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ Error | Null, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
  def scryptSync(password: BinaryLike, salt: BinaryLike, keylen: Double): Buffer = js.native
  def scryptSync(password: BinaryLike, salt: BinaryLike, keylen: Double, options: ScryptOptions): Buffer = js.native
  def sign(algorithm: js.UndefOr[scala.Nothing], data: Binary, key: KeyLike): Buffer = js.native
  def sign(algorithm: js.UndefOr[scala.Nothing], data: Binary, key: SignPrivateKeyInput): Buffer = js.native
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPrivateKey()`][].
    */
  def sign(algorithm: java.lang.String, data: Binary, key: KeyLike): Buffer = js.native
  def sign(algorithm: java.lang.String, data: Binary, key: SignPrivateKeyInput): Buffer = js.native
  def sign(algorithm: Null, data: Binary, key: KeyLike): Buffer = js.native
  def sign(algorithm: Null, data: Binary, key: SignPrivateKeyInput): Buffer = js.native
  def timingSafeEqual(a: Binary, b: Binary): Boolean = js.native
  def verify(algorithm: js.UndefOr[scala.Nothing], data: Binary, key: KeyLike, signature: Binary): Buffer = js.native
  def verify(algorithm: js.UndefOr[scala.Nothing], data: Binary, key: VerifyKeyWithOptions, signature: Binary): Buffer = js.native
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPublicKey()`][].
    */
  def verify(algorithm: java.lang.String, data: Binary, key: KeyLike, signature: Binary): Buffer = js.native
  def verify(algorithm: java.lang.String, data: Binary, key: VerifyKeyWithOptions, signature: Binary): Buffer = js.native
  def verify(algorithm: Null, data: Binary, key: KeyLike, signature: Binary): Buffer = js.native
  def verify(algorithm: Null, data: Binary, key: VerifyKeyWithOptions, signature: Binary): Buffer = js.native
}

