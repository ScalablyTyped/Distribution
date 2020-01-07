package typings.ol.pluggableMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtPixelOptions extends js.Object {
  var checkWrapped: js.UndefOr[Boolean] = js.undefined
  var hitTolerance: js.UndefOr[Double] = js.undefined
  var layerFilter: js.UndefOr[
    js.Function1[
      /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
      Boolean
    ]
  ] = js.undefined
}

object AtPixelOptions {
  @scala.inline
  def apply(
    checkWrapped: js.UndefOr[Boolean] = js.undefined,
    hitTolerance: Int | Double = null,
    layerFilter: /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default] => Boolean = null
  ): AtPixelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkWrapped)) __obj.updateDynamic("checkWrapped")(checkWrapped.asInstanceOf[js.Any])
    if (hitTolerance != null) __obj.updateDynamic("hitTolerance")(hitTolerance.asInstanceOf[js.Any])
    if (layerFilter != null) __obj.updateDynamic("layerFilter")(js.Any.fromFunction1(layerFilter))
    __obj.asInstanceOf[AtPixelOptions]
  }
}

