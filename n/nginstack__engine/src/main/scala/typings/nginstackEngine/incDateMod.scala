package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object incDateMod {
  
  inline def apply(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def apply(date: js.Date, opt_days: Double): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], opt_days.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  @JSImport("@nginstack/engine/lib/date/incDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
