package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplePushNotificationCertificate extends Entity {
  
  // Apple Id of the account used to create the MDM push certificate.
  var appleIdentifier: js.UndefOr[NullableOption[String]] = js.native
  
  // Not yet documented
  var certificate: js.UndefOr[NullableOption[String]] = js.native
  
  // The expiration date and time for Apple push notification certificate.
  var expirationDateTime: js.UndefOr[String] = js.native
  
  // Last modified date and time for Apple push notification certificate.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  // Topic Id.
  var topicIdentifier: js.UndefOr[NullableOption[String]] = js.native
}
object ApplePushNotificationCertificate {
  
  @scala.inline
  def apply(): ApplePushNotificationCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplePushNotificationCertificate]
  }
  
  @scala.inline
  implicit class ApplePushNotificationCertificateMutableBuilder[Self <: ApplePushNotificationCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppleIdentifier(value: NullableOption[String]): Self = StObject.set(x, "appleIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppleIdentifierNull: Self = StObject.set(x, "appleIdentifier", null)
    
    @scala.inline
    def setAppleIdentifierUndefined: Self = StObject.set(x, "appleIdentifier", js.undefined)
    
    @scala.inline
    def setCertificate(value: NullableOption[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateNull: Self = StObject.set(x, "certificate", null)
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    @scala.inline
    def setExpirationDateTime(value: String): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setTopicIdentifier(value: NullableOption[String]): Self = StObject.set(x, "topicIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicIdentifierNull: Self = StObject.set(x, "topicIdentifier", null)
    
    @scala.inline
    def setTopicIdentifierUndefined: Self = StObject.set(x, "topicIdentifier", js.undefined)
  }
}
