package typings
package olLib.pluggableMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtPixelOptions extends js.Object {
  var hitTolerance: js.UndefOr[scala.Double] = js.undefined
  def layerFilter(p0: olLib.layerLayerMod.default): scala.Boolean
}

object AtPixelOptions {
  @scala.inline
  def apply(
    layerFilter: olLib.layerLayerMod.default => scala.Boolean,
    hitTolerance: scala.Int | scala.Double = null
  ): AtPixelOptions = {
    val __obj = js.Dynamic.literal(layerFilter = js.Any.fromFunction1(layerFilter))
    if (hitTolerance != null) __obj.updateDynamic("hitTolerance")(hitTolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtPixelOptions]
  }
}

