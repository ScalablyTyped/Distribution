package typings.openlayers.mod.olx.layer

import typings.openlayers.mod.Collection
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.layer.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends js.Object {
  var extent: js.UndefOr[Extent_] = js.undefined
  var layers: js.UndefOr[js.Array[Base] | Collection[Base]] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    extent: Extent_ = null,
    layers: js.Array[Base] | Collection[Base] = null,
    maxResolution: js.UndefOr[Double] = js.undefined,
    minResolution: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): GroupOptions = {
    val __obj = js.Dynamic.literal()
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResolution)) __obj.updateDynamic("maxResolution")(maxResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minResolution)) __obj.updateDynamic("minResolution")(minResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
}

