package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceComplianceActionItem extends Entity {
  
  /**
    * What action to take. Possible values are: noAction, notification, block, retire, wipe, removeResourceAccessProfiles,
    * pushNotification.
    */
  var actionType: js.UndefOr[DeviceComplianceActionType] = js.native
  
  // Number of hours to wait till the action will be enforced. Valid values 0 to 8760
  var gracePeriodHours: js.UndefOr[Double] = js.native
  
  // A list of group IDs to speicify who to CC this notification message to.
  var notificationMessageCCList: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // What notification Message template to use
  var notificationTemplateId: js.UndefOr[NullableOption[String]] = js.native
}
object DeviceComplianceActionItem {
  
  @scala.inline
  def apply(): DeviceComplianceActionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceComplianceActionItem]
  }
  
  @scala.inline
  implicit class DeviceComplianceActionItemMutableBuilder[Self <: DeviceComplianceActionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: DeviceComplianceActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    @scala.inline
    def setGracePeriodHours(value: Double): Self = StObject.set(x, "gracePeriodHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGracePeriodHoursUndefined: Self = StObject.set(x, "gracePeriodHours", js.undefined)
    
    @scala.inline
    def setNotificationMessageCCList(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "notificationMessageCCList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationMessageCCListNull: Self = StObject.set(x, "notificationMessageCCList", null)
    
    @scala.inline
    def setNotificationMessageCCListUndefined: Self = StObject.set(x, "notificationMessageCCList", js.undefined)
    
    @scala.inline
    def setNotificationMessageCCListVarargs(value: String*): Self = StObject.set(x, "notificationMessageCCList", js.Array(value :_*))
    
    @scala.inline
    def setNotificationTemplateId(value: NullableOption[String]): Self = StObject.set(x, "notificationTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTemplateIdNull: Self = StObject.set(x, "notificationTemplateId", null)
    
    @scala.inline
    def setNotificationTemplateIdUndefined: Self = StObject.set(x, "notificationTemplateId", js.undefined)
  }
}
