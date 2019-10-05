package typings.playcanvas.pc

import typings.playcanvas.Anon_Gamepads
import typings.playcanvas.Anon_Pad
import typings.std.Element
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Controller
  * @classdesc A general input handler which handles both mouse and keyboard input assigned to named actions.
  * This allows you to define input handlers separately to defining keyboard/mouse configurations.
  * @description Create a new instance of a Controller.
  * @param {Element} [element] Element to attach Controller to.
  * @param {Object} [options] Optional arguments.
  * @param {pc.Keyboard} [options.keyboard] A Keyboard object to use.
  * @param {pc.Mouse} [options.mouse] A Mouse object to use.
  * @param {pc.GamePads} [options.gamepads] A Gamepads object to use.
  * @example
  * var c = new pc.Controller(document)
  *
  * // Register the "fire" action and assign it to both the Enter key and the Spacebar.
  * c.registerKeys("fire", [pc.KEY_ENTER, pc.KEY_SPACE]);
  */
@JSGlobal("pc.Controller")
@js.native
class Controller () extends js.Object {
  def this(element: Element) = this()
  def this(element: Element, options: Anon_Gamepads) = this()
  /**
    * @function
    * @name pc.Controller#attach
    * @description Attach Controller to a Element, this is required before you can monitor for key/mouse inputs.
    * @param {Element} element The element to attach mouse and keyboard event handler too
    */
  def attach(element: Element): Unit = js.native
  /**
    * @function
    * @name pc.Controller#detach
    * @description Detach Controller from an Element, this should be done before the Controller is destroyed
    */
  def detach(): Unit = js.native
  /**
    * @function
    * @name pc.Controller#disableContextMenu
    * @description Disable the context menu usually activated with the right mouse button.
    */
  def disableContextMenu(): Unit = js.native
  /**
    * @function
    * @name pc.Controller#enableContextMenu
    * @description Enable the context menu usually activated with the right mouse button. This is enabled by default.
    */
  def enableContextMenu(): Unit = js.native
  /**
    * @function
    * @name pc.Controller#isPressed
    * @description Returns true if the current action is enabled.
    * @param {String} actionName The name of the action.
    * @returns {Boolean} True if the action is enabled.
    */
  def isPressed(actionName: String): Boolean = js.native
  /**
    * @function
    * @name pc.Controller#registerAxis
    * @param {Object} [options] Optional options object.
    * @param {Object} [options.pad] The index of the game pad to register for (use pc.PAD_1, etc)
    */
  def registerAxis(): Unit = js.native
  def registerAxis(options: Anon_Pad): Unit = js.native
  /**
    * @function
    * @name pc.Controller#registerKeys
    * @description Create or update a action which is enabled when the supplied keys are pressed.
    * @param {String} action The name of the action
    * @param {Number[]} keys A list of keycodes
    */
  def registerKeys(action: String, keys: js.Array[Number]): Unit = js.native
  /**
    * @function
    * @name pc.Controller#registerMouse
    * @description Create or update an action which is enabled when the supplied mouse button is pressed
    * @param {String} action The name of the action
    * @param {Number} button The mouse button
    */
  def registerMouse(action: String, button: Double): Unit = js.native
  /**
    * @function
    * @name pc.Controller#registerPadButton
    * @description Create or update an action which is enabled when the gamepad button is pressed
    * @param {String} action The name of the action
    * @param {Number} pad The index of the pad to register (use pc.PAD_1, etc)
    * @param {Number} button The pad button
    */
  def registerPadButton(action: String, pad: Double, button: Double): Unit = js.native
  /**
    * @function
    * @name pc.Controller#update
    * @description Update the Keyboard and Mouse handlers
    * @param {Object} dt The time since the last frame
    */
  def update(dt: js.Any): Unit = js.native
  /**
    * @function
    * @name pc.Controller#wasPressed
    * @description Returns true if the action was enabled this since the last update.
    * @param {String} actionName The name of the action.
    * @returns {Boolean} True if the action was enabled this since the last update.
    */
  def wasPressed(actionName: String): Boolean = js.native
}

