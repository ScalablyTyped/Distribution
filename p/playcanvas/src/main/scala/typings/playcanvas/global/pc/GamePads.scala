package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input handler for accessing GamePad input.
  */
@JSGlobal("pc.GamePads")
@js.native
class GamePads ()
  extends typings.playcanvas.pc.GamePads {
  /**
    * Get the value of one of the analogue axes of the pad.
    * @param index - The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc.
    * @param axes - The axes to get the value of, use constants pc.PAD_L_STICK_X, etc.
    * @returns The value of the axis between -1 and 1.
    */
  /* CompleteClass */
  override def getAxis(index: Double, axes: Double): Double = js.native
  /**
    * Returns true if the button on the pad requested is pressed.
    * @param index - The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc.
    * @param button - The button to test, use constants pc.PAD_FACE_1, etc.
    * @returns True if the button is pressed.
    */
  /* CompleteClass */
  override def isPressed(index: Double, button: Double): Boolean = js.native
  /**
    * Poll for the latest data from the gamepad API.
    * @example
    * var gamepads = new pc.GamePads();
    var pads = gamepads.poll();
    * @returns An array of gamepads and mappings for the model of gamepad that is attached.
    */
  /* CompleteClass */
  override def poll(): js.Array[js.Object] = js.native
  /**
    * Update the current and previous state of the gamepads. This must be called every frame for wasPressed()
    to work.
    */
  /* CompleteClass */
  override def update(): Unit = js.native
  /**
    * Returns true if the button was pressed since the last frame.
    * @param index - The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc.
    * @param button - The button to test, use constants pc.PAD_FACE_1, etc.
    * @returns True if the button was pressed since the last frame.
    */
  /* CompleteClass */
  override def wasPressed(index: Double, button: Double): Boolean = js.native
}

