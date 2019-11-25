package typings.ol.formatFeatureMod

import typings.ol.extentMod.Extent
import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions extends js.Object {
  var dataProjection: js.UndefOr[ProjectionLike] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var featureProjection: js.UndefOr[ProjectionLike] = js.undefined
}

object ReadOptions {
  @scala.inline
  def apply(
    dataProjection: ProjectionLike = null,
    extent: Extent = null,
    featureProjection: ProjectionLike = null
  ): ReadOptions = {
    val __obj = js.Dynamic.literal()
    if (dataProjection != null) __obj.updateDynamic("dataProjection")(dataProjection.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (featureProjection != null) __obj.updateDynamic("featureProjection")(featureProjection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOptions]
  }
}

