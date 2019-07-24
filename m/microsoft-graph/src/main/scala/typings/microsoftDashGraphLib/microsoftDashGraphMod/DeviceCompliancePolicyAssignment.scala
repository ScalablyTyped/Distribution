package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceCompliancePolicyAssignment extends Entity {
  // Target for the compliance policy assignment.
  var target: js.UndefOr[DeviceAndAppManagementAssignmentTarget] = js.undefined
}

object DeviceCompliancePolicyAssignment {
  @scala.inline
  def apply(id: java.lang.String = null, target: DeviceAndAppManagementAssignmentTarget = null): DeviceCompliancePolicyAssignment = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DeviceCompliancePolicyAssignment]
  }
}

