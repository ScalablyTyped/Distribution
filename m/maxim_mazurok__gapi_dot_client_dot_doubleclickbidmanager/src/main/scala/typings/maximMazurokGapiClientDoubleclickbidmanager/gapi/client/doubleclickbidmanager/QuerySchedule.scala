package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySchedule extends StObject {
  
  /** Datetime to periodically run the query until. */
  var endTimeMs: js.UndefOr[String] = js.undefined
  
  /** How often the query is run. */
  var frequency: js.UndefOr[String] = js.undefined
  
  /** Time of day at which a new report will be generated, represented as minutes past midnight. Range is 0 to 1439. Only applies to scheduled reports. */
  var nextRunMinuteOfDay: js.UndefOr[Double] = js.undefined
  
  /** Canonical timezone code for report generation time. Defaults to America/New_York. */
  var nextRunTimezoneCode: js.UndefOr[String] = js.undefined
  
  /** When to start running the query. Not applicable to `ONE_TIME` frequency. */
  var startTimeMs: js.UndefOr[String] = js.undefined
}
object QuerySchedule {
  
  inline def apply(): QuerySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuerySchedule]
  }
  
  extension [Self <: QuerySchedule](x: Self) {
    
    inline def setEndTimeMs(value: String): Self = StObject.set(x, "endTimeMs", value.asInstanceOf[js.Any])
    
    inline def setEndTimeMsUndefined: Self = StObject.set(x, "endTimeMs", js.undefined)
    
    inline def setFrequency(value: String): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setNextRunMinuteOfDay(value: Double): Self = StObject.set(x, "nextRunMinuteOfDay", value.asInstanceOf[js.Any])
    
    inline def setNextRunMinuteOfDayUndefined: Self = StObject.set(x, "nextRunMinuteOfDay", js.undefined)
    
    inline def setNextRunTimezoneCode(value: String): Self = StObject.set(x, "nextRunTimezoneCode", value.asInstanceOf[js.Any])
    
    inline def setNextRunTimezoneCodeUndefined: Self = StObject.set(x, "nextRunTimezoneCode", js.undefined)
    
    inline def setStartTimeMs(value: String): Self = StObject.set(x, "startTimeMs", value.asInstanceOf[js.Any])
    
    inline def setStartTimeMsUndefined: Self = StObject.set(x, "startTimeMs", js.undefined)
  }
}
