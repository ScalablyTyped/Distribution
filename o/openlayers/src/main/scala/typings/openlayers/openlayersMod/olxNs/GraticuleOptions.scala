package typings.openlayers.openlayersMod.olxNs

import typings.openlayers.openlayersMod.Map
import typings.openlayers.openlayersMod.styleNs.Stroke
import typings.openlayers.openlayersMod.styleNs.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraticuleOptions extends js.Object {
  var latLabelFormatter: js.UndefOr[js.Function1[/* lat */ Double, String]] = js.undefined
  var latLabelPosition: js.UndefOr[Double] = js.undefined
  var latLabelStyle: js.UndefOr[Text] = js.undefined
  var lonLabelFormatter: js.UndefOr[js.Function1[/* lon */ Double, String]] = js.undefined
  var lonLabelPosition: js.UndefOr[Double] = js.undefined
  var lonLabelStyle: js.UndefOr[Text] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var maxLines: js.UndefOr[Double] = js.undefined
  var showLabels: js.UndefOr[Boolean] = js.undefined
  var strokeStyle: js.UndefOr[Stroke] = js.undefined
  var targetSize: js.UndefOr[Double] = js.undefined
}

object GraticuleOptions {
  @scala.inline
  def apply(
    latLabelFormatter: /* lat */ Double => String = null,
    latLabelPosition: Int | Double = null,
    latLabelStyle: Text = null,
    lonLabelFormatter: /* lon */ Double => String = null,
    lonLabelPosition: Int | Double = null,
    lonLabelStyle: Text = null,
    map: Map = null,
    maxLines: Int | Double = null,
    showLabels: js.UndefOr[Boolean] = js.undefined,
    strokeStyle: Stroke = null,
    targetSize: Int | Double = null
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

