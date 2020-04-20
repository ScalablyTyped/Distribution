package typings.parseMs.mod

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
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], microseconds = microseconds.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parsed]
  }
}

