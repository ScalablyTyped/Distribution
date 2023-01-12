package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenShiftChangeRequest
  extends StObject
     with ScheduleChangeRequest {
  
  // ID for the open shift.
  var openShiftId: js.UndefOr[NullableOption[String]] = js.undefined
}
object OpenShiftChangeRequest {
  
  inline def apply(): OpenShiftChangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenShiftChangeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenShiftChangeRequest] (val x: Self) extends AnyVal {
    
    inline def setOpenShiftId(value: NullableOption[String]): Self = StObject.set(x, "openShiftId", value.asInstanceOf[js.Any])
    
    inline def setOpenShiftIdNull: Self = StObject.set(x, "openShiftId", null)
    
    inline def setOpenShiftIdUndefined: Self = StObject.set(x, "openShiftId", js.undefined)
  }
}
