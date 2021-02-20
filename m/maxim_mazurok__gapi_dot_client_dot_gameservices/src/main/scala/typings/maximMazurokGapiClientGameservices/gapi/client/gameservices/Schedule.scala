package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schedule extends StObject {
  
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
  implicit class ScheduleMutableBuilder[Self <: Schedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCronJobDuration(value: String): Self = StObject.set(x, "cronJobDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCronJobDurationUndefined: Self = StObject.set(x, "cronJobDuration", js.undefined)
    
    @scala.inline
    def setCronSpec(value: String): Self = StObject.set(x, "cronSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCronSpecUndefined: Self = StObject.set(x, "cronSpec", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
