package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.VrManager
  * @class Manage and update {@link pc.VrDisplay}s that are attached to this device.
  * @description Manage and update {@link pc.VrDisplay}s that are attached to this device.
  * @param {pc.Application} app The main application
  * @property {pc.VrDisplay[]} displays The list of {@link pc.VrDisplay}s that are attached to this device
  * @property {pc.VrDisplay} display The default {@link pc.VrDisplay} to be used. Usually the first in the `displays` list
  * @property {Boolean} isSupported Reports whether this device supports the WebVR API
  * @property {Boolean} usesPolyfill Reports whether this device supports the WebVR API using a polyfill
  */
@JSGlobal("pc.VrManager")
@js.native
class VrManager protected () extends js.Object {
  def this(app: Application) = this()
  var display: VrDisplay = js.native
  var displays: js.Array[VrDisplay] = js.native
  /**
    * @function
    * @name pc.VrManager#destroy
    * @description Remove events and clear up manager
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.VrManager#fire
    * @description Fire an event, all additional arguments are passed on to the event listener
    * @param {Object} name Name of event to fire
    * @param {*} [...] Arguments that are passed to the event handler
    * @example
    * obj.fire('test', 'This is the message');
    */
  def fire(
    name: String,
    arg1: js.Any,
    arg2: js.UndefOr[js.Any],
    arg3: js.UndefOr[js.Any],
    arg4: js.UndefOr[js.Any],
    arg5: js.UndefOr[js.Any],
    arg6: js.UndefOr[js.Any],
    arg7: js.UndefOr[js.Any],
    arg8: js.UndefOr[js.Any]
  ): js.Any = js.native
  /**
    * @function
    * @name pc.VrManager#hasEvent
    * @description Test if there are any handlers bound to an event name
    * @param {String} name The name of the event to test
    * @example
    * obj.on('test', function () { }); // bind an event to 'test'
    * obj.hasEvent('test'); // returns true
    */
  def hasEvent(name: String): Boolean = js.native
  /**
    * @function
    * @name pc.VrManager#off
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
  def off(name: String, callback: js.Function1[/* repeated */ js.Any, Unit], scope: js.Any): js.Any = js.native
  // Events
  /**
    * @function
    * @name pc.VrManager#on
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
  def on(name: String, callback: js.Function1[/* repeated */ js.Any, Unit], scope: js.Any): js.Any = js.native
  /**
    * @function
    * @name pc.VrManager#once
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
  def once(name: String, callback: js.Function1[/* repeated */ js.Any, Unit], scope: js.Any): js.Any = js.native
  /**
    * @function
    * @name pc.VrManager#poll
    * @description Called once per frame to poll all attached displays
    */
  def poll(): Unit = js.native
}

/* static members */
@JSGlobal("pc.VrManager")
@js.native
object VrManager extends js.Object {
  var isSupported: Boolean = js.native
  var usesPolyfill: Boolean = js.native
}

