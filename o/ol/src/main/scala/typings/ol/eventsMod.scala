package typings.ol

import typings.ol.eventsEventMod.default
import typings.ol.eventsTargetMod.EventTargetLike
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("ol/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def listen(target: EventTargetLike, `type`: String, listener: ListenerFunction): EventsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventsKey]
  inline def listen(target: EventTargetLike, `type`: String, listener: ListenerFunction, opt_this: Any): EventsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[EventsKey]
  inline def listen(
    target: EventTargetLike,
    `type`: String,
    listener: ListenerFunction,
    opt_this: Any,
    opt_once: Boolean
  ): EventsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any], opt_once.asInstanceOf[js.Any])).asInstanceOf[EventsKey]
  inline def listen(
    target: EventTargetLike,
    `type`: String,
    listener: ListenerFunction,
    opt_this: Unit,
    opt_once: Boolean
  ): EventsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any], opt_once.asInstanceOf[js.Any])).asInstanceOf[EventsKey]
  
  inline def listenOnce(target: EventTargetLike, `type`: String, listener: ListenerFunction): EventsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("listenOnce")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventsKey]
  inline def listenOnce(target: EventTargetLike, `type`: String, listener: ListenerFunction, opt_this: Any): EventsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("listenOnce")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[EventsKey]
  
  inline def unlistenByKey(key: EventsKey): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlistenByKey")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait EventsKey extends StObject {
    
    def listener(p0: default): Boolean
    def listener(p0: Event): Boolean
    @JSName("listener")
    var listener_Original: ListenerFunction
    
    var target: EventTargetLike
    
    var `type`: String
  }
  object EventsKey {
    
    inline def apply(listener: /* p0 */ Event | default => Boolean, target: EventTargetLike, `type`: String): EventsKey = {
      val __obj = js.Dynamic.literal(listener = js.Any.fromFunction1(listener), target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventsKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventsKey] (val x: Self) extends AnyVal {
      
      inline def setListener(value: /* p0 */ Event | default => Boolean): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
      
      inline def setTarget(value: EventTargetLike): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Listener = ListenerFunction | ListenerObject
  
  type ListenerFunction = js.Function1[/* p0 */ Event | default, Boolean]
  
  trait ListenerObject extends StObject {
    
    def handleEvent(p0: default): Boolean
    def handleEvent(p0: Event): Boolean
    @JSName("handleEvent")
    var handleEvent_Original: ListenerFunction
  }
  object ListenerObject {
    
    inline def apply(handleEvent: /* p0 */ Event | default => Boolean): ListenerObject = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[ListenerObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListenerObject] (val x: Self) extends AnyVal {
      
      inline def setHandleEvent(value: /* p0 */ Event | default => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
}
