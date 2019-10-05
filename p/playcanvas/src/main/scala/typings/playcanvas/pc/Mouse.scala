package typings.playcanvas.pc

import typings.playcanvas.pc.callbacks.LockMouse
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Mouse
  * @extends pc.EventHandler
  * @classdesc A Mouse Device, bound to a DOM Element.
  * @description Create a new Mouse device
  * @param {Element} [element] The Element that the mouse events are attached to
  */
@JSGlobal("pc.Mouse")
@js.native
class Mouse () extends EventHandler {
  def this(element: Element) = this()
  /**
    * @function
    * @name pc.Mouse#attach
    * @description Attach mouse events to an Element.
    * @param {Element} element The DOM element to attach the mouse to.
    */
  def attach(element: Element): Unit = js.native
  /**
    * @function
    * @name pc.Mouse#detach
    * @description Remove mouse events from the element that it is attached to
    */
  def detach(): Unit = js.native
  /**
    * @function
    * @name pc.Mouse#disableContextMenu
    * @description Disable the context menu usually activated with right-click
    */
  def disableContextMenu(): Unit = js.native
  /**
    * @function
    * @name pc.Mouse#disablePointerLock
    * @description Return control of the mouse cursor to the user
    * @param {pc.callbacks.LockMouse} [success] Function called when the mouse lock is disabled
    */
  def disablePointerLock(): Unit = js.native
  def disablePointerLock(success: LockMouse): Unit = js.native
  /**
    * @function
    * @name pc.Mouse#enableContextMenu
    * @description Enable the context menu usually activated with right-click. This option is active by default.
    */
  def enableContextMenu(): Unit = js.native
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
    * @param {pc.callbacks.LockMouse} [success] Function called if the request for mouse lock is successful.
    * @param {pc.callbacks.LockMouse} [error] Function called if the request for mouse lock is unsuccessful.
    */
  def enablePointerLock(): Unit = js.native
  def enablePointerLock(success: LockMouse): Unit = js.native
  def enablePointerLock(success: LockMouse, error: LockMouse): Unit = js.native
  /**
    * @function
    * @name pc.Mouse#isPressed
    * @description Returns true if the mouse button is currently pressed
    * @param {Number} button The mouse button to test. Can be:
    * <ul>
    *     <li>{@link pc.MOUSEBUTTON_LEFT}</li>
    *     <li>{@link pc.MOUSEBUTTON_MIDDLE}</li>
    *     <li>{@link pc.MOUSEBUTTON_RIGHT}</li>
    * </ul>
    * @returns {Boolean} True if the mouse button is current pressed
    */
  def isPressed(button: Double): Boolean = js.native
  /**
    * @function
    * @name pc.Mouse#update
    * @description Update method, should be called once per frame
    */
  def update(): Unit = js.native
  /**
    * @function
    * @name pc.Mouse#wasPressed
    * @description Returns true if the mouse button was pressed this frame (since the last call to update).
    * @param {Number} button The mouse button to test. Can be:
    * <ul>
    *     <li>{@link pc.MOUSEBUTTON_LEFT}</li>
    *     <li>{@link pc.MOUSEBUTTON_MIDDLE}</li>
    *     <li>{@link pc.MOUSEBUTTON_RIGHT}</li>
    * </ul>
    * @returns {Boolean} True if the mouse button was pressed since the last update
    */
  def wasPressed(button: Double): Boolean = js.native
  /**
    * @function
    * @name pc.Mouse#wasReleased
    * @description Returns true if the mouse button was released this frame (since the last call to update).
    * @param {Number} button The mouse button to test. Can be:
    * <ul>
    *     <li>{@link pc.MOUSEBUTTON_LEFT}</li>
    *     <li>{@link pc.MOUSEBUTTON_MIDDLE}</li>
    *     <li>{@link pc.MOUSEBUTTON_RIGHT}</li>
    * </ul>
    * @returns {Boolean} True if the mouse button was released since the last update
    */
  def wasReleased(button: Double): Boolean = js.native
}

/* static members */
@JSGlobal("pc.Mouse")
@js.native
object Mouse extends js.Object {
  /**
    * @static
    * @function
    * @name pc.Mouse.isPointerLocked
    * @description Check if the mouse pointer has been locked, using {@link pc.Mouse#enabledPointerLock}
    * @returns {Boolean} True if locked
    */
  def isPointerLocked(): Boolean = js.native
}

