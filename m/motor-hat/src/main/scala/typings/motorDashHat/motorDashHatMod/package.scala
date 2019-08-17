package typings.motorDashHat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object motorDashHatMod {
  import typings.std.Error

  type Callback = js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[js.Any], Unit]
  type PinDefinition = PinDefinitionObject | js.Array[Double]
}
