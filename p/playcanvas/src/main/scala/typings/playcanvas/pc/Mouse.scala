package typings.playcanvas.pc

import typings.playcanvas.pc.callbacks.LockMouse
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new Mouse device.
  * @param [element] - The Element that the mouse events are attached to.
  */
@js.native
trait Mouse extends EventHandler {
  /**
    * Attach mouse events to an Element.
    * @param element - The DOM element to attach the mouse to.
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
    * @param [success] - Function called when the mouse lock is disabled.
    */
  def disablePointerLock(): Unit = js.native
  def disablePointerLock(success: LockMouse): Unit = js.native
  /**
    * Enable the context menu usually activated with right-click. This option is active by default.
    */
  def enableContextMenu(): Unit = js.native
  /**
    * Request that the browser hides the mouse cursor and locks the mouse to the element.
    Allowing raw access to mouse movement input without risking the mouse exiting the element.
    Notes:
    
    * In some browsers this will only work when the browser is running in fullscreen mode. See {@link pc.Application#enableFullscreen}
    * Enabling pointer lock can only be initiated by a user action e.g. in the event handler for a mouse or keyboard input.
    * @param [success] - Function called if the request for mouse lock is successful.
    * @param [error] - Function called if the request for mouse lock is unsuccessful.
    */
  def enablePointerLock(): Unit = js.native
  def enablePointerLock(success: LockMouse): Unit = js.native
  def enablePointerLock(success: LockMouse, error: LockMouse): Unit = js.native
  /**
    * Returns true if the mouse button is currently pressed.
    * @param button - The mouse button to test. Can be:
    
    * {@link pc.MOUSEBUTTON_LEFT}
    * {@link pc.MOUSEBUTTON_MIDDLE}
    * {@link pc.MOUSEBUTTON_RIGHT}
    * @returns True if the mouse button is current pressed.
    */
  def isPressed(button: Double): Boolean = js.native
  /**
    * Update method, should be called once per frame.
    */
  def update(): Unit = js.native
  /**
    * Returns true if the mouse button was pressed this frame (since the last call to update).
    * @param button - The mouse button to test. Can be:
    
    * {@link pc.MOUSEBUTTON_LEFT}
    * {@link pc.MOUSEBUTTON_MIDDLE}
    * {@link pc.MOUSEBUTTON_RIGHT}
    * @returns True if the mouse button was pressed since the last update.
    */
  def wasPressed(button: Double): Boolean = js.native
  /**
    * Returns true if the mouse button was released this frame (since the last call to update).
    * @param button - The mouse button to test. Can be:
    
    * {@link pc.MOUSEBUTTON_LEFT}
    * {@link pc.MOUSEBUTTON_MIDDLE}
    * {@link pc.MOUSEBUTTON_RIGHT}
    * @returns True if the mouse button was released since the last update.
    */
  def wasReleased(button: Double): Boolean = js.native
}

