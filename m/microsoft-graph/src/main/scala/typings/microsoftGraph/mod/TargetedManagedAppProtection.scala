package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetedManagedAppProtection extends ManagedAppProtection {
  // Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
  var assignments: js.UndefOr[js.Array[TargetedManagedAppPolicyAssignment]] = js.native
  // Indicates if the policy is deployed to any inclusion groups or not.
  var isAssigned: js.UndefOr[Boolean] = js.native
}

object TargetedManagedAppProtection {
  @scala.inline
  def apply(): TargetedManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedManagedAppProtection]
  }
  @scala.inline
  implicit class TargetedManagedAppProtectionOps[Self <: TargetedManagedAppProtection] (val x: Self) extends AnyVal {
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
    def setAssignmentsVarargs(value: TargetedManagedAppPolicyAssignment*): Self = this.set("assignments", js.Array(value :_*))
    @scala.inline
    def setAssignments(value: js.Array[TargetedManagedAppPolicyAssignment]): Self = this.set("assignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignments: Self = this.set("assignments", js.undefined)
    @scala.inline
    def setIsAssigned(value: Boolean): Self = this.set("isAssigned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAssigned: Self = this.set("isAssigned", js.undefined)
  }
  
}

