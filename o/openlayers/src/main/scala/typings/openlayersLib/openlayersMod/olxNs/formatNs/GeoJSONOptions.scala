package typings
package openlayersLib.openlayersMod.olxNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONOptions extends js.Object {
  var defaultDataProjection: openlayersLib.openlayersMod.ProjectionLike
  var featureProjection: openlayersLib.openlayersMod.ProjectionLike
  var geometryName: js.UndefOr[java.lang.String] = js.undefined
}

object GeoJSONOptions {
  @scala.inline
  def apply(
    defaultDataProjection: openlayersLib.openlayersMod.ProjectionLike,
    featureProjection: openlayersLib.openlayersMod.ProjectionLike,
    geometryName: java.lang.String = null
  ): GeoJSONOptions = {
    val __obj = js.Dynamic.literal(defaultDataProjection = defaultDataProjection.asInstanceOf[js.Any], featureProjection = featureProjection.asInstanceOf[js.Any])
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName)
    __obj.asInstanceOf[GeoJSONOptions]
  }
}

