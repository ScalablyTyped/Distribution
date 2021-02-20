package typings.pkijs

import typings.pkijs.pkijsStrings.jwk
import typings.pkijs.pkijsStrings.pkcs8
import typings.pkijs.pkijsStrings.raw
import typings.pkijs.pkijsStrings.spki
import typings.std.AesCbcParams
import typings.std.AesCfbParams
import typings.std.AesCmacParams
import typings.std.AesCtrParams
import typings.std.AesDerivedKeyParams
import typings.std.AesGcmParams
import typings.std.Algorithm
import typings.std.AlgorithmIdentifier
import typings.std.ArrayBuffer
import typings.std.BufferSource
import typings.std.ConcatParams
import typings.std.CryptoKey
import typings.std.CryptoKeyPair
import typings.std.DhImportKeyParams
import typings.std.EcKeyImportParams
import typings.std.EcdsaParams
import typings.std.HkdfParams
import typings.std.HmacImportParams
import typings.std.JsonWebKey
import typings.std.Pbkdf2Params
import typings.std.RsaHashedImportParams
import typings.std.RsaOaepParams
import typings.std.RsaPssParams
import typings.std.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoEngineMod {
  
  @JSImport("pkijs/src/CryptoEngine", JSImport.Default)
  @js.native
  /**
    * Constructor for CryptoEngine class
    * @param {*} [parameters={}]
    */
  class default () extends CryptoEngine {
    def this(parameters: js.Any) = this()
  }
  
  @js.native
  trait CryptoEngine extends SubtleCrypto {
    
    /**
      * Convert WebCrypto keys between different export formats
      * @param {string} inputFormat
      * @param {string} outputFormat
      * @param {ArrayBuffer|JsonWebKey} keyData
      * @param {Algorithm} algorithm
      * @param {boolean} extractable
      * @param {Array} keyUsages
      * @returns {Promise}
      */
    def convert(
      inputFormat: String,
      outputFormat: String,
      keyData: BufferSource,
      algorithm: Algorithm,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[BufferSource | JsonWebKey] = js.native
    def convert(
      inputFormat: String,
      outputFormat: String,
      keyData: JsonWebKey,
      algorithm: Algorithm,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[BufferSource | JsonWebKey] = js.native
    
    var crypto: SubtleCrypto = js.native
    
    def decrypt(algorithm: String, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    def decrypt(algorithm: AesCbcParams, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    def decrypt(algorithm: AesCfbParams, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    def decrypt(algorithm: AesCmacParams, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    def decrypt(algorithm: AesCtrParams, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    def decrypt(algorithm: AesGcmParams, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    def decrypt(algorithm: RsaOaepParams, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    
    def deriveBits(algorithm: String, baseKey: CryptoKey, length: Double): js.Promise[ArrayBuffer] = js.native
    
    def deriveKey(
      algorithm: String,
      baseKey: CryptoKey,
      derivedKeyType: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    def deriveKey(
      algorithm: String,
      baseKey: CryptoKey,
      derivedKeyType: AesDerivedKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    def deriveKey(
      algorithm: String,
      baseKey: CryptoKey,
      derivedKeyType: ConcatParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    def deriveKey(
      algorithm: String,
      baseKey: CryptoKey,
      derivedKeyType: HkdfParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    def deriveKey(
      algorithm: String,
      baseKey: CryptoKey,
      derivedKeyType: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    def deriveKey(
      algorithm: String,
      baseKey: CryptoKey,
      derivedKeyType: Pbkdf2Params,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    
    def digest(algorithm: AlgorithmIdentifier, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    
    def encrypt(algorithm: String, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    def encrypt(algorithm: AesCbcParams, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    def encrypt(algorithm: AesCfbParams, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    def encrypt(algorithm: AesCmacParams, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    def encrypt(algorithm: AesCtrParams, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    def encrypt(algorithm: AesGcmParams, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    def encrypt(algorithm: RsaOaepParams, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    
    @JSName("exportKey")
    def exportKey_jwk(format: jwk, key: CryptoKey): js.Promise[JsonWebKey] = js.native
    @JSName("exportKey")
    def exportKey_pkcs8(format: pkcs8, key: CryptoKey): js.Promise[ArrayBuffer] = js.native
    @JSName("exportKey")
    def exportKey_raw(format: raw, key: CryptoKey): js.Promise[ArrayBuffer] = js.native
    @JSName("exportKey")
    def exportKey_spki(format: spki, key: CryptoKey): js.Promise[ArrayBuffer] = js.native
    
    def generateKey(algorithm: String, extractable: Boolean, keyUsages: js.Array[String]): js.Promise[CryptoKeyPair | CryptoKey] = js.native
    
    def importKey(
      format: String,
      keyData: BufferSource,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: BufferSource,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: BufferSource,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: BufferSource,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: BufferSource,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: JsonWebKey,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: JsonWebKey,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: JsonWebKey,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: JsonWebKey,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: JsonWebKey,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_Promise(
      format: String,
      keyData: BufferSource,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_Promise(
      format: String,
      keyData: BufferSource,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_Promise(
      format: String,
      keyData: BufferSource,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_Promise(
      format: String,
      keyData: BufferSource,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_Promise(
      format: String,
      keyData: BufferSource,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_Promise(
      format: String,
      keyData: JsonWebKey,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_Promise(
      format: String,
      keyData: JsonWebKey,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_Promise(
      format: String,
      keyData: JsonWebKey,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_Promise(
      format: String,
      keyData: JsonWebKey,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_Promise(
      format: String,
      keyData: JsonWebKey,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_jwk(
      format: jwk,
      keyData: JsonWebKey,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_jwk(
      format: jwk,
      keyData: JsonWebKey,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_jwk(
      format: jwk,
      keyData: JsonWebKey,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_jwk(
      format: jwk,
      keyData: JsonWebKey,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_jwk(
      format: jwk,
      keyData: JsonWebKey,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_jwk_Promise(
      format: jwk,
      keyData: JsonWebKey,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_jwk_Promise(
      format: jwk,
      keyData: JsonWebKey,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_jwk_Promise(
      format: jwk,
      keyData: JsonWebKey,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_jwk_Promise(
      format: jwk,
      keyData: JsonWebKey,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_jwk_Promise(
      format: jwk,
      keyData: JsonWebKey,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_pkcs8(
      format: pkcs8,
      keyData: BufferSource,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_pkcs8(
      format: pkcs8,
      keyData: BufferSource,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_pkcs8(
      format: pkcs8,
      keyData: BufferSource,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_pkcs8(
      format: pkcs8,
      keyData: BufferSource,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_pkcs8(
      format: pkcs8,
      keyData: BufferSource,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_pkcs8_Promise(
      format: pkcs8,
      keyData: BufferSource,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_pkcs8_Promise(
      format: pkcs8,
      keyData: BufferSource,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_pkcs8_Promise(
      format: pkcs8,
      keyData: BufferSource,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_pkcs8_Promise(
      format: pkcs8,
      keyData: BufferSource,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_pkcs8_Promise(
      format: pkcs8,
      keyData: BufferSource,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_raw(
      format: raw,
      keyData: BufferSource,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_raw(
      format: raw,
      keyData: BufferSource,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_raw(
      format: raw,
      keyData: BufferSource,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_raw(
      format: raw,
      keyData: BufferSource,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_raw(
      format: raw,
      keyData: BufferSource,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_raw_Promise(
      format: raw,
      keyData: BufferSource,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_raw_Promise(
      format: raw,
      keyData: BufferSource,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_raw_Promise(
      format: raw,
      keyData: BufferSource,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_raw_Promise(
      format: raw,
      keyData: BufferSource,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_raw_Promise(
      format: raw,
      keyData: BufferSource,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_spki(
      format: spki,
      keyData: BufferSource,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_spki(
      format: spki,
      keyData: BufferSource,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_spki(
      format: spki,
      keyData: BufferSource,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_spki(
      format: spki,
      keyData: BufferSource,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_spki(
      format: spki,
      keyData: BufferSource,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_spki_Promise(
      format: spki,
      keyData: BufferSource,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_spki_Promise(
      format: spki,
      keyData: BufferSource,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_spki_Promise(
      format: spki,
      keyData: BufferSource,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_spki_Promise(
      format: spki,
      keyData: BufferSource,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_spki_Promise(
      format: spki,
      keyData: BufferSource,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    
    var name: String = js.native
    
    def sign(algorithm: String, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    def sign(algorithm: AesCmacParams, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    def sign(algorithm: EcdsaParams, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    def sign(algorithm: RsaPssParams, key: CryptoKey, data: BufferSource): js.Promise[ArrayBuffer] = js.native
    
    def unwrapKey(
      format: String,
      wrappedKey: BufferSource,
      unwrappingKey: CryptoKey,
      unwrapAlgorithm: AlgorithmIdentifier,
      unwrappedKeyAlgorithm: AlgorithmIdentifier,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Promise[CryptoKey] = js.native
    
    def verify(algorithm: String, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Promise[Boolean] = js.native
    def verify(algorithm: AesCmacParams, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Promise[Boolean] = js.native
    def verify(algorithm: EcdsaParams, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Promise[Boolean] = js.native
    def verify(algorithm: RsaPssParams, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Promise[Boolean] = js.native
  }
}
