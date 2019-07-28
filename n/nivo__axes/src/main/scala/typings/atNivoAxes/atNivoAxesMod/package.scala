package typings.atNivoAxes

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoAxesMod {
  type Axis = js.Any
  type TickFormatter = js.Function1[/* value */ Double | String | Date, String | Double]
}
