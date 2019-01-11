package typings
package momentDashJalaaliLib.momentDashJalaaliMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-jalaali", "moment")
@js.native
object ^ extends js.Object {
  def jDaysInMonth(year: scala.Double, month: scala.Double): scala.Double = js.native
  def jIsLeapYear(year: scala.Double): scala.Boolean = js.native
  /**
    * Add persian language.
    */
  def loadPersian(): scala.Unit = js.native
  def loadPersian(options: momentDashJalaaliLib.momentDashJalaaliMod.momentMod.LoadPersianOptions): scala.Unit = js.native
}

