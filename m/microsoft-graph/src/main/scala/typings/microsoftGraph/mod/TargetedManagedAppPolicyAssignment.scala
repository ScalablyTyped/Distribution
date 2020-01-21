package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetedManagedAppPolicyAssignment extends Entity {
  // Identifier for deployment of a group or app
  var target: js.UndefOr[DeviceAndAppManagementAssignmentTarget] = js.undefined
}

object TargetedManagedAppPolicyAssignment {
  @scala.inline
  def apply(id: String = null, target: DeviceAndAppManagementAssignmentTarget = null): TargetedManagedAppPolicyAssignment = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedManagedAppPolicyAssignment]
  }
}

