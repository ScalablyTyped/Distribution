package typings
package momentDashHijriLib.momentDashHijriMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moment extends js.Object {
  def add(amount: java.lang.String, unit: IUnitOfTime): Moment = js.native
  def add(amount: scala.Double, unit: IUnitOfTime): Moment = js.native
  def endOf(unit: IUnitOfTime): Moment = js.native
  def iDate(): scala.Double = js.native
  def iDate(d: scala.Double): Moment = js.native
  def iDayOfYear(): scala.Double = js.native
  def iDayOfYear(d: scala.Double): Moment = js.native
  def iDaysInMonth(): scala.Double = js.native
  def iMonth(): scala.Double = js.native
  def iMonth(m: java.lang.String): Moment = js.native
  def iMonth(m: scala.Double): Moment = js.native
  def iWeek(): scala.Double = js.native
  def iWeek(d: scala.Double): Moment = js.native
  def iWeekYear(): scala.Double = js.native
  def iWeekYear(d: scala.Double): Moment = js.native
  def iYear(): scala.Double = js.native
  def iYear(y: scala.Double): Moment = js.native
  def startOf(unit: IUnitOfTime): Moment = js.native
  def subtract(amount: java.lang.String, unit: IUnitOfTime): Moment = js.native
  def subtract(amount: scala.Double, unit: IUnitOfTime): Moment = js.native
}

