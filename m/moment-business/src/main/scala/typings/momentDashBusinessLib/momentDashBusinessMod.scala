package typings
package momentDashBusinessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-business", JSImport.Namespace)
@js.native
object momentDashBusinessMod extends js.Object {
  def addWeekDays(moment: momentLib.momentMod.Moment, amount: scala.Double): momentLib.momentMod.Moment = js.native
  def isWeekDay(moment: momentLib.momentMod.Moment): scala.Boolean = js.native
  def isWeekendDay(moment: momentLib.momentMod.Moment): scala.Boolean = js.native
  def subtractWeekDays(moment: momentLib.momentMod.Moment, amount: scala.Double): momentLib.momentMod.Moment = js.native
  def weekDays(startMoment: momentLib.momentMod.Moment, endMoment: momentLib.momentMod.Moment): scala.Double = js.native
  def weekendDays(startMoment: momentLib.momentMod.Moment, endMoment: momentLib.momentMod.Moment): scala.Double = js.native
}

