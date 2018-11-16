package typings
package nodeDashCalendarLib.nodeDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-calendar", JSImport.Namespace)
@js.native
object nodeDashCalendarModMembers extends js.Object {
  var APRIL: scala.Double = js.native
  var AUGUST: scala.Double = js.native
  var DECEMBER: scala.Double = js.native
  var FEBRUARY: scala.Double = js.native
  var FRIDAY: scala.Double = js.native
  var JANUARY: scala.Double = js.native
  var JULY: scala.Double = js.native
  var JUNE: scala.Double = js.native
  var MARCH: scala.Double = js.native
  var MAY: scala.Double = js.native
  var MONDAY: scala.Double = js.native
  var NOVEMBER: scala.Double = js.native
  var OCTOBER: scala.Double = js.native
  var SATURDAY: scala.Double = js.native
  var SEPTEMBER: scala.Double = js.native
  var SUNDAY: scala.Double = js.native
  var THURSDAY: scala.Double = js.native
  var TUESDAY: scala.Double = js.native
  var WEDNESDAY: scala.Double = js.native
  var day_abbr: js.Array[java.lang.String] = js.native
  var day_name: js.Array[java.lang.String] = js.native
  var month_abbr: js.Array[java.lang.String] = js.native
  var month_name: js.Array[java.lang.String] = js.native
  def isleap(year: scala.Double): scala.Boolean = js.native
  def leapdays(y1: scala.Double, y2: scala.Double): scala.Double = js.native
  def monthrange(year: scala.Double, month: scala.Double): js.Tuple2[scala.Double, scala.Double] = js.native
  def setlocale(): scala.Unit = js.native
  def setlocale(locale: java.lang.String): scala.Unit = js.native
  def timegm(
    timegmt: js.Tuple6[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]
  ): scala.Double = js.native
  def weekday(year: scala.Double, month: scala.Double, day: scala.Double): scala.Double = js.native
}

