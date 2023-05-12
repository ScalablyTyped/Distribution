package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link EventHandler} functions. Note the callback is limited to 8 arguments.
  *
  * @callback HandleEventCallback
  * @param {*} [arg1] - First argument that is passed from caller.
  * @param {*} [arg2] - Second argument that is passed from caller.
  * @param {*} [arg3] - Third argument that is passed from caller.
  * @param {*} [arg4] - Fourth argument that is passed from caller.
  * @param {*} [arg5] - Fifth argument that is passed from caller.
  * @param {*} [arg6] - Sixth argument that is passed from caller.
  * @param {*} [arg7] - Seventh argument that is passed from caller.
  * @param {*} [arg8] - Eighth argument that is passed from caller.
  */
/**
  * Abstract base class that implements functionality for event handling.
  *
  * ```javascript
  * const obj = new EventHandlerSubclass();
  *
  * // subscribe to an event
  * obj.on('hello', function (str) {
  *     console.log('event hello is fired', str);
  * });
  *
  * // fire event
  * obj.fire('hello', 'world');
  * ```
  */
@JSGlobal("pc.EventHandler")
@js.native
open class EventHandler ()
  extends typings.playcanvas.mod.EventHandler
