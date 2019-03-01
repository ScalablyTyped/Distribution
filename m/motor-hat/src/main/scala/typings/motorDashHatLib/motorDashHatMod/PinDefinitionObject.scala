package typings
package motorDashHatLib.motorDashHatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinDefinitionObject extends js.Object {
  /**
    * Pin number of the first coil output
    */
  var IN1: scala.Double
  /**
    * Pin number of the second coil output
    */
  var IN2: scala.Double
  /**
    * Pin number of the PWM output
    */
  var PWM: scala.Double
}

object PinDefinitionObject {
  @scala.inline
  def apply(IN1: scala.Double, IN2: scala.Double, PWM: scala.Double): PinDefinitionObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IN1")(IN1)
    __obj.updateDynamic("IN2")(IN2)
    __obj.updateDynamic("PWM")(PWM)
    __obj.asInstanceOf[PinDefinitionObject]
  }
}

