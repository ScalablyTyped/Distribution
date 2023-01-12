package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceConfigurationAssignment
  extends StObject
     with Entity {
  
  // The assignment target for the device configuration.
  var target: js.UndefOr[NullableOption[DeviceAndAppManagementAssignmentTarget]] = js.undefined
}
object DeviceConfigurationAssignment {
  
  inline def apply(): DeviceConfigurationAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfigurationAssignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceConfigurationAssignment] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: NullableOption[DeviceAndAppManagementAssignmentTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
