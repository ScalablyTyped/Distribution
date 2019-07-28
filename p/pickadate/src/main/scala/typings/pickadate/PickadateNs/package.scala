package typings.pickadate

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PickadateNs {
  type MinOrMaxDateOption = Date | (js.Tuple3[Double, Double, Double]) | Double | Boolean
  type MinOrMaxTimeOption = Date | (js.Tuple2[Double, Double]) | Double | Boolean
}
