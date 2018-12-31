package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptType
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * @function
    * @name pc.ScriptType#fire
    * @description Fire an event, all additional arguments are passed on to the event listener
    * @param {Object} name Name of event to fire
    * @param {*} [...] Arguments that are passed to the event handler
    * @example
    * obj.fire('test', 'This is the message');
    */
  var fire: js.UndefOr[
    js.Function9[
      /* name */ java.lang.String, 
      /* arg1 */ js.UndefOr[js.Any], 
      /* arg2 */ js.UndefOr[js.Any], 
      /* arg3 */ js.UndefOr[js.Any], 
      /* arg4 */ js.UndefOr[js.Any], 
      /* arg5 */ js.UndefOr[js.Any], 
      /* arg6 */ js.UndefOr[js.Any], 
      /* arg7 */ js.UndefOr[js.Any], 
      /* arg8 */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /**
    * @function
    * @name pc.ScriptType#hasEvent
    * @description Test if there are any handlers bound to an event name
    * @param {String} name The name of the event to test
    * @example
    * obj.on('test', function () { }); // bind an event to 'test'
    * obj.hasEvent('test'); // returns true
    */
  var hasEvent: js.UndefOr[js.Function1[/* name */ java.lang.String, scala.Boolean]] = js.undefined
  /**
    * initialize is called if defined when script is about to run for the first time.
    * @memberof ScriptType
    */
  var initialize: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * @function
    * @name pc.ScriptType#off
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
  var off: js.UndefOr[
    js.Function3[
      /* name */ java.lang.String, 
      /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
      /* scope */ js.Any, 
      _
    ]
  ] = js.undefined
  // Events
  /**
    * @function
    * @name pc.ScriptType#on
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
  var on: js.UndefOr[
    js.Function3[
      /* name */ java.lang.String, 
      /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
      /* scope */ js.Any, 
      _
    ]
  ] = js.undefined
  /**
    * @function
    * @name pc.ScriptType#once
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
  var once: js.UndefOr[
    js.Function3[
      /* name */ java.lang.String, 
      /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
      /* scope */ js.Any, 
      _
    ]
  ] = js.undefined
  /**
    * postInitialize will run after all initialize methods are executed in the
    * same tick or enabling chain of actions.
    * @memberof ScriptType
    */
  var postInitialize: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * postUpdate is called if defined for enabled (running state) scripts on each tick,
    * after update.
    * @memberof ScriptType
    */
  var postUpdate: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * This method will be called when a ScriptType that already exists in the registry
    * gets redefined. If the new ScriptType has a `swap` method in its prototype,
    * then it will be executed to perform hot-reload at runtime.
    * @memberof ScriptType
    */
  var swap: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * update is called if defined for enabled (running state) scripts on each tick.
    * @param {number} dt
    * @memberof ScriptType
    */
  var update: js.UndefOr[js.Function1[/* dt */ scala.Double, scala.Unit]] = js.undefined
}

