package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedDeviceMobileAppConfigurationAssignment
  extends StObject
     with Entity {
  
  // Assignment target that the T&amp;C policy is assigned to.
  var target: js.UndefOr[NullableOption[DeviceAndAppManagementAssignmentTarget]] = js.undefined
}
object ManagedDeviceMobileAppConfigurationAssignment {
  
  @scala.inline
  def apply(): ManagedDeviceMobileAppConfigurationAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedDeviceMobileAppConfigurationAssignment]
  }
  
  @scala.inline
  implicit class ManagedDeviceMobileAppConfigurationAssignmentMutableBuilder[Self <: ManagedDeviceMobileAppConfigurationAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: NullableOption[DeviceAndAppManagementAssignmentTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
