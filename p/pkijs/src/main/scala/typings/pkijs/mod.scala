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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pkijs/src/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create CMS ECDSA signature from WebCrypto ECDSA signature
    *
    * @param {ArrayBuffer} signatureBuffer WebCrypto result of "sign" function
    * @returns {ArrayBuffer}
    */
  inline def createCMSECDSASignature(signatureBuffer: ArrayBuffer): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createCMSECDSASignature")(signatureBuffer.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  /**
    * Create a single ArrayBuffer from CMS ECDSA signature
    *
    * @param {Sequence} cmsSignature ASN.1 SEQUENCE contains CMS ECDSA signature
    * @returns {ArrayBuffer}
    */
  inline def createECDSASignatureFromCMS(cmsSignature: Sequence): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createECDSASignatureFromCMS")(cmsSignature.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  /**
    * Get WebCrypto algorithm by wel-known OID
    *
    * @param {string} oid Wel-known OID to search for
    * @returns {Algorithm}
    */
  inline def getAlgorithmByOID(oid: String): Algorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlgorithmByOID")(oid.asInstanceOf[js.Any]).asInstanceOf[Algorithm]
  
  /**
    * Get default algorithm parameters for each kind of operation
    *
    * @param {string} algorithmName Algorithm name to get common parameters for
    * @param {string} operation Kind of operation: "sign", "encrypt", "generatekey", "importkey", "exportkey", "verify"
    * @returns {{ algorithm: Algorithm; usages: KeyUsage[]; }}
    */
  inline def getAlgorithmParameters(algorithmName: String, operation: String): typings.pkijs.anon.Algorithm = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlgorithmParameters")(algorithmName.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[typings.pkijs.anon.Algorithm]
  
  /**
    * Get crypto subtle from current "crypto engine" or "undefined"
    *
    * @returns {(SubtleCrypto | undefined)}
    */
  inline def getCrypto(): js.UndefOr[SubtleCrypto] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCrypto")().asInstanceOf[js.UndefOr[SubtleCrypto]]
  
  inline def getEngine(): Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngine")().asInstanceOf[Engine]
  
  /**
    * Getting hash algorithm by signature algorithm
    *
    * @param {AlgorithmIdentifier} signatureAlgorithm Signature algorithm
    * @returns {string}
    */
  inline def getHashAlgorithm(signatureAlgorithm: default): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHashAlgorithm")(signatureAlgorithm.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Get OID for each specific WebCrypto algorithm
    *
    * @param {Algorithm} algorithm
    * @returns {string}
    */
  inline def getOIDByAlgorithm(algorithm: Algorithm): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOIDByAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Initialize input Uint8Array by random values (with help from current "crypto engine")
    *
    * @param {ArrayBufferView} view
    * @returns {ArrayBufferView}
    */
  inline def getRandomValues(view: ArrayBufferView): ArrayBufferView = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomValues")(view.asInstanceOf[js.Any]).asInstanceOf[ArrayBufferView]
  
  /**
    * ANS X9.63 Key Derivation Function
    *
    * @param {string} hashFunction Used hash function
    * @param {ArrayBuffer} Zbuffer ArrayBuffer containing ECDH shared secret to derive from
    * @param {number} keydatalen Length (!!! in BITS !!!) of used kew derivation function
    * @param {ArrayBuffer} SharedInfo Usually DER encoded "ECC_CMS_SharedInfo" structure
    */
  inline def kdf(hashFunction: String, Zbuffer: ArrayBuffer, keydatalen: Double, SharedInfo: ArrayBuffer): js.Thenable[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("kdf")(hashFunction.asInstanceOf[js.Any], Zbuffer.asInstanceOf[js.Any], keydatalen.asInstanceOf[js.Any], SharedInfo.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ArrayBuffer]]
  
  /**
    * ANS X9.63 Key Derivation Function having a "Counter" as a parameter
    *
    * @param {string} hashFunction Used hash function
    * @param {ArrayBuffer} Zbuffer ArrayBuffer containing ECDH shared secret to derive from
    * @param {number} Counter
    * @param {ArrayBuffer} SharedInfo Usually DER encoded "ECC_CMS_SharedInfo" structure
    */
  inline def kdfWithCounter(hashFunction: String, Zbuffer: ArrayBuffer, Counter: Double, SharedInfo: ArrayBuffer): js.Thenable[Counter] = (^.asInstanceOf[js.Dynamic].applyDynamic("kdfWithCounter")(hashFunction.asInstanceOf[js.Any], Zbuffer.asInstanceOf[js.Any], Counter.asInstanceOf[js.Any], SharedInfo.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Counter]]
  
  inline def setEngine(name: String, crypto: Crypto, subtle: SubtleCrypto): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEngine")(name.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any], subtle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * String preparation function. In a future here will be realization of algorithm from RFC4518
    *
    * @param {string} inputString JavaScript string. As soon as for each ASN.1 string type we have a specific transformation function here we will work with pure JavaScript string
    * @returns {string} Formated string
    */
  inline def stringPrep(inputString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringPrep")(inputString.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Engine extends StObject {
    
    var crypto: Crypto
    
    var name: String
    
    var subtle: SubtleCrypto
  }
  object Engine {
    
    inline def apply(crypto: Crypto, name: String, subtle: SubtleCrypto): Engine = {
      val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtle = subtle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Engine]
    }
    
    extension [Self <: Engine](x: Self) {
      
      inline def setCrypto(value: Crypto): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSubtle(value: SubtleCrypto): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    }
  }
}
