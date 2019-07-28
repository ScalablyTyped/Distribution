package typings.motorDashHat.motorDashHatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Servo extends js.Object {
  /**
    * Calibrate the limits for the servolib
    *
    * @param   freq    The update freq in Hz
    * @param   min     The min. pulse in ms
    * @param   max     The max. pulse in ms
    */
  def calibrate(freq: Double, min: Double, max: Double): Unit
  /**
    * Move Servo to desired position.
    *
    * @param   pos     Relative position (0% to 100%).
    */
  def moveTo(pos: Double): Unit
}

object Servo {
  @scala.inline
  def apply(calibrate: (Double, Double, Double) => Unit, moveTo: Double => Unit): Servo = {
    val __obj = js.Dynamic.literal(calibrate = js.Any.fromFunction3(calibrate), moveTo = js.Any.fromFunction1(moveTo))
  
    __obj.asInstanceOf[Servo]
  }
}

