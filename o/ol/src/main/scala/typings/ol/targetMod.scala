package typings.ol

import typings.ol.eventsMod.ListenerFunction
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/events/Target", JSImport.Namespace)
@js.native
object targetMod extends js.Object {
  @js.native
  trait Target
    extends typings.ol.disposableMod.default {
    def addEventListener(`type`: String, listener: ListenerFunction): Unit = js.native
    def dispatchEvent(event: String): Boolean = js.native
    def dispatchEvent(event: js.Object): Boolean = js.native
    def dispatchEvent(event: typings.ol.eventMod.default): Boolean = js.native
    def getListeners(`type`: String): js.Array[ListenerFunction] = js.native
    def hasListener(): Boolean = js.native
    def hasListener(opt_type: String): Boolean = js.native
    def removeEventListener(`type`: String, listener: ListenerFunction): Unit = js.native
  }
  
  @js.native
  class default () extends Target {
    def this(opt_target: js.Any) = this()
  }
  
  type EventTargetLike = EventTarget | Target
}

