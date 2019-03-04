package typings
package osmtogeojsonLib.osmtogeojsonMod.GeoJSONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends GeoJSONObject {
  var coordinates: Coordinate | js.Array[Coordinate] | js.Array[js.Array[Coordinate]]
}

object Geometry {
  @scala.inline
  def apply(
    coordinates: Coordinate | js.Array[Coordinate] | js.Array[js.Array[Coordinate]],
    `type`: java.lang.String
  ): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Geometry]
  }
}

