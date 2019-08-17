package typings.pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PickadateNs {
  import typings.std.Date

  type MinOrMaxDateOption = Date | (js.Tuple3[Double, Double, Double]) | Double | Boolean
  type MinOrMaxTimeOption = Date | (js.Tuple2[Double, Double]) | Double | Boolean
}
