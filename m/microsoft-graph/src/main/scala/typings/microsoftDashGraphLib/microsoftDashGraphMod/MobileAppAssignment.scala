package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileAppAssignment extends Entity {
  /**
    * The install intent defined by the admin. Possible values are: available, required, uninstall,
    * availableWithoutEnrollment.
    */
  var intent: js.UndefOr[InstallIntent] = js.undefined
  // The settings for target assignment defined by the admin.
  var settings: js.UndefOr[MobileAppAssignmentSettings] = js.undefined
  // The target group assignment defined by the admin.
  var target: js.UndefOr[DeviceAndAppManagementAssignmentTarget] = js.undefined
}

object MobileAppAssignment {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    intent: InstallIntent = null,
    settings: MobileAppAssignmentSettings = null,
    target: DeviceAndAppManagementAssignmentTarget = null
  ): MobileAppAssignment = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[MobileAppAssignment]
  }
}

