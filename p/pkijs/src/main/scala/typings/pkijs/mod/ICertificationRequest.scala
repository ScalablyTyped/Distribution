package typings.pkijs.mod

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICertificationRequest extends StObject {
  
  /**
    * Collection of attributes providing additional information about the subject of the certificate
    */
  var attributes: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  /**
    * signature algorithm (and any associated parameters) under which the certification-request information is signed
    */
  var signatureAlgorithm: AlgorithmIdentifier
  
  /**
    * result of signing the certification request information with the certification request subject's private key
    */
  var signatureValue: BitString
  
  /**
    * Distinguished name of the certificate subject
    */
  var subject: RelativeDistinguishedNames
  
  /**
    * Information about the public key being certified
    */
  var subjectPublicKeyInfo: PublicKeyInfo
  
  /**
    * Value being signed
    */
  var tbs: js.typedarray.ArrayBuffer
  
  /**
    * Version number. It should be 0
    */
  var version: Double
}
object ICertificationRequest {
  
  inline def apply(
    signatureAlgorithm: AlgorithmIdentifier,
    signatureValue: BitString,
    subject: RelativeDistinguishedNames,
    subjectPublicKeyInfo: PublicKeyInfo,
    tbs: js.typedarray.ArrayBuffer,
    version: Double
  ): ICertificationRequest = {
    val __obj = js.Dynamic.literal(signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureValue = signatureValue.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectPublicKeyInfo = subjectPublicKeyInfo.asInstanceOf[js.Any], tbs = tbs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICertificationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICertificationRequest] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureValue(value: BitString): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: RelativeDistinguishedNames): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectPublicKeyInfo(value: PublicKeyInfo): Self = StObject.set(x, "subjectPublicKeyInfo", value.asInstanceOf[js.Any])
    
    inline def setTbs(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "tbs", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
