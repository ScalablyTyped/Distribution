package typings
package motorDashHatLib.motorDashHatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DCOptions extends js.Object {
  var frequency: js.UndefOr[scala.Double] = js.undefined
  /**
       * Pin definition for the motor
       */
  var pins: PinDefinition
  /**
       * PWM Interface Object
       */
  var pwm: js.Object
  var speed: js.UndefOr[scala.Double] = js.undefined
}

