package typings
package parseDashMsLib.parseDashMsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parsed extends js.Object {
  var days: scala.Double
  var hours: scala.Double
  var microseconds: scala.Double
  var milliseconds: scala.Double
  var minutes: scala.Double
  var nanoseconds: scala.Double
  var seconds: scala.Double
}

object Parsed {
  @scala.inline
  def apply(
    days: scala.Double,
    hours: scala.Double,
    microseconds: scala.Double,
    milliseconds: scala.Double,
    minutes: scala.Double,
    nanoseconds: scala.Double,
    seconds: scala.Double
  ): Parsed = {
    val __obj = js.Dynamic.literal(days = days, hours = hours, microseconds = microseconds, milliseconds = milliseconds, minutes = minutes, nanoseconds = nanoseconds, seconds = seconds)
  
    __obj.asInstanceOf[Parsed]
  }
}

