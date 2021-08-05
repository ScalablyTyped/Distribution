package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceRefreshWeeklySchedule extends StObject {
  
  /** Days of the week to refresh. At least one day must be specified. */
  var daysOfWeek: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The start time of a time interval in which a data source refresh is scheduled. Only `hours` part is used. The time interval size defaults to that in the Sheets editor. */
  var startTime: js.UndefOr[TimeOfDay] = js.undefined
}
object DataSourceRefreshWeeklySchedule {
  
  inline def apply(): DataSourceRefreshWeeklySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceRefreshWeeklySchedule]
  }
  
  extension [Self <: DataSourceRefreshWeeklySchedule](x: Self) {
    
    inline def setDaysOfWeek(value: js.Array[String]): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDaysOfWeekUndefined: Self = StObject.set(x, "daysOfWeek", js.undefined)
    
    inline def setDaysOfWeekVarargs(value: String*): Self = StObject.set(x, "daysOfWeek", js.Array(value :_*))
    
    inline def setStartTime(value: TimeOfDay): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
