package typings.plottable

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/dispatchers/dispatcher", JSImport.Namespace)
@js.native
object dispatcherMod extends js.Object {
  @js.native
  class Dispatcher () extends js.Object {
    var _connected: js.Any = js.native
    var _eventNameToCallbackSet: js.Any = js.native
    /**
      * All listeners are registered to this `EventTarget` and events are then
      * dispatched to callbacks from `_eventNameToCallbackSet` manually.
      *
      * Subclasses set their own event target instead of `document`.
      */
    var _eventTarget: EventTarget = js.native
    /**
      * Subclasses set these in constructor. Then, these get attached to the event
      * target in _connect
      *
      * eventname is a DOM event name like "mouseup", "touchstart", etc. The
      * callback is simply registered to the event callback with bubbling.
      */
    var _eventToProcessingFunction: StringDictionary[js.Function1[/* e */ Event, _]] = js.native
    /* protected */ def _addCallbackForEvent(eventName: String, callback: js.Function): Unit = js.native
    /* protected */ def _callCallbacksForEvent(eventName: String, args: js.Any*): Unit = js.native
    /* private */ def _connect(): js.Any = js.native
    /* private */ def _disconnect(): js.Any = js.native
    /* private */ def _hasNoCallbacks(): js.Any = js.native
    /* protected */ def _removeCallbackForEvent(eventName: String, callback: js.Function): Unit = js.native
  }
  
}

