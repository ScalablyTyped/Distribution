package typings.playable

import typings.playable.debugPanelTypesMod.IDebugPanelHighlightStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntaxHighlightMod {
  
  @JSImport("playable/dist/src/modules/ui/debug-panel/syntaxHighlight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(json: String, styleNames: IDebugPanelHighlightStyles): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(json.asInstanceOf[js.Any], styleNames.asInstanceOf[js.Any])).asInstanceOf[String]
}
