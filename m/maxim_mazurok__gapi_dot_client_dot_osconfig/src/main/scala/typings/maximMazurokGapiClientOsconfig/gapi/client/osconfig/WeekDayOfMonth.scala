package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeekDayOfMonth extends StObject {
  
  /** Required. A day of the week. */
  var dayOfWeek: js.UndefOr[String] = js.undefined
  
  /** Required. Week number in a month. 1-4 indicates the 1st to 4th week of the month. -1 indicates the last week of the month. */
  var weekOrdinal: js.UndefOr[Double] = js.undefined
}
object WeekDayOfMonth {
  
  inline def apply(): WeekDayOfMonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeekDayOfMonth]
  }
  
  extension [Self <: WeekDayOfMonth](x: Self) {
    
    inline def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    inline def setWeekOrdinal(value: Double): Self = StObject.set(x, "weekOrdinal", value.asInstanceOf[js.Any])
    
    inline def setWeekOrdinalUndefined: Self = StObject.set(x, "weekOrdinal", js.undefined)
  }
}
