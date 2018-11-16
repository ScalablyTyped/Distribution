package typings
package pkijsLib.srcCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", JSImport.Namespace)
@js.native
object srcCommonModMembers extends js.Object {
  /**
       * Create CMS ECDSA signature from WebCrypto ECDSA signature
       * 
       * @param {ArrayBuffer} signatureBuffer WebCrypto result of "sign" function
       * @returns {ArrayBuffer}
       */
  def createCMSECDSASignature(signatureBuffer: stdLib.ArrayBuffer): stdLib.ArrayBuffer = js.native
  /**
       * Create a single ArrayBuffer from CMS ECDSA signature
       * 
       * @param {Sequence} cmsSignature ASN.1 SEQUENCE contains CMS ECDSA signature
       * @returns {ArrayBuffer}
       */
  def createECDSASignatureFromCMS(cmsSignature: asn1jsLib.asn1jsMod.Sequence): stdLib.ArrayBuffer = js.native
  /**
       * Get WebCrypto algorithm by wel-known OID
       * 
       * @param {string} oid Wel-known OID to search for
       * @returns {Algorithm}
       */
  def getAlgorithmByOID(oid: java.lang.String): stdLib.Algorithm = js.native
  /**
       * Get default algorithm parameters for each kind of operation
       * 
       * @param {string} algorithmName Algorithm name to get common parameters for
       * @param {string} operation Kind of operation: "sign", "encrypt", "generatekey", "importkey", "exportkey", "verify"
       * @returns {{ algorithm: Algorithm; usages: string[]; }}
       */
  def getAlgorithmParameters(algorithmName: java.lang.String, operation: java.lang.String): pkijsLib.Anon_Algorithm = js.native
  /**
       * Get crypto subtle from current "crypto engine" or "undefined"
       * 
       * @returns {(SubtleCrypto | undefined)}
       */
  def getCrypto(): js.UndefOr[stdLib.SubtleCrypto] = js.native
  def getEngine(): Engine = js.native
  /**
       * Getting hash algorithm by signature algorithm
       * 
       * @param {AlgorithmIdentifier} signatureAlgorithm Signature algorithm
       * @returns {string}
       */
  def getHashAlgorithm(signatureAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default): java.lang.String = js.native
  /**
       * Get OID for each specific WebCrypto algorithm
       * 
       * @param {Algorithm} algorithm
       * @returns {string}
       */
  def getOIDByAlgorithm(algorithm: stdLib.Algorithm): java.lang.String = js.native
  /**
       * Initialize input Uint8Array by random values (with help from current "crypto engine")
       * 
       * @param {ArrayBufferView} view
       * @returns {ArrayBufferView}
       */
  def getRandomValues(view: stdLib.ArrayBufferView): stdLib.ArrayBufferView = js.native
  /**
       * ANS X9.63 Key Derivation Function
       * 
       * @param {string} hashFunction Used hash function
       * @param {ArrayBuffer} Zbuffer ArrayBuffer containing ECDH shared secret to derive from
       * @param {number} keydatalen Length (!!! in BITS !!!) of used kew derivation function
       * @param {ArrayBuffer} SharedInfo Usually DER encoded "ECC_CMS_SharedInfo" structure
       */
  def kdf(
    hashFunction: java.lang.String,
    Zbuffer: stdLib.ArrayBuffer,
    keydatalen: scala.Double,
    SharedInfo: stdLib.ArrayBuffer
  ): stdLib.PromiseLike[stdLib.ArrayBuffer] = js.native
  /**
       * ANS X9.63 Key Derivation Function having a "Counter" as a parameter
       * 
       * @param {string} hashFunction Used hash function
       * @param {ArrayBuffer} Zbuffer ArrayBuffer containing ECDH shared secret to derive from
       * @param {number} Counter
       * @param {ArrayBuffer} SharedInfo Usually DER encoded "ECC_CMS_SharedInfo" structure
       */
  def kdfWithCounter(
    hashFunction: java.lang.String,
    Zbuffer: stdLib.ArrayBuffer,
    Counter: scala.Double,
    SharedInfo: stdLib.ArrayBuffer
  ): stdLib.PromiseLike[pkijsLib.Anon_Result] = js.native
  def setEngine(name: java.lang.String, crypto: stdLib.Crypto, subtle: stdLib.SubtleCrypto): scala.Unit = js.native
  /**
       * String preparation function. In a future here will be realization of algorithm from RFC4518
       * 
       * @param {string} inputString JavaScript string. As soon as for each ASN.1 string type we have a specific transformation function here we will work with pure JavaScript string
       * @returns {string} Formated string
       */
  def stringPrep(inputString: java.lang.String): java.lang.String = js.native
}

