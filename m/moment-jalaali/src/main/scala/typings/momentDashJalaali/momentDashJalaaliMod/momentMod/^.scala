package typings.momentDashJalaali.momentDashJalaaliMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-jalaali", "moment")
@js.native
object ^ extends js.Object {
  def jDaysInMonth(year: Double, month: Double): Double = js.native
  def jIsLeapYear(year: Double): Boolean = js.native
  /**
    * Add persian language.
    */
  def loadPersian(): Unit = js.native
  def loadPersian(options: LoadPersianOptions): Unit = js.native
}

