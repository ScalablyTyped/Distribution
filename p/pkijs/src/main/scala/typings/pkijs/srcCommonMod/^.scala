package typings.pkijs.srcCommonMod

import typings.asn1js.asn1jsMod.Sequence
import typings.pkijs.Anon_Algorithm
import typings.pkijs.Anon_Counter
import typings.pkijs.srcAlgorithmIdentifierMod.default
import typings.std.Algorithm
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Crypto
import typings.std.SubtleCrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Create CMS ECDSA signature from WebCrypto ECDSA signature
    * 
    * @param {ArrayBuffer} signatureBuffer WebCrypto result of "sign" function
    * @returns {ArrayBuffer}
    */
  def createCMSECDSASignature(signatureBuffer: ArrayBuffer): ArrayBuffer = js.native
  /**
    * Create a single ArrayBuffer from CMS ECDSA signature
    * 
    * @param {Sequence} cmsSignature ASN.1 SEQUENCE contains CMS ECDSA signature
    * @returns {ArrayBuffer}
    */
  def createECDSASignatureFromCMS(cmsSignature: Sequence): ArrayBuffer = js.native
  /**
    * Get WebCrypto algorithm by wel-known OID
    * 
    * @param {string} oid Wel-known OID to search for
    * @returns {Algorithm}
    */
  def getAlgorithmByOID(oid: String): Algorithm = js.native
  /**
    * Get default algorithm parameters for each kind of operation
    * 
    * @param {string} algorithmName Algorithm name to get common parameters for
    * @param {string} operation Kind of operation: "sign", "encrypt", "generatekey", "importkey", "exportkey", "verify"
    * @returns {{ algorithm: Algorithm; usages: string[]; }}
    */
  def getAlgorithmParameters(algorithmName: String, operation: String): Anon_Algorithm = js.native
  /**
    * Get crypto subtle from current "crypto engine" or "undefined"
    * 
    * @returns {(SubtleCrypto | undefined)}
    */
  def getCrypto(): js.UndefOr[SubtleCrypto] = js.native
  def getEngine(): Engine = js.native
  /**
    * Getting hash algorithm by signature algorithm
    * 
    * @param {AlgorithmIdentifier} signatureAlgorithm Signature algorithm
    * @returns {string}
    */
  def getHashAlgorithm(signatureAlgorithm: default): String = js.native
  /**
    * Get OID for each specific WebCrypto algorithm
    * 
    * @param {Algorithm} algorithm
    * @returns {string}
    */
  def getOIDByAlgorithm(algorithm: Algorithm): String = js.native
  /**
    * Initialize input Uint8Array by random values (with help from current "crypto engine")
    * 
    * @param {ArrayBufferView} view
    * @returns {ArrayBufferView}
    */
  def getRandomValues(view: ArrayBufferView): ArrayBufferView = js.native
  /**
    * ANS X9.63 Key Derivation Function
    * 
    * @param {string} hashFunction Used hash function
    * @param {ArrayBuffer} Zbuffer ArrayBuffer containing ECDH shared secret to derive from
    * @param {number} keydatalen Length (!!! in BITS !!!) of used kew derivation function
    * @param {ArrayBuffer} SharedInfo Usually DER encoded "ECC_CMS_SharedInfo" structure
    */
  def kdf(hashFunction: String, Zbuffer: ArrayBuffer, keydatalen: Double, SharedInfo: ArrayBuffer): js.Thenable[ArrayBuffer] = js.native
  /**
    * ANS X9.63 Key Derivation Function having a "Counter" as a parameter
    * 
    * @param {string} hashFunction Used hash function
    * @param {ArrayBuffer} Zbuffer ArrayBuffer containing ECDH shared secret to derive from
    * @param {number} Counter
    * @param {ArrayBuffer} SharedInfo Usually DER encoded "ECC_CMS_SharedInfo" structure
    */
  def kdfWithCounter(hashFunction: String, Zbuffer: ArrayBuffer, Counter: Double, SharedInfo: ArrayBuffer): js.Thenable[Anon_Counter] = js.native
  def setEngine(name: String, crypto: Crypto, subtle: SubtleCrypto): Unit = js.native
  /**
    * String preparation function. In a future here will be realization of algorithm from RFC4518
    * 
    * @param {string} inputString JavaScript string. As soon as for each ASN.1 string type we have a specific transformation function here we will work with pure JavaScript string
    * @returns {string} Formated string
    */
  def stringPrep(inputString: String): String = js.native
}

