package typings.playcanvas.pcNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptType
  extends /* key */ StringDictionary[js.Any] {
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
      /* name */ String, 
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
  var hasEvent: js.UndefOr[js.Function1[/* name */ String, Boolean]] = js.undefined
  /**
    * initialize is called if defined when script is about to run for the first time.
    * @memberof ScriptType
    */
  var initialize: js.UndefOr[js.Function0[Unit]] = js.undefined
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
      /* name */ String, 
      /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
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
      /* name */ String, 
      /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
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
      /* name */ String, 
      /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
      /* scope */ js.Any, 
      _
    ]
  ] = js.undefined
  /**
    * postInitialize will run after all initialize methods are executed in the
    * same tick or enabling chain of actions.
    * @memberof ScriptType
    */
  var postInitialize: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * postUpdate is called if defined for enabled (running state) scripts on each tick,
    * after update.
    * @memberof ScriptType
    */
  var postUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * This method will be called when a ScriptType that already exists in the registry
    * gets redefined. If the new ScriptType has a `swap` method in its prototype,
    * then it will be executed to perform hot-reload at runtime.
    * @memberof ScriptType
    */
  var swap: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * update is called if defined for enabled (running state) scripts on each tick.
    * @param {number} dt
    * @memberof ScriptType
    */
  var update: js.UndefOr[js.Function1[/* dt */ Double, Unit]] = js.undefined
}

object ScriptType {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    fire: (/* name */ String, /* arg1 */ js.UndefOr[js.Any], /* arg2 */ js.UndefOr[js.Any], /* arg3 */ js.UndefOr[js.Any], /* arg4 */ js.UndefOr[js.Any], /* arg5 */ js.UndefOr[js.Any], /* arg6 */ js.UndefOr[js.Any], /* arg7 */ js.UndefOr[js.Any], /* arg8 */ js.UndefOr[js.Any]) => _ = null,
    hasEvent: /* name */ String => Boolean = null,
    initialize: () => Unit = null,
    off: (/* name */ String, /* callback */ js.Function1[/* repeated */ js.Any, Unit], /* scope */ js.Any) => _ = null,
    on: (/* name */ String, /* callback */ js.Function1[/* repeated */ js.Any, Unit], /* scope */ js.Any) => _ = null,
    once: (/* name */ String, /* callback */ js.Function1[/* repeated */ js.Any, Unit], /* scope */ js.Any) => _ = null,
    postInitialize: () => Unit = null,
    postUpdate: () => Unit = null,
    swap: () => Unit = null,
    update: /* dt */ Double => Unit = null
  ): ScriptType = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (fire != null) __obj.updateDynamic("fire")(js.Any.fromFunction9(fire))
    if (hasEvent != null) __obj.updateDynamic("hasEvent")(js.Any.fromFunction1(hasEvent))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (off != null) __obj.updateDynamic("off")(js.Any.fromFunction3(off))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction3(on))
    if (once != null) __obj.updateDynamic("once")(js.Any.fromFunction3(once))
    if (postInitialize != null) __obj.updateDynamic("postInitialize")(js.Any.fromFunction0(postInitialize))
    if (postUpdate != null) __obj.updateDynamic("postUpdate")(js.Any.fromFunction0(postUpdate))
    if (swap != null) __obj.updateDynamic("swap")(js.Any.fromFunction0(swap))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    __obj.asInstanceOf[ScriptType]
  }
}

