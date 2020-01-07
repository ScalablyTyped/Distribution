package typings.ol.layerGroupMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var extent: js.UndefOr[Extent] = js.undefined
  var layers: js.UndefOr[
    js.Array[typings.ol.layerBaseMod.default] | typings.ol.collectionMod.default[typings.ol.layerBaseMod.default]
  ] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    extent: Extent = null,
    layers: js.Array[typings.ol.layerBaseMod.default] | typings.ol.collectionMod.default[typings.ol.layerBaseMod.default] = null,
    maxResolution: Int | Double = null,
    maxZoom: Int | Double = null,
    minResolution: Int | Double = null,
    minZoom: Int | Double = null,
    opacity: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

