package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleManagementPolicyNotificationRule
  extends StObject
     with UnifiedRoleManagementPolicyRule {
  
  // Indicates whether a default recipient will receive the notification email.
  var isDefaultRecipientsEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The level of notification. The possible values are None, Critical, All.
  var notificationLevel: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The list of recipients of the email notifications.
  var notificationRecipients: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The type of notification. Only Email is supported.
  var notificationType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of recipient of the notification. The possible values are Requestor, Approver, Admin.
  var recipientType: js.UndefOr[NullableOption[String]] = js.undefined
}
object UnifiedRoleManagementPolicyNotificationRule {
  
  inline def apply(): UnifiedRoleManagementPolicyNotificationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleManagementPolicyNotificationRule]
  }
  
  extension [Self <: UnifiedRoleManagementPolicyNotificationRule](x: Self) {
    
    inline def setIsDefaultRecipientsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isDefaultRecipientsEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultRecipientsEnabledNull: Self = StObject.set(x, "isDefaultRecipientsEnabled", null)
    
    inline def setIsDefaultRecipientsEnabledUndefined: Self = StObject.set(x, "isDefaultRecipientsEnabled", js.undefined)
    
    inline def setNotificationLevel(value: NullableOption[String]): Self = StObject.set(x, "notificationLevel", value.asInstanceOf[js.Any])
    
    inline def setNotificationLevelNull: Self = StObject.set(x, "notificationLevel", null)
    
    inline def setNotificationLevelUndefined: Self = StObject.set(x, "notificationLevel", js.undefined)
    
    inline def setNotificationRecipients(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "notificationRecipients", value.asInstanceOf[js.Any])
    
    inline def setNotificationRecipientsNull: Self = StObject.set(x, "notificationRecipients", null)
    
    inline def setNotificationRecipientsUndefined: Self = StObject.set(x, "notificationRecipients", js.undefined)
    
    inline def setNotificationRecipientsVarargs(value: String*): Self = StObject.set(x, "notificationRecipients", js.Array(value*))
    
    inline def setNotificationType(value: NullableOption[String]): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
    
    inline def setNotificationTypeNull: Self = StObject.set(x, "notificationType", null)
    
    inline def setNotificationTypeUndefined: Self = StObject.set(x, "notificationType", js.undefined)
    
    inline def setRecipientType(value: NullableOption[String]): Self = StObject.set(x, "recipientType", value.asInstanceOf[js.Any])
    
    inline def setRecipientTypeNull: Self = StObject.set(x, "recipientType", null)
    
    inline def setRecipientTypeUndefined: Self = StObject.set(x, "recipientType", js.undefined)
  }
}
