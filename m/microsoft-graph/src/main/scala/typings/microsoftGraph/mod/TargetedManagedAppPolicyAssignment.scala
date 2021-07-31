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
  
  @scala.inline
  def apply(): TargetedManagedAppPolicyAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedManagedAppPolicyAssignment]
  }
  
  @scala.inline
  implicit class TargetedManagedAppPolicyAssignmentMutableBuilder[Self <: TargetedManagedAppPolicyAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: NullableOption[DeviceAndAppManagementAssignmentTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
