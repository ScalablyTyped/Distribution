package typings.openlayers.mod

import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.source.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceImageOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var extent: js.UndefOr[Extent_] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var projection: ProjectionLike
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  var state: js.UndefOr[State] = js.undefined
}

object SourceImageOptions {
  @scala.inline
  def apply(
    attributions: AttributionLike = null,
    extent: Extent_ = null,
    logo: String | LogoOptions = null,
    projection: ProjectionLike = null,
    resolutions: js.Array[Double] = null,
    state: State = null
  ): SourceImageOptions = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceImageOptions]
  }
}

