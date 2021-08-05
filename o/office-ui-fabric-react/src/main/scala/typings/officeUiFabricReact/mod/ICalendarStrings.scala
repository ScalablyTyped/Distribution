package typings.officeUiFabricReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICalendarStrings
  extends StObject
     with typings.officeUiFabricReact.calendarTypesMod.ICalendarStrings
object ICalendarStrings {
  
  inline def apply(
    days: js.Array[String],
    goToToday: String,
    months: js.Array[String],
    shortDays: js.Array[String],
    shortMonths: js.Array[String]
  ): ICalendarStrings = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], goToToday = goToToday.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarStrings]
  }
}
