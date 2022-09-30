package typings.node.cryptoMod

import typings.node.anon.Length
import typings.node.anon.PrivateKey
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.cryptoMod.^
import typings.node.cryptoMod.webcrypto.SubtleCrypto
import typings.node.nodeInts.`0`
import typings.node.nodeInts.`1`
import typings.node.nodeStrings.`rsa-pss`
import typings.node.nodeStrings.aes
import typings.node.nodeStrings.der
import typings.node.nodeStrings.dsa
import typings.node.nodeStrings.ec
import typings.node.nodeStrings.ed25519
import typings.node.nodeStrings.ed448
import typings.node.nodeStrings.hmac
import typings.node.nodeStrings.pem
import typings.node.nodeStrings.rsa
import typings.node.nodeStrings.x25519
import typings.node.nodeStrings.x448
import typings.node.streamMod.TransformOptions
import typings.node.streamMod.WritableOptions
import typings.std.SharedArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** @deprecated since v10.0.0 */
inline def DEFAULT_ENCODING: BufferEncoding = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_ENCODING").asInstanceOf[BufferEncoding]

/**
  * Checks the primality of the `candidate`.
  * @since v15.8.0
  * @param candidate A possible prime encoded as a sequence of big endian octets of arbitrary length.
  */
inline def checkPrime(
  value: LargeNumberLike,
  callback: js.Function2[/* err */ js.Error | Null, /* result */ Boolean, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPrime")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def checkPrime(
  value: LargeNumberLike,
  options: CheckPrimeOptions,
  callback: js.Function2[/* err */ js.Error | Null, /* result */ Boolean, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPrime")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Checks the primality of the `candidate`.
  * @since v15.8.0
  * @param candidate A possible prime encoded as a sequence of big endian octets of arbitrary length.
  * @return `true` if the candidate is a prime with an error probability less than `0.25 ** options.checks`.
  */
inline def checkPrimeSync(candidate: LargeNumberLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPrimeSync")(candidate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def checkPrimeSync(candidate: LargeNumberLike, options: CheckPrimeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPrimeSync")(candidate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/** @deprecated since v10.0.0 use `createCipheriv()` */
inline def createCipher(algorithm: String, password: BinaryLike): Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Cipher]
inline def createCipher(algorithm: String, password: BinaryLike, options: TransformOptions): Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Cipher]
/**
  * Creates and returns a `Cipher` object that uses the given `algorithm` and`password`.
  *
  * The `options` argument controls stream behavior and is optional except when a
  * cipher in CCM or OCB mode (e.g. `'aes-128-ccm'`) is used. In that case, the`authTagLength` option is required and specifies the length of the
  * authentication tag in bytes, see `CCM mode`. In GCM mode, the `authTagLength`option is not required but can be used to set the length of the authentication
  * tag that will be returned by `getAuthTag()` and defaults to 16 bytes.
  * For `chacha20-poly1305`, the `authTagLength` option defaults to 16 bytes.
  *
  * The `algorithm` is dependent on OpenSSL, examples are `'aes192'`, etc. On
  * recent OpenSSL releases, `openssl list -cipher-algorithms` will
  * display the available cipher algorithms.
  *
  * The `password` is used to derive the cipher key and initialization vector (IV).
  * The value must be either a `'latin1'` encoded string, a `Buffer`, a`TypedArray`, or a `DataView`.
  *
  * The implementation of `crypto.createCipher()` derives keys using the OpenSSL
  * function [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) with the digest algorithm set to MD5, one
  * iteration, and no salt. The lack of salt allows dictionary attacks as the same
  * password always creates the same key. The low iteration count and
  * non-cryptographically secure hash algorithm allow passwords to be tested very
  * rapidly.
  *
  * In line with OpenSSL's recommendation to use a more modern algorithm instead of [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) it is recommended that
  * developers derive a key and IV on
  * their own using {@link scrypt} and to use {@link createCipheriv} to create the `Cipher` object. Users should not use ciphers with counter mode
  * (e.g. CTR, GCM, or CCM) in `crypto.createCipher()`. A warning is emitted when
  * they are used in order to avoid the risk of IV reuse that causes
  * vulnerabilities. For the case when IV is reused in GCM, see [Nonce-Disrespecting Adversaries](https://github.com/nonce-disrespect/nonce-disrespect) for details.
  * @since v0.1.94
  * @deprecated Since v10.0.0 - Use {@link createCipheriv} instead.
  * @param options `stream.transform` options
  */
inline def createCipher(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): CipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherCCM]
/** @deprecated since v10.0.0 use `createCipheriv()` */
inline def createCipher(algorithm: CipherGCMTypes, password: BinaryLike): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
inline def createCipher(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]

inline def createCipheriv(algorithm: String, key: CipherKey): Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Cipher]
inline def createCipheriv(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Cipher]
inline def createCipheriv(algorithm: String, key: CipherKey, iv: BinaryLike): Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Cipher]
inline def createCipheriv(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Cipher]
/**
  * Creates and returns a `Cipher` object, with the given `algorithm`, `key` and
  * initialization vector (`iv`).
  *
  * The `options` argument controls stream behavior and is optional except when a
  * cipher in CCM or OCB mode (e.g. `'aes-128-ccm'`) is used. In that case, the`authTagLength` option is required and specifies the length of the
  * authentication tag in bytes, see `CCM mode`. In GCM mode, the `authTagLength`option is not required but can be used to set the length of the authentication
  * tag that will be returned by `getAuthTag()` and defaults to 16 bytes.
  * For `chacha20-poly1305`, the `authTagLength` option defaults to 16 bytes.
  *
  * The `algorithm` is dependent on OpenSSL, examples are `'aes192'`, etc. On
  * recent OpenSSL releases, `openssl list -cipher-algorithms` will
  * display the available cipher algorithms.
  *
  * The `key` is the raw key used by the `algorithm` and `iv` is an [initialization vector](https://en.wikipedia.org/wiki/Initialization_vector). Both arguments must be `'utf8'` encoded
  * strings,`Buffers`, `TypedArray`, or `DataView`s. The `key` may optionally be
  * a `KeyObject` of type `secret`. If the cipher does not need
  * an initialization vector, `iv` may be `null`.
  *
  * When passing strings for `key` or `iv`, please consider `caveats when using strings as inputs to cryptographic APIs`.
  *
  * Initialization vectors should be unpredictable and unique; ideally, they will be
  * cryptographically random. They do not have to be secret: IVs are typically just
  * added to ciphertext messages unencrypted. It may sound contradictory that
  * something has to be unpredictable and unique, but does not have to be secret;
  * remember that an attacker must not be able to predict ahead of time what a
  * given IV will be.
  * @since v0.1.94
  * @param options `stream.transform` options
  */
inline def createCipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): CipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherCCM]
inline def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
inline def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
inline def createCipheriv(algorithm: CipherOCBTypes, key: CipherKey, iv: BinaryLike, options: CipherOCBOptions): CipherOCB = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherOCB]

/** @deprecated since v10.0.0 use `createDecipheriv()` */
inline def createDecipher(algorithm: String, password: BinaryLike): Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Decipher]
inline def createDecipher(algorithm: String, password: BinaryLike, options: TransformOptions): Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Decipher]
/**
  * Creates and returns a `Decipher` object that uses the given `algorithm` and`password` (key).
  *
  * The `options` argument controls stream behavior and is optional except when a
  * cipher in CCM or OCB mode (e.g. `'aes-128-ccm'`) is used. In that case, the`authTagLength` option is required and specifies the length of the
  * authentication tag in bytes, see `CCM mode`.
  * For `chacha20-poly1305`, the `authTagLength` option defaults to 16 bytes.
  *
  * The implementation of `crypto.createDecipher()` derives keys using the OpenSSL
  * function [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) with the digest algorithm set to MD5, one
  * iteration, and no salt. The lack of salt allows dictionary attacks as the same
  * password always creates the same key. The low iteration count and
  * non-cryptographically secure hash algorithm allow passwords to be tested very
  * rapidly.
  *
  * In line with OpenSSL's recommendation to use a more modern algorithm instead of [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) it is recommended that
  * developers derive a key and IV on
  * their own using {@link scrypt} and to use {@link createDecipheriv} to create the `Decipher` object.
  * @since v0.1.94
  * @deprecated Since v10.0.0 - Use {@link createDecipheriv} instead.
  * @param options `stream.transform` options
  */
inline def createDecipher(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): DecipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherCCM]
/** @deprecated since v10.0.0 use `createDecipheriv()` */
inline def createDecipher(algorithm: CipherGCMTypes, password: BinaryLike): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
inline def createDecipher(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]

