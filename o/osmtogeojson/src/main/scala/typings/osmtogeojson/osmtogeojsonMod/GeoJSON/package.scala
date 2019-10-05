package typings.osmtogeojson.osmtogeojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GeoJSON {
  type Coordinate = Coordinate2d | Coordinate3d
  type Coordinate2d = js.Tuple2[Double, Double]
  type Coordinate3d = js.Tuple3[Double, Double, Double]
}
