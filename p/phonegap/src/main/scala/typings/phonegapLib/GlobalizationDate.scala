package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalizationDate extends js.Object {
  var day: scala.Double
  var hour: scala.Double
  var millisecond: scala.Double
  var minute: scala.Double
  var month: scala.Double
  var second: scala.Double
  var year: scala.Double
}

object GlobalizationDate {
  @scala.inline
  def apply(
    day: scala.Double,
    hour: scala.Double,
    millisecond: scala.Double,
    minute: scala.Double,
    month: scala.Double,
    second: scala.Double,
    year: scala.Double
  ): GlobalizationDate = {
    val __obj = js.Dynamic.literal(day = day, hour = hour, millisecond = millisecond, minute = minute, month = month, second = second, year = year)
  
    __obj.asInstanceOf[GlobalizationDate]
  }
}

