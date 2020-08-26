package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetedManagedAppPolicyAssignment extends Entity {
  // Identifier for deployment of a group or app
  var target: js.UndefOr[DeviceAndAppManagementAssignmentTarget] = js.native
}

object TargetedManagedAppPolicyAssignment {
  @scala.inline
  def apply(): TargetedManagedAppPolicyAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedManagedAppPolicyAssignment]
  }
  @scala.inline
  implicit class TargetedManagedAppPolicyAssignmentOps[Self <: TargetedManagedAppPolicyAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTarget(value: DeviceAndAppManagementAssignmentTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

