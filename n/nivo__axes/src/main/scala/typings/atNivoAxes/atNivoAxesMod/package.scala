package typings.atNivoAxes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoAxesMod {
  import typings.std.Date

  type Axis = js.Any
  type TickFormatter = js.Function1[/* value */ Double | String | Date, String | Double]
}
