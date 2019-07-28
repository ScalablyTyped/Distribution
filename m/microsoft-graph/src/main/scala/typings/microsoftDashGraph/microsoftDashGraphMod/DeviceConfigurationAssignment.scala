package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceConfigurationAssignment extends Entity {
  // The assignment target for the device configuration.
  var target: js.UndefOr[DeviceAndAppManagementAssignmentTarget] = js.undefined
}

object DeviceConfigurationAssignment {
  @scala.inline
  def apply(id: String = null, target: DeviceAndAppManagementAssignmentTarget = null): DeviceConfigurationAssignment = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DeviceConfigurationAssignment]
  }
}

