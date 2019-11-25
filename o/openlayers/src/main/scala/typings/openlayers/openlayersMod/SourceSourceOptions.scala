package typings.openlayers.openlayersMod

import typings.openlayers.openlayersMod.olx.LogoOptions
import typings.openlayers.openlayersMod.source.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceSourceOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var projection: ProjectionLike
  var state: js.UndefOr[State] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object SourceSourceOptions {
  @scala.inline
  def apply(
    attributions: AttributionLike = null,
    logo: String | LogoOptions = null,
    projection: ProjectionLike = null,
    state: State = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): SourceSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSourceOptions]
  }
}

