package typings.parseDashMs.parseDashMsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parsed extends js.Object {
  var days: Double
  var hours: Double
  var microseconds: Double
  var milliseconds: Double
  var minutes: Double
  var nanoseconds: Double
  var seconds: Double
}

object Parsed {
  @scala.inline
  def apply(
    days: Double,
    hours: Double,
    microseconds: Double,
    milliseconds: Double,
    minutes: Double,
    nanoseconds: Double,
    seconds: Double
  ): Parsed = {
    val __obj = js.Dynamic.literal(days = days, hours = hours, microseconds = microseconds, milliseconds = milliseconds, minutes = minutes, nanoseconds = nanoseconds, seconds = seconds)
  
    __obj.asInstanceOf[Parsed]
  }
}

