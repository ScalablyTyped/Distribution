package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schedule extends js.Object {
  
  /** The duration for the cron job event. The duration of the event is effective after the cron job's start time. */
  var cronJobDuration: js.UndefOr[String] = js.native
  
  /** The cron definition of the scheduled event. See https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as defined by the realm. */
  var cronSpec: js.UndefOr[String] = js.native
  
  /** The end time of the event. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The start time of the event. */
  var startTime: js.UndefOr[String] = js.native
}
object Schedule {
  
  @scala.inline
  def apply(): Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schedule]
  }
  
  @scala.inline
  implicit class ScheduleOps[Self <: Schedule] (val x: Self) extends AnyVal {
    
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
    def setCronJobDuration(value: String): Self = this.set("cronJobDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCronJobDuration: Self = this.set("cronJobDuration", js.undefined)
    
    @scala.inline
    def setCronSpec(value: String): Self = this.set("cronSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCronSpec: Self = this.set("cronSpec", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
