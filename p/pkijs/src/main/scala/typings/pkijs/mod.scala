package typings.pkijs

import typings.asn1js.mod.Sequence
import typings.pkijs.algorithmIdentifierMod.default
import typings.pkijs.anon.Counter
import typings.std.Algorithm
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Crypto
import typings.std.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create CMS ECDSA signature from WebCrypto ECDSA signature
    *
    * @param {ArrayBuffer} signatureBuffer WebCrypto result of "sign" function
    * @returns {ArrayBuffer}
    */
  @JSImport("pkijs/src/common", "createCMSECDSASignature")
  @js.native
  def createCMSECDSASignature(signatureBuffer: ArrayBuffer): ArrayBuffer = js.native
  
  /**
    * Create a single ArrayBuffer from CMS ECDSA signature
    *
    * @param {Sequence} cmsSignature ASN.1 SEQUENCE contains CMS ECDSA signature
    * @returns {ArrayBuffer}
    */
  @JSImport("pkijs/src/common", "createECDSASignatureFromCMS")
  @js.native
  def createECDSASignatureFromCMS(cmsSignature: Sequence): ArrayBuffer = js.native
  
  /**
    * Get WebCrypto algorithm by wel-known OID
    *
    * @param {string} oid Wel-known OID to search for
    * @returns {Algorithm}
    */
  @JSImport("pkijs/src/common", "getAlgorithmByOID")
  @js.native
  def getAlgorithmByOID(oid: String): Algorithm = js.native
  
  /**
    * Get default algorithm parameters for each kind of operation
    *
    * @param {string} algorithmName Algorithm name to get common parameters for
    * @param {string} operation Kind of operation: "sign", "encrypt", "generatekey", "importkey", "exportkey", "verify"
    * @returns {{ algorithm: Algorithm; usages: KeyUsage[]; }}
    */
  @JSImport("pkijs/src/common", "getAlgorithmParameters")
  @js.native
  def getAlgorithmParameters(algorithmName: String, operation: String): typings.pkijs.anon.Algorithm = js.native
  
  /**
    * Get crypto subtle from current "crypto engine" or "undefined"
    *
    * @returns {(SubtleCrypto | undefined)}
    */
  @JSImport("pkijs/src/common", "getCrypto")
  @js.native
  def getCrypto(): js.UndefOr[SubtleCrypto] = js.native
  
  @JSImport("pkijs/src/common", "getEngine")
  @js.native
  def getEngine(): Engine = js.native
  
  /**
    * Getting hash algorithm by signature algorithm
    *
    * @param {AlgorithmIdentifier} signatureAlgorithm Signature algorithm
    * @returns {string}
    */
  @JSImport("pkijs/src/common", "getHashAlgorithm")
  @js.native
  def getHashAlgorithm(signatureAlgorithm: default): String = js.native
  
  /**
    * Get OID for each specific WebCrypto algorithm
    *
    * @param {Algorithm} algorithm
    * @returns {string}
    */
  @JSImport("pkijs/src/common", "getOIDByAlgorithm")
  @js.native
  def getOIDByAlgorithm(algorithm: Algorithm): String = js.native
  
  /**
    * Initialize input Uint8Array by random values (with help from current "crypto engine")
    *
    * @param {ArrayBufferView} view
    * @returns {ArrayBufferView}
    */
  @JSImport("pkijs/src/common", "getRandomValues")
  @js.native
  def getRandomValues(view: ArrayBufferView): ArrayBufferView = js.native
  
  /**
    * ANS X9.63 Key Derivation Function
    *
    * @param {string} hashFunction Used hash function
    * @param {ArrayBuffer} Zbuffer ArrayBuffer containing ECDH shared secret to derive from
    * @param {number} keydatalen Length (!!! in BITS !!!) of used kew derivation function
    * @param {ArrayBuffer} SharedInfo Usually DER encoded "ECC_CMS_SharedInfo" structure
    */
  @JSImport("pkijs/src/common", "kdf")
  @js.native
  def kdf(hashFunction: String, Zbuffer: ArrayBuffer, keydatalen: Double, SharedInfo: ArrayBuffer): js.Thenable[ArrayBuffer] = js.native
  
  /**
    * ANS X9.63 Key Derivation Function having a "Counter" as a parameter
    *
    * @param {string} hashFunction Used hash function
    * @param {ArrayBuffer} Zbuffer ArrayBuffer containing ECDH shared secret to derive from
    * @param {number} Counter
    * @param {ArrayBuffer} SharedInfo Usually DER encoded "ECC_CMS_SharedInfo" structure
    */
  @JSImport("pkijs/src/common", "kdfWithCounter")
  @js.native
  def kdfWithCounter(hashFunction: String, Zbuffer: ArrayBuffer, Counter: Double, SharedInfo: ArrayBuffer): js.Thenable[Counter] = js.native
  
  @JSImport("pkijs/src/common", "setEngine")
  @js.native
  def setEngine(name: String, crypto: Crypto, subtle: SubtleCrypto): Unit = js.native
  
  /**
    * String preparation function. In a future here will be realization of algorithm from RFC4518
    *
    * @param {string} inputString JavaScript string. As soon as for each ASN.1 string type we have a specific transformation function here we will work with pure JavaScript string
    * @returns {string} Formated string
    */
  @JSImport("pkijs/src/common", "stringPrep")
  @js.native
  def stringPrep(inputString: String): String = js.native
  
  @js.native
  trait Engine extends StObject {
    
    var crypto: Crypto = js.native
    
    var name: String = js.native
    
    var subtle: SubtleCrypto = js.native
  }
  object Engine {
    
    @scala.inline
    def apply(crypto: Crypto, name: String, subtle: SubtleCrypto): Engine = {
      val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtle = subtle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Engine]
    }
    
    @scala.inline
    implicit class EngineMutableBuilder[Self <: Engine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrypto(value: Crypto): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtle(value: SubtleCrypto): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    }
  }
}
