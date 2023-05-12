package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceManagementPartnerAssignment extends StObject {
  
  // User groups targeting for devices to be enrolled through partner.
  var target: js.UndefOr[NullableOption[DeviceAndAppManagementAssignmentTarget]] = js.undefined
}
object DeviceManagementPartnerAssignment {
  
  inline def apply(): DeviceManagementPartnerAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagementPartnerAssignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceManagementPartnerAssignment] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: NullableOption[DeviceAndAppManagementAssignmentTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
