package typings.ol

import typings.ol.eventsMod.ListenerFunction
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/events/Target", JSImport.Namespace)
@js.native
object eventsTargetMod extends js.Object {
  @js.native
  trait Target
    extends typings.ol.disposableMod.default {
    def addEventListener(`type`: String, listener: ListenerFunction): Unit = js.native
    def dispatchEvent(event: String): js.UndefOr[Boolean] = js.native
    def dispatchEvent(event: js.Object): js.UndefOr[Boolean] = js.native
    def dispatchEvent(event: typings.ol.eventsEventMod.default): js.UndefOr[Boolean] = js.native
    def getListeners(`type`: String): js.Array[ListenerFunction] = js.native
    def hasListener(): Boolean = js.native
    def hasListener(opt_type: String): Boolean = js.native
    def removeEventListener(`type`: String, listener: ListenerFunction): Unit = js.native
  }
  
  @js.native
  class default () extends Target
  
  type EventTargetLike = EventTarget | Target
}

