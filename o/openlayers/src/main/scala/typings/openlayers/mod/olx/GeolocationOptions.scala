package typings.openlayers.mod.olx

import typings.openlayers.mod.ProjectionLike
import typings.std.PositionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationOptions extends js.Object {
  var projection: ProjectionLike
  var tracking: js.UndefOr[Boolean] = js.undefined
  var trackingOptions: js.UndefOr[PositionOptions] = js.undefined
}

object GeolocationOptions {
  @scala.inline
  def apply(
    projection: ProjectionLike = null,
    tracking: js.UndefOr[Boolean] = js.undefined,
    trackingOptions: PositionOptions = null
  ): GeolocationOptions = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(tracking)) __obj.updateDynamic("tracking")(tracking.asInstanceOf[js.Any])
    if (trackingOptions != null) __obj.updateDynamic("trackingOptions")(trackingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationOptions]
  }
}

