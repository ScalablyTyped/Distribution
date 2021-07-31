package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetedManagedAppProtection
  extends StObject
     with ManagedAppProtection {
  
  // Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
  var assignments: js.UndefOr[NullableOption[js.Array[TargetedManagedAppPolicyAssignment]]] = js.undefined
  
  // Indicates if the policy is deployed to any inclusion groups or not.
  var isAssigned: js.UndefOr[Boolean] = js.undefined
}
object TargetedManagedAppProtection {
  
  @scala.inline
  def apply(): TargetedManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedManagedAppProtection]
  }
  
  @scala.inline
  implicit class TargetedManagedAppProtectionMutableBuilder[Self <: TargetedManagedAppProtection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignments(value: NullableOption[js.Array[TargetedManagedAppPolicyAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    @scala.inline
    def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsVarargs(value: TargetedManagedAppPolicyAssignment*): Self = StObject.set(x, "assignments", js.Array(value :_*))
    
    @scala.inline
    def setIsAssigned(value: Boolean): Self = StObject.set(x, "isAssigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAssignedUndefined: Self = StObject.set(x, "isAssigned", js.undefined)
  }
}
