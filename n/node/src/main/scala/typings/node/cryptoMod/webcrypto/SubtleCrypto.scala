package typings.node.cryptoMod.webcrypto

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @since v15.0.0
  */
@js.native
trait SubtleCrypto extends StObject {
  
  def decrypt(algorithm: AesCbcParams, key: CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def decrypt(algorithm: AesCtrParams, key: CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def decrypt(algorithm: AesGcmParams, key: CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  /**
    * Using the method and parameters specified in `algorithm` and the keying material provided by `key`,
    * `subtle.decrypt()` attempts to decipher the provided `data`. If successful,
    * the returned promise will be resolved with an `<ArrayBuffer>` containing the plaintext result.
    *
    * The algorithms currently supported include:
    *
    * - `'RSA-OAEP'`
    * - `'AES-CTR'`
    * - `'AES-CBC'`
    * - `'AES-GCM'`
    * @since v15.0.0
    */
  def decrypt(algorithm: AlgorithmIdentifier, key: CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def decrypt(algorithm: RsaOaepParams, key: CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def deriveBits(algorithm: AlgorithmIdentifier, baseKey: CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  /**
    * Using the method and parameters specified in `algorithm` and the keying material provided by `baseKey`,
    * `subtle.deriveBits()` attempts to generate `length` bits.
    * The Node.js implementation requires that when `length` is a number it must be multiple of `8`.
    * When `length` is `null` the maximum number of bits for a given algorithm is generated. This is allowed
    * for the `'ECDH'`, `'X25519'`, and `'X448'` algorithms.
    * If successful, the returned promise will be resolved with an `<ArrayBuffer>` containing the generated data.
    *
    * The algorithms currently supported include:
    *
    * - `'ECDH'`
    * - `'X25519'`
    * - `'X448'`
    * - `'HKDF'`
    * - `'PBKDF2'`
    * @since v15.0.0
    */
  def deriveBits(algorithm: EcdhKeyDeriveParams, baseKey: CryptoKey): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: EcdhKeyDeriveParams, baseKey: CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: HkdfParams, baseKey: CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: Pbkdf2Params, baseKey: CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: AesDerivedKeyParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  /**
    * Using the method and parameters specified in `algorithm`, and the keying material provided by `baseKey`,
    * `subtle.deriveKey()` attempts to generate a new <CryptoKey>` based on the method and parameters in `derivedKeyAlgorithm`.
    *
    * Calling `subtle.deriveKey()` is equivalent to calling `subtle.deriveBits()` to generate raw keying material,
    * then passing the result into the `subtle.importKey()` method using the `deriveKeyAlgorithm`, `extractable`, and `keyUsages` parameters as input.
    *
    * The algorithms currently supported include:
    *
    * - `'ECDH'`
    * - `'X25519'`
    * - `'X448'`
    * - `'HKDF'`
    * - `'PBKDF2'`
    * @param keyUsages See {@link https://nodejs.org/docs/latest/api/webcrypto.html#cryptokeyusages Key usages}.
    * @since v15.0.0
    */
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: AlgorithmIdentifier,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: HkdfParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: Pbkdf2Params,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: AesDerivedKeyParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: AlgorithmIdentifier,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: HkdfParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: Pbkdf2Params,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: AesDerivedKeyParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: AlgorithmIdentifier,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: HkdfParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: Pbkdf2Params,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: AesDerivedKeyParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: AlgorithmIdentifier,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: HkdfParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyAlgorithm: Pbkdf2Params,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  
  /**
    * Using the method identified by `algorithm`, `subtle.digest()` attempts to generate a digest of `data`.
    * If successful, the returned promise is resolved with an `<ArrayBuffer>` containing the computed digest.
    *
    * If `algorithm` is provided as a `<string>`, it must be one of:
    *
    * - `'SHA-1'`
    * - `'SHA-256'`
    * - `'SHA-384'`
    * - `'SHA-512'`
    *
    * If `algorithm` is provided as an `<Object>`, it must have a `name` property whose value is one of the above.
    * @since v15.0.0
    */
  def digest(algorithm: AlgorithmIdentifier, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def encrypt(algorithm: AesCbcParams, key: CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def encrypt(algorithm: AesCtrParams, key: CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def encrypt(algorithm: AesGcmParams, key: CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  /**
    * Using the method and parameters specified by `algorithm` and the keying material provided by `key`,
    * `subtle.encrypt()` attempts to encipher `data`. If successful,
    * the returned promise is resolved with an `<ArrayBuffer>` containing the encrypted result.
    *
    * The algorithms currently supported include:
    *
    * - `'RSA-OAEP'`
    * - `'AES-CTR'`
    * - `'AES-CBC'`
    * - `'AES-GCM'`
    * @since v15.0.0
    */
  def encrypt(algorithm: AlgorithmIdentifier, key: CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def encrypt(algorithm: RsaOaepParams, key: CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Exports the given key into the specified format, if supported.
    *
    * If the `<CryptoKey>` is not extractable, the returned promise will reject.
    *
    * When `format` is either `'pkcs8'` or `'spki'` and the export is successful,
    * the returned promise will be resolved with an `<ArrayBuffer>` containing the exported key data.
    *
    * When `format` is `'jwk'` and the export is successful, the returned promise will be resolved with a
    * JavaScript object conforming to the {@link https://tools.ietf.org/html/rfc7517 JSON Web Key} specification.
    * @param format Must be one of `'raw'`, `'pkcs8'`, `'spki'`, or `'jwk'`.
    * @returns `<Promise>` containing `<ArrayBuffer>`.
    * @since v15.0.0
    */
  @JSName("exportKey")
  @scala.annotation.targetName("exportKey_jwk")
  def exportKey(format: "jwk" | (Exclude[KeyFormat, "jwk"]), key: CryptoKey): js.Promise[JsonWebKey] = js.native
  
  def generateKey(algorithm: AesKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKey] = js.native
  def generateKey(algorithm: AlgorithmIdentifier, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKeyPair | CryptoKey] = js.native
  def generateKey(algorithm: EcKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKeyPair] = js.native
  def generateKey(algorithm: HmacKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKey] = js.native
  def generateKey(algorithm: Pbkdf2Params, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKey] = js.native
  /**
    * Using the method and parameters provided in `algorithm`,
    * `subtle.generateKey()` attempts to generate new keying material.
    * Depending the method used, the method may generate either a single `<CryptoKey>` or a `<CryptoKeyPair>`.
    *
    * The `<CryptoKeyPair>` (public and private key) generating algorithms supported include:
    *
    * - `'RSASSA-PKCS1-v1_5'`
    * - `'RSA-PSS'`
    * - `'RSA-OAEP'`
    * - `'ECDSA'`
    * - `'Ed25519'`
    * - `'Ed448'`
    * - `'ECDH'`
    * - `'X25519'`
    * - `'X448'`
    * The `<CryptoKey>` (secret key) generating algorithms supported include:
    *
    * - `'HMAC'`
    * - `'AES-CTR'`
    * - `'AES-CBC'`
    * - `'AES-GCM'`
    * - `'AES-KW'`
    * @param keyUsages See {@link https://nodejs.org/docs/latest/api/webcrypto.html#cryptokeyusages Key usages}.
    * @since v15.0.0
    */
  def generateKey(algorithm: RsaHashedKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKeyPair] = js.native
  
  @JSName("importKey")
  @scala.annotation.targetName("importKey_jwk")
  def importKey(
    format: "jwk",
    keyData: JsonWebKey,
    algorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  /**
    * The `subtle.importKey()` method attempts to interpret the provided `keyData` as the given `format`
    * to create a `<CryptoKey>` instance using the provided `algorithm`, `extractable`, and `keyUsages` arguments.
    * If the import is successful, the returned promise will be resolved with the created `<CryptoKey>`.
    *
    * If importing a `'PBKDF2'` key, `extractable` must be `false`.
    * @param format Must be one of `'raw'`, `'pkcs8'`, `'spki'`, or `'jwk'`.
    * @param keyUsages See {@link https://nodejs.org/docs/latest/api/webcrypto.html#cryptokeyusages Key usages}.
    * @since v15.0.0
    */
  @JSName("importKey")
  @scala.annotation.targetName("importKey_jwk")
  def importKey(
    format: "jwk",
    keyData: JsonWebKey,
    algorithm: AlgorithmIdentifier,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  @scala.annotation.targetName("importKey_jwk")
  def importKey(
    format: "jwk",
    keyData: JsonWebKey,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  @scala.annotation.targetName("importKey_jwk")
  def importKey(
    format: "jwk",
    keyData: JsonWebKey,
    algorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  @scala.annotation.targetName("importKey_jwk")
  def importKey(
    format: "jwk",
    keyData: JsonWebKey,
    algorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  @scala.annotation.targetName("importKey_jwk")
  def importKey(
    format: Exclude[KeyFormat, "jwk"],
    keyData: BufferSource,
    algorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  @scala.annotation.targetName("importKey_jwk")
  def importKey(
    format: Exclude[KeyFormat, "jwk"],
    keyData: BufferSource,
    algorithm: AlgorithmIdentifier,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  @scala.annotation.targetName("importKey_jwk")
  def importKey(
    format: Exclude[KeyFormat, "jwk"],
    keyData: BufferSource,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  @scala.annotation.targetName("importKey_jwk")
  def importKey(
    format: Exclude[KeyFormat, "jwk"],
    keyData: BufferSource,
    algorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  @scala.annotation.targetName("importKey_jwk")
  def importKey(
    format: Exclude[KeyFormat, "jwk"],
    keyData: BufferSource,
    algorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  
  /**
    * Using the method and parameters given by `algorithm` and the keying material provided by `key`,
    * `subtle.sign()` attempts to generate a cryptographic signature of `data`. If successful,
    * the returned promise is resolved with an `<ArrayBuffer>` containing the generated signature.
    *
    * The algorithms currently supported include:
    *
    * - `'RSASSA-PKCS1-v1_5'`
    * - `'RSA-PSS'`
    * - `'ECDSA'`
    * - `'Ed25519'`
    * - `'Ed448'`
    * - `'HMAC'`
    * @since v15.0.0
    */
  def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(algorithm: Ed448Params, key: CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCbcParams,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesCtrParams,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AesGcmParams,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  /**
    * In cryptography, "wrapping a key" refers to exporting and then encrypting the keying material.
    * The `subtle.unwrapKey()` method attempts to decrypt a wrapped key and create a `<CryptoKey>` instance.
    * It is equivalent to calling `subtle.decrypt()` first on the encrypted key data (using the `wrappedKey`, `unwrapAlgo`, and `unwrappingKey` arguments as input)
    * then passing the results in to the `subtle.importKey()` method using the `unwrappedKeyAlgo`, `extractable`, and `keyUsages` arguments as inputs.
    * If successful, the returned promise is resolved with a `<CryptoKey>` object.
    *
    * The wrapping algorithms currently supported include:
    *
    * - `'RSA-OAEP'`
    * - `'AES-CTR'`
    * - `'AES-CBC'`
    * - `'AES-GCM'`
    * - `'AES-KW'`
    *
    * The unwrapped key algorithms supported include:
    *
    * - `'RSASSA-PKCS1-v1_5'`
    * - `'RSA-PSS'`
    * - `'RSA-OAEP'`
    * - `'ECDSA'`
    * - `'Ed25519'`
    * - `'Ed448'`
    * - `'ECDH'`
    * - `'X25519'`
    * - `'X448'`
    * - `'HMAC'`
    * - `'AES-CTR'`
    * - `'AES-CBC'`
    * - `'AES-GCM'`
    * - `'AES-KW'`
    * @param format Must be one of `'raw'`, `'pkcs8'`, `'spki'`, or `'jwk'`.
    * @param keyUsages See {@link https://nodejs.org/docs/latest/api/webcrypto.html#cryptokeyusages Key usages}.
    * @since v15.0.0
    */
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: AesKeyAlgorithm,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def unwrapKey(
    format: KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: RsaOaepParams,
    unwrappedKeyAlgorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  
  /**
    * Using the method and parameters given in `algorithm` and the keying material provided by `key`,
    * `subtle.verify()` attempts to verify that `signature` is a valid cryptographic signature of `data`.
    * The returned promise is resolved with either `true` or `false`.
    *
    * The algorithms currently supported include:
    *
    * - `'RSASSA-PKCS1-v1_5'`
    * - `'RSA-PSS'`
    * - `'ECDSA'`
    * - `'Ed25519'`
    * - `'Ed448'`
    * - `'HMAC'`
    * @since v15.0.0
    */
  def verify(algorithm: AlgorithmIdentifier, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Promise[Boolean] = js.native
  def verify(algorithm: EcdsaParams, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Promise[Boolean] = js.native
  def verify(algorithm: Ed448Params, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Promise[Boolean] = js.native
  def verify(algorithm: RsaPssParams, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Promise[Boolean] = js.native
  
  def wrapKey(format: KeyFormat, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCbcParams): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(format: KeyFormat, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCtrParams): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(format: KeyFormat, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesGcmParams): js.Promise[js.typedarray.ArrayBuffer] = js.native
  /**
    * In cryptography, "wrapping a key" refers to exporting and then encrypting the keying material.
    * The `subtle.wrapKey()` method exports the keying material into the format identified by `format`,
    * then encrypts it using the method and parameters specified by `wrapAlgo` and the keying material provided by `wrappingKey`.
    * It is the equivalent to calling `subtle.exportKey()` using `format` and `key` as the arguments,
    * then passing the result to the `subtle.encrypt()` method using `wrappingKey` and `wrapAlgo` as inputs.
    * If successful, the returned promise will be resolved with an `<ArrayBuffer>` containing the encrypted key data.
    *
    * The wrapping algorithms currently supported include:
    *
    * - `'RSA-OAEP'`
    * - `'AES-CTR'`
    * - `'AES-CBC'`
    * - `'AES-GCM'`
    * - `'AES-KW'`
    * @param format Must be one of `'raw'`, `'pkcs8'`, `'spki'`, or `'jwk'`.
    * @since v15.0.0
    */
  def wrapKey(format: KeyFormat, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AlgorithmIdentifier): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(format: KeyFormat, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: RsaOaepParams): js.Promise[js.typedarray.ArrayBuffer] = js.native
}
