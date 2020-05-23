package typings.openlayers.mod.olx.layer

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.source.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerOptions extends js.Object {
  var extent: js.UndefOr[Extent_] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[Source] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object LayerOptions {
  @scala.inline
  def apply(
    extent: Extent_ = null,
    maxResolution: js.UndefOr[Double] = js.undefined,
    minResolution: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    source: Source = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): LayerOptions = {
    val __obj = js.Dynamic.literal()
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResolution)) __obj.updateDynamic("maxResolution")(maxResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minResolution)) __obj.updateDynamic("minResolution")(minResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerOptions]
  }
}

