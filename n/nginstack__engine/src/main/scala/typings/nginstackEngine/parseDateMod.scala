package typings.nginstackEngine

import typings.nginstackEngine.anon.BaseDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseDateMod {
  
  inline def apply(dateStr: String): js.Date = ^.asInstanceOf[js.Dynamic].apply(dateStr.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def apply(dateStr: String, opt_options: BaseDate): js.Date = (^.asInstanceOf[js.Dynamic].apply(dateStr.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  @JSImport("@nginstack/engine/lib/date/parseDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
