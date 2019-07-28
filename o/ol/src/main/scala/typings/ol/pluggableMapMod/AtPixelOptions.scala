package typings.ol.pluggableMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtPixelOptions extends js.Object {
  var hitTolerance: js.UndefOr[Double] = js.undefined
  def layerFilter(p0: typings.ol.layerLayerMod.default): Boolean
}

object AtPixelOptions {
  @scala.inline
  def apply(layerFilter: typings.ol.layerLayerMod.default => Boolean, hitTolerance: Int | Double = null): AtPixelOptions = {
    val __obj = js.Dynamic.literal(layerFilter = js.Any.fromFunction1(layerFilter))
    if (hitTolerance != null) __obj.updateDynamic("hitTolerance")(hitTolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtPixelOptions]
  }
}

