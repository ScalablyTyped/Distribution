package typings.microsoftGraph.mod

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
  implicit class OpenShiftChangeRequestOps[Self <: OpenShiftChangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOpenShiftId(value: NullableOption[String]): Self = this.set("openShiftId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenShiftId: Self = this.set("openShiftId", js.undefined)
    
    @scala.inline
    def setOpenShiftIdNull: Self = this.set("openShiftId", null)
  }
}
