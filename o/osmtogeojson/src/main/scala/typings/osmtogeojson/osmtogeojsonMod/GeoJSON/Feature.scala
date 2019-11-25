package typings.osmtogeojson.osmtogeojsonMod.GeoJSON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends GeoJSONObject {
  var geometry: Geometry
  var id: js.UndefOr[String] = js.undefined
  var properties: js.Any
}

object Feature {
  @scala.inline
  def apply(geometry: Geometry, properties: js.Any, `type`: String, id: String = null): Feature = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
}

