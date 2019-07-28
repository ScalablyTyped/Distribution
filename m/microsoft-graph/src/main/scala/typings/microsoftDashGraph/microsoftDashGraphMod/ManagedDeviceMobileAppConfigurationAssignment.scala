package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedDeviceMobileAppConfigurationAssignment extends Entity {
  // Assignment target that the T&amp;C policy is assigned to.
  var target: js.UndefOr[DeviceAndAppManagementAssignmentTarget] = js.undefined
}

object ManagedDeviceMobileAppConfigurationAssignment {
  @scala.inline
  def apply(id: String = null, target: DeviceAndAppManagementAssignmentTarget = null): ManagedDeviceMobileAppConfigurationAssignment = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ManagedDeviceMobileAppConfigurationAssignment]
  }
}

