package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceComplianceActionItem
  extends StObject
     with Entity {
  
  /**
    * What action to take. Possible values are: noAction, notification, block, retire, wipe, removeResourceAccessProfiles,
    * pushNotification.
    */
  var actionType: js.UndefOr[DeviceComplianceActionType] = js.undefined
  
  // Number of hours to wait till the action will be enforced. Valid values 0 to 8760
  var gracePeriodHours: js.UndefOr[Double] = js.undefined
  
  // A list of group IDs to speicify who to CC this notification message to.
  var notificationMessageCCList: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // What notification Message template to use
  var notificationTemplateId: js.UndefOr[NullableOption[String]] = js.undefined
}
object DeviceComplianceActionItem {
  
  inline def apply(): DeviceComplianceActionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceComplianceActionItem]
  }
  
  extension [Self <: DeviceComplianceActionItem](x: Self) {
    
    inline def setActionType(value: DeviceComplianceActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    inline def setGracePeriodHours(value: Double): Self = StObject.set(x, "gracePeriodHours", value.asInstanceOf[js.Any])
    
    inline def setGracePeriodHoursUndefined: Self = StObject.set(x, "gracePeriodHours", js.undefined)
    
    inline def setNotificationMessageCCList(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "notificationMessageCCList", value.asInstanceOf[js.Any])
    
    inline def setNotificationMessageCCListNull: Self = StObject.set(x, "notificationMessageCCList", null)
    
    inline def setNotificationMessageCCListUndefined: Self = StObject.set(x, "notificationMessageCCList", js.undefined)
    
    inline def setNotificationMessageCCListVarargs(value: String*): Self = StObject.set(x, "notificationMessageCCList", js.Array(value*))
    
    inline def setNotificationTemplateId(value: NullableOption[String]): Self = StObject.set(x, "notificationTemplateId", value.asInstanceOf[js.Any])
    
    inline def setNotificationTemplateIdNull: Self = StObject.set(x, "notificationTemplateId", null)
    
    inline def setNotificationTemplateIdUndefined: Self = StObject.set(x, "notificationTemplateId", js.undefined)
  }
}
