package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schedule extends StObject {
  
  /** The duration for the cron job event. The duration of the event is effective after the cron job's start time. */
  var cronJobDuration: js.UndefOr[String] = js.undefined
  
  /** The cron definition of the scheduled event. See https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as defined by the realm. */
  var cronSpec: js.UndefOr[String] = js.undefined
  
  /** The end time of the event. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The start time of the event. */
  var startTime: js.UndefOr[String] = js.undefined
}
object Schedule {
  
  inline def apply(): Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schedule]
  }
  
  extension [Self <: Schedule](x: Self) {
    
    inline def setCronJobDuration(value: String): Self = StObject.set(x, "cronJobDuration", value.asInstanceOf[js.Any])
    
    inline def setCronJobDurationUndefined: Self = StObject.set(x, "cronJobDuration", js.undefined)
    
    inline def setCronSpec(value: String): Self = StObject.set(x, "cronSpec", value.asInstanceOf[js.Any])
    
    inline def setCronSpecUndefined: Self = StObject.set(x, "cronSpec", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
