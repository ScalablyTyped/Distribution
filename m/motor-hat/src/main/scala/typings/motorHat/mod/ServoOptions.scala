package typings.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServoOptions extends js.Object {
  /**
    * PWM Controller frequency for the servo
    */
  var freq: js.UndefOr[Double] = js.undefined
  /**
    * Duration in ms of pulse at position 100
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Duration in ms of pulse at position 0
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * Servo controller pin. Which pin (0 to 15) is the servo connected to?
    */
  var pin: Double
  /**
    * PWM Interface Object
    */
  var pwm: js.Object
}

object ServoOptions {
  @scala.inline
  def apply(
    pin: Double,
    pwm: js.Object,
    freq: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null
  ): ServoOptions = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
    if (freq != null) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServoOptions]
  }
}

