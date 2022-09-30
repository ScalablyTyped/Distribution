package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICertificate extends StObject {
  
  /**
    * If present, this field is a SEQUENCE of one or more certificate extensions
    */
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  
  /**
    * The issuer field identifies the entity that has signed and issued the certificate
    */
  var issuer: RelativeDistinguishedNames
  
  /**
    * The subject and issuer unique identifiers are present in the certificate to handle the possibility of reuse of subject and/or issuer names over time
    */
  var issuerUniqueID: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  /**
    * The date on which the certificate validity period ends
    */
  var notAfter: Time
  
  /**
    * The date on which the certificate validity period begins
    */
  var notBefore: Time
  
  /**
    * Serial number of the certificate
    */
  var serialNumber: Integer
  
  /**
    * This field contains the algorithm identifier for the algorithm used by the CA to sign the certificate
    */
  var signature: AlgorithmIdentifier
  
  /**
    * The signatureAlgorithm field contains the identifier for the cryptographic algorithm used by the CA to sign this certificate
    */
  var signatureAlgorithm: AlgorithmIdentifier
  
  /**
    * The signatureValue field contains a digital signature computed upon the ASN.1 DER encoded tbsCertificate
    */
  var signatureValue: BitString
  
  /**
    * The subject field identifies the entity associated with the public key stored in the subject public key field
    */
  var subject: RelativeDistinguishedNames
  
  /**
    * This field is used to carry the public key and identify the algorithm with which the key is used
    */
  var subjectPublicKeyInfo: PublicKeyInfo
  
  /**
    * The subject and issuer unique identifiers are present in the certificate to handle the possibility of reuse of subject and/or issuer names over time
    */
  var subjectUniqueID: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  /**
    * ToBeSigned (TBS) part of the certificate
    */
  var tbs: js.typedarray.ArrayBuffer
  
  /**
    * Version number
    */
  var version: Double
}
object ICertificate {
  
  inline def apply(
    issuer: RelativeDistinguishedNames,
    notAfter: Time,
    notBefore: Time,
    serialNumber: Integer,
    signature: AlgorithmIdentifier,
    signatureAlgorithm: AlgorithmIdentifier,
    signatureValue: BitString,
    subject: RelativeDistinguishedNames,
    subjectPublicKeyInfo: PublicKeyInfo,
    tbs: js.typedarray.ArrayBuffer,
    version: Double
  ): ICertificate = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureValue = signatureValue.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectPublicKeyInfo = subjectPublicKeyInfo.asInstanceOf[js.Any], tbs = tbs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICertificate]
  }
  
  extension [Self <: ICertificate](x: Self) {
    
    inline def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setIssuer(value: RelativeDistinguishedNames): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUniqueID(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "issuerUniqueID", value.asInstanceOf[js.Any])
    
    inline def setIssuerUniqueIDUndefined: Self = StObject.set(x, "issuerUniqueID", js.undefined)
    
    inline def setNotAfter(value: Time): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    inline def setNotBefore(value: Time): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: AlgorithmIdentifier): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureValue(value: BitString): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: RelativeDistinguishedNames): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectPublicKeyInfo(value: PublicKeyInfo): Self = StObject.set(x, "subjectPublicKeyInfo", value.asInstanceOf[js.Any])
    
    inline def setSubjectUniqueID(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "subjectUniqueID", value.asInstanceOf[js.Any])
    
    inline def setSubjectUniqueIDUndefined: Self = StObject.set(x, "subjectUniqueID", js.undefined)
    
    inline def setTbs(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "tbs", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
