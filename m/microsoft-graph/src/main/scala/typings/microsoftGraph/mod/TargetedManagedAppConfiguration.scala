package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class TargetedManagedAppConfigurationMutableBuilder[Self <: TargetedManagedAppConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApps(value: NullableOption[js.Array[ManagedMobileApp]]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsNull: Self = StObject.set(x, "apps", null)
    
    @scala.inline
    def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    @scala.inline
    def setAppsVarargs(value: ManagedMobileApp*): Self = StObject.set(x, "apps", js.Array(value :_*))
    
    @scala.inline
    def setAssignments(value: NullableOption[js.Array[TargetedManagedAppPolicyAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    @scala.inline
    def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsVarargs(value: TargetedManagedAppPolicyAssignment*): Self = StObject.set(x, "assignments", js.Array(value :_*))
    
    @scala.inline
    def setDeployedAppCount(value: Double): Self = StObject.set(x, "deployedAppCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployedAppCountUndefined: Self = StObject.set(x, "deployedAppCount", js.undefined)
    
    @scala.inline
    def setDeploymentSummary(value: NullableOption[ManagedAppPolicyDeploymentSummary]): Self = StObject.set(x, "deploymentSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentSummaryNull: Self = StObject.set(x, "deploymentSummary", null)
    
    @scala.inline
    def setDeploymentSummaryUndefined: Self = StObject.set(x, "deploymentSummary", js.undefined)
    
    @scala.inline
    def setIsAssigned(value: Boolean): Self = StObject.set(x, "isAssigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAssignedUndefined: Self = StObject.set(x, "isAssigned", js.undefined)
  }
}
