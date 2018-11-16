package typings
package osmtogeojsonLib.osmtogeojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GeoJSONNs {
  type Coordinate = Coordinate2d | Coordinate3d
  type Coordinate2d = js.Tuple2[scala.Double, scala.Double]
  type Coordinate3d = js.Tuple3[scala.Double, scala.Double, scala.Double]
}
