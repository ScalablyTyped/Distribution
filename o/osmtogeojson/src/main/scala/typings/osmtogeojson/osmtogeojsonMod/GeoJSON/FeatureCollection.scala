package typings.osmtogeojson.osmtogeojsonMod.GeoJSON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureCollection extends GeoJSONObject {
  var features: js.Array[Feature]
}

object FeatureCollection {
  @scala.inline
  def apply(features: js.Array[Feature], `type`: String): FeatureCollection = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureCollection]
  }
}

