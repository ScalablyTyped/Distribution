package typings
package atNivoCalendarLib.atNivoCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarDatum extends js.Object {
  var day: java.lang.String
  var value: scala.Double
}

object CalendarDatum {
  @scala.inline
  def apply(day: java.lang.String, value: scala.Double): CalendarDatum = {
    val __obj = js.Dynamic.literal(day = day, value = value)
  
    __obj.asInstanceOf[CalendarDatum]
  }
}

