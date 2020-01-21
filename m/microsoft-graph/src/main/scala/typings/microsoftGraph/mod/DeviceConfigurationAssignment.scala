package typings.microsoftGraph.mod

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
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfigurationAssignment]
  }
}

