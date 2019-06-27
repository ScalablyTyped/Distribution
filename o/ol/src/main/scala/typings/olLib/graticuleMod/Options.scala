package typings
package olLib.graticuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var intervals: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var latLabelFormatter: js.UndefOr[js.Function1[/* p0 */ scala.Double, java.lang.String]] = js.undefined
  var latLabelPosition: js.UndefOr[scala.Double] = js.undefined
  var latLabelStyle: js.UndefOr[olLib.styleTextMod.default] = js.undefined
  var lonLabelFormatter: js.UndefOr[js.Function1[/* p0 */ scala.Double, java.lang.String]] = js.undefined
  var lonLabelPosition: js.UndefOr[scala.Double] = js.undefined
  var lonLabelStyle: js.UndefOr[olLib.styleTextMod.default] = js.undefined
  var map: js.UndefOr[olLib.pluggableMapMod.default] = js.undefined
  var maxLines: js.UndefOr[scala.Double] = js.undefined
  var showLabels: js.UndefOr[scala.Boolean] = js.undefined
  var strokeStyle: js.UndefOr[olLib.styleStrokeMod.default] = js.undefined
  var targetSize: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    intervals: js.Array[scala.Double] = null,
    latLabelFormatter: /* p0 */ scala.Double => java.lang.String = null,
    latLabelPosition: scala.Int | scala.Double = null,
    latLabelStyle: olLib.styleTextMod.default = null,
    lonLabelFormatter: /* p0 */ scala.Double => java.lang.String = null,
    lonLabelPosition: scala.Int | scala.Double = null,
    lonLabelStyle: olLib.styleTextMod.default = null,
    map: olLib.pluggableMapMod.default = null,
    maxLines: scala.Int | scala.Double = null,
    showLabels: js.UndefOr[scala.Boolean] = js.undefined,
    strokeStyle: olLib.styleStrokeMod.default = null,
    targetSize: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (intervals != null) __obj.updateDynamic("intervals")(intervals)
    if (latLabelFormatter != null) __obj.updateDynamic("latLabelFormatter")(js.Any.fromFunction1(latLabelFormatter))
    if (latLabelPosition != null) __obj.updateDynamic("latLabelPosition")(latLabelPosition.asInstanceOf[js.Any])
    if (latLabelStyle != null) __obj.updateDynamic("latLabelStyle")(latLabelStyle)
    if (lonLabelFormatter != null) __obj.updateDynamic("lonLabelFormatter")(js.Any.fromFunction1(lonLabelFormatter))
    if (lonLabelPosition != null) __obj.updateDynamic("lonLabelPosition")(lonLabelPosition.asInstanceOf[js.Any])
    if (lonLabelStyle != null) __obj.updateDynamic("lonLabelStyle")(lonLabelStyle)
    if (map != null) __obj.updateDynamic("map")(map)
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels)
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    if (targetSize != null) __obj.updateDynamic("targetSize")(targetSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

