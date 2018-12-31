package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.events
  * @namespace
  * @description global namespace that allows to extend other objects with events
  * Additionally it can handle global events it self.
  * @example
  * var obj = { };
  * pc.events.attach(obj);
  *
  * // subscribe to an event
  * obj.on('hello', function(str) {
  *     console.log('event hello is fired', str);
  * });
  *
  * // fire event
  * obj.fire('hello', 'world');
  */
@JSGlobal("pc.events")
@js.native
object eventsNs extends js.Object {
  /**
    * @function
    * @name pc.events.attach
    * @description Attach event methods 'on', 'off', 'fire' and 'hasEvent' to the target object
    * @param {Object} target The object to add events to.
    * @return {Object} The target object
    * @example
    * var obj = { };
    * pc.events.attach(obj);
    */
  def attach[T](target: T): T = js.native
  /**
    * @function
    * @name pc.events.fire
    * @description Fire an event, all additional arguments are passed on to the event listener
    * @param {Object} name Name of event to fire
    * @param {*} [...] Arguments that are passed to the event handler
    * @example
    * obj.fire('test', 'This is the message');
    */
  def fire(
    name: java.lang.String,
    arg1: js.UndefOr[js.Any],
    arg2: js.UndefOr[js.Any],
    arg3: js.UndefOr[js.Any],
    arg4: js.UndefOr[js.Any],
    arg5: js.UndefOr[js.Any],
    arg6: js.UndefOr[js.Any],
    arg7: js.UndefOr[js.Any],
    arg8: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  /**
    * @function
    * @name pc.events.hasEvent
    * @description Test if there are any handlers bound to an event name
    * @param {String} name The name of the event to test
    * @example
    * obj.on('test', function () { }); // bind an event to 'test'
    * obj.hasEvent('test'); // returns true
    */
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  /**
    * @function
    * @name pc.events.off
    * @description Detach an event handler from an event. If callback is not provided then all callbacks are unbound from the event,
    * if scope is not provided then all events with the callback will be unbound.
    * @param {String} [name] Name of the event to unbind
    * @param {Function} [callback] Function to be unbound
    * @param {Object} [scope] Scope that was used as the this when the event is fired
    * @example
    * var handler = function () {
    * };
    * obj.on('test', handler);
    *
    * obj.off(); // Removes all events
    * obj.off('test'); // Removes all events called 'test'
    * obj.off('test', handler); // Removes all handler functions, called 'test'
    * obj.off('test', handler, this); // Removes all hander functions, called 'test' with scope this
    */
  def off(name: java.lang.String): scala.Unit = js.native
  def off(name: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  def off(name: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit], scope: js.Any): scala.Unit = js.native
  /**
    * @function
    * @name pc.events.on
    * @description Attach an event handler to an event
    * @param {String} name Name of the event to bind the callback to
    * @param {Function} callback Function that is called when event is fired. Note the callback is limited to 8 arguments.
    * @param {Object} [scope] Object to use as 'this' when the event is fired, defaults to current this
    * @example
    * obj.on('test', function (a, b) {
    *     console.log(a + b);
    * });
    * obj.fire('test', 1, 2); // prints 3 to the console
    */
  def on(name: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  def on(name: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit], scope: js.Any): scala.Unit = js.native
  /**
    * @function
    * @name pc.events.once
    * @description Attach an event handler to an event. This handler will be removed after being fired once.
    * @param {String} name Name of the event to bind the callback to
    * @param {Function} callback Function that is called when event is fired. Note the callback is limited to 8 arguments.
    * @param {Object} [scope] Object to use as 'this' when the event is fired, defaults to current this
    * @example
    * obj.once('test', function (a, b) {
    *     console.log(a + b);
    * });
    * obj.fire('test', 1, 2); // prints 3 to the console
    * obj.fire('test', 1, 2); // not going to get handled
    */
  def once(name: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  def once(name: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit], scope: js.Any): scala.Unit = js.native
}

