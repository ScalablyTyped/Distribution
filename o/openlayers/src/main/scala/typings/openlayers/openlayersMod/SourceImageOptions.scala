package typings.openlayers.openlayersMod

import typings.openlayers.openlayersMod.olxNs.LogoOptions
import typings.openlayers.openlayersMod.sourceNs.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceImageOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var projection: ProjectionLike
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  var state: js.UndefOr[State] = js.undefined
}

object SourceImageOptions {
  @scala.inline
  def apply(
    projection: ProjectionLike,
    attributions: AttributionLike = null,
    extent: Extent = null,
    logo: String | LogoOptions = null,
    resolutions: js.Array[Double] = null,
    state: State = null
  ): SourceImageOptions = {
    val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[SourceImageOptions]
  }
}

