package typings.momentBusiness

import typings.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moment-business", "addWeekDays")
  @js.native
  def addWeekDays(moment: Moment, amount: Double): Moment = js.native
  
  @JSImport("moment-business", "isWeekDay")
  @js.native
  def isWeekDay(moment: Moment): Boolean = js.native
  
  @JSImport("moment-business", "isWeekendDay")
  @js.native
  def isWeekendDay(moment: Moment): Boolean = js.native
  
  @JSImport("moment-business", "subtractWeekDays")
  @js.native
  def subtractWeekDays(moment: Moment, amount: Double): Moment = js.native
  
  @JSImport("moment-business", "weekDays")
  @js.native
  def weekDays(startMoment: Moment, endMoment: Moment): Double = js.native
  
  @JSImport("moment-business", "weekendDays")
  @js.native
  def weekendDays(startMoment: Moment, endMoment: Moment): Double = js.native
}
