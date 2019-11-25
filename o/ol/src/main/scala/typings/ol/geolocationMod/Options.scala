package typings.ol.geolocationMod

import typings.ol.projMod.ProjectionLike
import typings.std.PositionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var tracking: js.UndefOr[Boolean] = js.undefined
  var trackingOptions: js.UndefOr[PositionOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    projection: ProjectionLike = null,
    tracking: js.UndefOr[Boolean] = js.undefined,
    trackingOptions: PositionOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(tracking)) __obj.updateDynamic("tracking")(tracking.asInstanceOf[js.Any])
    if (trackingOptions != null) __obj.updateDynamic("trackingOptions")(trackingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

