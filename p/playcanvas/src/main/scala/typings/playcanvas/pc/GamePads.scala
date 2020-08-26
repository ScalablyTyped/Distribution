package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input handler for accessing GamePad input.
  */
@js.native
trait GamePads extends js.Object {
  /**
    * Get the value of one of the analogue axes of the pad.
    * @param index - The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc.
    * @param axes - The axes to get the value of, use constants pc.PAD_L_STICK_X, etc.
    * @returns The value of the axis between -1 and 1.
    */
  def getAxis(index: Double, axes: Double): Double = js.native
  /**
    * Returns true if the button on the pad requested is pressed.
    * @param index - The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc.
    * @param button - The button to test, use constants pc.PAD_FACE_1, etc.
    * @returns True if the button is pressed.
    */
  def isPressed(index: Double, button: Double): Boolean = js.native
  /**
    * Poll for the latest data from the gamepad API.
    * @example
    * var gamepads = new pc.GamePads();
    * var pads = gamepads.poll();
    * @returns An array of gamepads and mappings for the model of gamepad that is attached.
    */
  def poll(): js.Array[js.Object] = js.native
  /**
    * Update the current and previous state of the gamepads. This must be called every frame for wasPressed()
    * to work.
    */
  def update(): Unit = js.native
  /**
    * Returns true if the button was pressed since the last frame.
    * @param index - The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc.
    * @param button - The button to test, use constants pc.PAD_FACE_1, etc.
    * @returns True if the button was pressed since the last frame.
    */
  def wasPressed(index: Double, button: Double): Boolean = js.native
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
  @scala.inline
  implicit class GamePadsOps[Self <: GamePads] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetAxis(value: (Double, Double) => Double): Self = this.set("getAxis", js.Any.fromFunction2(value))
    @scala.inline
    def setIsPressed(value: (Double, Double) => Boolean): Self = this.set("isPressed", js.Any.fromFunction2(value))
    @scala.inline
    def setPoll(value: () => js.Array[js.Object]): Self = this.set("poll", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    @scala.inline
    def setWasPressed(value: (Double, Double) => Boolean): Self = this.set("wasPressed", js.Any.fromFunction2(value))
  }
  
}

