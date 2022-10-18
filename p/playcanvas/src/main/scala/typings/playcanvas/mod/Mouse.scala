package typings.playcanvas.mod

import typings.playcanvas.anon.X
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link Mouse#enablePointerLock} and {@link Application#disablePointerLock}.
  *
  * @callback LockMouseCallback
  */
/**
  * A Mouse Device, bound to a DOM Element.
  *
  * @augments EventHandler
  */
@js.native
trait Mouse extends EventHandler {
  
  var _attached: Boolean = js.native
  
  var _buttons: js.Array[Boolean] = js.native
  
  def _contextMenuHandler(event: Any): Unit = js.native
  
  var _downHandler: Any = js.native
  
  def _getTargetCoords(event: Any): X = js.native
  
  def _handleDown(event: Any): Unit = js.native
  
  def _handleMove(event: Any): Unit = js.native
  
  def _handleUp(event: Any): Unit = js.native
  
  def _handleWheel(event: Any): Unit = js.native
  
  var _lastX: Double = js.native
  
  var _lastY: Double = js.native
  
  var _lastbuttons: js.Array[Boolean] = js.native
  
  var _moveHandler: Any = js.native
  
  var _target: Element = js.native
  
  var _upHandler: Any = js.native
  
  var _wheelHandler: Any = js.native
  
  /**
    * Attach mouse events to an Element.
    *
    * @param {Element} element - The DOM element to attach the mouse to.
    */
  def attach(element: Element): Unit = js.native
  
  /**
    * Remove mouse events from the element that it is attached to.
    */
  def detach(): Unit = js.native
  
  /**
    * Disable the context menu usually activated with right-click.
    */
  def disableContextMenu(): Unit = js.native
  
  /**
    * Return control of the mouse cursor to the user.
    *
    * @param {LockMouseCallback} [success] - Function called when the mouse lock is disabled.
    */
  def disablePointerLock(): Unit = js.native
  def disablePointerLock(success: LockMouseCallback): Unit = js.native
  
  /**
    * Enable the context menu usually activated with right-click. This option is active by
    * default.
    */
  def enableContextMenu(): Unit = js.native
  
  /**
    * Request that the browser hides the mouse cursor and locks the mouse to the element. Allowing
    * raw access to mouse movement input without risking the mouse exiting the element. Notes:
    *
    * - In some browsers this will only work when the browser is running in fullscreen mode. See
    * {@link Application#enableFullscreen}
    * - Enabling pointer lock can only be initiated by a user action e.g. in the event handler for
    * a mouse or keyboard input.
    *
    * @param {LockMouseCallback} [success] - Function called if the request for mouse lock is
    * successful.
    * @param {LockMouseCallback} [error] - Function called if the request for mouse lock is
    * unsuccessful.
    */
  def enablePointerLock(): Unit = js.native
  def enablePointerLock(success: Unit, error: LockMouseCallback): Unit = js.native
  def enablePointerLock(success: LockMouseCallback): Unit = js.native
  def enablePointerLock(success: LockMouseCallback, error: LockMouseCallback): Unit = js.native
  
  /**
    * Returns true if the mouse button is currently pressed.
    *
    * @param {number} button - The mouse button to test. Can be:
    *
    * - {@link MOUSEBUTTON_LEFT}
    * - {@link MOUSEBUTTON_MIDDLE}
    * - {@link MOUSEBUTTON_RIGHT}
    *
    * @returns {boolean} True if the mouse button is current pressed.
    */
  def isPressed(button: Double): Boolean = js.native
  
  /**
    * Update method, should be called once per frame.
    */
  def update(): Unit = js.native
  
  /**
    * Returns true if the mouse button was pressed this frame (since the last call to update).
    *
    * @param {number} button - The mouse button to test. Can be:
    *
    * - {@link MOUSEBUTTON_LEFT}
    * - {@link MOUSEBUTTON_MIDDLE}
    * - {@link MOUSEBUTTON_RIGHT}
    *
    * @returns {boolean} True if the mouse button was pressed since the last update.
    */
  def wasPressed(button: Double): Boolean = js.native
  
  /**
    * Returns true if the mouse button was released this frame (since the last call to update).
    *
    * @param {number} button - The mouse button to test. Can be:
    *
    * - {@link MOUSEBUTTON_LEFT}
    * - {@link MOUSEBUTTON_MIDDLE}
    * - {@link MOUSEBUTTON_RIGHT}
    *
    * @returns {boolean} True if the mouse button was released since the last update.
    */
  def wasReleased(button: Double): Boolean = js.native
}
