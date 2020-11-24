package typings.momentBusiness

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("moment-business", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addWeekDays(moment: Moment, amount: Double): Moment = js.native
  
  def isWeekDay(moment: Moment): Boolean = js.native
  
  def isWeekendDay(moment: Moment): Boolean = js.native
  
  def subtractWeekDays(moment: Moment, amount: Double): Moment = js.native
  
  def weekDays(startMoment: Moment, endMoment: Moment): Double = js.native
  
  def weekendDays(startMoment: Moment, endMoment: Moment): Double = js.native
}
