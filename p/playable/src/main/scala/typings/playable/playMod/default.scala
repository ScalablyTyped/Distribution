package typings.playable.playMod

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.Theme
import typings.playable.playTypesMod.IPlayViewConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/controls/play/play", JSImport.Default)
@js.native
class default protected () extends PlayControl {
  def this(hasEngineEventEmitterTextMapTheme: Theme) = this()
}
/* static members */
@JSImport("playable/dist/src/modules/ui/controls/play/play", JSImport.Default)
@js.native
object default extends js.Object {
  
  var View: Instantiable1[/* config */ IPlayViewConfig, typings.playable.playViewMod.default] = js.native
  
  var dependencies: js.Array[String] = js.native
  
  var moduleName: String = js.native
}
