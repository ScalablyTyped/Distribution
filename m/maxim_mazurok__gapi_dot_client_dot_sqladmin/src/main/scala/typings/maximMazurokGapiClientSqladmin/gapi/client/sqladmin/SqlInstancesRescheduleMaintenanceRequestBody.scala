package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlInstancesRescheduleMaintenanceRequestBody extends js.Object {
  
  /** Required. The type of the reschedule the user wants. */
  var reschedule: js.UndefOr[Reschedule] = js.native
}
object SqlInstancesRescheduleMaintenanceRequestBody {
  
  @scala.inline
  def apply(): SqlInstancesRescheduleMaintenanceRequestBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlInstancesRescheduleMaintenanceRequestBody]
  }
  
  @scala.inline
  implicit class SqlInstancesRescheduleMaintenanceRequestBodyOps[Self <: SqlInstancesRescheduleMaintenanceRequestBody] (val x: Self) extends AnyVal {
    
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
    def setReschedule(value: Reschedule): Self = this.set("reschedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReschedule: Self = this.set("reschedule", js.undefined)
  }
}
