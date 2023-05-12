package typings.playcanvas.mod

import typings.playcanvas.anon.Button
import typings.playcanvas.anon.Gamepads
import typings.playcanvas.anon.Pad
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A general input handler which handles both mouse and keyboard input assigned to named actions.
  * This allows you to define input handlers separately to defining keyboard/mouse configurations.
  */
@JSImport("playcanvas", "Controller")
@js.native
/**
  * Create a new instance of a Controller.
  *
  * @param {Element} [element] - Element to attach Controller to.
  * @param {object} [options] - Optional arguments.
  * @param {Keyboard} [options.keyboard] - A Keyboard object to use.
  * @param {Mouse} [options.mouse] - A Mouse object to use.
  * @param {import('./game-pads.js').GamePads} [options.gamepads] - A Gamepads object to use.
  * @example
  * const c = new pc.Controller(document);
  *
  * // Register the "fire" action and assign it to both the Enter key and the space bar.
  * c.registerKeys("fire", [pc.KEY_ENTER, pc.KEY_SPACE]);
  */
open class Controller () extends StObject {
  def this(element: Element) = this()
  def this(element: Unit, options: Gamepads) = this()
  def this(element: Element, options: Gamepads) = this()
  
  var _element: Element = js.native
  
  def _enableKeyboard(): Unit = js.native
  
  def _enableMouse(): Unit = js.native
  
  var _gamepads: GamePads = js.native
  
  var _keyboard: Keyboard = js.native
  
  var _mouse: Mouse = js.native
  
  /**
    * Helper function to append an action.
    *
    * @param {string} action_name - The name of the action.
    * @param {object} action - An action object to add.
    * @param {ACTION_KEYBOARD | ACTION_MOUSE | ACTION_GAMEPAD} action.type - The name of the action.
    * @param {number[]} [action.keys] - Keyboard: A list of keycodes e.g. `[pc.KEY_A, pc.KEY_ENTER]`.
    * @param {number} [action.button] - Mouse: e.g. `pc.MOUSEBUTTON_LEFT` - Gamepad: e.g. `pc.PAD_FACE_1`
    * @param {number} [action.pad] - Gamepad: An index of the pad to register (use {@link PAD_1}, etc).
    */
  def appendAction(action_name: String, action: Button): Unit = js.native
  
  /**
    * Attach Controller to an Element. This is required before you can monitor for key/mouse
    * inputs.
    *
    * @param {Element} element - The element to attach mouse and keyboard event handler too.
    */
  def attach(element: Element): Unit = js.native
  
  /**
    * Detach Controller from an Element. This should be done before the Controller is destroyed.
    */
  def detach(): Unit = js.native
  
  /**
    * Disable the context menu usually activated with the right mouse button.
    */
  def disableContextMenu(): Unit = js.native
  
  /**
    * Enable the context menu usually activated with the right mouse button. This is enabled by
    * default.
    */
  def enableContextMenu(): Unit = js.native
  
  def getAxis(name: Any): Double = js.native
  
  /**
    * Returns true if the current action is enabled.
    *
    * @param {string} actionName - The name of the action.
    * @returns {boolean} True if the action is enabled.
    */
  def isPressed(actionName: String): Boolean = js.native
  
  /**
    * Register an action against a controller axis.
    *
    * @param {object} [options] - Optional options object.
    * @param {number} [options.pad] - The index of the game pad to register for (use {@link PAD_1}, etc).
    */
  def registerAxis(): Unit = js.native
  def registerAxis(options: Pad): Unit = js.native
  
  /**
    * Create or update a action which is enabled when the supplied keys are pressed.
    *
    * @param {string} action - The name of the action.
    * @param {number[]} keys - A list of keycodes.
    */
  def registerKeys(action: String, keys: js.Array[Double]): Unit = js.native
  
  /**
    * Create or update an action which is enabled when the supplied mouse button is pressed.
    *
    * @param {string} action - The name of the action.
    * @param {number} button - The mouse button.
    */
  def registerMouse(action: String, button: Double): Unit = js.native
  
  /**
    * Create or update an action which is enabled when the gamepad button is pressed.
    *
    * @param {string} action - The name of the action.
    * @param {number} pad - The index of the pad to register (use {@link PAD_1}, etc).
    * @param {number} button - The pad button.
    */
  def registerPadButton(action: String, pad: Double, button: Double): Unit = js.native
  
  /**
    * Update the Keyboard and Mouse handlers.
    *
    * @param {object} dt - The time since the last frame.
    */
  def update(dt: js.Object): Unit = js.native
  
  /**
    * Returns true if the action was enabled this since the last update.
    *
    * @param {string} actionName - The name of the action.
    * @returns {boolean} True if the action was enabled this since the last update.
    */
  def wasPressed(actionName: String): Boolean = js.native
}
