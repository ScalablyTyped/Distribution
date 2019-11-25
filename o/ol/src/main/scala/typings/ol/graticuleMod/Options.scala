package typings.ol.graticuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var intervals: js.UndefOr[js.Array[Double]] = js.undefined
  var latLabelFormatter: js.UndefOr[js.Function1[/* p0 */ Double, String]] = js.undefined
  var latLabelPosition: js.UndefOr[Double] = js.undefined
  var latLabelStyle: js.UndefOr[typings.ol.styleTextMod.default] = js.undefined
  var lonLabelFormatter: js.UndefOr[js.Function1[/* p0 */ Double, String]] = js.undefined
  var lonLabelPosition: js.UndefOr[Double] = js.undefined
  var lonLabelStyle: js.UndefOr[typings.ol.styleTextMod.default] = js.undefined
  var map: js.UndefOr[typings.ol.pluggableMapMod.default] = js.undefined
  var maxLines: js.UndefOr[Double] = js.undefined
  var showLabels: js.UndefOr[Boolean] = js.undefined
  var strokeStyle: js.UndefOr[typings.ol.styleStrokeMod.default] = js.undefined
  var targetSize: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    intervals: js.Array[Double] = null,
    latLabelFormatter: /* p0 */ Double => String = null,
    latLabelPosition: Int | Double = null,
    latLabelStyle: typings.ol.styleTextMod.default = null,
    lonLabelFormatter: /* p0 */ Double => String = null,
    lonLabelPosition: Int | Double = null,
    lonLabelStyle: typings.ol.styleTextMod.default = null,
    map: typings.ol.pluggableMapMod.default = null,
    maxLines: Int | Double = null,
    showLabels: js.UndefOr[Boolean] = js.undefined,
    strokeStyle: typings.ol.styleStrokeMod.default = null,
    targetSize: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (intervals != null) __obj.updateDynamic("intervals")(intervals.asInstanceOf[js.Any])
    if (latLabelFormatter != null) __obj.updateDynamic("latLabelFormatter")(js.Any.fromFunction1(latLabelFormatter))
    if (latLabelPosition != null) __obj.updateDynamic("latLabelPosition")(latLabelPosition.asInstanceOf[js.Any])
    if (latLabelStyle != null) __obj.updateDynamic("latLabelStyle")(latLabelStyle.asInstanceOf[js.Any])
    if (lonLabelFormatter != null) __obj.updateDynamic("lonLabelFormatter")(js.Any.fromFunction1(lonLabelFormatter))
    if (lonLabelPosition != null) __obj.updateDynamic("lonLabelPosition")(lonLabelPosition.asInstanceOf[js.Any])
    if (lonLabelStyle != null) __obj.updateDynamic("lonLabelStyle")(lonLabelStyle.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (targetSize != null) __obj.updateDynamic("targetSize")(targetSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

