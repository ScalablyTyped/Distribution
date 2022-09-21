package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object incYearMod {
  
  inline def apply(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def apply(date: js.Date, opt_years: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], opt_years.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  @JSImport("@nginstack/engine/lib/date/incYear", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
