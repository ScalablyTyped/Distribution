package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reschedule extends js.Object {
  
  /** Required. The type of the reschedule. */
  var rescheduleType: js.UndefOr[String] = js.native
  
  /** Optional. Timestamp when the maintenance shall be rescheduled to if reschedule_type=SPECIFIC_TIME, in RFC 3339 format, for example *2012-11-15T16:19:00.094Z*. */
  var scheduleTime: js.UndefOr[String] = js.native
}
object Reschedule {
  
  @scala.inline
  def apply(): Reschedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reschedule]
  }
  
  @scala.inline
  implicit class RescheduleOps[Self <: Reschedule] (val x: Self) extends AnyVal {
    
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
    def setRescheduleType(value: String): Self = this.set("rescheduleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRescheduleType: Self = this.set("rescheduleType", js.undefined)
    
    @scala.inline
    def setScheduleTime(value: String): Self = this.set("scheduleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleTime: Self = this.set("scheduleTime", js.undefined)
  }
}
