package typings.osrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object osrmMod {
  type Bearing = js.Array[Double]
  type Coordinate = js.Array[Double]
  type Duration = Double
  type Hint = String
  type Polyline = String
  type Radius = Double
  type Tile = js.Tuple3[Double, Double, Double]
}
