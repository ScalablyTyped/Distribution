package typings.openlayers.openlayersMod.olx.format

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
    defaultDataProjection: ProjectionLike = null,
    featureProjection: ProjectionLike = null,
    geometryName: String = null
  ): GeoJSONOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultDataProjection != null) __obj.updateDynamic("defaultDataProjection")(defaultDataProjection.asInstanceOf[js.Any])
    if (featureProjection != null) __obj.updateDynamic("featureProjection")(featureProjection.asInstanceOf[js.Any])
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName)
    __obj.asInstanceOf[GeoJSONOptions]
  }
}

