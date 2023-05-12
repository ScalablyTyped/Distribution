package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplePushNotificationCertificate
  extends StObject
     with Entity {
  
  // Apple Id of the account used to create the MDM push certificate.
  var appleIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Not yet documented
  var certificate: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Certificate serial number. This property is read-only.
  var certificateSerialNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The reason the certificate upload failed.
  var certificateUploadFailureReason: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The certificate upload status.
  var certificateUploadStatus: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The expiration date and time for Apple push notification certificate.
  var expirationDateTime: js.UndefOr[String] = js.undefined
  
  // Last modified date and time for Apple push notification certificate.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  // Topic Id.
  var topicIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
}
object ApplePushNotificationCertificate {
  
  inline def apply(): ApplePushNotificationCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplePushNotificationCertificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePushNotificationCertificate] (val x: Self) extends AnyVal {
    
    inline def setAppleIdentifier(value: NullableOption[String]): Self = StObject.set(x, "appleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setAppleIdentifierNull: Self = StObject.set(x, "appleIdentifier", null)
    
    inline def setAppleIdentifierUndefined: Self = StObject.set(x, "appleIdentifier", js.undefined)
    
    inline def setCertificate(value: NullableOption[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateNull: Self = StObject.set(x, "certificate", null)
    
    inline def setCertificateSerialNumber(value: NullableOption[String]): Self = StObject.set(x, "certificateSerialNumber", value.asInstanceOf[js.Any])
    
    inline def setCertificateSerialNumberNull: Self = StObject.set(x, "certificateSerialNumber", null)
    
    inline def setCertificateSerialNumberUndefined: Self = StObject.set(x, "certificateSerialNumber", js.undefined)
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setCertificateUploadFailureReason(value: NullableOption[String]): Self = StObject.set(x, "certificateUploadFailureReason", value.asInstanceOf[js.Any])
    
    inline def setCertificateUploadFailureReasonNull: Self = StObject.set(x, "certificateUploadFailureReason", null)
    
    inline def setCertificateUploadFailureReasonUndefined: Self = StObject.set(x, "certificateUploadFailureReason", js.undefined)
    
    inline def setCertificateUploadStatus(value: NullableOption[String]): Self = StObject.set(x, "certificateUploadStatus", value.asInstanceOf[js.Any])
    
    inline def setCertificateUploadStatusNull: Self = StObject.set(x, "certificateUploadStatus", null)
    
    inline def setCertificateUploadStatusUndefined: Self = StObject.set(x, "certificateUploadStatus", js.undefined)
    
    inline def setExpirationDateTime(value: String): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setTopicIdentifier(value: NullableOption[String]): Self = StObject.set(x, "topicIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTopicIdentifierNull: Self = StObject.set(x, "topicIdentifier", null)
    
    inline def setTopicIdentifierUndefined: Self = StObject.set(x, "topicIdentifier", js.undefined)
  }
}
