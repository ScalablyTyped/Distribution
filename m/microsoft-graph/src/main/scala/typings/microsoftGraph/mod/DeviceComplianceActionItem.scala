package typings.microsoftGraph.mod

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
  implicit class DeviceComplianceActionItemOps[Self <: DeviceComplianceActionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionType(value: DeviceComplianceActionType): Self = this.set("actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
    
    @scala.inline
    def setGracePeriodHours(value: Double): Self = this.set("gracePeriodHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGracePeriodHours: Self = this.set("gracePeriodHours", js.undefined)
    
    @scala.inline
    def setNotificationMessageCCListVarargs(value: String*): Self = this.set("notificationMessageCCList", js.Array(value :_*))
    
    @scala.inline
    def setNotificationMessageCCList(value: NullableOption[js.Array[String]]): Self = this.set("notificationMessageCCList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationMessageCCList: Self = this.set("notificationMessageCCList", js.undefined)
    
    @scala.inline
    def setNotificationMessageCCListNull: Self = this.set("notificationMessageCCList", null)
    
    @scala.inline
    def setNotificationTemplateId(value: NullableOption[String]): Self = this.set("notificationTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationTemplateId: Self = this.set("notificationTemplateId", js.undefined)
    
    @scala.inline
    def setNotificationTemplateIdNull: Self = this.set("notificationTemplateId", null)
  }
}
