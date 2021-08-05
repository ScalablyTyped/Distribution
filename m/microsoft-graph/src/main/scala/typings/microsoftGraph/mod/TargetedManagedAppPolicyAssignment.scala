package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetedManagedAppPolicyAssignment
  extends StObject
     with Entity {
  
  // Identifier for deployment of a group or app
  var target: js.UndefOr[NullableOption[DeviceAndAppManagementAssignmentTarget]] = js.undefined
}
object TargetedManagedAppPolicyAssignment {
  
  inline def apply(): TargetedManagedAppPolicyAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedManagedAppPolicyAssignment]
  }
  
  extension [Self <: TargetedManagedAppPolicyAssignment](x: Self) {
    
    inline def setTarget(value: NullableOption[DeviceAndAppManagementAssignmentTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
