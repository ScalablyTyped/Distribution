package typings.momentDashBusinessDashTime.momentMod

import typings.moment.momentMod.unitOfTimeNs.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moment extends js.Object {
  def addWorkingTime(args: (Double | Base)*): typings.moment.momentMod.Moment = js.native
  def isWorkingDay(): Boolean = js.native
  def isWorkingTime(): Boolean = js.native
  def lastWorkingDay(): typings.moment.momentMod.Moment = js.native
  def lastWorkingTime(): typings.moment.momentMod.Moment = js.native
  def nextWorkingDay(): typings.moment.momentMod.Moment = js.native
  def nextWorkingTime(): typings.moment.momentMod.Moment = js.native
  def subtractWorkingTime(args: (Double | Base)*): typings.moment.momentMod.Moment = js.native
  def workingDiff(moment: typings.moment.momentMod.Moment, unit: Base): typings.moment.momentMod.Moment = js.native
  def workingDiff(moment: typings.moment.momentMod.Moment, unit: Base, fractions: Boolean): typings.moment.momentMod.Moment = js.native
}

