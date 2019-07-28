package typings.motorDashHat.motorDashHatMod

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
  def apply(pins: PinDefinition, pwm: js.Object, frequency: Int | Double = null, speed: Int | Double = null): DCOptions = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], pwm = pwm)
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DCOptions]
  }
}