inline def createDecipheriv(algorithm: String, key: CipherKey): Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Decipher]
inline def createDecipheriv(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Decipher]
inline def createDecipheriv(algorithm: String, key: CipherKey, iv: BinaryLike): Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Decipher]
inline def createDecipheriv(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Decipher]
/**
  * Creates and returns a `Decipher` object that uses the given `algorithm`, `key`and initialization vector (`iv`).
  *
  * The `options` argument controls stream behavior and is optional except when a
  * cipher in CCM or OCB mode (e.g. `'aes-128-ccm'`) is used. In that case, the`authTagLength` option is required and specifies the length of the
  * authentication tag in bytes, see `CCM mode`. In GCM mode, the `authTagLength`option is not required but can be used to restrict accepted authentication tags
  * to those with the specified length.
  * For `chacha20-poly1305`, the `authTagLength` option defaults to 16 bytes.
  *
  * The `algorithm` is dependent on OpenSSL, examples are `'aes192'`, etc. On
  * recent OpenSSL releases, `openssl list -cipher-algorithms` will
  * display the available cipher algorithms.
  *
  * The `key` is the raw key used by the `algorithm` and `iv` is an [initialization vector](https://en.wikipedia.org/wiki/Initialization_vector). Both arguments must be `'utf8'` encoded
  * strings,`Buffers`, `TypedArray`, or `DataView`s. The `key` may optionally be
  * a `KeyObject` of type `secret`. If the cipher does not need
  * an initialization vector, `iv` may be `null`.
  *
  * When passing strings for `key` or `iv`, please consider `caveats when using strings as inputs to cryptographic APIs`.
  *
  * Initialization vectors should be unpredictable and unique; ideally, they will be
  * cryptographically random. They do not have to be secret: IVs are typically just
  * added to ciphertext messages unencrypted. It may sound contradictory that
  * something has to be unpredictable and unique, but does not have to be secret;
  * remember that an attacker must not be able to predict ahead of time what a given
  * IV will be.
  * @since v0.1.94
  * @param options `stream.transform` options
  */
inline def createDecipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): DecipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherCCM]
inline def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
inline def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
inline def createDecipheriv(algorithm: CipherOCBTypes, key: CipherKey, iv: BinaryLike, options: CipherOCBOptions): DecipherOCB = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherOCB]

/**
  * Creates a `DiffieHellman` key exchange object using the supplied `prime` and an
  * optional specific `generator`.
  *
  * The `generator` argument can be a number, string, or `Buffer`. If`generator` is not specified, the value `2` is used.
  *
  * If `primeEncoding` is specified, `prime` is expected to be a string; otherwise
  * a `Buffer`, `TypedArray`, or `DataView` is expected.
  *
  * If `generatorEncoding` is specified, `generator` is expected to be a string;
  * otherwise a number, `Buffer`, `TypedArray`, or `DataView` is expected.
  * @since v0.11.12
  * @param primeEncoding The `encoding` of the `prime` string.
  * @param [generator=2]
  * @param generatorEncoding The `encoding` of the `generator` string.
  */
inline def createDiffieHellman(primeLength: Double): DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(primeLength.asInstanceOf[js.Any]).asInstanceOf[DiffieHellman_]
inline def createDiffieHellman(primeLength: Double, generator: Double): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(primeLength.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
inline def createDiffieHellman(prime: String, primeEncoding: BinaryToTextEncoding): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], primeEncoding.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
inline def createDiffieHellman(
  prime: String,
  primeEncoding: BinaryToTextEncoding,
  generator: String,
  generatorEncoding: BinaryToTextEncoding
): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], primeEncoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], generatorEncoding.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
inline def createDiffieHellman(prime: String, primeEncoding: BinaryToTextEncoding, generator: js.typedarray.ArrayBuffer): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], primeEncoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
inline def createDiffieHellman(prime: String, primeEncoding: BinaryToTextEncoding, generator: js.typedarray.ArrayBufferView): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], primeEncoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
inline def createDiffieHellman(prime: String, primeEncoding: BinaryToTextEncoding, generator: Double): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], primeEncoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
inline def createDiffieHellman(prime: js.typedarray.ArrayBuffer): DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any]).asInstanceOf[DiffieHellman_]
inline def createDiffieHellman(prime: js.typedarray.ArrayBufferView): DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any]).asInstanceOf[DiffieHellman_]
inline def createDiffieHellman(prime: js.typedarray.ArrayBufferView, generator: String, generatorEncoding: BinaryToTextEncoding): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], generatorEncoding.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
inline def createDiffieHellman(prime: js.typedarray.ArrayBufferView, generator: js.typedarray.ArrayBuffer): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
inline def createDiffieHellman(prime: js.typedarray.ArrayBufferView, generator: js.typedarray.ArrayBufferView): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
inline def createDiffieHellman(prime: js.typedarray.ArrayBufferView, generator: Double): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
inline def createDiffieHellman(prime: js.typedarray.ArrayBuffer, generator: String, generatorEncoding: BinaryToTextEncoding): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], generatorEncoding.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
inline def createDiffieHellman(prime: js.typedarray.ArrayBuffer, generator: js.typedarray.ArrayBuffer): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
inline def createDiffieHellman(prime: js.typedarray.ArrayBuffer, generator: js.typedarray.ArrayBufferView): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
inline def createDiffieHellman(prime: js.typedarray.ArrayBuffer, generator: Double): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]

/**
  * An alias for {@link getDiffieHellman}
  * @since v0.9.3
  */
inline def createDiffieHellmanGroup(name: String): DiffieHellmanGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellmanGroup")(name.asInstanceOf[js.Any]).asInstanceOf[DiffieHellmanGroup]

/**
  * Creates an Elliptic Curve Diffie-Hellman (`ECDH`) key exchange object using a
  * predefined curve specified by the `curveName` string. Use {@link getCurves} to obtain a list of available curve names. On recent
  * OpenSSL releases, `openssl ecparam -list_curves` will also display the name
  * and description of each available elliptic curve.
  * @since v0.11.14
  */
inline def createECDH(curveName: String): ECDH = ^.asInstanceOf[js.Dynamic].applyDynamic("createECDH")(curveName.asInstanceOf[js.Any]).asInstanceOf[ECDH]

/**
  * Creates and returns a `Hash` object that can be used to generate hash digests
  * using the given `algorithm`. Optional `options` argument controls stream
  * behavior. For XOF hash functions such as `'shake256'`, the `outputLength` option
  * can be used to specify the desired output length in bytes.
  *
  * The `algorithm` is dependent on the available algorithms supported by the
  * version of OpenSSL on the platform. Examples are `'sha256'`, `'sha512'`, etc.
  * On recent releases of OpenSSL, `openssl list -digest-algorithms` will
  * display the available digest algorithms.
  *
  * Example: generating the sha256 sum of a file
  *
  * ```js
  * import {
  *   createReadStream
  * } from 'fs';
  * import { argv } from 'process';
  * const {
  *   createHash
  * } = await import('crypto');
  *
  * const filename = argv[2];
  *
  * const hash = createHash('sha256');
  *
  * const input = createReadStream(filename);
  * input.on('readable', () => {
  *   // Only one element is going to be produced by the
  *   // hash stream.
  *   const data = input.read();
  *   if (data)
  *     hash.update(data);
  *   else {
  *     console.log(`${hash.digest('hex')} ${filename}`);
  *   }
  * });
  * ```
  * @since v0.1.92
  * @param options `stream.transform` options
  */
inline def createHash(algorithm: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[Hash]
inline def createHash(algorithm: String, options: HashOptions): Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Hash]

/**
  * Creates and returns an `Hmac` object that uses the given `algorithm` and `key`.
  * Optional `options` argument controls stream behavior.
  *
  * The `algorithm` is dependent on the available algorithms supported by the
  * version of OpenSSL on the platform. Examples are `'sha256'`, `'sha512'`, etc.
  * On recent releases of OpenSSL, `openssl list -digest-algorithms` will
  * display the available digest algorithms.
  *
  * The `key` is the HMAC key used to generate the cryptographic HMAC hash. If it is
  * a `KeyObject`, its type must be `secret`.
  *
  * Example: generating the sha256 HMAC of a file
  *
  * ```js
  * import {
  *   createReadStream
  * } from 'fs';
  * import { argv } from 'process';
  * const {
  *   createHmac
  * } = await import('crypto');
  *
  * const filename = argv[2];
  *
  * const hmac = createHmac('sha256', 'a secret');
  *
  * const input = createReadStream(filename);
  * input.on('readable', () => {
  *   // Only one element is going to be produced by the
  *   // hash stream.
  *   const data = input.read();
  *   if (data)
  *     hmac.update(data);
  *   else {
  *     console.log(`${hmac.digest('hex')} ${filename}`);
  *   }
  * });
  * ```
  * @since v0.1.94
  * @param options `stream.transform` options
  */
inline def createHmac(algorithm: String, key: BinaryLike): Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Hmac]
inline def createHmac(algorithm: String, key: BinaryLike, options: TransformOptions): Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Hmac]
inline def createHmac(algorithm: String, key: KeyObject): Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Hmac]
inline def createHmac(algorithm: String, key: KeyObject, options: TransformOptions): Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Hmac]

inline def createPrivateKey(key: String): KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[KeyObject]
inline def createPrivateKey(key: Buffer): KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[KeyObject]
inline def createPrivateKey(key: JsonWebKeyInput): KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[KeyObject]
/**
  * Creates and returns a new key object containing a private key. If `key` is a
  * string or `Buffer`, `format` is assumed to be `'pem'`; otherwise, `key`must be an object with the properties described above.
  *
  * If the private key is encrypted, a `passphrase` must be specified. The length
  * of the passphrase is limited to 1024 bytes.
  * @since v11.6.0
  */
