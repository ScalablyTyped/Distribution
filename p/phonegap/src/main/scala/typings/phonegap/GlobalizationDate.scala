package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalizationDate extends js.Object {
  var day: Double
  var hour: Double
  var millisecond: Double
  var minute: Double
  var month: Double
  var second: Double
  var year: Double
}

object GlobalizationDate {
  @scala.inline
  def apply(
    day: Double,
    hour: Double,
    millisecond: Double,
    minute: Double,
    month: Double,
    second: Double,
    year: Double
  ): GlobalizationDate = {
    val __obj = js.Dynamic.literal(day = day, hour = hour, millisecond = millisecond, minute = minute, month = month, second = second, year = year)
  
    __obj.asInstanceOf[GlobalizationDate]
  }
}

