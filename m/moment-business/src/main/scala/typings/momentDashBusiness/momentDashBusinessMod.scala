package typings.momentDashBusiness

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-business", JSImport.Namespace)
@js.native
object momentDashBusinessMod extends js.Object {
  def addWeekDays(moment: Moment, amount: Double): Moment = js.native
  def isWeekDay(moment: Moment): Boolean = js.native
  def isWeekendDay(moment: Moment): Boolean = js.native
  def subtractWeekDays(moment: Moment, amount: Double): Moment = js.native
  def weekDays(startMoment: Moment, endMoment: Moment): Double = js.native
  def weekendDays(startMoment: Moment, endMoment: Moment): Double = js.native
}

