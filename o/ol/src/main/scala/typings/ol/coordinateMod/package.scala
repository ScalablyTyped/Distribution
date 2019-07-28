package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coordinateMod {
  type Coordinate = js.Array[Double]
  type CoordinateFormat = js.Function1[/* p0 */ Coordinate, String]
}
