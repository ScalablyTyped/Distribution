package typings.playable.fullScreenMod

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.FullScreenManager
import typings.playable.fullScreenTypesMod.IFullScreenViewConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/controls/full-screen/full-screen", JSImport.Default)
@js.native
class default protected () extends FullScreenControl {
  def this(hasEventEmitterFullScreenManagerTextMapTooltipServiceTheme: FullScreenManager) = this()
}
/* static members */
@JSImport("playable/dist/src/modules/ui/controls/full-screen/full-screen", JSImport.Default)
@js.native
object default extends js.Object {
  
  var View: Instantiable1[/* config */ IFullScreenViewConfig, typings.playable.fullScreenViewMod.default] = js.native
  
  var dependencies: js.Array[String] = js.native
  
  var moduleName: String = js.native
}
