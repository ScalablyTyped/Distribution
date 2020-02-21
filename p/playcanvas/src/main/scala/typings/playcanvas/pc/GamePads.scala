package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.GamePads
  * @classdesc Input handler for accessing GamePad input.
  */
@JSGlobal("pc.GamePads")
@js.native
class GamePads () extends js.Object {
  /**
    * @function
    * @name pc.GamePads#getAxis
    * @description Get the value of one of the analogue axes of the pad.
    * @param {number} index - The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc.
    * @param {number} axes - The axes to get the value of, use constants pc.PAD_L_STICK_X, etc.
    * @returns {number} The value of the axis between -1 and 1.
    */
  def getAxis(index: Double, axes: Double): Double = js.native
  /**
    * @function
    * @name pc.GamePads#isPressed
    * @description Returns true if the button on the pad requested is pressed.
    * @param {number} index - The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc.
    * @param {number} button - The button to test, use constants pc.PAD_FACE_1, etc.
    * @returns {boolean} True if the button is pressed.
    */
  def isPressed(index: Double, button: Double): Boolean = js.native
  /**
    * @function
    * @name pc.GamePads#poll
    * @description Poll for the latest data from the gamepad API.
    * @returns {object[]} An array of gamepads and mappings for the model of gamepad that is attached.
    * @example
    * var gamepads = new pc.GamePads();
    * var pads = gamepads.poll();
    */
  def poll(): js.Array[js.Object] = js.native
  /**
    * @function
    * @name pc.GamePads#update
    * @description Update the current and previous state of the gamepads. This must be called every frame for wasPressed()
    * to work.
    */
  def update(): Unit = js.native
  /**
    * @function
    * @name pc.GamePads#wasPressed
    * @description Returns true if the button was pressed since the last frame.
    * @param {number} index - The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc.
    * @param {number} button - The button to test, use constants pc.PAD_FACE_1, etc.
    * @returns {boolean} True if the button was pressed since the last frame.
    */
  def wasPressed(index: Double, button: Double): Boolean = js.native
}

