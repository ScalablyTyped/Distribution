package typings.playcanvas.pc

import typings.playcanvas.anon.Pad
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new instance of a Controller.
  * @example
  * var c = new pc.Controller(document);
  *
  * // Register the "fire" action and assign it to both the Enter key and the Spacebar.
  * c.registerKeys("fire", [pc.KEY_ENTER, pc.KEY_SPACE]);
  * @param [element] - Element to attach Controller to.
  * @param [options] - Optional arguments.
  * @param [options.keyboard] - A Keyboard object to use.
  * @param [options.mouse] - A Mouse object to use.
  * @param [options.gamepads] - A Gamepads object to use.
  */
@js.native
trait Controller extends StObject {
  
  /**
    * Attach Controller to a Element, this is required before you can monitor for key/mouse inputs.
    * @param element - The element to attach mouse and keyboard event handler too.
    */
  def attach(element: Element): Unit = js.native
  
  /**
    * Detach Controller from an Element, this should be done before the Controller is destroyed.
    */
  def detach(): Unit = js.native
  
  /**
    * Disable the context menu usually activated with the right mouse button.
    */
  def disableContextMenu(): Unit = js.native
  
  /**
    * Enable the context menu usually activated with the right mouse button. This is enabled by default.
    */
  def enableContextMenu(): Unit = js.native
  
  /**
    * Returns true if the current action is enabled.
    * @param actionName - The name of the action.
    * @returns True if the action is enabled.
    */
  def isPressed(actionName: String): Boolean = js.native
  
  /**
    * @param [options] - Optional options object.
    * @param [options.pad] - The index of the game pad to register for (use pc.PAD_1, etc).
    */
  def registerAxis(): Unit = js.native
  def registerAxis(options: Pad): Unit = js.native
  
  /**
    * Create or update a action which is enabled when the supplied keys are pressed.
    * @param action - The name of the action.
    * @param keys - A list of keycodes.
    */
  def registerKeys(action: String, keys: js.Array[Double]): Unit = js.native
  
  /**
    * Create or update an action which is enabled when the supplied mouse button is pressed.
    * @param action - The name of the action.
    * @param button - The mouse button.
    */
  def registerMouse(action: String, button: Double): Unit = js.native
  
  /**
    * Create or update an action which is enabled when the gamepad button is pressed.
    * @param action - The name of the action.
    * @param pad - The index of the pad to register (use pc.PAD_1, etc).
    * @param button - The pad button.
    */
  def registerPadButton(action: String, pad: Double, button: Double): Unit = js.native
  
  /**
    * Update the Keyboard and Mouse handlers.
    * @param dt - The time since the last frame.
    */
  def update(dt: js.Any): Unit = js.native
  
  /**
    * Returns true if the action was enabled this since the last update.
    * @param actionName - The name of the action.
    * @returns True if the action was enabled this since the last update.
    */
  def wasPressed(actionName: String): Boolean = js.native
}
