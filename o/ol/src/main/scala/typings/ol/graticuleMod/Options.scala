package typings.ol.graticuleMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var intervals: js.UndefOr[js.Array[Double]] = js.undefined
  var latLabelFormatter: js.UndefOr[js.Function1[/* p0 */ Double, String]] = js.undefined
  var latLabelPosition: js.UndefOr[Double] = js.undefined
  var latLabelStyle: js.UndefOr[typings.ol.textMod.default] = js.undefined
  var lonLabelFormatter: js.UndefOr[js.Function1[/* p0 */ Double, String]] = js.undefined
  var lonLabelPosition: js.UndefOr[Double] = js.undefined
  var lonLabelStyle: js.UndefOr[typings.ol.textMod.default] = js.undefined
  var maxLines: js.UndefOr[Double] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var showLabels: js.UndefOr[Boolean] = js.undefined
  var strokeStyle: js.UndefOr[typings.ol.strokeMod.default] = js.undefined
  var targetSize: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: String = null,
    extent: Extent = null,
    intervals: js.Array[Double] = null,
    latLabelFormatter: /* p0 */ Double => String = null,
    latLabelPosition: js.UndefOr[Double] = js.undefined,
    latLabelStyle: typings.ol.textMod.default = null,
    lonLabelFormatter: /* p0 */ Double => String = null,
    lonLabelPosition: js.UndefOr[Double] = js.undefined,
    lonLabelStyle: typings.ol.textMod.default = null,
    maxLines: js.UndefOr[Double] = js.undefined,
    maxResolution: js.UndefOr[Double] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minResolution: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    showLabels: js.UndefOr[Boolean] = js.undefined,
    strokeStyle: typings.ol.strokeMod.default = null,
    targetSize: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    wrapX: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (intervals != null) __obj.updateDynamic("intervals")(intervals.asInstanceOf[js.Any])
    if (latLabelFormatter != null) __obj.updateDynamic("latLabelFormatter")(js.Any.fromFunction1(latLabelFormatter))
    if (!js.isUndefined(latLabelPosition)) __obj.updateDynamic("latLabelPosition")(latLabelPosition.get.asInstanceOf[js.Any])
    if (latLabelStyle != null) __obj.updateDynamic("latLabelStyle")(latLabelStyle.asInstanceOf[js.Any])
    if (lonLabelFormatter != null) __obj.updateDynamic("lonLabelFormatter")(js.Any.fromFunction1(lonLabelFormatter))
    if (!js.isUndefined(lonLabelPosition)) __obj.updateDynamic("lonLabelPosition")(lonLabelPosition.get.asInstanceOf[js.Any])
    if (lonLabelStyle != null) __obj.updateDynamic("lonLabelStyle")(lonLabelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLines)) __obj.updateDynamic("maxLines")(maxLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResolution)) __obj.updateDynamic("maxResolution")(maxResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minResolution)) __obj.updateDynamic("minResolution")(minResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels.get.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(targetSize)) __obj.updateDynamic("targetSize")(targetSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

