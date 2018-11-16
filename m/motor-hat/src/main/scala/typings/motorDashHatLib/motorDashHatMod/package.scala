package typings
package motorDashHatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object motorDashHatMod {
  type Direction = motorDashHatLib.motorDashHatLibStrings.fwd | motorDashHatLib.motorDashHatLibStrings.back
  type Motor = motorDashHatLib.motorDashHatLibStrings.M1 | motorDashHatLib.motorDashHatLibStrings.M2 | motorDashHatLib.motorDashHatLibStrings.M3 | motorDashHatLib.motorDashHatLibStrings.M4
  type PinDefinition = PinDefinitionObject | js.Array[scala.Double]
}
