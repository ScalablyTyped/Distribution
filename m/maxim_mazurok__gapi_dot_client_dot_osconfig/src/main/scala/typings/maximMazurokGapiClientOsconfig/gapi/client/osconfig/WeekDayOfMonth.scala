package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeekDayOfMonth extends StObject {
  
  /** Required. A day of the week. */
  var dayOfWeek: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Represents the number of days before or after the given week day of month that the patch deployment is scheduled for. For example if `week_ordinal` and `day_of_week`
    * values point to the second day of the month and this `day_offset` value is set to `3`, the patch deployment takes place three days after the second Tuesday of the month. If this
    * value is negative, for example -5, the patches are deployed five days before before the second Tuesday of the month. Allowed values are in range [-30, 30].
    */
  var dayOffset: js.UndefOr[Double] = js.undefined
  
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
    
    inline def setDayOffset(value: Double): Self = StObject.set(x, "dayOffset", value.asInstanceOf[js.Any])
    
    inline def setDayOffsetUndefined: Self = StObject.set(x, "dayOffset", js.undefined)
    
    inline def setWeekOrdinal(value: Double): Self = StObject.set(x, "weekOrdinal", value.asInstanceOf[js.Any])
    
    inline def setWeekOrdinalUndefined: Self = StObject.set(x, "weekOrdinal", js.undefined)
  }
}
