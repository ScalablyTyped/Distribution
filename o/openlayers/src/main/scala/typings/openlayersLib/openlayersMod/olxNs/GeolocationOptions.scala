package typings
package openlayersLib.openlayersMod.olxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationOptions extends js.Object {
  var projection: openlayersLib.openlayersMod.ProjectionLike
  var tracking: js.UndefOr[scala.Boolean] = js.undefined
  var trackingOptions: js.UndefOr[stdLib.PositionOptions] = js.undefined
}

object GeolocationOptions {
  @scala.inline
  def apply(
    projection: openlayersLib.openlayersMod.ProjectionLike,
    tracking: js.UndefOr[scala.Boolean] = js.undefined,
    trackingOptions: stdLib.PositionOptions = null
  ): GeolocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(tracking)) __obj.updateDynamic("tracking")(tracking)
    if (trackingOptions != null) __obj.updateDynamic("trackingOptions")(trackingOptions)
    __obj.asInstanceOf[GeolocationOptions]
  }
}

