package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input handler for accessing GamePad input.
  */
trait GamePads extends js.Object {
  /**
    * Get the value of one of the analogue axes of the pad.
    * @param index - The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc.
    * @param axes - The axes to get the value of, use constants pc.PAD_L_STICK_X, etc.
    * @returns The value of the axis between -1 and 1.
    */
  def getAxis(index: Double, axes: Double): Double
  /**
    * Returns true if the button on the pad requested is pressed.
    * @param index - The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc.
    * @param button - The button to test, use constants pc.PAD_FACE_1, etc.
    * @returns True if the button is pressed.
    */
  def isPressed(index: Double, button: Double): Boolean
  /**
    * Poll for the latest data from the gamepad API.
    * @example
    * var gamepads = new pc.GamePads();
    var pads = gamepads.poll();
    * @returns An array of gamepads and mappings for the model of gamepad that is attached.
    */
  def poll(): js.Array[js.Object]
  /**
    * Update the current and previous state of the gamepads. This must be called every frame for wasPressed()
    to work.
    */
  def update(): Unit
  /**
    * Returns true if the button was pressed since the last frame.
    * @param index - The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc.
    * @param button - The button to test, use constants pc.PAD_FACE_1, etc.
    * @returns True if the button was pressed since the last frame.
    */
  def wasPressed(index: Double, button: Double): Boolean
}

object GamePads {
  @scala.inline
  def apply(
    getAxis: (Double, Double) => Double,
    isPressed: (Double, Double) => Boolean,
    poll: () => js.Array[js.Object],
    update: () => Unit,
    wasPressed: (Double, Double) => Boolean
  ): GamePads = {
    val __obj = js.Dynamic.literal(getAxis = js.Any.fromFunction2(getAxis), isPressed = js.Any.fromFunction2(isPressed), poll = js.Any.fromFunction0(poll), update = js.Any.fromFunction0(update), wasPressed = js.Any.fromFunction2(wasPressed))
    __obj.asInstanceOf[GamePads]
  }
}

