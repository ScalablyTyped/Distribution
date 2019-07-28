package typings.nodeDashCalendar.nodeDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-calendar", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var APRIL: Double = js.native
  var AUGUST: Double = js.native
  var DECEMBER: Double = js.native
  var FEBRUARY: Double = js.native
  var FRIDAY: Double = js.native
  var JANUARY: Double = js.native
  var JULY: Double = js.native
  var JUNE: Double = js.native
  var MARCH: Double = js.native
  var MAY: Double = js.native
  var MONDAY: Double = js.native
  var NOVEMBER: Double = js.native
  var OCTOBER: Double = js.native
  var SATURDAY: Double = js.native
  var SEPTEMBER: Double = js.native
  var SUNDAY: Double = js.native
  var THURSDAY: Double = js.native
  var TUESDAY: Double = js.native
  var WEDNESDAY: Double = js.native
  var day_abbr: js.Array[String] = js.native
  var day_name: js.Array[String] = js.native
  var month_abbr: js.Array[String] = js.native
  var month_name: js.Array[String] = js.native
  def isleap(year: Double): Boolean = js.native
  def leapdays(y1: Double, y2: Double): Double = js.native
  def monthrange(year: Double, month: Double): js.Tuple2[Double, Double] = js.native
  def setlocale(): Unit = js.native
  def setlocale(locale: String): Unit = js.native
  def timegm(timegmt: js.Tuple6[Double, Double, Double, Double, Double, Double]): Double = js.native
  def weekday(year: Double, month: Double, day: Double): Double = js.native
}

