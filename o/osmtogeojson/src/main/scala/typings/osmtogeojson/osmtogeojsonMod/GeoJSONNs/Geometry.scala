package typings.osmtogeojson.osmtogeojsonMod.GeoJSONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends GeoJSONObject {
  var coordinates: Coordinate | (js.Array[js.Array[Coordinate] | Coordinate])
}

object Geometry {
  @scala.inline
  def apply(coordinates: Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), `type`: String): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Geometry]
  }
}

