package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenShiftChangeRequest extends ScheduleChangeRequest {
  
  // ID for the open shift.
  var openShiftId: js.UndefOr[NullableOption[String]] = js.native
}
object OpenShiftChangeRequest {
  
  @scala.inline
  def apply(): OpenShiftChangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenShiftChangeRequest]
  }
  
  @scala.inline
  implicit class OpenShiftChangeRequestMutableBuilder[Self <: OpenShiftChangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenShiftId(value: NullableOption[String]): Self = StObject.set(x, "openShiftId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenShiftIdNull: Self = StObject.set(x, "openShiftId", null)
    
    @scala.inline
    def setOpenShiftIdUndefined: Self = StObject.set(x, "openShiftId", js.undefined)
  }
}
