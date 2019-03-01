package typings
package motorDashHatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_W1 extends js.Object {
  /**
    * Pin definition for winding 1 of the stepper
    */
  var W1: motorDashHatLib.motorDashHatMod.PinDefinition
  /**
    * Pin definition for winding 2 of the stepper
    */
  var W2: motorDashHatLib.motorDashHatMod.PinDefinition
}

object Anon_W1 {
  @scala.inline
  def apply(
    W1: motorDashHatLib.motorDashHatMod.PinDefinition,
    W2: motorDashHatLib.motorDashHatMod.PinDefinition
  ): Anon_W1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("W1")(W1.asInstanceOf[js.Any])
    __obj.updateDynamic("W2")(W2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_W1]
  }
}

