package typings.plottable

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dispatcherMod {
  
  @JSImport("plottable/build/src/dispatchers/dispatcher", "Dispatcher")
  @js.native
  open class Dispatcher () extends StObject {
    
    /* protected */ def _addCallbackForEvent(eventName: String, callback: js.Function): Unit = js.native
    
    /* protected */ def _callCallbacksForEvent(eventName: String, args: Any*): Unit = js.native
    
    /* private */ var _connect: Any = js.native
    
    /* private */ var _connected: Any = js.native
    
    /* private */ var _disconnect: Any = js.native
    
    /* private */ var _eventNameToCallbackSet: Any = js.native
    
    /**
      * All listeners are registered to this `EventTarget` and events are then
      * dispatched to callbacks from `_eventNameToCallbackSet` manually.
      *
      * Subclasses set their own event target instead of `document`.
      */
    /* protected */ var _eventTarget: EventTarget = js.native
    
    /**
      * Subclasses set these in constructor. Then, these get attached to the event
      * target in _connect
      *
      * eventname is a DOM event name like "mouseup", "touchstart", etc. The
      * callback is simply registered to the event callback with bubbling.
      */
    /* protected */ var _eventToProcessingFunction: StringDictionary[js.Function1[/* e */ Event, Any]] = js.native
    
    /* private */ var _hasNoCallbacks: Any = js.native
    
    /* protected */ def _removeCallbackForEvent(eventName: String, callback: js.Function): Unit = js.native
  }
}
