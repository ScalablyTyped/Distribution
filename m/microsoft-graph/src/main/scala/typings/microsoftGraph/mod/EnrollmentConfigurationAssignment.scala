package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrollmentConfigurationAssignment
  extends StObject
     with Entity {
  
  // Represents an assignment to managed devices in the tenant
  var target: js.UndefOr[NullableOption[DeviceAndAppManagementAssignmentTarget]] = js.undefined
}
object EnrollmentConfigurationAssignment {
  
  inline def apply(): EnrollmentConfigurationAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrollmentConfigurationAssignment]
  }
  
  extension [Self <: EnrollmentConfigurationAssignment](x: Self) {
    
    inline def setTarget(value: NullableOption[DeviceAndAppManagementAssignmentTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
