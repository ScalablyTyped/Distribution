package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceManagementPartnerAssignment extends StObject {
  
  // Group assignment target.
  var target: js.UndefOr[NullableOption[DeviceAndAppManagementAssignmentTarget]] = js.undefined
}
object ComplianceManagementPartnerAssignment {
  
  inline def apply(): ComplianceManagementPartnerAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceManagementPartnerAssignment]
  }
  
  extension [Self <: ComplianceManagementPartnerAssignment](x: Self) {
    
    inline def setTarget(value: NullableOption[DeviceAndAppManagementAssignmentTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
