package typings.openfin

import typings.node.eventsMod.EventEmitter
import typings.openfin.openfinStrings.`external-window`
import typings.openfin.openfinStrings.`global-hotkey`
import typings.openfin.openfinStrings.application
import typings.openfin.openfinStrings.system
import typings.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/events/emitterMap", JSImport.Namespace)
@js.native
object emitterMapMod extends js.Object {
  @js.native
  class EmitterMap () extends js.Object {
    var hashKeys: js.Any = js.native
    var storage: js.Any = js.native
    def delete(keys: EmitterAccessor): Boolean = js.native
    def get(keys: EmitterAccessor): EventEmitter = js.native
    def has(keys: EmitterAccessor): Boolean = js.native
  }
  
  type ApplicationEmitterAccessor = js.Tuple2[application, String]
  type EmitterAccessor = SystemEmitterAccessor | ApplicationEmitterAccessor | WindowEmitterAccessor | ExternalWindowEmitterAccessor | HotkeyEmitterAccessor | js.Array[String]
  type ExternalWindowEmitterAccessor = js.Tuple2[`external-window`, String]
  type HotkeyEmitterAccessor = js.Array[`global-hotkey`]
  type SystemEmitterAccessor = js.Array[system]
  type WindowEmitterAccessor = js.Tuple3[window, String, String]
}

