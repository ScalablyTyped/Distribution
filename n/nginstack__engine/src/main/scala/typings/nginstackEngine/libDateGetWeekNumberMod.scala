package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDateGetWeekNumberMod {
  
  inline def apply(year: Double, month: Double, date: Double): Double = (^.asInstanceOf[js.Dynamic].apply(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(year: Double, month: Double, date: Double, opt_weekDay: Double): Double = (^.asInstanceOf[js.Dynamic].apply(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], opt_weekDay.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(year: Double, month: Double, date: Double, opt_weekDay: Double, opt_firstDayOfWeek: Double): Double = (^.asInstanceOf[js.Dynamic].apply(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], opt_weekDay.asInstanceOf[js.Any], opt_firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(year: Double, month: Double, date: Double, opt_weekDay: Unit, opt_firstDayOfWeek: Double): Double = (^.asInstanceOf[js.Dynamic].apply(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], date.asInstanceOf[js.Any], opt_weekDay.asInstanceOf[js.Any], opt_firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@nginstack/engine/lib/date/getWeekNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
