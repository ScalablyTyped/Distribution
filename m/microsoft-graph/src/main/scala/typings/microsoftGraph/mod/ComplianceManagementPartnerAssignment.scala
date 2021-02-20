package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceManagementPartnerAssignment extends StObject {
  
  // Group assignment target.
  var target: js.UndefOr[NullableOption[DeviceAndAppManagementAssignmentTarget]] = js.native
}
object ComplianceManagementPartnerAssignment {
  
  @scala.inline
  def apply(): ComplianceManagementPartnerAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceManagementPartnerAssignment]
  }
  
  @scala.inline
  implicit class ComplianceManagementPartnerAssignmentMutableBuilder[Self <: ComplianceManagementPartnerAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: NullableOption[DeviceAndAppManagementAssignmentTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
