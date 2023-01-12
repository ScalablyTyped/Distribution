package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certification extends StObject {
  
  // URL that shows certification details for the application.
  var certificationDetailsUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The timestamp when the current certification for the application will expire.
  var certificationExpirationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether the application is certified by Microsoft.
  var isCertifiedByMicrosoft: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether the application has been self-attested by the application developer or the publisher.
  var isPublisherAttested: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The timestamp when the certification for the application was most recently added or updated.
  var lastCertificationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object Certification {
  
  inline def apply(): Certification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Certification] (val x: Self) extends AnyVal {
    
    inline def setCertificationDetailsUrl(value: NullableOption[String]): Self = StObject.set(x, "certificationDetailsUrl", value.asInstanceOf[js.Any])
    
    inline def setCertificationDetailsUrlNull: Self = StObject.set(x, "certificationDetailsUrl", null)
    
    inline def setCertificationDetailsUrlUndefined: Self = StObject.set(x, "certificationDetailsUrl", js.undefined)
    
    inline def setCertificationExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "certificationExpirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCertificationExpirationDateTimeNull: Self = StObject.set(x, "certificationExpirationDateTime", null)
    
    inline def setCertificationExpirationDateTimeUndefined: Self = StObject.set(x, "certificationExpirationDateTime", js.undefined)
    
    inline def setIsCertifiedByMicrosoft(value: NullableOption[Boolean]): Self = StObject.set(x, "isCertifiedByMicrosoft", value.asInstanceOf[js.Any])
    
    inline def setIsCertifiedByMicrosoftNull: Self = StObject.set(x, "isCertifiedByMicrosoft", null)
    
    inline def setIsCertifiedByMicrosoftUndefined: Self = StObject.set(x, "isCertifiedByMicrosoft", js.undefined)
    
    inline def setIsPublisherAttested(value: NullableOption[Boolean]): Self = StObject.set(x, "isPublisherAttested", value.asInstanceOf[js.Any])
    
    inline def setIsPublisherAttestedNull: Self = StObject.set(x, "isPublisherAttested", null)
    
    inline def setIsPublisherAttestedUndefined: Self = StObject.set(x, "isPublisherAttested", js.undefined)
    
    inline def setLastCertificationDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastCertificationDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastCertificationDateTimeNull: Self = StObject.set(x, "lastCertificationDateTime", null)
    
    inline def setLastCertificationDateTimeUndefined: Self = StObject.set(x, "lastCertificationDateTime", js.undefined)
  }
}
