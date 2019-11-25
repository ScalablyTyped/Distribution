package typings.ol.formatGeoJSONMod

import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dataProjection: js.UndefOr[ProjectionLike] = js.undefined
  var extractGeometryName: js.UndefOr[Boolean] = js.undefined
  var featureProjection: js.UndefOr[ProjectionLike] = js.undefined
  var geometryName: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dataProjection: ProjectionLike = null,
    extractGeometryName: js.UndefOr[Boolean] = js.undefined,
    featureProjection: ProjectionLike = null,
    geometryName: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dataProjection != null) __obj.updateDynamic("dataProjection")(dataProjection.asInstanceOf[js.Any])
    if (!js.isUndefined(extractGeometryName)) __obj.updateDynamic("extractGeometryName")(extractGeometryName.asInstanceOf[js.Any])
    if (featureProjection != null) __obj.updateDynamic("featureProjection")(featureProjection.asInstanceOf[js.Any])
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

