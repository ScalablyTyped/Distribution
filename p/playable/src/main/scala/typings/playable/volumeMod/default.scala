package typings.playable.volumeMod

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.TooltipService
import typings.playable.volumeTypesMod.IVolumeViewConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/controls/volume/volume", JSImport.Default)
@js.native
class default protected () extends VolumeControl {
  def this(hasEngineEventEmitterTextMapTooltipServiceTheme: TooltipService) = this()
}
/* static members */
@JSImport("playable/dist/src/modules/ui/controls/volume/volume", JSImport.Default)
@js.native
object default extends js.Object {
  
  var View: Instantiable1[/* config */ IVolumeViewConfig, typings.playable.volumeViewMod.default] = js.native
  
  var dependencies: js.Array[String] = js.native
  
  var moduleName: String = js.native
}
