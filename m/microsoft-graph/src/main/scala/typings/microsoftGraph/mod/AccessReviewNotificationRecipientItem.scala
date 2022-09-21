package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewNotificationRecipientItem extends StObject {
  
  // Determines the recipient of the notification email.
  var notificationRecipientScope: js.UndefOr[NullableOption[AccessReviewNotificationRecipientScope]] = js.undefined
  
  /**
    * Indicates the type of access review email to be sent. Supported template type is CompletedAdditionalRecipients, which
    * sends review completion notifications to the recipients.
    */
  var notificationTemplateType: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessReviewNotificationRecipientItem {
  
  inline def apply(): AccessReviewNotificationRecipientItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewNotificationRecipientItem]
  }
  
  extension [Self <: AccessReviewNotificationRecipientItem](x: Self) {
    
    inline def setNotificationRecipientScope(value: NullableOption[AccessReviewNotificationRecipientScope]): Self = StObject.set(x, "notificationRecipientScope", value.asInstanceOf[js.Any])
    
    inline def setNotificationRecipientScopeNull: Self = StObject.set(x, "notificationRecipientScope", null)
    
    inline def setNotificationRecipientScopeUndefined: Self = StObject.set(x, "notificationRecipientScope", js.undefined)
    
    inline def setNotificationTemplateType(value: NullableOption[String]): Self = StObject.set(x, "notificationTemplateType", value.asInstanceOf[js.Any])
    
    inline def setNotificationTemplateTypeNull: Self = StObject.set(x, "notificationTemplateType", null)
    
    inline def setNotificationTemplateTypeUndefined: Self = StObject.set(x, "notificationTemplateType", js.undefined)
  }
}
