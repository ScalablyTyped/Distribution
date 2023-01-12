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
  
  inline def apply(): TargetedManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedManagedAppProtection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetedManagedAppProtection] (val x: Self) extends AnyVal {
    
    inline def setAssignments(value: NullableOption[js.Array[TargetedManagedAppPolicyAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setAssignmentsVarargs(value: TargetedManagedAppPolicyAssignment*): Self = StObject.set(x, "assignments", js.Array(value*))
    
    inline def setIsAssigned(value: Boolean): Self = StObject.set(x, "isAssigned", value.asInstanceOf[js.Any])
    
    inline def setIsAssignedUndefined: Self = StObject.set(x, "isAssigned", js.undefined)
  }
}
