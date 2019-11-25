package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceComplianceActionItem extends Entity {
  /**
    * What action to take. Possible values are: noAction, notification, block, retire, wipe, removeResourceAccessProfiles,
    * pushNotification.
    */
  var actionType: js.UndefOr[DeviceComplianceActionType] = js.undefined
  // Number of hours to wait till the action will be enforced. Valid values 0 to 8760
  var gracePeriodHours: js.UndefOr[Double] = js.undefined
  // A list of group IDs to speicify who to CC this notification message to.
  var notificationMessageCCList: js.UndefOr[js.Array[String]] = js.undefined
  // What notification Message template to use
  var notificationTemplateId: js.UndefOr[String] = js.undefined
}

object DeviceComplianceActionItem {
  @scala.inline
  def apply(
    actionType: DeviceComplianceActionType = null,
    gracePeriodHours: Int | Double = null,
    id: String = null,
    notificationMessageCCList: js.Array[String] = null,
    notificationTemplateId: String = null
  ): DeviceComplianceActionItem = {
    val __obj = js.Dynamic.literal()
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    if (gracePeriodHours != null) __obj.updateDynamic("gracePeriodHours")(gracePeriodHours.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (notificationMessageCCList != null) __obj.updateDynamic("notificationMessageCCList")(notificationMessageCCList.asInstanceOf[js.Any])
    if (notificationTemplateId != null) __obj.updateDynamic("notificationTemplateId")(notificationTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceComplianceActionItem]
  }
}

