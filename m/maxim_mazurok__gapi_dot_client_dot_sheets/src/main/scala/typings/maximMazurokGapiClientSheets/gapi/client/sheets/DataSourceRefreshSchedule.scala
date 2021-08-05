package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceRefreshSchedule extends StObject {
  
  /** Daily refresh schedule. */
  var dailySchedule: js.UndefOr[DataSourceRefreshDailySchedule] = js.undefined
  
  /** True if the refresh schedule is enabled, or false otherwise. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** Monthly refresh schedule. */
  var monthlySchedule: js.UndefOr[DataSourceRefreshMonthlySchedule] = js.undefined
  
  /** Output only. The time interval of the next run. */
  var nextRun: js.UndefOr[Interval] = js.undefined
  
  /** The scope of the refresh. Must be ALL_DATA_SOURCES. */
  var refreshScope: js.UndefOr[String] = js.undefined
  
  /** Weekly refresh schedule. */
  var weeklySchedule: js.UndefOr[DataSourceRefreshWeeklySchedule] = js.undefined
}
object DataSourceRefreshSchedule {
  
  inline def apply(): DataSourceRefreshSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceRefreshSchedule]
  }
  
  extension [Self <: DataSourceRefreshSchedule](x: Self) {
    
    inline def setDailySchedule(value: DataSourceRefreshDailySchedule): Self = StObject.set(x, "dailySchedule", value.asInstanceOf[js.Any])
    
    inline def setDailyScheduleUndefined: Self = StObject.set(x, "dailySchedule", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMonthlySchedule(value: DataSourceRefreshMonthlySchedule): Self = StObject.set(x, "monthlySchedule", value.asInstanceOf[js.Any])
    
    inline def setMonthlyScheduleUndefined: Self = StObject.set(x, "monthlySchedule", js.undefined)
    
    inline def setNextRun(value: Interval): Self = StObject.set(x, "nextRun", value.asInstanceOf[js.Any])
    
    inline def setNextRunUndefined: Self = StObject.set(x, "nextRun", js.undefined)
    
    inline def setRefreshScope(value: String): Self = StObject.set(x, "refreshScope", value.asInstanceOf[js.Any])
    
    inline def setRefreshScopeUndefined: Self = StObject.set(x, "refreshScope", js.undefined)
    
    inline def setWeeklySchedule(value: DataSourceRefreshWeeklySchedule): Self = StObject.set(x, "weeklySchedule", value.asInstanceOf[js.Any])
    
    inline def setWeeklyScheduleUndefined: Self = StObject.set(x, "weeklySchedule", js.undefined)
  }
}
