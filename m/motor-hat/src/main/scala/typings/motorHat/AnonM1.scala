package typings.motorHat

import typings.motorHat.mod.MotorPins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonM1 extends js.Object {
  var M1: MotorPins
  var M2: MotorPins
  var M3: MotorPins
  var M4: MotorPins
}

object AnonM1 {
  @scala.inline
  def apply(M1: MotorPins, M2: MotorPins, M3: MotorPins, M4: MotorPins): AnonM1 = {
    val __obj = js.Dynamic.literal(M1 = M1.asInstanceOf[js.Any], M2 = M2.asInstanceOf[js.Any], M3 = M3.asInstanceOf[js.Any], M4 = M4.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonM1]
  }
}

