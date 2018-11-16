package typings
package plottableLib.buildSrcDispatchersDispatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/dispatchers/dispatcher", "Dispatcher")
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
  var _eventTarget: stdLib.EventTarget = js.native
  /**
       * Subclasses set these in constructor. Then, these get attached to the event
       * target in _connect
       *
       * eventname is a DOM event name like "mouseup", "touchstart", etc. The
       * callback is simply registered to the event callback with bubbling.
       */
  var _eventToProcessingFunction: ScalablyTyped.runtime.StringDictionary[js.Function1[/* e */ stdLib.Event, _]] = js.native
  /* protected */ def _addCallbackForEvent(eventName: java.lang.String, callback: js.Function): scala.Unit = js.native
  /* protected */ def _callCallbacksForEvent(eventName: java.lang.String, args: js.Any*): scala.Unit = js.native
  /* private */ def _connect(): js.Any = js.native
  /* private */ def _disconnect(): js.Any = js.native
  /* private */ def _hasNoCallbacks(): js.Any = js.native
  /* protected */ def _removeCallbackForEvent(eventName: java.lang.String, callback: js.Function): scala.Unit = js.native
}

