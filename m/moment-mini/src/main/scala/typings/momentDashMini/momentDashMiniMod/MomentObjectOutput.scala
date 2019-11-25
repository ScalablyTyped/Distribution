package typings.momentDashMini.momentDashMiniMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentObjectOutput extends js.Object {
  /* Day of the month */
  var date: Double
  var hours: Double
  var milliseconds: Double
  var minutes: Double
  /* One digit */
  var months: Double
  var seconds: Double
  var years: Double
}

object MomentObjectOutput {
  @scala.inline
  def apply(
    date: Double,
    hours: Double,
    milliseconds: Double,
    minutes: Double,
    months: Double,
    seconds: Double,
    years: Double
  ): MomentObjectOutput = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MomentObjectOutput]
  }
}

