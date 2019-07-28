package typings.openlayers.openlayersMod.olxNs.formatNs

import typings.openlayers.openlayersMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONOptions extends js.Object {
  var defaultDataProjection: ProjectionLike
  var featureProjection: ProjectionLike
  var geometryName: js.UndefOr[String] = js.undefined
}

object GeoJSONOptions {
  @scala.inline
  def apply(
    defaultDataProjection: ProjectionLike,
    featureProjection: ProjectionLike,
    geometryName: String = null
  ): GeoJSONOptions = {
    val __obj = js.Dynamic.literal(defaultDataProjection = defaultDataProjection.asInstanceOf[js.Any], featureProjection = featureProjection.asInstanceOf[js.Any])
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName)
    __obj.asInstanceOf[GeoJSONOptions]
  }
}

