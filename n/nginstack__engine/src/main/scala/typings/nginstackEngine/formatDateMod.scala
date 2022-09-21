package typings.nginstackEngine

import typings.nginstackEngine.anon.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatDateMod {
  
  inline def apply(date: js.Date): String = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(date: js.Date, opt_options: Format): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@nginstack/engine/lib/date/formatDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
