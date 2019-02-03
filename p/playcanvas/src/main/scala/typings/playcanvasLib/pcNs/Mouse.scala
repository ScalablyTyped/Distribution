package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.Mouse
  * @class A Mouse Device, bound to a DOM Element.
  * @description Create a new Mouse device
  * @param {Element} [element] The Element that the mouse events are attached to
  */
@JSGlobal("pc.Mouse")
@js.native
class Mouse () extends js.Object {
  def this(element: stdLib.Element) = this()
  /**
    * @function
    * @name pc.Mouse#attach
    * @description Attach mouse events to an Element.
    * @param {Element} element
    */
  def attach(element: stdLib.Element): scala.Unit = js.native
  /**
    * @function
    * @name pc.Mouse#detach
    * @description Remove mouse events from the element that it is attached to
    */
  def detach(): scala.Unit = js.native
  /**
    * @function
    * @name pc.Mouse#disableContextMenu
    * @description Disable the context menu usually activated with right-click
    */
  def disableContextMenu(): scala.Unit = js.native
  /**
    * @function
    * @name pc.Mouse#disablePointerLock
    * @description Return control of the mouse cursor to the user
    * @param {Function} [success] Function called when the mouse lock is disabled
    */
  def disablePointerLock(): scala.Unit = js.native
  def disablePointerLock(success: js.Function1[/* repeated */ js.Any, js.Object]): scala.Unit = js.native
  /**
    * @function
    * @name pc.Mouse#enableContextMenu
    * @description Enable the context menu usually activated with right-click. This option is active by default.
    */
  def enableContextMenu(): scala.Unit = js.native
  /**
    * @function
    * @name pc.Mouse#enablePointerLock
    * @description Request that the browser hides the mouse cursor and locks the mouse to the element.
    * Allowing raw access to mouse movement input without risking the mouse exiting the element.
    * Notes: <br />
    * <ul>
    * <li>In some browsers this will only work when the browser is running in fullscreen mode. See {@link pc.Application#enableFullscreen}
    * <li>Enabling pointer lock can only be initiated by a user action e.g. in the event handler for a mouse or keyboard input.
    * </ul>
    * @param {Function} [success] Function called if the request for mouse lock is successful.
    * @param {Function} [error] Function called if the request for mouse lock is unsuccessful.
    */
  def enablePointerLock(): scala.Unit = js.native
  def enablePointerLock(success: js.Function1[/* repeated */ js.Any, js.Object]): scala.Unit = js.native
  def enablePointerLock(
    success: js.Function1[/* repeated */ js.Any, js.Object],
    error: js.Function1[/* repeated */ js.Any, js.Object]
  ): scala.Unit = js.native
  /**
    * @function
    * @name pc.Mouse#fire
    * @description Fire an event, all additional arguments are passed on to the event listener
    * @param {Object} name Name of event to fire
    * @param {*} [...] Arguments that are passed to the event handler
    * @example
    * obj.fire('test', 'This is the message');
    */
  def fire(
    name: java.lang.String,
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
    * @name pc.Mouse#hasEvent
    * @description Test if there are any handlers bound to an event name
    * @param {String} name The name of the event to test
    * @example
    * obj.on('test', function () { }); // bind an event to 'test'
    * obj.hasEvent('test'); // returns true
    */
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  /**
    * @function
    * @name pc.Mouse#isPressed
    * @description Returns true if the mouse button is currently pressed
    * @param {pc.MOUSEBUTTON} button
    * @returns {Boolean} True if the mouse button is current pressed
    */
  def isPressed(button: scala.Double): scala.Boolean = js.native
  /**
    * @function
    * @name pc.Mouse#off
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
  def off(name: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit], scope: js.Any): js.Any = js.native
  // Events
  /**
    * @function
    * @name pc.Mouse#on
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
  def on(name: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit], scope: js.Any): js.Any = js.native
  /**
    * @function
    * @name pc.Mouse#once
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
  def once(name: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit], scope: js.Any): js.Any = js.native
  /**
    * @function
    * @name pc.Mouse#update
    * @description Update method, should be called once per frame
    * @param {Object} dt
    */
  def update(dt: scala.Double): scala.Unit = js.native
  /**
    * @function
    * @name pc.Mouse#wasPressed
    * @description Returns true if the mouse button was pressed this frame (since the last call to update).
    * @param {pc.MOUSEBUTTON} button
    * @returns {Boolean} True if the mouse button was pressed since the last update
    */
  def wasPressed(button: scala.Double): scala.Boolean = js.native
  /**
    * @function
    * @name pc.Mouse#wasReleased
    * @description Returns true if the mouse button was released this frame (since the last call to update).
    * @param {pc.MOUSEBUTTON} button
    * @returns {Boolean} True if the mouse button was released since the last update
    */
  def wasReleased(button: scala.Double): scala.Boolean = js.native
}

/* static members */
@JSGlobal("pc.Mouse")
@js.native
object Mouse extends js.Object {
  /**
    * @function
    * @name pc.Mouse.isPointerLocked
    * @description Check if the mouse pointer has been locked, using {@link pc.Mouse#enabledPointerLock}
    * @returns {Boolean} True if locked
    */
  def isPointerLocked(): scala.Unit = js.native
}

