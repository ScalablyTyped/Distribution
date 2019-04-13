package typings
package momentDashBusinessDashTimeLib.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moment extends js.Object {
  def addWorkingTime(args: (scala.Double | momentLib.momentMod.unitOfTimeNs.Base)*): momentLib.momentMod.Moment = js.native
  def isWorkingDay(): scala.Boolean = js.native
  def isWorkingTime(): scala.Boolean = js.native
  def lastWorkingDay(): momentLib.momentMod.Moment = js.native
  def lastWorkingTime(): momentLib.momentMod.Moment = js.native
  def nextWorkingDay(): momentLib.momentMod.Moment = js.native
  def nextWorkingTime(): momentLib.momentMod.Moment = js.native
  def subtractWorkingTime(args: (scala.Double | momentLib.momentMod.unitOfTimeNs.Base)*): momentLib.momentMod.Moment = js.native
  def workingDiff(moment: momentLib.momentMod.Moment, unit: momentLib.momentMod.unitOfTimeNs.Base): momentLib.momentMod.Moment = js.native
  def workingDiff(
    moment: momentLib.momentMod.Moment,
    unit: momentLib.momentMod.unitOfTimeNs.Base,
    fractions: scala.Boolean
  ): momentLib.momentMod.Moment = js.native
}

