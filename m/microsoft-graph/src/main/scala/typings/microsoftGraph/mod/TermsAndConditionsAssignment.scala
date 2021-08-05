package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermsAndConditionsAssignment
  extends StObject
     with Entity {
  
  // Assignment target that the T&amp;C policy is assigned to.
  var target: js.UndefOr[NullableOption[DeviceAndAppManagementAssignmentTarget]] = js.undefined
}
object TermsAndConditionsAssignment {
  
  inline def apply(): TermsAndConditionsAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TermsAndConditionsAssignment]
  }
  
  extension [Self <: TermsAndConditionsAssignment](x: Self) {
    
    inline def setTarget(value: NullableOption[DeviceAndAppManagementAssignmentTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
