package typings.nextReactDevOverlay

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopTemplateMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/helpers/noop-template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def noop(strings: TemplateStringsArray, keys: String*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("noop")(strings.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[String]
}
