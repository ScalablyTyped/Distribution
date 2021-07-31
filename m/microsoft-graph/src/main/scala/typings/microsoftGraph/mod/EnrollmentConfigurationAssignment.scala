package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrollmentConfigurationAssignment
  extends StObject
     with Entity {
  
  // Not yet documented
  var target: js.UndefOr[NullableOption[DeviceAndAppManagementAssignmentTarget]] = js.undefined
}
object EnrollmentConfigurationAssignment {
  
  @scala.inline
  def apply(): EnrollmentConfigurationAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrollmentConfigurationAssignment]
  }
  
  @scala.inline
  implicit class EnrollmentConfigurationAssignmentMutableBuilder[Self <: EnrollmentConfigurationAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: NullableOption[DeviceAndAppManagementAssignmentTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
