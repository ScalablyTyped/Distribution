package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroundOverlayOptions extends js.Object {
  var clickable: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[Map | Null] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object GroundOverlayOptions {
  @scala.inline
  def apply(clickable: js.UndefOr[Boolean] = js.undefined, map: Map = null, opacity: Int | Double = null): GroundOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (map != null) __obj.updateDynamic("map")(map)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroundOverlayOptions]
  }
}

