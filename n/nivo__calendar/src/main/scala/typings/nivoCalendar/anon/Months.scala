package typings.nivoCalendar.anon

import typings.nivoCalendar.nivoCalendarStrings.after
import typings.nivoCalendar.nivoCalendarStrings.before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Months[Month /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  bbox :@nivo/calendar.@nivo/calendar/dist/types/types.BBox} */ js.Any */] extends StObject {
  
  var months: js.Array[Month]
  
  var offset: Double
  
  var position: before | after
}
object Months {
  
  inline def apply[Month /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  bbox :@nivo/calendar.@nivo/calendar/dist/types/types.BBox} */ js.Any */](months: js.Array[Month], offset: Double, position: before | after): Months[Month] = {
    val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Months[Month]]
  }
  
  extension [Self <: Months[?], Month /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  bbox :@nivo/calendar.@nivo/calendar/dist/types/types.BBox} */ js.Any */](x: Self & Months[Month]) {
    
    inline def setMonths(value: js.Array[Month]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMonthsVarargs(value: Month*): Self = StObject.set(x, "months", js.Array(value*))
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: before | after): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
