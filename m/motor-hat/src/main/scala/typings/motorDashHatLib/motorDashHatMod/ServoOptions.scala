package typings
package motorDashHatLib.motorDashHatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServoOptions extends js.Object {
  /**
    * PWM Controller frequency for the servo
    */
  var freq: js.UndefOr[scala.Double] = js.undefined
  /**
    * Duration in ms of pulse at position 100
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * Duration in ms of pulse at position 0
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * Servo controller pin. Which pin (0 to 15) is the servo connected to?
    */
  var pin: scala.Double
  /**
    * PWM Interface Object
    */
  var pwm: js.Object
}

