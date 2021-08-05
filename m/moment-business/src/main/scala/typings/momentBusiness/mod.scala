package typings.momentBusiness

import typings.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moment-business", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addWeekDays(moment: Moment, amount: Double): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("addWeekDays")(moment.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Moment]
  
  inline def isWeekDay(moment: Moment): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWeekDay")(moment.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWeekendDay(moment: Moment): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWeekendDay")(moment.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def subtractWeekDays(moment: Moment, amount: Double): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("subtractWeekDays")(moment.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Moment]
  
  inline def weekDays(startMoment: Moment, endMoment: Moment): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekDays")(startMoment.asInstanceOf[js.Any], endMoment.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def weekendDays(startMoment: Moment, endMoment: Moment): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekendDays")(startMoment.asInstanceOf[js.Any], endMoment.asInstanceOf[js.Any])).asInstanceOf[Double]
}
