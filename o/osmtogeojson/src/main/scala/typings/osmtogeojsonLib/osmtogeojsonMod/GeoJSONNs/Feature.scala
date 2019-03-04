package typings
package osmtogeojsonLib.osmtogeojsonMod.GeoJSONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends GeoJSONObject {
  var geometry: Geometry
  var id: js.UndefOr[java.lang.String] = js.undefined
  var properties: js.Any
}

object Feature {
  @scala.inline
  def apply(geometry: Geometry, properties: js.Any, `type`: java.lang.String, id: java.lang.String = null): Feature = {
    val __obj = js.Dynamic.literal(geometry = geometry, properties = properties)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Feature]
  }
}

