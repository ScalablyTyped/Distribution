package typings.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Servo extends js.Object {
  /**
    * Calibrate the limits for the servolib
    *
    * @param   freq    The update freq in Hz
    * @param   min     The min. pulse in ms
    * @param   max     The max. pulse in ms
    */
  def calibrate(freq: Double, min: Double, max: Double): Unit = js.native
  /**
    * Move Servo to desired position.
    *
    * @param   pos     Relative position (0% to 100%).
    */
  def moveTo(pos: Double): Unit = js.native
}

object Servo {
  @scala.inline
  def apply(calibrate: (Double, Double, Double) => Unit, moveTo: Double => Unit): Servo = {
    val __obj = js.Dynamic.literal(calibrate = js.Any.fromFunction3(calibrate), moveTo = js.Any.fromFunction1(moveTo))
    __obj.asInstanceOf[Servo]
  }
  @scala.inline
  implicit class ServoOps[Self <: Servo] (val x: Self) extends AnyVal {
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
    def setCalibrate(value: (Double, Double, Double) => Unit): Self = this.set("calibrate", js.Any.fromFunction3(value))
    @scala.inline
    def setMoveTo(value: Double => Unit): Self = this.set("moveTo", js.Any.fromFunction1(value))
  }
  
}

