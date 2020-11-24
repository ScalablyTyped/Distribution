package typings.ol

import typings.ol.eventMod.default
import typings.ol.targetMod.EventTargetLike
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  
  def listen(target: EventTargetLike, `type`: String, listener: ListenerFunction): EventsKey = js.native
  def listen(
    target: EventTargetLike,
    `type`: String,
    listener: ListenerFunction,
    opt_this: js.UndefOr[scala.Nothing],
    opt_once: Boolean
  ): EventsKey = js.native
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
  
  @js.native
  trait EventsKey extends js.Object {
    
    def listener(p0: default): Boolean = js.native
    def listener(p0: Event): Boolean = js.native
    @JSName("listener")
    var listener_Original: ListenerFunction = js.native
    
    var target: EventTargetLike = js.native
    
    var `type`: String = js.native
  }
  
  @js.native
  trait ListenerObject extends js.Object {
    
    def handleEvent(p0: default): Boolean = js.native
    def handleEvent(p0: Event): Boolean = js.native
    @JSName("handleEvent")
    var handleEvent_Original: ListenerFunction = js.native
  }
  
  type Listener = ListenerFunction | ListenerObject
  
  type ListenerFunction = js.Function1[/* p0 */ Event | default, Boolean]
}
