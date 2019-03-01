package typings
package pkijsLib.srcCryptoEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoEngine
  extends stdLib.SubtleCrypto {
  var crypto: stdLib.SubtleCrypto = js.native
  var name: java.lang.String = js.native
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
    inputFormat: java.lang.String,
    outputFormat: java.lang.String,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.BufferSource | stdLib.JsonWebKey] = js.native
  def convert(
    inputFormat: java.lang.String,
    outputFormat: java.lang.String,
    keyData: stdLib.JsonWebKey,
    algorithm: stdLib.Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.BufferSource | stdLib.JsonWebKey] = js.native
  def decrypt(algorithm: java.lang.String, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def decrypt(algorithm: stdLib.AesCbcParams, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def decrypt(algorithm: stdLib.AesCfbParams, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def decrypt(algorithm: stdLib.AesCmacParams, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def decrypt(algorithm: stdLib.AesCtrParams, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def decrypt(algorithm: stdLib.AesGcmParams, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def decrypt(algorithm: stdLib.RsaOaepParams, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def digest(algorithm: stdLib.AlgorithmIdentifier, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def encrypt(algorithm: java.lang.String, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def encrypt(algorithm: stdLib.AesCbcParams, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def encrypt(algorithm: stdLib.AesCfbParams, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def encrypt(algorithm: stdLib.AesCmacParams, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def encrypt(algorithm: stdLib.AesCtrParams, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def encrypt(algorithm: stdLib.AesGcmParams, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def encrypt(algorithm: stdLib.RsaOaepParams, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_jwk(format: pkijsLib.pkijsLibStrings.jwk, key: stdLib.CryptoKey): js.Thenable[stdLib.JsonWebKey] = js.native
  @JSName("exportKey")
  def exportKey_pkcs8(format: pkijsLib.pkijsLibStrings.pkcs8, key: stdLib.CryptoKey): js.Thenable[stdLib.ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_raw(format: pkijsLib.pkijsLibStrings.raw, key: stdLib.CryptoKey): js.Thenable[stdLib.ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_spki(format: pkijsLib.pkijsLibStrings.spki, key: stdLib.CryptoKey): js.Thenable[stdLib.ArrayBuffer] = js.native
  def importKey(
    format: java.lang.String,
    keyData: stdLib.BufferSource,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: stdLib.JsonWebKey,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: stdLib.JsonWebKey,
    algorithm: stdLib.DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: stdLib.JsonWebKey,
    algorithm: stdLib.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: stdLib.JsonWebKey,
    algorithm: stdLib.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: stdLib.JsonWebKey,
    algorithm: stdLib.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: pkijsLib.pkijsLibStrings.jwk,
    keyData: stdLib.JsonWebKey,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: pkijsLib.pkijsLibStrings.jwk,
    keyData: stdLib.JsonWebKey,
    algorithm: stdLib.DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: pkijsLib.pkijsLibStrings.jwk,
    keyData: stdLib.JsonWebKey,
    algorithm: stdLib.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: pkijsLib.pkijsLibStrings.jwk,
    keyData: stdLib.JsonWebKey,
    algorithm: stdLib.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: pkijsLib.pkijsLibStrings.jwk,
    keyData: stdLib.JsonWebKey,
    algorithm: stdLib.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkijsLib.pkijsLibStrings.pkcs8,
    keyData: stdLib.BufferSource,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkijsLib.pkijsLibStrings.pkcs8,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkijsLib.pkijsLibStrings.pkcs8,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkijsLib.pkijsLibStrings.pkcs8,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkijsLib.pkijsLibStrings.pkcs8,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: pkijsLib.pkijsLibStrings.raw,
    keyData: stdLib.BufferSource,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: pkijsLib.pkijsLibStrings.raw,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: pkijsLib.pkijsLibStrings.raw,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: pkijsLib.pkijsLibStrings.raw,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: pkijsLib.pkijsLibStrings.raw,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: pkijsLib.pkijsLibStrings.spki,
    keyData: stdLib.BufferSource,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: pkijsLib.pkijsLibStrings.spki,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: pkijsLib.pkijsLibStrings.spki,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: pkijsLib.pkijsLibStrings.spki,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: pkijsLib.pkijsLibStrings.spki,
    keyData: stdLib.BufferSource,
    algorithm: stdLib.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  def sign(algorithm: java.lang.String, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def sign(algorithm: stdLib.AesCmacParams, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def sign(algorithm: stdLib.EcdsaParams, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def sign(algorithm: stdLib.RsaPssParams, key: stdLib.CryptoKey, data: stdLib.BufferSource): js.Thenable[stdLib.ArrayBuffer] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: stdLib.BufferSource,
    unwrappingKey: stdLib.CryptoKey,
    unwrapAlgorithm: stdLib.AlgorithmIdentifier,
    unwrappedKeyAlgorithm: stdLib.AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[stdLib.CryptoKey] = js.native
  def verify(
    algorithm: java.lang.String,
    key: stdLib.CryptoKey,
    signature: stdLib.BufferSource,
    data: stdLib.BufferSource
  ): js.Thenable[scala.Boolean] = js.native
  def verify(
    algorithm: stdLib.AesCmacParams,
    key: stdLib.CryptoKey,
    signature: stdLib.BufferSource,
    data: stdLib.BufferSource
  ): js.Thenable[scala.Boolean] = js.native
  def verify(
    algorithm: stdLib.EcdsaParams,
    key: stdLib.CryptoKey,
    signature: stdLib.BufferSource,
    data: stdLib.BufferSource
  ): js.Thenable[scala.Boolean] = js.native
  def verify(
    algorithm: stdLib.RsaPssParams,
    key: stdLib.CryptoKey,
    signature: stdLib.BufferSource,
    data: stdLib.BufferSource
  ): js.Thenable[scala.Boolean] = js.native
  def wrapKey(
    format: java.lang.String,
    key: stdLib.CryptoKey,
    wrappingKey: stdLib.CryptoKey,
    wrapAlgorithm: stdLib.AlgorithmIdentifier
  ): js.Thenable[stdLib.ArrayBuffer] = js.native
}