inline def createPrivateKey(key: PrivateKeyInput): KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[KeyObject]

inline def createPublicKey(key: String): KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[KeyObject]
inline def createPublicKey(key: Buffer): KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[KeyObject]
inline def createPublicKey(key: JsonWebKeyInput): KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[KeyObject]
inline def createPublicKey(key: KeyObject): KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[KeyObject]
/**
  * Creates and returns a new key object containing a public key. If `key` is a
  * string or `Buffer`, `format` is assumed to be `'pem'`; if `key` is a `KeyObject`with type `'private'`, the public key is derived from the given private key;
  * otherwise, `key` must be an object with the properties described above.
  *
  * If the format is `'pem'`, the `'key'` may also be an X.509 certificate.
  *
  * Because public keys can be derived from private keys, a private key may be
  * passed instead of a public key. In that case, this function behaves as if {@link createPrivateKey} had been called, except that the type of the
  * returned `KeyObject` will be `'public'` and that the private key cannot be
  * extracted from the returned `KeyObject`. Similarly, if a `KeyObject` with type`'private'` is given, a new `KeyObject` with type `'public'` will be returned
  * and it will be impossible to extract the private key from the returned object.
  * @since v11.6.0
  */
inline def createPublicKey(key: PublicKeyInput): KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[KeyObject]

inline def createSecretKey(key: String, encoding: BufferEncoding): KeyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecretKey")(key.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[KeyObject]
/**
  * Creates and returns a new key object containing a secret key for symmetric
  * encryption or `Hmac`.
  * @since v11.6.0
  * @param encoding The string encoding when `key` is a string.
  */
inline def createSecretKey(key: js.typedarray.ArrayBufferView): KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecretKey")(key.asInstanceOf[js.Any]).asInstanceOf[KeyObject]

/**
  * Creates and returns a `Sign` object that uses the given `algorithm`. Use {@link getHashes} to obtain the names of the available digest algorithms.
  * Optional `options` argument controls the `stream.Writable` behavior.
  *
  * In some cases, a `Sign` instance can be created using the name of a signature
  * algorithm, such as `'RSA-SHA256'`, instead of a digest algorithm. This will use
  * the corresponding digest algorithm. This does not work for all signature
  * algorithms, such as `'ecdsa-with-SHA256'`, so it is best to always use digest
  * algorithm names.
  * @since v0.1.92
  * @param options `stream.Writable` options
  */
inline def createSign(algorithm: String): Sign_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(algorithm.asInstanceOf[js.Any]).asInstanceOf[Sign_]
inline def createSign(algorithm: String, options: WritableOptions): Sign_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sign_]

/**
  * Creates and returns a `Verify` object that uses the given algorithm.
  * Use {@link getHashes} to obtain an array of names of the available
  * signing algorithms. Optional `options` argument controls the`stream.Writable` behavior.
  *
  * In some cases, a `Verify` instance can be created using the name of a signature
  * algorithm, such as `'RSA-SHA256'`, instead of a digest algorithm. This will use
  * the corresponding digest algorithm. This does not work for all signature
  * algorithms, such as `'ecdsa-with-SHA256'`, so it is best to always use digest
  * algorithm names.
  * @since v0.1.92
  * @param options `stream.Writable` options
  */
inline def createVerify(algorithm: String): Verify_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(algorithm.asInstanceOf[js.Any]).asInstanceOf[Verify_]
inline def createVerify(algorithm: String, options: WritableOptions): Verify_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Verify_]

/**
  * Computes the Diffie-Hellman secret based on a `privateKey` and a `publicKey`.
  * Both keys must have the same `asymmetricKeyType`, which must be one of `'dh'`(for Diffie-Hellman), `'ec'` (for ECDH), `'x448'`, or `'x25519'` (for ECDH-ES).
  * @since v13.9.0, v12.17.0
  */
inline def diffieHellman(options: PrivateKey): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("diffieHellman")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]

/** @deprecated since v10.0.0 */
inline def fips: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("fips").asInstanceOf[Boolean]

/**
  * Asynchronously generates a new random secret key of the given `length`. The`type` will determine which validations will be performed on the `length`.
  *
  * ```js
  * const {
  *   generateKey
  * } = await import('crypto');
  *
  * generateKey('hmac', { length: 64 }, (err, key) => {
  *   if (err) throw err;
  *   console.log(key.export().toString('hex'));  // 46e..........620
  * });
  * ```
  * @since v15.0.0
  * @param type The intended use of the generated secret key. Currently accepted values are `'hmac'` and `'aes'`.
  */
