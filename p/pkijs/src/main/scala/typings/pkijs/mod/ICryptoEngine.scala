package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.OctetString
import typings.pkijs.pkijsBooleans.`true`
import typings.std.Algorithm
import typings.std.BufferSource
import typings.std.Crypto
import typings.std.CryptoKey
import typings.std.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICryptoEngine
  extends StObject
     with SubtleCrypto {
  
  var crypto: Crypto = js.native
  
  /**
    * Decrypt data stored in "EncryptedContentInfo" object using parameters
    * @param parameters
    */
  def decryptEncryptedContentInfo(parameters: CryptoEngineDecryptParams): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Specialized function encrypting "EncryptedContentInfo" object using parameters
    * @param parameters
    */
  def encryptEncryptedContentInfo(parameters: CryptoEngineEncryptParams): js.Promise[EncryptedContentInfo] = js.native
  
  /**
    * Gets WebCrypto algorithm by wel-known OID
    * @param oid algorithm identifier
    * @param safety if `true` throws exception on unknown algorithm identifier
    * @param target name of the target
    * @returns Returns WebCrypto algorithm or an empty object
    */
  def getAlgorithmByOID[T /* <: Algorithm */](oid: String): T | js.Object = js.native
  def getAlgorithmByOID[T /* <: Algorithm */](oid: String, safety: Boolean): T | js.Object = js.native
  def getAlgorithmByOID[T /* <: Algorithm */](oid: String, safety: Boolean, target: String): T | js.Object = js.native
  def getAlgorithmByOID[T /* <: Algorithm */](oid: String, safety: Unit, target: String): T | js.Object = js.native
  /**
    * Gets WebCrypto algorithm by wel-known OID
    * @param oid algorithm identifier
    * @param safety if `true` throws exception on unknown algorithm identifier
    * @param target name of the target
    * @returns Returns WebCrypto algorithm
    * @throws Throws {@link Error} exception if unknown algorithm identifier
    */
  @JSName("getAlgorithmByOID")
  def getAlgorithmByOID_true[T /* <: Algorithm */](oid: String, safety: `true`): T = js.native
  @JSName("getAlgorithmByOID")
  def getAlgorithmByOID_true[T /* <: Algorithm */](oid: String, safety: `true`, target: String): T = js.native
  
  /**
    * Get default algorithm parameters for each kind of operation
    * @param algorithmName Algorithm name to get common parameters for
    * @param operation Kind of operation: "sign", "encrypt", "generateKey", "importKey", "exportKey", "verify"
    */
  def getAlgorithmParameters(algorithmName: String, operation: CryptoEngineAlgorithmOperation): CryptoEngineAlgorithmParams = js.native
  
  /**
    * Getting hash algorithm by signature algorithm
    * @param signatureAlgorithm Signature algorithm
    */
  def getHashAlgorithm(signatureAlgorithm: AlgorithmIdentifier): String = js.native
  
  /**
    * Get OID for each specific algorithm
    * @param algorithm WebCrypto Algorithm
    * @param safety If `true` throws exception on unknown algorithm. Default is `false`
    * @param target Name of the target
    * @throws Throws {@link Error} exception if unknown WebCrypto algorithm
    */
  def getOIDByAlgorithm(algorithm: Algorithm): String = js.native
  def getOIDByAlgorithm(algorithm: Algorithm, safety: Boolean): String = js.native
  def getOIDByAlgorithm(algorithm: Algorithm, safety: Boolean, target: String): String = js.native
  def getOIDByAlgorithm(algorithm: Algorithm, safety: Unit, target: String): String = js.native
  
  def getPublicKey(publicKeyInfo: PublicKeyInfo, signatureAlgorithm: AlgorithmIdentifier): js.Promise[CryptoKey] = js.native
  def getPublicKey(
    publicKeyInfo: PublicKeyInfo,
    signatureAlgorithm: AlgorithmIdentifier,
    parameters: CryptoEnginePublicKeyParams
  ): js.Promise[CryptoKey] = js.native
  
  def getRandomValues[T /* <: js.typedarray.ArrayBufferView | Null */](array: T): T = js.native
  
  /**
    * Get signature parameters by analyzing private key algorithm
    * @param privateKey The private key user would like to use
    * @param hashAlgorithm Hash algorithm user would like to use. Default is SHA-1
    */
  def getSignatureParameters(privateKey: CryptoKey): js.Promise[CryptoEngineSignatureParams] = js.native
  def getSignatureParameters(privateKey: CryptoKey, hashAlgorithm: String): js.Promise[CryptoEngineSignatureParams] = js.native
  
  var name: String = js.native
  
  /**
    * Sign data with pre-defined private key
    * @param data Data to be signed
    * @param privateKey Private key to use
    * @param parameters Parameters for used algorithm
    */
  def signWithPrivateKey(data: BufferSource, privateKey: CryptoKey, parameters: CryptoEngineSignWithPrivateKeyParams): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Stamping (signing) data using algorithm similar to HMAC
    * @param parameters
    */
  def stampDataWithPassword(parameters: CryptoEngineStampDataWithPasswordParams): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  var subtle: SubtleCrypto = js.native
  
  def verifyDataStampedWithPassword(parameters: CryptoEngineVerifyDataStampedWithPasswordParams): js.Promise[Boolean] = js.native
  
  /**
    * Verify data with the public key
    * @param data Data to be verified
    * @param signature Signature value
    * @param publicKeyInfo Public key information
    * @param signatureAlgorithm Signature algorithm
    * @param shaAlgorithm Hash algorithm
    */
  def verifyWithPublicKey(
    data: BufferSource,
    signature: BitString,
    publicKeyInfo: PublicKeyInfo,
    signatureAlgorithm: AlgorithmIdentifier
  ): js.Promise[Boolean] = js.native
  def verifyWithPublicKey(
    data: BufferSource,
    signature: BitString,
    publicKeyInfo: PublicKeyInfo,
    signatureAlgorithm: AlgorithmIdentifier,
    shaAlgorithm: String
  ): js.Promise[Boolean] = js.native
  def verifyWithPublicKey(
    data: BufferSource,
    signature: OctetString,
    publicKeyInfo: PublicKeyInfo,
    signatureAlgorithm: AlgorithmIdentifier
  ): js.Promise[Boolean] = js.native
  def verifyWithPublicKey(
    data: BufferSource,
    signature: OctetString,
    publicKeyInfo: PublicKeyInfo,
    signatureAlgorithm: AlgorithmIdentifier,
    shaAlgorithm: String
  ): js.Promise[Boolean] = js.native
}
