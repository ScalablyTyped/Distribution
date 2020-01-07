package typings.ol

import typings.ol.eventsEventMod.default
import typings.ol.eventsTargetMod.EventTargetLike
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  @js.native
  trait EventsKey extends js.Object {
    @JSName("listener")
    var listener_Original: ListenerFunction = js.native
    var target: EventTargetLike = js.native
    var `type`: String = js.native
    def listener(p0: default): Boolean = js.native
    def listener(p0: Event): Boolean = js.native
  }
  
  def listen(target: EventTargetLike, `type`: String, listener: ListenerFunction): EventsKey = js.native
  def listen(target: EventTargetLike, `type`: String, listener: ListenerFunction, opt_this: js.Any): EventsKey = js.native
  def listen(
    target: EventTargetLike,
    `type`: String,
    listener: ListenerFunction,
    opt_this: js.Any,
    opt_once: Boolean
  ): EventsKey = js.native
  def listenOnce(target: EventTargetLike, `type`: String, listener: ListenerFunction): EventsKey = js.native
  def listenOnce(target: EventTargetLike, `type`: String, listener: ListenerFunction, opt_this: js.Any): EventsKey = js.native
  def unlistenByKey(key: EventsKey): Unit = js.native
  type ListenerFunction = js.Function1[/* p0 */ Event | default, Boolean]
}

