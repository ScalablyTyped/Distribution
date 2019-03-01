package typings
package motorDashHatLib.motorDashHatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MotorPins extends js.Object {
  val IN1: scala.Double
  val IN2: scala.Double
  val PWM: scala.Double
}

object MotorPins {
  @scala.inline
  def apply(IN1: scala.Double, IN2: scala.Double, PWM: scala.Double): MotorPins = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IN1")(IN1)
    __obj.updateDynamic("IN2")(IN2)
    __obj.updateDynamic("PWM")(PWM)
    __obj.asInstanceOf[MotorPins]
  }
}

