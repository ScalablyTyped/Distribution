package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceCompliancePolicyAssignment extends Entity {
  // Target for the compliance policy assignment.
  var target: js.UndefOr[DeviceAndAppManagementAssignmentTarget] = js.undefined
}

object DeviceCompliancePolicyAssignment {
  @scala.inline
  def apply(id: String = null, target: DeviceAndAppManagementAssignmentTarget = null): DeviceCompliancePolicyAssignment = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceCompliancePolicyAssignment]
  }
}

