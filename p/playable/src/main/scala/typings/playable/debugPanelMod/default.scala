package typings.playable.debugPanelMod

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.KeyboardControl
import typings.playable.debugPanelTypesMod.IDebugPanelViewConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/debug-panel/debug-panel", JSImport.Default)
@js.native
class default protected () extends DebugPanel {
  def this(hasEngineRootContainerKeyboardControl: KeyboardControl) = this()
}
/* static members */
@JSImport("playable/dist/src/modules/ui/debug-panel/debug-panel", JSImport.Default)
@js.native
object default extends js.Object {
  
  var View: Instantiable1[/* config */ IDebugPanelViewConfig, typings.playable.debugPanelViewMod.default] = js.native
  
  var dependencies: js.Array[String] = js.native
  
  var moduleName: String = js.native
}
