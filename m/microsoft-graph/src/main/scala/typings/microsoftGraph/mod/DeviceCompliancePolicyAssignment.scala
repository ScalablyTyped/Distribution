package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceCompliancePolicyAssignment
  extends StObject
     with Entity {
  
  // Target for the compliance policy assignment.
  var target: js.UndefOr[NullableOption[DeviceAndAppManagementAssignmentTarget]] = js.undefined
}
object DeviceCompliancePolicyAssignment {
  
  @scala.inline
  def apply(): DeviceCompliancePolicyAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCompliancePolicyAssignment]
  }
  
  @scala.inline
  implicit class DeviceCompliancePolicyAssignmentMutableBuilder[Self <: DeviceCompliancePolicyAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: NullableOption[DeviceAndAppManagementAssignmentTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
