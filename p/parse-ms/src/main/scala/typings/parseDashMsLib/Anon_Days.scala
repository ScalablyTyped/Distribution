package typings
package parseDashMsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Days extends js.Object {
  var days: scala.Double
  var hours: scala.Double
  var milliseconds: scala.Double
  var minutes: scala.Double
  var seconds: scala.Double
}

object Anon_Days {
  @scala.inline
  def apply(
    days: scala.Double,
    hours: scala.Double,
    milliseconds: scala.Double,
    minutes: scala.Double,
    seconds: scala.Double
  ): Anon_Days = {
    val __obj = js.Dynamic.literal(days = days, hours = hours, milliseconds = milliseconds, minutes = minutes, seconds = seconds)
  
    __obj.asInstanceOf[Anon_Days]
  }
}

