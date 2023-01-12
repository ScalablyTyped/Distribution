package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificate extends StObject {
  
  /** The certificate expire time. */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /** The issuer of this certificate. */
  var issuingCertificate: js.UndefOr[Certificate] = js.undefined
  
  /** The certificate subject. */
  var subject: js.UndefOr[String] = js.undefined
  
  /** The additional hostnames for the domain. */
  var subjectAlternativeName: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The certificate thumbprint which uniquely identifies the certificate. */
  var thumbprint: js.UndefOr[String] = js.undefined
}
object Certificate {
  
  inline def apply(): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setIssuingCertificate(value: Certificate): Self = StObject.set(x, "issuingCertificate", value.asInstanceOf[js.Any])
    
    inline def setIssuingCertificateUndefined: Self = StObject.set(x, "issuingCertificate", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeName(value: js.Array[String]): Self = StObject.set(x, "subjectAlternativeName", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeNameUndefined: Self = StObject.set(x, "subjectAlternativeName", js.undefined)
    
    inline def setSubjectAlternativeNameVarargs(value: String*): Self = StObject.set(x, "subjectAlternativeName", js.Array(value*))
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
    
    inline def setThumbprintUndefined: Self = StObject.set(x, "thumbprint", js.undefined)
  }
}
