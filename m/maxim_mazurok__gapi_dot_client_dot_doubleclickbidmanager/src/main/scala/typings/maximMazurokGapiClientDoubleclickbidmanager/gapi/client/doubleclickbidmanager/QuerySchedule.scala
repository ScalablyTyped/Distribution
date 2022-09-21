package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySchedule extends StObject {
  
  /** Date to periodically run the query until. Not applicable to `ONE_TIME` frequency. */
  var endDate: js.UndefOr[Date] = js.undefined
  
  /** How often the query is run. */
  var frequency: js.UndefOr[String] = js.undefined
  
  /** Canonical timezone code for report generation time. Defaults to `America/New_York`. */
  var nextRunTimezoneCode: js.UndefOr[String] = js.undefined
  
  /** When to start running the query. Not applicable to `ONE_TIME` frequency. */
  var startDate: js.UndefOr[Date] = js.undefined
}
object QuerySchedule {
  
  inline def apply(): QuerySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuerySchedule]
  }
  
  extension [Self <: QuerySchedule](x: Self) {
    
    inline def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setFrequency(value: String): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setNextRunTimezoneCode(value: String): Self = StObject.set(x, "nextRunTimezoneCode", value.asInstanceOf[js.Any])
    
    inline def setNextRunTimezoneCodeUndefined: Self = StObject.set(x, "nextRunTimezoneCode", js.undefined)
    
    inline def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
