package typings
package osmtogeojsonLib.osmtogeojsonMod.GeoJSONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureCollection extends GeoJSONObject {
  var features: js.Array[Feature]
}

object FeatureCollection {
  @scala.inline
  def apply(features: js.Array[Feature], `type`: java.lang.String): FeatureCollection = {
    val __obj = js.Dynamic.literal(features = features)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FeatureCollection]
  }
}

