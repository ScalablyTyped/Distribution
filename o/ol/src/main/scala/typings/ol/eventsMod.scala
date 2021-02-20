package typings.ol

import typings.ol.eventMod.default
import typings.ol.targetMod.EventTargetLike
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("ol/events", "listen")
  @js.native
  def listen(target: EventTargetLike, `type`: String, listener: ListenerFunction): EventsKey = js.native
  @JSImport("ol/events", "listen")
  @js.native
  def listen(
    target: EventTargetLike,
    `type`: String,
    listener: ListenerFunction,
    opt_this: js.UndefOr[scala.Nothing],
    opt_once: Boolean
  ): EventsKey = js.native
  @JSImport("ol/events", "listen")
  @js.native
  def listen(target: EventTargetLike, `type`: String, listener: ListenerFunction, opt_this: js.Any): EventsKey = js.native
  @JSImport("ol/events", "listen")
  @js.native
  def listen(
    target: EventTargetLike,
    `type`: String,
    listener: ListenerFunction,
    opt_this: js.Any,
    opt_once: Boolean
  ): EventsKey = js.native
  
  @JSImport("ol/events", "listenOnce")
  @js.native
  def listenOnce(target: EventTargetLike, `type`: String, listener: ListenerFunction): EventsKey = js.native
  @JSImport("ol/events", "listenOnce")
  @js.native
  def listenOnce(target: EventTargetLike, `type`: String, listener: ListenerFunction, opt_this: js.Any): EventsKey = js.native
  
  @JSImport("ol/events", "unlistenByKey")
  @js.native
  def unlistenByKey(key: EventsKey): Unit = js.native
  
  @js.native
  trait EventsKey extends StObject {
    
    def listener(p0: default): Boolean = js.native
    def listener(p0: Event): Boolean = js.native
    @JSName("listener")
    var listener_Original: ListenerFunction = js.native
    
    var target: EventTargetLike = js.native
    
    var `type`: String = js.native
  }
  
  type Listener = ListenerFunction | ListenerObject
  
  type ListenerFunction = js.Function1[/* p0 */ Event | default, Boolean]
  
  @js.native
  trait ListenerObject extends StObject {
    
    def handleEvent(p0: default): Boolean = js.native
    def handleEvent(p0: Event): Boolean = js.native
    @JSName("handleEvent")
    var handleEvent_Original: ListenerFunction = js.native
  }
}
