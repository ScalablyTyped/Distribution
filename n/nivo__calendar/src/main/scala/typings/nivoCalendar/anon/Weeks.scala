package typings.nivoCalendar.anon

import org.scalablytyped.runtime.StringDictionary
import typings.nivoCalendar.timeRangeMod.Month
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Weeks extends StObject {
  
  var months: StringDictionary[Month]
  
  var weeks: js.Array[typings.nivoCalendar.timeRangeMod.Day]
}
object Weeks {
  
  inline def apply(months: StringDictionary[Month], weeks: js.Array[typings.nivoCalendar.timeRangeMod.Day]): Weeks = {
    val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Weeks]
  }
  
  extension [Self <: Weeks](x: Self) {
    
    inline def setMonths(value: StringDictionary[Month]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setWeeks(value: js.Array[typings.nivoCalendar.timeRangeMod.Day]): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
    
    inline def setWeeksVarargs(value: typings.nivoCalendar.timeRangeMod.Day*): Self = StObject.set(x, "weeks", js.Array(value*))
  }
}
