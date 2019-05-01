package typings
package motorDashHatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object motorDashHatMod {
  type Callback = js.Function2[/* err */ js.UndefOr[stdLib.Error], /* result */ js.UndefOr[js.Any], scala.Unit]
  type PinDefinition = PinDefinitionObject | js.Array[scala.Double]
}
