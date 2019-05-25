package typings
package olLib.geolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var projection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var tracking: js.UndefOr[scala.Boolean] = js.undefined
  var trackingOptions: js.UndefOr[stdLib.PositionOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    projection: olLib.projMod.ProjectionLike = null,
    tracking: js.UndefOr[scala.Boolean] = js.undefined,
    trackingOptions: stdLib.PositionOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(tracking)) __obj.updateDynamic("tracking")(tracking)
    if (trackingOptions != null) __obj.updateDynamic("trackingOptions")(trackingOptions)
    __obj.asInstanceOf[Options]
  }
}

