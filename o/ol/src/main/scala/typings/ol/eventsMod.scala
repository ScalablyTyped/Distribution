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
  inline def listen(target: EventTargetLike, `type`: String, listener: ListenerFunction, thisArg: Any): EventsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[EventsKey]
  inline def listen(target: EventTargetLike, `type`: String, listener: ListenerFunction, thisArg: Any, once: Boolean): EventsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[EventsKey]
  inline def listen(target: EventTargetLike, `type`: String, listener: ListenerFunction, thisArg: Unit, once: Boolean): EventsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[EventsKey]
  
  inline def listenOnce(target: EventTargetLike, `type`: String, listener: ListenerFunction): EventsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("listenOnce")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EventsKey]
  inline def listenOnce(target: EventTargetLike, `type`: String, listener: ListenerFunction, thisArg: Any): EventsKey = (^.asInstanceOf[js.Dynamic].applyDynamic("listenOnce")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[EventsKey]
  
  inline def unlistenByKey(key: EventsKey): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlistenByKey")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait EventsKey extends StObject {
    
    def listener(arg0: default): Unit | Boolean
    /**
      * Listener.
      */
    def listener(arg0: Event): Unit | Boolean
    /**
      * Listener.
      */
    @JSName("listener")
    var listener_Original: ListenerFunction
    
    /**
      * Target.
      */
    var target: EventTargetLike
    
    /**
      * Type.
      */
    var `type`: String
  }
  object EventsKey {
    
    inline def apply(listener: /* arg0 */ Event | default => Unit | Boolean, target: EventTargetLike, `type`: String): EventsKey = {
      val __obj = js.Dynamic.literal(listener = js.Any.fromFunction1(listener), target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventsKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventsKey] (val x: Self) extends AnyVal {
      
      inline def setListener(value: /* arg0 */ Event | default => Unit | Boolean): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
      
      inline def setTarget(value: EventTargetLike): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Listener = ListenerFunction | ListenerObject
  
  type ListenerFunction = js.Function1[/* arg0 */ Event | default, Unit | Boolean]
  
  trait ListenerObject extends StObject {
    
    def handleEvent(arg0: default): Unit | Boolean
    /**
      * HandleEvent listener function.
      */
    def handleEvent(arg0: Event): Unit | Boolean
    /**
      * HandleEvent listener function.
      */
    @JSName("handleEvent")
    var handleEvent_Original: ListenerFunction
  }
  object ListenerObject {
    
    inline def apply(handleEvent: /* arg0 */ Event | default => Unit | Boolean): ListenerObject = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[ListenerObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListenerObject] (val x: Self) extends AnyVal {
      
      inline def setHandleEvent(value: /* arg0 */ Event | default => Unit | Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
}
