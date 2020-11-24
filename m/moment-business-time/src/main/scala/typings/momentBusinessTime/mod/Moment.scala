package typings.momentBusinessTime.mod

import typings.moment.mod.unitOfTime.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Moment extends js.Object {
  
  def addWorkingTime(args: (Double | Base)*): Moment = js.native
  
  def isWorkingDay(): Boolean = js.native
  
  def isWorkingTime(): Boolean = js.native
  
  def lastWorkingDay(): Moment = js.native
  
  def lastWorkingTime(): Moment = js.native
  
  def nextWorkingDay(): Moment = js.native
  
  def nextWorkingTime(): Moment = js.native
  
  def subtractWorkingTime(args: (Double | Base)*): Moment = js.native
  
  def workingDiff(moment: Moment, unit: Base): Double = js.native
  def workingDiff(moment: Moment, unit: Base, fractions: Boolean): Double = js.native
}
