package typings.playcanvas.mod

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
@JSImport("playcanvas", "EventHandler")
@js.native
open class EventHandler () extends StObject {
  
  /**
    * Registers a new event handler.
    *
    * @param {string} name - Name of the event to bind the callback to.
    * @param {HandleEventCallback} callback - Function that is called when event is fired. Note
    * the callback is limited to 8 arguments.
    * @param {object} [scope] - Object to use as 'this' when the event is fired, defaults to
    * current this.
    * @param {boolean} [once=false] - If true, the callback will be unbound after being fired once.
    * @private
    */
  /* private */ var _addCallback: Any = js.native
  
  /**
    * @type {object}
    * @private
    */
  /* private */ var _callbackActive: Any = js.native
  
  /**
    * @type {object}
    * @private
    */
  /* private */ var _callbacks: Any = js.native
  
  /**
    * Fire an event, all additional arguments are passed on to the event listener.
    *
    * @param {string} name - Name of event to fire.
    * @param {*} [arg1] - First argument that is passed to the event handler.
    * @param {*} [arg2] - Second argument that is passed to the event handler.
    * @param {*} [arg3] - Third argument that is passed to the event handler.
    * @param {*} [arg4] - Fourth argument that is passed to the event handler.
    * @param {*} [arg5] - Fifth argument that is passed to the event handler.
    * @param {*} [arg6] - Sixth argument that is passed to the event handler.
    * @param {*} [arg7] - Seventh argument that is passed to the event handler.
    * @param {*} [arg8] - Eighth argument that is passed to the event handler.
    * @returns {EventHandler} Self for chaining.
    * @example
    * obj.fire('test', 'This is the message');
    */
  def fire(
    name: String,
    arg1: js.UndefOr[Any],
    arg2: js.UndefOr[Any],
    arg3: js.UndefOr[Any],
    arg4: js.UndefOr[Any],
    arg5: js.UndefOr[Any],
    arg6: js.UndefOr[Any],
    arg7: js.UndefOr[Any],
    arg8: js.UndefOr[Any]
  ): EventHandler = js.native
  
  /**
    * Test if there are any handlers bound to an event name.
    *
    * @param {string} name - The name of the event to test.
    * @returns {boolean} True if the object has handlers bound to the specified event name.
    * @example
    * obj.on('test', function () { }); // bind an event to 'test'
    * obj.hasEvent('test'); // returns true
    * obj.hasEvent('hello'); // returns false
    */
  def hasEvent(name: String): Boolean = js.native
  
  /**
    * Reinitialize the event handler.
    *
    * @private
    */
  /* private */ var initEventHandler: Any = js.native
  
  /**
    * Detach an event handler from an event. If callback is not provided then all callbacks are
    * unbound from the event, if scope is not provided then all events with the callback will be
    * unbound.
    *
    * @param {string} [name] - Name of the event to unbind.
    * @param {HandleEventCallback} [callback] - Function to be unbound.
    * @param {object} [scope] - Scope that was used as the this when the event is fired.
    * @returns {EventHandler} Self for chaining.
    * @example
    * const handler = function () {
    * };
    * obj.on('test', handler);
    *
    * obj.off(); // Removes all events
    * obj.off('test'); // Removes all events called 'test'
    * obj.off('test', handler); // Removes all handler functions, called 'test'
    * obj.off('test', handler, this); // Removes all handler functions, called 'test' with scope this
    */
  def off(): EventHandler = js.native
  def off(name: String): EventHandler = js.native
  def off(name: String, callback: Unit, scope: js.Object): EventHandler = js.native
  def off(name: String, callback: HandleEventCallback): EventHandler = js.native
  def off(name: String, callback: HandleEventCallback, scope: js.Object): EventHandler = js.native
  def off(name: Unit, callback: Unit, scope: js.Object): EventHandler = js.native
  def off(name: Unit, callback: HandleEventCallback): EventHandler = js.native
  def off(name: Unit, callback: HandleEventCallback, scope: js.Object): EventHandler = js.native
  
  /**
    * Attach an event handler to an event.
    *
    * @param {string} name - Name of the event to bind the callback to.
    * @param {HandleEventCallback} callback - Function that is called when event is fired. Note
    * the callback is limited to 8 arguments.
    * @param {object} [scope] - Object to use as 'this' when the event is fired, defaults to
    * current this.
    * @returns {EventHandler} Self for chaining.
    * @example
    * obj.on('test', function (a, b) {
    *     console.log(a + b);
    * });
    * obj.fire('test', 1, 2); // prints 3 to the console
    */
  def on(name: String, callback: HandleEventCallback): EventHandler = js.native
  def on(name: String, callback: HandleEventCallback, scope: js.Object): EventHandler = js.native
  
  /**
    * Attach an event handler to an event. This handler will be removed after being fired once.
    *
    * @param {string} name - Name of the event to bind the callback to.
    * @param {HandleEventCallback} callback - Function that is called when event is fired. Note
    * the callback is limited to 8 arguments.
    * @param {object} [scope] - Object to use as 'this' when the event is fired, defaults to
    * current this.
    * @returns {EventHandler} Self for chaining.
    * @example
    * obj.once('test', function (a, b) {
    *     console.log(a + b);
    * });
    * obj.fire('test', 1, 2); // prints 3 to the console
    * obj.fire('test', 1, 2); // not going to get handled
    */
  def once(name: String, callback: HandleEventCallback): EventHandler = js.native
  def once(name: String, callback: HandleEventCallback, scope: js.Object): EventHandler = js.native
}
