package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceConfigurationAssignment extends Entity {
  
  // The assignment target for the device configuration.
  var target: js.UndefOr[NullableOption[DeviceAndAppManagementAssignmentTarget]] = js.native
}
object DeviceConfigurationAssignment {
  
  @scala.inline
  def apply(): DeviceConfigurationAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfigurationAssignment]
  }
  
  @scala.inline
  implicit class DeviceConfigurationAssignmentMutableBuilder[Self <: DeviceConfigurationAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: NullableOption[DeviceAndAppManagementAssignmentTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
