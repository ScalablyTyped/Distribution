package typings
package motorDashHatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_M1 extends js.Object {
  var M1: motorDashHatLib.motorDashHatMod.MotorPins
  var M2: motorDashHatLib.motorDashHatMod.MotorPins
  var M3: motorDashHatLib.motorDashHatMod.MotorPins
  var M4: motorDashHatLib.motorDashHatMod.MotorPins
}

object Anon_M1 {
  @scala.inline
  def apply(
    M1: motorDashHatLib.motorDashHatMod.MotorPins,
    M2: motorDashHatLib.motorDashHatMod.MotorPins,
    M3: motorDashHatLib.motorDashHatMod.MotorPins,
    M4: motorDashHatLib.motorDashHatMod.MotorPins
  ): Anon_M1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("M1")(M1)
    __obj.updateDynamic("M2")(M2)
    __obj.updateDynamic("M3")(M3)
    __obj.updateDynamic("M4")(M4)
    __obj.asInstanceOf[Anon_M1]
  }
}

