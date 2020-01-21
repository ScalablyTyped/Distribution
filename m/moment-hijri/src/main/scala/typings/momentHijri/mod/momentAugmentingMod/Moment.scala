package typings.momentHijri.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moment extends js.Object {
  def add(amount: String, unit: IUnitOfTime): Moment = js.native
  def add(amount: Double, unit: IUnitOfTime): Moment = js.native
  def endOf(unit: IUnitOfTime): Moment = js.native
  def iDate(): Double = js.native
  def iDate(d: Double): Moment = js.native
  def iDayOfYear(): Double = js.native
  def iDayOfYear(d: Double): Moment = js.native
  def iDaysInMonth(): Double = js.native
  def iMonth(): Double = js.native
  def iMonth(m: String): Moment = js.native
  def iMonth(m: Double): Moment = js.native
  def iWeek(): Double = js.native
  def iWeek(d: Double): Moment = js.native
  def iWeekYear(): Double = js.native
  def iWeekYear(d: Double): Moment = js.native
  def iYear(): Double = js.native
  def iYear(y: Double): Moment = js.native
  def startOf(unit: IUnitOfTime): Moment = js.native
  def subtract(amount: String, unit: IUnitOfTime): Moment = js.native
  def subtract(amount: Double, unit: IUnitOfTime): Moment = js.native
}

