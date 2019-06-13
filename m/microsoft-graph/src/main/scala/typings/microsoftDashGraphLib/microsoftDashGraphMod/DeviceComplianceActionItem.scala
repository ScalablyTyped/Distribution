package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceComplianceActionItem extends Entity {
  /** What action to take. Possible values are: noAction, notification, block, retire, wipe, removeResourceAccessProfiles, pushNotification. */
  var actionType: js.UndefOr[DeviceComplianceActionType] = js.undefined
  /** Number of hours to wait till the action will be enforced. Valid values 0 to 8760 */
  var gracePeriodHours: js.UndefOr[scala.Double] = js.undefined
  /** A list of group IDs to speicify who to CC this notification message to. */
  var notificationMessageCCList: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** What notification Message template to use */
  var notificationTemplateId: js.UndefOr[java.lang.String] = js.undefined
}

object DeviceComplianceActionItem {
  @scala.inline
  def apply(
    actionType: DeviceComplianceActionType = null,
    gracePeriodHours: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    notificationMessageCCList: js.Array[java.lang.String] = null,
    notificationTemplateId: java.lang.String = null
  ): DeviceComplianceActionItem = {
    val __obj = js.Dynamic.literal()
    if (actionType != null) __obj.updateDynamic("actionType")(actionType)
    if (gracePeriodHours != null) __obj.updateDynamic("gracePeriodHours")(gracePeriodHours.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (notificationMessageCCList != null) __obj.updateDynamic("notificationMessageCCList")(notificationMessageCCList)
    if (notificationTemplateId != null) __obj.updateDynamic("notificationTemplateId")(notificationTemplateId)
    __obj.asInstanceOf[DeviceComplianceActionItem]
  }
}