inline def generateKey(
  `type`: hmac | aes,
  options: Length,
  callback: js.Function2[/* err */ js.Error | Null, /* key */ KeyObject, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def generateKeyPair(
  `type`: `rsa-pss`,
  options: RSAPSSKeyPairKeyObjectOptions,
  callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: `rsa-pss`,
  options: RSAPSSKeyPairOptions[der | pem, der | pem],
  callback: js.Function3[
  js.Error | Null, 
  (/* publicKey */ Buffer) | (/* publicKey */ String), 
  (/* privateKey */ Buffer) | (/* privateKey */ String), 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: dsa,
  options: DSAKeyPairKeyObjectOptions,
  callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: dsa,
  options: DSAKeyPairOptions[der | pem, der | pem],
  callback: js.Function3[
  js.Error | Null, 
  (/* publicKey */ Buffer) | (/* publicKey */ String), 
  (/* privateKey */ Buffer) | (/* privateKey */ String), 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: ec,
  options: ECKeyPairKeyObjectOptions,
  callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: ec,
  options: ECKeyPairOptions[der | pem, der | pem],
  callback: js.Function3[
  js.Error | Null, 
  (/* publicKey */ Buffer) | (/* publicKey */ String), 
  (/* privateKey */ Buffer) | (/* privateKey */ String), 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: ed25519,
  options: Unit,
  callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: ed25519,
  options: ED25519KeyPairKeyObjectOptions,
  callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: ed25519,
  options: ED25519KeyPairOptions[der | pem, der | pem],
  callback: js.Function3[
  js.Error | Null, 
  (/* publicKey */ Buffer) | (/* publicKey */ String), 
  (/* privateKey */ Buffer) | (/* privateKey */ String), 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: ed448,
  options: Unit,
  callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: ed448,
  options: ED448KeyPairKeyObjectOptions,
  callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: ed448,
  options: ED448KeyPairOptions[der | pem, der | pem],
  callback: js.Function3[
  js.Error | Null, 
  (/* publicKey */ Buffer) | (/* publicKey */ String), 
  (/* privateKey */ Buffer) | (/* privateKey */ String), 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: rsa,
  options: RSAKeyPairKeyObjectOptions,
  callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
/**
  * Generates a new asymmetric key pair of the given `type`. RSA, RSA-PSS, DSA, EC,
  * Ed25519, Ed448, X25519, X448, and DH are currently supported.
  *
  * If a `publicKeyEncoding` or `privateKeyEncoding` was specified, this function
  * behaves as if `keyObject.export()` had been called on its result. Otherwise,
  * the respective part of the key is returned as a `KeyObject`.
  *
  * It is recommended to encode public keys as `'spki'` and private keys as`'pkcs8'` with encryption for long-term storage:
  *
  * ```js
  * const {
  *   generateKeyPair
  * } = await import('crypto');
  *
  * generateKeyPair('rsa', {
  *   modulusLength: 4096,
  *   publicKeyEncoding: {
  *     type: 'spki',
  *     format: 'pem'
  *   },
  *   privateKeyEncoding: {
  *     type: 'pkcs8',
  *     format: 'pem',
  *     cipher: 'aes-256-cbc',
  *     passphrase: 'top secret'
  *   }
  * }, (err, publicKey, privateKey) => {
  *   // Handle errors and use the generated key pair.
  * });
  * ```
  *
  * On completion, `callback` will be called with `err` set to `undefined` and`publicKey` / `privateKey` representing the generated key pair.
  *
  * If this method is invoked as its `util.promisify()` ed version, it returns
  * a `Promise` for an `Object` with `publicKey` and `privateKey` properties.
  * @since v10.12.0
  * @param type Must be `'rsa'`, `'rsa-pss'`, `'dsa'`, `'ec'`, `'ed25519'`, `'ed448'`, `'x25519'`, `'x448'`, or `'dh'`.
  */
inline def generateKeyPair(
  `type`: rsa,
  options: RSAKeyPairOptions[der | pem, der | pem],
  callback: js.Function3[
  js.Error | Null, 
  (/* publicKey */ Buffer) | (/* publicKey */ String), 
  (/* privateKey */ Buffer) | (/* privateKey */ String), 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: x25519,
  options: Unit,
  callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: x25519,
  options: X25519KeyPairKeyObjectOptions,
  callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: x25519,
  options: X25519KeyPairOptions[der | pem, der | pem],
  callback: js.Function3[
  js.Error | Null, 
  (/* publicKey */ Buffer) | (/* publicKey */ String), 
  (/* privateKey */ Buffer) | (/* privateKey */ String), 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: x448,
  options: Unit,
  callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: x448,
  options: X448KeyPairKeyObjectOptions,
  callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generateKeyPair(
  `type`: x448,
  options: X448KeyPairOptions[der | pem, der | pem],
  callback: js.Function3[
  js.Error | Null, 
  (/* publicKey */ Buffer) | (/* publicKey */ String), 
  (/* privateKey */ Buffer) | (/* privateKey */ String), 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def generateKeyPairSync(`type`: `rsa-pss`, options: RSAPSSKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
inline def generateKeyPairSync(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
inline def generateKeyPairSync(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
inline def generateKeyPairSync(`type`: ed25519, options: ED25519KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
inline def generateKeyPairSync(`type`: ed448, options: ED448KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
/**
  * Generates a new asymmetric key pair of the given `type`. RSA, RSA-PSS, DSA, EC,
  * Ed25519, Ed448, X25519, X448, and DH are currently supported.
  *
  * If a `publicKeyEncoding` or `privateKeyEncoding` was specified, this function
  * behaves as if `keyObject.export()` had been called on its result. Otherwise,
  * the respective part of the key is returned as a `KeyObject`.
  *
  * When encoding public keys, it is recommended to use `'spki'`. When encoding
  * private keys, it is recommended to use `'pkcs8'` with a strong passphrase,
  * and to keep the passphrase confidential.
  *
  * ```js
  * const {
  *   generateKeyPairSync
  * } = await import('crypto');
  *
  * const {
  *   publicKey,
  *   privateKey,
  * } = generateKeyPairSync('rsa', {
  *   modulusLength: 4096,
  *   publicKeyEncoding: {
  *     type: 'spki',
  *     format: 'pem'
  *   },
  *   privateKeyEncoding: {
  *     type: 'pkcs8',
  *     format: 'pem',
  *     cipher: 'aes-256-cbc',
  *     passphrase: 'top secret'
  *   }
  * });
  * ```
  *
  * The return value `{ publicKey, privateKey }` represents the generated key pair.
  * When PEM encoding was selected, the respective key will be a string, otherwise
  * it will be a buffer containing the data encoded as DER.
  * @since v10.12.0
  * @param type Must be `'rsa'`, `'rsa-pss'`, `'dsa'`, `'ec'`, `'ed25519'`, `'ed448'`, `'x25519'`, `'x448'`, or `'dh'`.
  */
inline def generateKeyPairSync(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
inline def generateKeyPairSync(`type`: x25519, options: X25519KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
inline def generateKeyPairSync(`type`: x448, options: X448KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]

inline def generateKeyPairSync_dsa(`type`: dsa, options: DSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]

inline def generateKeyPairSync_ec(`type`: ec, options: ECKeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]

inline def generateKeyPairSync_ed25519(`type`: ed25519): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[KeyPairKeyObjectResult]
inline def generateKeyPairSync_ed25519(`type`: ed25519, options: ED25519KeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]

inline def generateKeyPairSync_ed448(`type`: ed448): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[KeyPairKeyObjectResult]
inline def generateKeyPairSync_ed448(`type`: ed448, options: ED448KeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]

inline def generateKeyPairSync_rsa(`type`: rsa, options: RSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]

inline def generateKeyPairSync_rsapss(`type`: `rsa-pss`, options: RSAPSSKeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]

inline def generateKeyPairSync_x25519(`type`: x25519): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[KeyPairKeyObjectResult]
inline def generateKeyPairSync_x25519(`type`: x25519, options: X25519KeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]

inline def generateKeyPairSync_x448(`type`: x448): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[KeyPairKeyObjectResult]
inline def generateKeyPairSync_x448(`type`: x448, options: X448KeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]

/**
  * Synchronously generates a new random secret key of the given `length`. The`type` will determine which validations will be performed on the `length`.
  *
  * ```js
  * const {
  *   generateKeySync
  * } = await import('crypto');
  *
  * const key = generateKeySync('hmac', { length: 64 });
  * console.log(key.export().toString('hex'));  // e89..........41e
  * ```
  * @since v15.0.0
  * @param type The intended use of the generated secret key. Currently accepted values are `'hmac'` and `'aes'`.
  */
inline def generateKeySync(`type`: hmac | aes, options: Length): KeyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeySync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyObject]

/**
  * Generates a pseudorandom prime of `size` bits.
  *
  * If `options.safe` is `true`, the prime will be a safe prime -- that is,`(prime - 1) / 2` will also be a prime.
  *
  * The `options.add` and `options.rem` parameters can be used to enforce additional
  * requirements, e.g., for Diffie-Hellman:
  *
  * * If `options.add` and `options.rem` are both set, the prime will satisfy the
  * condition that `prime % add = rem`.
  * * If only `options.add` is set and `options.safe` is not `true`, the prime will
  * satisfy the condition that `prime % add = 1`.
  * * If only `options.add` is set and `options.safe` is set to `true`, the prime
  * will instead satisfy the condition that `prime % add = 3`. This is necessary
  * because `prime % add = 1` for `options.add > 2` would contradict the condition
  * enforced by `options.safe`.
  * * `options.rem` is ignored if `options.add` is not given.
  *
  * Both `options.add` and `options.rem` must be encoded as big-endian sequences
  * if given as an `ArrayBuffer`, `SharedArrayBuffer`, `TypedArray`, `Buffer`, or`DataView`.
  *
  * By default, the prime is encoded as a big-endian sequence of octets
  * in an [ArrayBuffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer). If the `bigint` option is `true`, then a
  * [bigint](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt) is provided.
  * @since v15.8.0
  * @param size The size (in bits) of the prime to generate.
  */
inline def generatePrime(
  size: Double,
  callback: js.Function2[/* err */ js.Error | Null, /* prime */ js.typedarray.ArrayBuffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrime")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generatePrime(
  size: Double,
  options: GeneratePrimeOptionsArrayBuffer,
  callback: js.Function2[/* err */ js.Error | Null, /* prime */ js.typedarray.ArrayBuffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrime")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generatePrime(
  size: Double,
  options: GeneratePrimeOptionsBigInt,
  callback: js.Function2[/* err */ js.Error | Null, /* prime */ js.BigInt, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrime")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def generatePrime(
  size: Double,
  options: GeneratePrimeOptions,
  callback: js.Function2[/* err */ js.Error | Null, /* prime */ js.typedarray.ArrayBuffer | js.BigInt, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrime")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Generates a pseudorandom prime of `size` bits.
  *
  * If `options.safe` is `true`, the prime will be a safe prime -- that is,`(prime - 1) / 2` will also be a prime.
  *
  * The `options.add` and `options.rem` parameters can be used to enforce additional
  * requirements, e.g., for Diffie-Hellman:
  *
  * * If `options.add` and `options.rem` are both set, the prime will satisfy the
  * condition that `prime % add = rem`.
  * * If only `options.add` is set and `options.safe` is not `true`, the prime will
  * satisfy the condition that `prime % add = 1`.
  * * If only `options.add` is set and `options.safe` is set to `true`, the prime
  * will instead satisfy the condition that `prime % add = 3`. This is necessary
  * because `prime % add = 1` for `options.add > 2` would contradict the condition
  * enforced by `options.safe`.
  * * `options.rem` is ignored if `options.add` is not given.
  *
  * Both `options.add` and `options.rem` must be encoded as big-endian sequences
  * if given as an `ArrayBuffer`, `SharedArrayBuffer`, `TypedArray`, `Buffer`, or`DataView`.
  *
  * By default, the prime is encoded as a big-endian sequence of octets
  * in an [ArrayBuffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer). If the `bigint` option is `true`, then a
  * [bigint](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt) is provided.
  * @since v15.8.0
  * @param size The size (in bits) of the prime to generate.
  */
inline def generatePrimeSync(size: Double): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePrimeSync")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
inline def generatePrimeSync(size: Double, options: GeneratePrimeOptions): js.typedarray.ArrayBuffer | js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrimeSync")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer | js.BigInt]
inline def generatePrimeSync(size: Double, options: GeneratePrimeOptionsArrayBuffer): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrimeSync")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
inline def generatePrimeSync(size: Double, options: GeneratePrimeOptionsBigInt): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrimeSync")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]

/**
  * Returns information about a given cipher.
  *
  * Some ciphers accept variable length keys and initialization vectors. By default,
  * the `crypto.getCipherInfo()` method will return the default values for these
  * ciphers. To test if a given key length or iv length is acceptable for given
  * cipher, use the `keyLength` and `ivLength` options. If the given values are
  * unacceptable, `undefined` will be returned.
  * @since v15.0.0
  * @param nameOrNid The name or nid of the cipher to query.
  */
inline def getCipherInfo(nameOrNid: String): js.UndefOr[CipherInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCipherInfo")(nameOrNid.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CipherInfo]]
inline def getCipherInfo(nameOrNid: String, options: CipherInfoOptions): js.UndefOr[CipherInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCipherInfo")(nameOrNid.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CipherInfo]]
inline def getCipherInfo(nameOrNid: Double): js.UndefOr[CipherInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCipherInfo")(nameOrNid.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CipherInfo]]
inline def getCipherInfo(nameOrNid: Double, options: CipherInfoOptions): js.UndefOr[CipherInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCipherInfo")(nameOrNid.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CipherInfo]]

/**
  * ```js
  * const {
  *   getCiphers
  * } = await import('crypto');
  *
  * console.log(getCiphers()); // ['aes-128-cbc', 'aes-128-ccm', ...]
  * ```
  * @since v0.9.3
  * @return An array with the names of the supported cipher algorithms.
  */
inline def getCiphers(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCiphers")().asInstanceOf[js.Array[String]]

/**
  * ```js
  * const {
  *   getCurves
  * } = await import('crypto');
  *
  * console.log(getCurves()); // ['Oakley-EC2N-3', 'Oakley-EC2N-4', ...]
  * ```
  * @since v2.3.0
  * @return An array with the names of the supported elliptic curves.
  */
inline def getCurves(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurves")().asInstanceOf[js.Array[String]]

/**
  * Creates a predefined `DiffieHellmanGroup` key exchange object. The
  * supported groups are: `'modp1'`, `'modp2'`, `'modp5'` (defined in [RFC 2412](https://www.rfc-editor.org/rfc/rfc2412.txt), but see `Caveats`) and `'modp14'`, `'modp15'`,`'modp16'`, `'modp17'`,
  * `'modp18'` (defined in [RFC 3526](https://www.rfc-editor.org/rfc/rfc3526.txt)). The
  * returned object mimics the interface of objects created by {@link createDiffieHellman}, but will not allow changing
  * the keys (with `diffieHellman.setPublicKey()`, for example). The
  * advantage of using this method is that the parties do not have to
  * generate nor exchange a group modulus beforehand, saving both processor
  * and communication time.
  *
  * Example (obtaining a shared secret):
  *
  * ```js
  * const {
  *   getDiffieHellman
  * } = await import('crypto');
  * const alice = getDiffieHellman('modp14');
  * const bob = getDiffieHellman('modp14');
  *
  * alice.generateKeys();
  * bob.generateKeys();
  *
  * const aliceSecret = alice.computeSecret(bob.getPublicKey(), null, 'hex');
  * const bobSecret = bob.computeSecret(alice.getPublicKey(), null, 'hex');
  *
  * // aliceSecret and bobSecret should be the same
  * console.log(aliceSecret === bobSecret);
  * ```
  * @since v0.7.5
  */
inline def getDiffieHellman(groupName: String): DiffieHellmanGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiffieHellman")(groupName.asInstanceOf[js.Any]).asInstanceOf[DiffieHellmanGroup]

/**
  * @since v10.0.0
  * @return `1` if and only if a FIPS compliant crypto provider is currently in use, `0` otherwise. A future semver-major release may change the return type of this API to a {boolean}.
  */
inline def getFips(): `1` | `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("getFips")().asInstanceOf[`1` | `0`]

/**
  * ```js
  * const {
  *   getHashes
  * } = await import('crypto');
  *
  * console.log(getHashes()); // ['DSA', 'DSA-SHA', 'DSA-SHA1', ...]
  * ```
  * @since v0.9.3
  * @return An array of the names of the supported hash algorithms, such as `'RSA-SHA256'`. Hash algorithms are also called "digest" algorithms.
  */
inline def getHashes(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHashes")().asInstanceOf[js.Array[String]]

inline def getRandomValues(typedArray: js.typedarray.ArrayBuffer): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomValues")(typedArray.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
/**
  * A convenient alias for `crypto.webcrypto.getRandomValues()`.
  * This implementation is not compliant with the Web Crypto spec,
  * to write web-compatible code use `crypto.webcrypto.getRandomValues()` instead.
  * @since v17.4.0
  * @returns Returns `typedArray`.
  */
inline def getRandomValues(typedArray: js.typedarray.ArrayBufferView): js.typedarray.ArrayBufferView = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomValues")(typedArray.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBufferView]

/**
  * HKDF is a simple key derivation function defined in RFC 5869\. The given `ikm`,`salt` and `info` are used with the `digest` to derive a key of `keylen` bytes.
  *
  * The supplied `callback` function is called with two arguments: `err` and`derivedKey`. If an errors occurs while deriving the key, `err` will be set;
  * otherwise `err` will be `null`. The successfully generated `derivedKey` will
  * be passed to the callback as an [ArrayBuffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer). An error will be thrown if any
  * of the input arguments specify invalid values or types.
  *
  * ```js
  * import { Buffer } from 'buffer';
  * const {
  *   hkdf
  * } = await import('crypto');
  *
  * hkdf('sha512', 'key', 'salt', 'info', 64, (err, derivedKey) => {
  *   if (err) throw err;
  *   console.log(Buffer.from(derivedKey).toString('hex'));  // '24156e2...5391653'
  * });
  * ```
  * @since v15.0.0
  * @param digest The digest algorithm to use.
  * @param ikm The input keying material. It must be at least one byte in length.
  * @param salt The salt value. Must be provided but can be zero-length.
  * @param info Additional info value. Must be provided but can be zero-length, and cannot be more than 1024 bytes.
  * @param keylen The length of the key to generate. Must be greater than 0. The maximum allowable value is `255` times the number of bytes produced by the selected digest function (e.g. `sha512`
  * generates 64-byte hashes, making the maximum HKDF output 16320 bytes).
  */
inline def hkdf(
  digest: String,
  irm: BinaryLike,
  salt: BinaryLike,
  info: BinaryLike,
  keylen: Double,
  callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ js.typedarray.ArrayBuffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], irm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def hkdf(
  digest: String,
  irm: KeyObject,
  salt: BinaryLike,
  info: BinaryLike,
  keylen: Double,
  callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ js.typedarray.ArrayBuffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], irm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Provides a synchronous HKDF key derivation function as defined in RFC 5869\. The
  * given `ikm`, `salt` and `info` are used with the `digest` to derive a key of`keylen` bytes.
  *
  * The successfully generated `derivedKey` will be returned as an [ArrayBuffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer).
  *
  * An error will be thrown if any of the input arguments specify invalid values or
  * types, or if the derived key cannot be generated.
  *
  * ```js
  * import { Buffer } from 'buffer';
  * const {
  *   hkdfSync
  * } = await import('crypto');
  *
  * const derivedKey = hkdfSync('sha512', 'key', 'salt', 'info', 64);
  * console.log(Buffer.from(derivedKey).toString('hex'));  // '24156e2...5391653'
  * ```
  * @since v15.0.0
  * @param digest The digest algorithm to use.
  * @param ikm The input keying material. It must be at least one byte in length.
  * @param salt The salt value. Must be provided but can be zero-length.
  * @param info Additional info value. Must be provided but can be zero-length, and cannot be more than 1024 bytes.
  * @param keylen The length of the key to generate. Must be greater than 0. The maximum allowable value is `255` times the number of bytes produced by the selected digest function (e.g. `sha512`
  * generates 64-byte hashes, making the maximum HKDF output 16320 bytes).
  */
inline def hkdfSync(digest: String, ikm: BinaryLike, salt: BinaryLike, info: BinaryLike, keylen: Double): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdfSync")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
inline def hkdfSync(digest: String, ikm: KeyObject, salt: BinaryLike, info: BinaryLike, keylen: Double): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdfSync")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]

/**
  * Provides an asynchronous Password-Based Key Derivation Function 2 (PBKDF2)
  * implementation. A selected HMAC digest algorithm specified by `digest` is
  * applied to derive a key of the requested byte length (`keylen`) from the`password`, `salt` and `iterations`.
  *
  * The supplied `callback` function is called with two arguments: `err` and`derivedKey`. If an error occurs while deriving the key, `err` will be set;
  * otherwise `err` will be `null`. By default, the successfully generated`derivedKey` will be passed to the callback as a `Buffer`. An error will be
  * thrown if any of the input arguments specify invalid values or types.
  *
  * If `digest` is `null`, `'sha1'` will be used. This behavior is deprecated,
  * please specify a `digest` explicitly.
  *
  * The `iterations` argument must be a number set as high as possible. The
  * higher the number of iterations, the more secure the derived key will be,
  * but will take a longer amount of time to complete.
  *
  * The `salt` should be as unique as possible. It is recommended that a salt is
  * random and at least 16 bytes long. See [NIST SP 800-132](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-132.pdf) for details.
  *
  * When passing strings for `password` or `salt`, please consider `caveats when using strings as inputs to cryptographic APIs`.
  *
  * ```js
  * const {
  *   pbkdf2
  * } = await import('crypto');
  *
  * pbkdf2('secret', 'salt', 100000, 64, 'sha512', (err, derivedKey) => {
  *   if (err) throw err;
  *   console.log(derivedKey.toString('hex'));  // '3745e48...08d59ae'
  * });
  * ```
  *
  * The `crypto.DEFAULT_ENCODING` property can be used to change the way the`derivedKey` is passed to the callback. This property, however, has been
  * deprecated and use should be avoided.
  *
  * ```js
  * import crypto from 'crypto';
  * crypto.DEFAULT_ENCODING = 'hex';
  * crypto.pbkdf2('secret', 'salt', 100000, 512, 'sha512', (err, derivedKey) => {
  *   if (err) throw err;
  *   console.log(derivedKey);  // '3745e48...aa39b34'
  * });
  * ```
  *
  * An array of supported digest functions can be retrieved using {@link getHashes}.
  *
  * This API uses libuv's threadpool, which can have surprising and
  * negative performance implications for some applications; see the `UV_THREADPOOL_SIZE` documentation for more information.
  * @since v0.5.5
  */
inline def pbkdf2(
  password: BinaryLike,
  salt: BinaryLike,
  iterations: Double,
  keylen: Double,
  digest: String,
  callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Provides a synchronous Password-Based Key Derivation Function 2 (PBKDF2)
  * implementation. A selected HMAC digest algorithm specified by `digest` is
  * applied to derive a key of the requested byte length (`keylen`) from the`password`, `salt` and `iterations`.
  *
  * If an error occurs an `Error` will be thrown, otherwise the derived key will be
  * returned as a `Buffer`.
  *
  * If `digest` is `null`, `'sha1'` will be used. This behavior is deprecated,
  * please specify a `digest` explicitly.
  *
  * The `iterations` argument must be a number set as high as possible. The
  * higher the number of iterations, the more secure the derived key will be,
  * but will take a longer amount of time to complete.
  *
  * The `salt` should be as unique as possible. It is recommended that a salt is
  * random and at least 16 bytes long. See [NIST SP 800-132](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-132.pdf) for details.
  *
  * When passing strings for `password` or `salt`, please consider `caveats when using strings as inputs to cryptographic APIs`.
  *
  * ```js
  * const {
  *   pbkdf2Sync
  * } = await import('crypto');
  *
  * const key = pbkdf2Sync('secret', 'salt', 100000, 64, 'sha512');
  * console.log(key.toString('hex'));  // '3745e48...08d59ae'
  * ```
  *
  * The `crypto.DEFAULT_ENCODING` property may be used to change the way the`derivedKey` is returned. This property, however, is deprecated and use
  * should be avoided.
  *
  * ```js
  * import crypto from 'crypto';
  * crypto.DEFAULT_ENCODING = 'hex';
  * const key = crypto.pbkdf2Sync('secret', 'salt', 100000, 512, 'sha512');
  * console.log(key);  // '3745e48...aa39b34'
  * ```
  *
  * An array of supported digest functions can be retrieved using {@link getHashes}.
  * @since v0.9.3
  */
inline def pbkdf2Sync(password: BinaryLike, salt: BinaryLike, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]

inline def privateDecrypt(privateKey: KeyLike, buffer: js.typedarray.ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateDecrypt")(privateKey.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
/**
  * Decrypts `buffer` with `privateKey`. `buffer` was previously encrypted using
  * the corresponding public key, for example using {@link publicEncrypt}.
  *
  * If `privateKey` is not a `KeyObject`, this function behaves as if`privateKey` had been passed to {@link createPrivateKey}. If it is an
  * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_OAEP_PADDING`.
  * @since v0.11.14
  */
inline def privateDecrypt(privateKey: RsaPrivateKey, buffer: js.typedarray.ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateDecrypt")(privateKey.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]

inline def privateEncrypt(privateKey: KeyLike, buffer: js.typedarray.ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateEncrypt")(privateKey.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
/**
  * Encrypts `buffer` with `privateKey`. The returned data can be decrypted using
  * the corresponding public key, for example using {@link publicDecrypt}.
  *
  * If `privateKey` is not a `KeyObject`, this function behaves as if`privateKey` had been passed to {@link createPrivateKey}. If it is an
  * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_PADDING`.
  * @since v1.1.0
  */
inline def privateEncrypt(privateKey: RsaPrivateKey, buffer: js.typedarray.ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateEncrypt")(privateKey.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]

inline def pseudoRandomBytes(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
inline def pseudoRandomBytes(size: Double, callback: js.Function2[/* err */ js.Error | Null, /* buf */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def publicDecrypt(key: KeyLike, buffer: js.typedarray.ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
inline def publicDecrypt(key: RsaPrivateKey, buffer: js.typedarray.ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
/**
  * Decrypts `buffer` with `key`.`buffer` was previously encrypted using
  * the corresponding private key, for example using {@link privateEncrypt}.
  *
  * If `key` is not a `KeyObject`, this function behaves as if`key` had been passed to {@link createPublicKey}. If it is an
  * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_PADDING`.
  *
  * Because RSA public keys can be derived from private keys, a private key may
  * be passed instead of a public key.
  * @since v1.1.0
  */
inline def publicDecrypt(key: RsaPublicKey, buffer: js.typedarray.ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]

inline def publicEncrypt(key: KeyLike, buffer: js.typedarray.ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
inline def publicEncrypt(key: RsaPrivateKey, buffer: js.typedarray.ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
/**
  * Encrypts the content of `buffer` with `key` and returns a new `Buffer` with encrypted content. The returned data can be decrypted using
  * the corresponding private key, for example using {@link privateDecrypt}.
  *
  * If `key` is not a `KeyObject`, this function behaves as if`key` had been passed to {@link createPublicKey}. If it is an
  * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_OAEP_PADDING`.
  *
  * Because RSA public keys can be derived from private keys, a private key may
  * be passed instead of a public key.
  * @since v0.11.14
  */
inline def publicEncrypt(key: RsaPublicKey, buffer: js.typedarray.ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]

/**
  * Generates cryptographically strong pseudorandom data. The `size` argument
  * is a number indicating the number of bytes to generate.
  *
  * If a `callback` function is provided, the bytes are generated asynchronously
  * and the `callback` function is invoked with two arguments: `err` and `buf`.
  * If an error occurs, `err` will be an `Error` object; otherwise it is `null`. The`buf` argument is a `Buffer` containing the generated bytes.
  *
  * ```js
  * // Asynchronous
  * const {
  *   randomBytes
  * } = await import('crypto');
  *
  * randomBytes(256, (err, buf) => {
  *   if (err) throw err;
  *   console.log(`${buf.length} bytes of random data: ${buf.toString('hex')}`);
  * });
  * ```
  *
  * If the `callback` function is not provided, the random bytes are generated
  * synchronously and returned as a `Buffer`. An error will be thrown if
  * there is a problem generating the bytes.
  *
  * ```js
  * // Synchronous
  * const {
  *   randomBytes
  * } = await import('crypto');
  *
  * const buf = randomBytes(256);
  * console.log(
  *   `${buf.length} bytes of random data: ${buf.toString('hex')}`);
  * ```
  *
  * The `crypto.randomBytes()` method will not complete until there is
  * sufficient entropy available.
  * This should normally never take longer than a few milliseconds. The only time
  * when generating the random bytes may conceivably block for a longer period of
  * time is right after boot, when the whole system is still low on entropy.
  *
  * This API uses libuv's threadpool, which can have surprising and
  * negative performance implications for some applications; see the `UV_THREADPOOL_SIZE` documentation for more information.
  *
  * The asynchronous version of `crypto.randomBytes()` is carried out in a single
  * threadpool request. To minimize threadpool task length variation, partition
  * large `randomBytes` requests when doing so as part of fulfilling a client
  * request.
  * @since v0.5.8
  * @param size The number of bytes to generate. The `size` must not be larger than `2**31 - 1`.
  * @return if the `callback` function is not provided.
  */
inline def randomBytes(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
inline def randomBytes(size: Double, callback: js.Function2[/* err */ js.Error | Null, /* buf */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * This function is similar to {@link randomBytes} but requires the first
  * argument to be a `Buffer` that will be filled. It also
  * requires that a callback is passed in.
  *
  * If the `callback` function is not provided, an error will be thrown.
  *
  * ```js
  * import { Buffer } from 'buffer';
  * const { randomFill } = await import('crypto');
  *
  * const buf = Buffer.alloc(10);
  * randomFill(buf, (err, buf) => {
  *   if (err) throw err;
  *   console.log(buf.toString('hex'));
  * });
  *
  * randomFill(buf, 5, (err, buf) => {
  *   if (err) throw err;
  *   console.log(buf.toString('hex'));
  * });
  *
  * // The above is equivalent to the following:
  * randomFill(buf, 5, 5, (err, buf) => {
  *   if (err) throw err;
  *   console.log(buf.toString('hex'));
  * });
  * ```
  *
  * Any `ArrayBuffer`, `TypedArray`, or `DataView` instance may be passed as`buffer`.
  *
  * While this includes instances of `Float32Array` and `Float64Array`, this
  * function should not be used to generate random floating-point numbers. The
  * result may contain `+Infinity`, `-Infinity`, and `NaN`, and even if the array
  * contains finite numbers only, they are not drawn from a uniform random
  * distribution and have no meaningful lower or upper bounds.
  *
  * ```js
  * import { Buffer } from 'buffer';
  * const { randomFill } = await import('crypto');
  *
  * const a = new Uint32Array(10);
  * randomFill(a, (err, buf) => {
  *   if (err) throw err;
  *   console.log(Buffer.from(buf.buffer, buf.byteOffset, buf.byteLength)
  *     .toString('hex'));
  * });
  *
  * const b = new DataView(new ArrayBuffer(10));
  * randomFill(b, (err, buf) => {
  *   if (err) throw err;
  *   console.log(Buffer.from(buf.buffer, buf.byteOffset, buf.byteLength)
  *     .toString('hex'));
  * });
  *
  * const c = new ArrayBuffer(10);
  * randomFill(c, (err, buf) => {
  *   if (err) throw err;
  *   console.log(Buffer.from(buf).toString('hex'));
  * });
  * ```
  *
  * This API uses libuv's threadpool, which can have surprising and
  * negative performance implications for some applications; see the `UV_THREADPOOL_SIZE` documentation for more information.
  *
  * The asynchronous version of `crypto.randomFill()` is carried out in a single
  * threadpool request. To minimize threadpool task length variation, partition
  * large `randomFill` requests when doing so as part of fulfilling a client
  * request.
  * @since v7.10.0, v6.13.0
  * @param buffer Must be supplied. The size of the provided `buffer` must not be larger than `2**31 - 1`.
  * @param [offset=0]
  * @param [size=buffer.length - offset]
  * @param callback `function(err, buf) {}`.
  */
inline def randomFill[T /* <: js.typedarray.ArrayBufferView */](buffer: T, callback: js.Function2[/* err */ js.Error | Null, /* buf */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def randomFill[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Double, callback: js.Function2[/* err */ js.Error | Null, /* buf */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def randomFill[T /* <: js.typedarray.ArrayBufferView */](
  buffer: T,
  offset: Double,
  size: Double,
  callback: js.Function2[/* err */ js.Error | Null, /* buf */ T, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Synchronous version of {@link randomFill}.
  *
  * ```js
  * import { Buffer } from 'buffer';
  * const { randomFillSync } = await import('crypto');
  *
  * const buf = Buffer.alloc(10);
  * console.log(randomFillSync(buf).toString('hex'));
  *
  * randomFillSync(buf, 5);
  * console.log(buf.toString('hex'));
  *
  * // The above is equivalent to the following:
  * randomFillSync(buf, 5, 5);
  * console.log(buf.toString('hex'));
  * ```
  *
  * Any `ArrayBuffer`, `TypedArray` or `DataView` instance may be passed as`buffer`.
  *
  * ```js
  * import { Buffer } from 'buffer';
  * const { randomFillSync } = await import('crypto');
  *
  * const a = new Uint32Array(10);
  * console.log(Buffer.from(randomFillSync(a).buffer,
  *                         a.byteOffset, a.byteLength).toString('hex'));
  *
  * const b = new DataView(new ArrayBuffer(10));
  * console.log(Buffer.from(randomFillSync(b).buffer,
  *                         b.byteOffset, b.byteLength).toString('hex'));
  *
  * const c = new ArrayBuffer(10);
  * console.log(Buffer.from(randomFillSync(c)).toString('hex'));
  * ```
  * @since v7.10.0, v6.13.0
  * @param buffer Must be supplied. The size of the provided `buffer` must not be larger than `2**31 - 1`.
  * @param [offset=0]
  * @param [size=buffer.length - offset]
  * @return The object passed as `buffer` argument.
  */
inline def randomFillSync[T /* <: js.typedarray.ArrayBufferView */](buffer: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[T]
inline def randomFillSync[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[T]
inline def randomFillSync[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Double, size: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
inline def randomFillSync[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Unit, size: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]

/**
  * Return a random integer `n` such that `min <= n < max`.  This
  * implementation avoids [modulo bias](https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle#Modulo_bias).
  *
  * The range (`max - min`) must be less than 248. `min` and `max` must
  * be [safe integers](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isSafeInteger).
  *
  * If the `callback` function is not provided, the random integer is
  * generated synchronously.
  *
  * ```js
  * // Asynchronous
  * const {
  *   randomInt
  * } = await import('crypto');
  *
  * randomInt(3, (err, n) => {
  *   if (err) throw err;
  *   console.log(`Random number chosen from (0, 1, 2): ${n}`);
  * });
  * ```
  *
  * ```js
  * // Synchronous
  * const {
  *   randomInt
  * } = await import('crypto');
  *
  * const n = randomInt(3);
  * console.log(`Random number chosen from (0, 1, 2): ${n}`);
  * ```
  *
  * ```js
  * // With `min` argument
  * const {
  *   randomInt
  * } = await import('crypto');
  *
  * const n = randomInt(1, 7);
  * console.log(`The dice rolled: ${n}`);
  * ```
  * @since v14.10.0, v12.19.0
  * @param [min=0] Start of random range (inclusive).
  * @param max End of random range (exclusive).
  * @param callback `function(err, n) {}`.
  */
inline def randomInt(max: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(max.asInstanceOf[js.Any]).asInstanceOf[Double]
inline def randomInt(max: Double, callback: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(max.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def randomInt(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def randomInt(
  min: Double,
  max: Double,
  callback: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Generates a random [RFC 4122](https://www.rfc-editor.org/rfc/rfc4122.txt) version 4 UUID. The UUID is generated using a
  * cryptographic pseudorandom number generator.
  * @since v15.6.0, v14.17.0
  */
inline def randomUUID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUUID")().asInstanceOf[String]
inline def randomUUID(options: RandomUUIDOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUUID")(options.asInstanceOf[js.Any]).asInstanceOf[String]

/**
  * Provides an asynchronous [scrypt](https://en.wikipedia.org/wiki/Scrypt) implementation. Scrypt is a password-based
  * key derivation function that is designed to be expensive computationally and
  * memory-wise in order to make brute-force attacks unrewarding.
  *
  * The `salt` should be as unique as possible. It is recommended that a salt is
  * random and at least 16 bytes long. See [NIST SP 800-132](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-132.pdf) for details.
  *
  * When passing strings for `password` or `salt`, please consider `caveats when using strings as inputs to cryptographic APIs`.
  *
  * The `callback` function is called with two arguments: `err` and `derivedKey`.`err` is an exception object when key derivation fails, otherwise `err` is`null`. `derivedKey` is passed to the
  * callback as a `Buffer`.
  *
  * An exception is thrown when any of the input arguments specify invalid values
  * or types.
  *
  * ```js
  * const {
  *   scrypt
  * } = await import('crypto');
  *
  * // Using the factory defaults.
  * scrypt('password', 'salt', 64, (err, derivedKey) => {
  *   if (err) throw err;
  *   console.log(derivedKey.toString('hex'));  // '3745e48...08d59ae'
  * });
  * // Using a custom N parameter. Must be a power of two.
  * scrypt('password', 'salt', 64, { N: 1024 }, (err, derivedKey) => {
  *   if (err) throw err;
  *   console.log(derivedKey.toString('hex'));  // '3745e48...aa39b34'
  * });
  * ```
  * @since v10.5.0
  */
inline def scrypt(
  password: BinaryLike,
  salt: BinaryLike,
  keylen: Double,
  callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def scrypt(
  password: BinaryLike,
  salt: BinaryLike,
  keylen: Double,
  options: ScryptOptions,
  callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Provides a synchronous [scrypt](https://en.wikipedia.org/wiki/Scrypt) implementation. Scrypt is a password-based
  * key derivation function that is designed to be expensive computationally and
  * memory-wise in order to make brute-force attacks unrewarding.
  *
  * The `salt` should be as unique as possible. It is recommended that a salt is
  * random and at least 16 bytes long. See [NIST SP 800-132](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-132.pdf) for details.
  *
  * When passing strings for `password` or `salt`, please consider `caveats when using strings as inputs to cryptographic APIs`.
  *
  * An exception is thrown when key derivation fails, otherwise the derived key is
  * returned as a `Buffer`.
  *
  * An exception is thrown when any of the input arguments specify invalid values
  * or types.
  *
  * ```js
  * const {
  *   scryptSync
  * } = await import('crypto');
  * // Using the factory defaults.
  *
  * const key1 = scryptSync('password', 'salt', 64);
  * console.log(key1.toString('hex'));  // '3745e48...08d59ae'
  * // Using a custom N parameter. Must be a power of two.
  * const key2 = scryptSync('password', 'salt', 64, { N: 1024 });
  * console.log(key2.toString('hex'));  // '3745e48...aa39b34'
  * ```
  * @since v10.5.0
  */
inline def scryptSync(password: BinaryLike, salt: BinaryLike, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("scryptSync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
inline def scryptSync(password: BinaryLike, salt: BinaryLike, keylen: Double, options: ScryptOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("scryptSync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]

/**
  * @since v15.6.0
  */
inline def secureHeapUsed(): SecureHeapUsage = ^.asInstanceOf[js.Dynamic].applyDynamic("secureHeapUsed")().asInstanceOf[SecureHeapUsage]

/**
  * Load and set the `engine` for some or all OpenSSL functions (selected by flags).
  *
  * `engine` could be either an id or a path to the engine's shared library.
  *
  * The optional `flags` argument uses `ENGINE_METHOD_ALL` by default.
  * The `flags` is a bit field taking one of or a mix of the following flags (defined in `crypto.constants`):
  *
  * - `crypto.constants.ENGINE_METHOD_RSA`
  * - `crypto.constants.ENGINE_METHOD_DSA`
  * - `crypto.constants.ENGINE_METHOD_DH`
  * - `crypto.constants.ENGINE_METHOD_RAND`
  * - `crypto.constants.ENGINE_METHOD_EC`
  * - `crypto.constants.ENGINE_METHOD_CIPHERS`
  * - `crypto.constants.ENGINE_METHOD_DIGESTS`
  * - `crypto.constants.ENGINE_METHOD_PKEY_METHS`
  * - `crypto.constants.ENGINE_METHOD_PKEY_ASN1_METHS`
  * - `crypto.constants.ENGINE_METHOD_ALL`
  * - `crypto.constants.ENGINE_METHOD_NONE`
  *
  * The flags below are deprecated in OpenSSL-1.1.0.
  *
  * - `crypto.constants.ENGINE_METHOD_ECDH`
  * - `crypto.constants.ENGINE_METHOD_ECDSA`
  * - `crypto.constants.ENGINE_METHOD_STORE`
  * @since v0.11.11
  * @param [flags=crypto.constants.ENGINE_METHOD_ALL]
  */
inline def setEngine(engine: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEngine")(engine.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def setEngine(engine: String, flags: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEngine")(engine.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Enables the FIPS compliant crypto provider in a FIPS-enabled Node.js build. Throws an error if FIPS mode is not available.
  * @since v10.0.0
  * @param bool `true` to enable FIPS mode.
  */
inline def setFips(bool: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFips")(bool.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Calculates and returns the signature for `data` using the given private key and
  * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
  * dependent upon the key type (especially Ed25519 and Ed448).
  *
  * If `key` is not a `KeyObject`, this function behaves as if `key` had been
  * passed to {@link createPrivateKey}. If it is an object, the following
  * additional properties can be passed:
  *
  * If the `callback` function is provided this function uses libuv's threadpool.
  * @since v12.0.0
  */
inline def sign(algorithm: String, data: js.typedarray.ArrayBufferView, key: KeyLike): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
inline def sign(
  algorithm: String,
  data: js.typedarray.ArrayBufferView,
  key: KeyLike,
  callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def sign(algorithm: String, data: js.typedarray.ArrayBufferView, key: SignKeyObjectInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
inline def sign(
  algorithm: String,
  data: js.typedarray.ArrayBufferView,
  key: SignKeyObjectInput,
  callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def sign(algorithm: String, data: js.typedarray.ArrayBufferView, key: SignPrivateKeyInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
inline def sign(
  algorithm: String,
  data: js.typedarray.ArrayBufferView,
  key: SignPrivateKeyInput,
  callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def sign(algorithm: Null, data: js.typedarray.ArrayBufferView, key: KeyLike): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
inline def sign(
  algorithm: Null,
  data: js.typedarray.ArrayBufferView,
  key: KeyLike,
  callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def sign(algorithm: Null, data: js.typedarray.ArrayBufferView, key: SignKeyObjectInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
inline def sign(
  algorithm: Null,
  data: js.typedarray.ArrayBufferView,
  key: SignKeyObjectInput,
  callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def sign(algorithm: Null, data: js.typedarray.ArrayBufferView, key: SignPrivateKeyInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
inline def sign(
  algorithm: Null,
  data: js.typedarray.ArrayBufferView,
  key: SignPrivateKeyInput,
  callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def sign(algorithm: Unit, data: js.typedarray.ArrayBufferView, key: KeyLike): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
inline def sign(
  algorithm: Unit,
  data: js.typedarray.ArrayBufferView,
  key: KeyLike,
  callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def sign(algorithm: Unit, data: js.typedarray.ArrayBufferView, key: SignKeyObjectInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
inline def sign(
  algorithm: Unit,
  data: js.typedarray.ArrayBufferView,
  key: SignKeyObjectInput,
  callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def sign(algorithm: Unit, data: js.typedarray.ArrayBufferView, key: SignPrivateKeyInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
inline def sign(
  algorithm: Unit,
  data: js.typedarray.ArrayBufferView,
  key: SignPrivateKeyInput,
  callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * A convenient alias for `crypto.webcrypto.subtle`.
  * @since v17.4.0
  */
inline def subtle: SubtleCrypto = ^.asInstanceOf[js.Dynamic].selectDynamic("subtle").asInstanceOf[SubtleCrypto]

/**
  * This function is based on a constant-time algorithm.
  * Returns true if `a` is equal to `b`, without leaking timing information that
  * would allow an attacker to guess one of the values. This is suitable for
  * comparing HMAC digests or secret values like authentication cookies or [capability urls](https://www.w3.org/TR/capability-urls/).
  *
  * `a` and `b` must both be `Buffer`s, `TypedArray`s, or `DataView`s, and they
  * must have the same byte length. An error is thrown if `a` and `b` have
  * different byte lengths.
  *
  * If at least one of `a` and `b` is a `TypedArray` with more than one byte per
  * entry, such as `Uint16Array`, the result will be computed using the platform
  * byte order.
  *
  * Use of `crypto.timingSafeEqual` does not guarantee that the _surrounding_ code
  * is timing-safe. Care should be taken to ensure that the surrounding code does
  * not introduce timing vulnerabilities.
  * @since v6.6.0
  */
inline def timingSafeEqual(a: js.typedarray.ArrayBufferView, b: js.typedarray.ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("timingSafeEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Verifies the given signature for `data` using the given key and algorithm. If`algorithm` is `null` or `undefined`, then the algorithm is dependent upon the
  * key type (especially Ed25519 and Ed448).
  *
  * If `key` is not a `KeyObject`, this function behaves as if `key` had been
  * passed to {@link createPublicKey}. If it is an object, the following
  * additional properties can be passed:
  *
  * The `signature` argument is the previously calculated signature for the `data`.
  *
  * Because public keys can be derived from private keys, a private key or a public
  * key may be passed for `key`.
  *
  * If the `callback` function is provided this function uses libuv's threadpool.
  * @since v12.0.0
  */
inline def verify(
  algorithm: String,
  data: js.typedarray.ArrayBufferView,
  key: KeyLike,
  signature: js.typedarray.ArrayBufferView
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def verify(
  algorithm: String,
  data: js.typedarray.ArrayBufferView,
  key: KeyLike,
  signature: js.typedarray.ArrayBufferView,
  callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def verify(
  algorithm: String,
  data: js.typedarray.ArrayBufferView,
  key: VerifyKeyObjectInput,
  signature: js.typedarray.ArrayBufferView
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def verify(
  algorithm: String,
  data: js.typedarray.ArrayBufferView,
  key: VerifyKeyObjectInput,
  signature: js.typedarray.ArrayBufferView,
  callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def verify(
  algorithm: String,
  data: js.typedarray.ArrayBufferView,
  key: VerifyPublicKeyInput,
  signature: js.typedarray.ArrayBufferView
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def verify(
  algorithm: String,
  data: js.typedarray.ArrayBufferView,
  key: VerifyPublicKeyInput,
  signature: js.typedarray.ArrayBufferView,
  callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def verify(
  algorithm: Null,
  data: js.typedarray.ArrayBufferView,
  key: KeyLike,
  signature: js.typedarray.ArrayBufferView
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def verify(
  algorithm: Null,
  data: js.typedarray.ArrayBufferView,
  key: KeyLike,
  signature: js.typedarray.ArrayBufferView,
  callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def verify(
  algorithm: Null,
  data: js.typedarray.ArrayBufferView,
  key: VerifyKeyObjectInput,
  signature: js.typedarray.ArrayBufferView
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def verify(
  algorithm: Null,
  data: js.typedarray.ArrayBufferView,
  key: VerifyKeyObjectInput,
  signature: js.typedarray.ArrayBufferView,
  callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def verify(
  algorithm: Null,
  data: js.typedarray.ArrayBufferView,
  key: VerifyPublicKeyInput,
  signature: js.typedarray.ArrayBufferView
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def verify(
  algorithm: Null,
  data: js.typedarray.ArrayBufferView,
  key: VerifyPublicKeyInput,
  signature: js.typedarray.ArrayBufferView,
  callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def verify(
  algorithm: Unit,
  data: js.typedarray.ArrayBufferView,
  key: KeyLike,
  signature: js.typedarray.ArrayBufferView
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def verify(
  algorithm: Unit,
  data: js.typedarray.ArrayBufferView,
  key: KeyLike,
  signature: js.typedarray.ArrayBufferView,
  callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def verify(
  algorithm: Unit,
  data: js.typedarray.ArrayBufferView,
  key: VerifyKeyObjectInput,
  signature: js.typedarray.ArrayBufferView
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def verify(
  algorithm: Unit,
  data: js.typedarray.ArrayBufferView,
  key: VerifyKeyObjectInput,
  signature: js.typedarray.ArrayBufferView,
  callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def verify(
  algorithm: Unit,
  data: js.typedarray.ArrayBufferView,
  key: VerifyPublicKeyInput,
  signature: js.typedarray.ArrayBufferView
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def verify(
  algorithm: Unit,
  data: js.typedarray.ArrayBufferView,
  key: VerifyPublicKeyInput,
  signature: js.typedarray.ArrayBufferView,
  callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

type BinaryLike = String | js.typedarray.ArrayBufferView

type CipherKey = BinaryLike | KeyObject

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.node.bufferMod.global.Buffer
  - typings.node.cryptoMod.KeyObject
*/
type KeyLike = _KeyLike | String

type LargeNumberLike = js.typedarray.ArrayBufferView | SharedArrayBuffer | js.typedarray.ArrayBuffer | js.BigInt
