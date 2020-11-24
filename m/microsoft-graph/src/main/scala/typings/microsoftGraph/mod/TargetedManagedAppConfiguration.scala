package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetedManagedAppConfiguration extends ManagedAppConfiguration {
  
  // List of apps to which the policy is deployed.
  var apps: js.UndefOr[NullableOption[js.Array[ManagedMobileApp]]] = js.native
  
  // Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
  var assignments: js.UndefOr[NullableOption[js.Array[TargetedManagedAppPolicyAssignment]]] = js.native
  
  // Count of apps to which the current policy is deployed.
  var deployedAppCount: js.UndefOr[Double] = js.native
  
  // Navigation property to deployment summary of the configuration.
  var deploymentSummary: js.UndefOr[NullableOption[ManagedAppPolicyDeploymentSummary]] = js.native
  
  // Indicates if the policy is deployed to any inclusion groups or not.
  var isAssigned: js.UndefOr[Boolean] = js.native
}
object TargetedManagedAppConfiguration {
  
  @scala.inline
  def apply(): TargetedManagedAppConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedManagedAppConfiguration]
  }
  
  @scala.inline
  implicit class TargetedManagedAppConfigurationOps[Self <: TargetedManagedAppConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAppsVarargs(value: ManagedMobileApp*): Self = this.set("apps", js.Array(value :_*))
    
    @scala.inline
    def setApps(value: NullableOption[js.Array[ManagedMobileApp]]): Self = this.set("apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApps: Self = this.set("apps", js.undefined)
    
    @scala.inline
    def setAppsNull: Self = this.set("apps", null)
    
    @scala.inline
    def setAssignmentsVarargs(value: TargetedManagedAppPolicyAssignment*): Self = this.set("assignments", js.Array(value :_*))
    
    @scala.inline
    def setAssignments(value: NullableOption[js.Array[TargetedManagedAppPolicyAssignment]]): Self = this.set("assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignments: Self = this.set("assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsNull: Self = this.set("assignments", null)
    
    @scala.inline
    def setDeployedAppCount(value: Double): Self = this.set("deployedAppCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployedAppCount: Self = this.set("deployedAppCount", js.undefined)
    
    @scala.inline
    def setDeploymentSummary(value: NullableOption[ManagedAppPolicyDeploymentSummary]): Self = this.set("deploymentSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentSummary: Self = this.set("deploymentSummary", js.undefined)
    
    @scala.inline
    def setDeploymentSummaryNull: Self = this.set("deploymentSummary", null)
    
    @scala.inline
    def setIsAssigned(value: Boolean): Self = this.set("isAssigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAssigned: Self = this.set("isAssigned", js.undefined)
  }
}
