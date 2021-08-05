package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonthlySchedule extends StObject {
  
  /**
    * Required. One day of the month. 1-31 indicates the 1st to the 31st day. -1 indicates the last day of the month. Months without the target day will be skipped. For example, a
    * schedule to run "every month on the 31st" will not run in February, April, June, etc.
    */
  var monthDay: js.UndefOr[Double] = js.undefined
  
  /** Required. Week day in a month. */
  var weekDayOfMonth: js.UndefOr[WeekDayOfMonth] = js.undefined
}
object MonthlySchedule {
  
  inline def apply(): MonthlySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonthlySchedule]
  }
  
  extension [Self <: MonthlySchedule](x: Self) {
    
    inline def setMonthDay(value: Double): Self = StObject.set(x, "monthDay", value.asInstanceOf[js.Any])
    
    inline def setMonthDayUndefined: Self = StObject.set(x, "monthDay", js.undefined)
    
    inline def setWeekDayOfMonth(value: WeekDayOfMonth): Self = StObject.set(x, "weekDayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setWeekDayOfMonthUndefined: Self = StObject.set(x, "weekDayOfMonth", js.undefined)
  }
}
