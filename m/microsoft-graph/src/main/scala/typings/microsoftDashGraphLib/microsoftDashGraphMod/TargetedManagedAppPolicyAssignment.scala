package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetedManagedAppPolicyAssignment extends Entity {
  // Identifier for deployment of a group or app
  var target: js.UndefOr[DeviceAndAppManagementAssignmentTarget] = js.undefined
}

object TargetedManagedAppPolicyAssignment {
  @scala.inline
  def apply(id: java.lang.String = null, target: DeviceAndAppManagementAssignmentTarget = null): TargetedManagedAppPolicyAssignment = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[TargetedManagedAppPolicyAssignment]
  }
}

