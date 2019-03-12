package typings
package openlayersLib.openlayersMod.olxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraticuleOptions extends js.Object {
  var latLabelFormatter: js.UndefOr[js.Function1[/* lat */ scala.Double, java.lang.String]] = js.undefined
  var latLabelPosition: js.UndefOr[scala.Double] = js.undefined
  var latLabelStyle: js.UndefOr[openlayersLib.openlayersMod.styleNs.Text] = js.undefined
  var lonLabelFormatter: js.UndefOr[js.Function1[/* lon */ scala.Double, java.lang.String]] = js.undefined
  var lonLabelPosition: js.UndefOr[scala.Double] = js.undefined
  var lonLabelStyle: js.UndefOr[openlayersLib.openlayersMod.styleNs.Text] = js.undefined
  var map: js.UndefOr[openlayersLib.openlayersMod.Map] = js.undefined
  var maxLines: js.UndefOr[scala.Double] = js.undefined
  var showLabels: js.UndefOr[scala.Boolean] = js.undefined
  var strokeStyle: js.UndefOr[openlayersLib.openlayersMod.styleNs.Stroke] = js.undefined
  var targetSize: js.UndefOr[scala.Double] = js.undefined
}

object GraticuleOptions {
  @scala.inline
  def apply(
    latLabelFormatter: /* lat */ scala.Double => java.lang.String = null,
    latLabelPosition: scala.Int | scala.Double = null,
    latLabelStyle: openlayersLib.openlayersMod.styleNs.Text = null,
    lonLabelFormatter: /* lon */ scala.Double => java.lang.String = null,
    lonLabelPosition: scala.Int | scala.Double = null,
    lonLabelStyle: openlayersLib.openlayersMod.styleNs.Text = null,
    map: openlayersLib.openlayersMod.Map = null,
    maxLines: scala.Int | scala.Double = null,
    showLabels: js.UndefOr[scala.Boolean] = js.undefined,
    strokeStyle: openlayersLib.openlayersMod.styleNs.Stroke = null,
    targetSize: scala.Int | scala.Double = null
  ): GraticuleOptions = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[GraticuleOptions]
  }
}

