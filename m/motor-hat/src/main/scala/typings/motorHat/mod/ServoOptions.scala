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
    freq: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined
  ): ServoOptions = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
    if (!js.isUndefined(freq)) __obj.updateDynamic("freq")(freq.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServoOptions]
  }
}

