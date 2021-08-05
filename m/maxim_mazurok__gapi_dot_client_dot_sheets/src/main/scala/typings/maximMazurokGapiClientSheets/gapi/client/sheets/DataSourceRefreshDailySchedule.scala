package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceRefreshDailySchedule extends StObject {
  
  /** The start time of a time interval in which a data source refresh is scheduled. Only `hours` part is used. The time interval size defaults to that in the Sheets editor. */
  var startTime: js.UndefOr[TimeOfDay] = js.undefined
}
object DataSourceRefreshDailySchedule {
  
  inline def apply(): DataSourceRefreshDailySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceRefreshDailySchedule]
  }
  
  extension [Self <: DataSourceRefreshDailySchedule](x: Self) {
    
    inline def setStartTime(value: TimeOfDay): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
