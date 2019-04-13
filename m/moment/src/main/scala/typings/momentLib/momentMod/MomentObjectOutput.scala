package typings
package momentLib.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentObjectOutput extends js.Object {
  /* Day of the month */
  var date: scala.Double
  var hours: scala.Double
  var milliseconds: scala.Double
  var minutes: scala.Double
  /* One digit */
  var months: scala.Double
  var seconds: scala.Double
  var years: scala.Double
}

object MomentObjectOutput {
  @scala.inline
  def apply(
    date: scala.Double,
    hours: scala.Double,
    milliseconds: scala.Double,
    minutes: scala.Double,
    months: scala.Double,
    seconds: scala.Double,
    years: scala.Double
  ): MomentObjectOutput = {
    val __obj = js.Dynamic.literal(date = date, hours = hours, milliseconds = milliseconds, minutes = minutes, months = months, seconds = seconds, years = years)
  
    __obj.asInstanceOf[MomentObjectOutput]
  }
}

