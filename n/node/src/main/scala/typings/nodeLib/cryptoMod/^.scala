package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** @deprecated since v10.0.0 */
  val DEFAULT_ENCODING: java.lang.String = js.native
  /** @deprecated since v10.0.0 */
  val fips: scala.Boolean = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: java.lang.String, password: BinaryLike): Cipher = js.native
  def createCipher(algorithm: java.lang.String, password: BinaryLike, options: nodeLib.streamMod.TransformOptions): Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): CipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: CipherGCMTypes, password: BinaryLike): CipherGCM = js.native
  def createCipher(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): CipherGCM = js.native
  def createCipheriv(algorithm: java.lang.String, key: CipherKey): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: CipherKey, iv: BinaryLike): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: CipherKey,
    iv: BinaryLike,
    options: nodeLib.streamMod.TransformOptions
  ): Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: CipherKey,
    iv: scala.Null,
    options: nodeLib.streamMod.TransformOptions
  ): Cipher = js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): CipherCCM = js.native
  def createCipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: scala.Null, options: CipherCCMOptions): CipherCCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): CipherGCM = js.native
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: scala.Null, options: CipherGCMOptions): CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: java.lang.String, password: BinaryLike): Decipher = js.native
  def createDecipher(algorithm: java.lang.String, password: BinaryLike, options: nodeLib.streamMod.TransformOptions): Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): DecipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: CipherGCMTypes, password: BinaryLike): DecipherGCM = js.native
  def createDecipher(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): DecipherGCM = js.native
  def createDecipheriv(algorithm: java.lang.String, key: BinaryLike): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: BinaryLike, iv: BinaryLike): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: BinaryLike,
    iv: BinaryLike,
    options: nodeLib.streamMod.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: BinaryLike,
    iv: scala.Null,
    options: nodeLib.streamMod.TransformOptions
  ): Decipher = js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: BinaryLike, iv: BinaryLike, options: CipherCCMOptions): DecipherCCM = js.native
  def createDecipheriv(algorithm: CipherCCMTypes, key: BinaryLike, iv: scala.Null, options: CipherCCMOptions): DecipherCCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: BinaryLike): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: BinaryLike, iv: BinaryLike): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: BinaryLike, iv: BinaryLike, options: CipherGCMOptions): DecipherGCM = js.native
  def createDecipheriv(algorithm: CipherGCMTypes, key: BinaryLike, iv: scala.Null, options: CipherGCMOptions): DecipherGCM = js.native
  def createDiffieHellman(prime_length: scala.Double): DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: Binary): DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: scala.Double): DiffieHellman = js.native
  def createDiffieHellman(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding): DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: HexBase64Latin1Encoding,
    generator: java.lang.String,
    generator_encoding: HexBase64Latin1Encoding
  ): DiffieHellman = js.native
  def createDiffieHellman(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding, generator: Binary): DiffieHellman = js.native
  def createDiffieHellman(prime: java.lang.String, prime_encoding: HexBase64Latin1Encoding, generator: scala.Double): DiffieHellman = js.native
  def createDiffieHellman(prime: Binary): DiffieHellman = js.native
  def createECDH(curve_name: java.lang.String): ECDH = js.native
  def createHash(algorithm: java.lang.String): Hash = js.native
  def createHash(algorithm: java.lang.String, options: nodeLib.streamMod.TransformOptions): Hash = js.native
  def createHmac(algorithm: java.lang.String, key: BinaryLike): Hmac = js.native
  def createHmac(algorithm: java.lang.String, key: BinaryLike, options: nodeLib.streamMod.TransformOptions): Hmac = js.native
  def createPrivateKey(key: java.lang.String): KeyObject = js.native
  def createPrivateKey(key: nodeLib.Buffer): KeyObject = js.native
  def createPrivateKey(key: PrivateKeyInput): KeyObject = js.native
  def createPublicKey(key: java.lang.String): KeyObject = js.native
  def createPublicKey(key: nodeLib.Buffer): KeyObject = js.native
  def createPublicKey(key: KeyObject): KeyObject = js.native
  def createPublicKey(key: PublicKeyInput): KeyObject = js.native
  def createSecretKey(key: nodeLib.Buffer): KeyObject = js.native
  def createSign(algorithm: java.lang.String): Signer = js.native
  def createSign(algorithm: java.lang.String, options: nodeLib.streamMod.WritableOptions): Signer = js.native
  def createVerify(algorith: java.lang.String): Verify = js.native
  def createVerify(algorith: java.lang.String, options: nodeLib.streamMod.WritableOptions): Verify = js.native
  def generateKeyPair(
    `type`: nodeLib.nodeLibStrings.dsa,
    options: DSAKeyPairOptions[
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem, 
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem
    ],
    callback: js.Function3[
      nodeLib.Error | scala.Null, 
      (/* publicKey */ nodeLib.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ nodeLib.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def generateKeyPair(
    `type`: nodeLib.nodeLibStrings.ec,
    options: ECKeyPairOptions[
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem, 
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem
    ],
    callback: js.Function3[
      nodeLib.Error | scala.Null, 
      (/* publicKey */ nodeLib.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ nodeLib.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def generateKeyPair(
    `type`: nodeLib.nodeLibStrings.rsa,
    options: RSAKeyPairOptions[
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem, 
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem
    ],
    callback: js.Function3[
      nodeLib.Error | scala.Null, 
      (/* publicKey */ nodeLib.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ nodeLib.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def generateKeyPairSync(
    `type`: nodeLib.nodeLibStrings.dsa,
    options: DSAKeyPairOptions[
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem, 
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem
    ]
  ): KeyPairSyncResult[java.lang.String, java.lang.String] = js.native
  def generateKeyPairSync(
    `type`: nodeLib.nodeLibStrings.ec,
    options: ECKeyPairOptions[
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem, 
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem
    ]
  ): KeyPairSyncResult[java.lang.String, java.lang.String] = js.native
  def generateKeyPairSync(
    `type`: nodeLib.nodeLibStrings.rsa,
    options: RSAKeyPairOptions[
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem, 
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem
    ]
  ): KeyPairSyncResult[java.lang.String, java.lang.String] = js.native
  @JSName("generateKeyPairSync")
  def generateKeyPairSync_dsa(`type`: nodeLib.nodeLibStrings.dsa, options: DSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
  @JSName("generateKeyPairSync")
  def generateKeyPairSync_ec(`type`: nodeLib.nodeLibStrings.ec, options: ECKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
  @JSName("generateKeyPairSync")
  def generateKeyPairSync_rsa(`type`: nodeLib.nodeLibStrings.rsa, options: RSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
  @JSName("generateKeyPair")
  def generateKeyPair_dsa(
    `type`: nodeLib.nodeLibStrings.dsa,
    options: DSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* publicKey */ KeyObject, 
      /* privateKey */ KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("generateKeyPair")
  def generateKeyPair_ec(
    `type`: nodeLib.nodeLibStrings.ec,
    options: ECKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* publicKey */ KeyObject, 
      /* privateKey */ KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("generateKeyPair")
  def generateKeyPair_rsa(
    `type`: nodeLib.nodeLibStrings.rsa,
    options: RSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* publicKey */ KeyObject, 
      /* privateKey */ KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getCiphers(): js.Array[java.lang.String] = js.native
  def getCurves(): js.Array[java.lang.String] = js.native
  def getDiffieHellman(group_name: java.lang.String): DiffieHellman = js.native
  def getHashes(): js.Array[java.lang.String] = js.native
  def pbkdf2(
    password: BinaryLike,
    salt: BinaryLike,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2Sync(
    password: BinaryLike,
    salt: BinaryLike,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: KeyLike, buffer: Binary): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: RsaPrivateKey, buffer: Binary): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: KeyLike, buffer: Binary): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: RsaPrivateKey, buffer: Binary): nodeLib.Buffer = js.native
  def pseudoRandomBytes(size: scala.Double): nodeLib.Buffer = js.native
  def pseudoRandomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def publicDecrypt(public_key: KeyLike, buffer: Binary): nodeLib.Buffer = js.native
  def publicDecrypt(public_key: RsaPublicKey, buffer: Binary): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: KeyLike, buffer: Binary): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: RsaPublicKey, buffer: Binary): nodeLib.Buffer = js.native
  def randomBytes(size: scala.Double): nodeLib.Buffer = js.native
  def randomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: nodeLib.Buffer,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.DataView,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.DataView, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.DataView,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.DataView, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.DataView,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.DataView, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float32Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float32Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float64Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float64Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float64Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float64Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float64Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float64Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int16Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int16Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int16Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int32Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int32Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int8Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int8Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int8Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint16Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint16Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint16Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint32Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint32Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8ClampedArray,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8ClampedArray, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8ClampedArray,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8ClampedArray, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8ClampedArray,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8ClampedArray, scala.Unit]
  ): scala.Unit = js.native
  def randomFillSync(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def randomFillSync(buffer: nodeLib.Buffer, offset: scala.Double): nodeLib.Buffer = js.native
  def randomFillSync(buffer: nodeLib.Buffer, offset: scala.Double, size: scala.Double): nodeLib.Buffer = js.native
  def randomFillSync(buffer: stdLib.DataView): stdLib.DataView = js.native
  def randomFillSync(buffer: stdLib.DataView, offset: scala.Double): stdLib.DataView = js.native
  def randomFillSync(buffer: stdLib.DataView, offset: scala.Double, size: scala.Double): stdLib.DataView = js.native
  def randomFillSync(buffer: stdLib.Float32Array): stdLib.Float32Array = js.native
  def randomFillSync(buffer: stdLib.Float32Array, offset: scala.Double): stdLib.Float32Array = js.native
  def randomFillSync(buffer: stdLib.Float32Array, offset: scala.Double, size: scala.Double): stdLib.Float32Array = js.native
  def randomFillSync(buffer: stdLib.Float64Array): stdLib.Float64Array = js.native
  def randomFillSync(buffer: stdLib.Float64Array, offset: scala.Double): stdLib.Float64Array = js.native
  def randomFillSync(buffer: stdLib.Float64Array, offset: scala.Double, size: scala.Double): stdLib.Float64Array = js.native
  def randomFillSync(buffer: stdLib.Int16Array): stdLib.Int16Array = js.native
  def randomFillSync(buffer: stdLib.Int16Array, offset: scala.Double): stdLib.Int16Array = js.native
  def randomFillSync(buffer: stdLib.Int16Array, offset: scala.Double, size: scala.Double): stdLib.Int16Array = js.native
  def randomFillSync(buffer: stdLib.Int32Array): stdLib.Int32Array = js.native
  def randomFillSync(buffer: stdLib.Int32Array, offset: scala.Double): stdLib.Int32Array = js.native
  def randomFillSync(buffer: stdLib.Int32Array, offset: scala.Double, size: scala.Double): stdLib.Int32Array = js.native
  def randomFillSync(buffer: stdLib.Int8Array): stdLib.Int8Array = js.native
  def randomFillSync(buffer: stdLib.Int8Array, offset: scala.Double): stdLib.Int8Array = js.native
  def randomFillSync(buffer: stdLib.Int8Array, offset: scala.Double, size: scala.Double): stdLib.Int8Array = js.native
  def randomFillSync(buffer: stdLib.Uint16Array): stdLib.Uint16Array = js.native
  def randomFillSync(buffer: stdLib.Uint16Array, offset: scala.Double): stdLib.Uint16Array = js.native
  def randomFillSync(buffer: stdLib.Uint16Array, offset: scala.Double, size: scala.Double): stdLib.Uint16Array = js.native
  def randomFillSync(buffer: stdLib.Uint32Array): stdLib.Uint32Array = js.native
  def randomFillSync(buffer: stdLib.Uint32Array, offset: scala.Double): stdLib.Uint32Array = js.native
  def randomFillSync(buffer: stdLib.Uint32Array, offset: scala.Double, size: scala.Double): stdLib.Uint32Array = js.native
  def randomFillSync(buffer: stdLib.Uint8Array): stdLib.Uint8Array = js.native
  def randomFillSync(buffer: stdLib.Uint8Array, offset: scala.Double): stdLib.Uint8Array = js.native
  def randomFillSync(buffer: stdLib.Uint8Array, offset: scala.Double, size: scala.Double): stdLib.Uint8Array = js.native
  def randomFillSync(buffer: stdLib.Uint8ClampedArray): stdLib.Uint8ClampedArray = js.native
  def randomFillSync(buffer: stdLib.Uint8ClampedArray, offset: scala.Double): stdLib.Uint8ClampedArray = js.native
  def randomFillSync(buffer: stdLib.Uint8ClampedArray, offset: scala.Double, size: scala.Double): stdLib.Uint8ClampedArray = js.native
  def scrypt(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: scala.Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scryptSync(password: BinaryLike, salt: BinaryLike, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(password: BinaryLike, salt: BinaryLike, keylen: scala.Double, options: ScryptOptions): nodeLib.Buffer = js.native
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPrivateKey()`][].
    */
  def sign(algorithm: java.lang.String, data: Binary, key: KeyLike): nodeLib.Buffer = js.native
  def sign(algorithm: java.lang.String, data: Binary, key: SignPrivateKeyInput): nodeLib.Buffer = js.native
  def sign(algorithm: js.UndefOr[scala.Nothing], data: Binary, key: KeyLike): nodeLib.Buffer = js.native
  def sign(algorithm: js.UndefOr[scala.Nothing], data: Binary, key: SignPrivateKeyInput): nodeLib.Buffer = js.native
  def sign(algorithm: scala.Null, data: Binary, key: KeyLike): nodeLib.Buffer = js.native
  def sign(algorithm: scala.Null, data: Binary, key: SignPrivateKeyInput): nodeLib.Buffer = js.native
  def timingSafeEqual(a: Binary, b: Binary): scala.Boolean = js.native
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPublicKey()`][].
    */
  def verify(algorithm: java.lang.String, data: Binary, key: KeyLike, signature: Binary): nodeLib.Buffer = js.native
  def verify(algorithm: java.lang.String, data: Binary, key: VerifyKeyWithOptions, signature: Binary): nodeLib.Buffer = js.native
  def verify(algorithm: js.UndefOr[scala.Nothing], data: Binary, key: KeyLike, signature: Binary): nodeLib.Buffer = js.native
  def verify(algorithm: js.UndefOr[scala.Nothing], data: Binary, key: VerifyKeyWithOptions, signature: Binary): nodeLib.Buffer = js.native
  def verify(algorithm: scala.Null, data: Binary, key: KeyLike, signature: Binary): nodeLib.Buffer = js.native
  def verify(algorithm: scala.Null, data: Binary, key: VerifyKeyWithOptions, signature: Binary): nodeLib.Buffer = js.native
}

