package typings
package olLib.formatGeoJSONMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dataProjection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var extractGeometryName: js.UndefOr[scala.Boolean] = js.undefined
  var featureProjection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var geometryName: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dataProjection: olLib.projMod.ProjectionLike = null,
    extractGeometryName: js.UndefOr[scala.Boolean] = js.undefined,
    featureProjection: olLib.projMod.ProjectionLike = null,
    geometryName: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dataProjection != null) __obj.updateDynamic("dataProjection")(dataProjection.asInstanceOf[js.Any])
    if (!js.isUndefined(extractGeometryName)) __obj.updateDynamic("extractGeometryName")(extractGeometryName)
    if (featureProjection != null) __obj.updateDynamic("featureProjection")(featureProjection.asInstanceOf[js.Any])
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName)
    __obj.asInstanceOf[Options]
  }
}

