package typings.motorDashHat.motorDashHatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MotorPins extends js.Object {
  val IN1: Double
  val IN2: Double
  val PWM: Double
}

object MotorPins {
  @scala.inline
  def apply(IN1: Double, IN2: Double, PWM: Double): MotorPins = {
    val __obj = js.Dynamic.literal(IN1 = IN1, IN2 = IN2, PWM = PWM)
  
    __obj.asInstanceOf[MotorPins]
  }
}

