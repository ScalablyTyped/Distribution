package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getIntervalMod {
  
  inline def apply(startDate: js.Date, startHour: String, endDate: js.Date, endHour: String, opt_format: Any): String | Double = (^.asInstanceOf[js.Dynamic].apply(startDate.asInstanceOf[js.Any], startHour.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any], endHour.asInstanceOf[js.Any], opt_format.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  @JSImport("@nginstack/engine/lib/date/getInterval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
