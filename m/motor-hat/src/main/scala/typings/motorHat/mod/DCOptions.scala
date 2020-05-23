package typings.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DCOptions extends js.Object {
  var frequency: js.UndefOr[Double] = js.undefined
  /**
    * Pin definition for the motor
    */
  var pins: PinDefinition
  /**
    * PWM Interface Object
    */
  var pwm: js.Object
  var speed: js.UndefOr[Double] = js.undefined
}

object DCOptions {
  @scala.inline
  def apply(
    pins: PinDefinition,
    pwm: js.Object,
    frequency: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined
  ): DCOptions = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DCOptions]
  }
}

