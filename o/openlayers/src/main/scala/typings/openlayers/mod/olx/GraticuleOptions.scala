package typings.openlayers.mod.olx

import typings.openlayers.mod.Map
import typings.openlayers.mod.style.Stroke
import typings.openlayers.mod.style.Text
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
    latLabelPosition: js.UndefOr[Double] = js.undefined,
    latLabelStyle: Text = null,
    lonLabelFormatter: /* lon */ Double => String = null,
    lonLabelPosition: js.UndefOr[Double] = js.undefined,
    lonLabelStyle: Text = null,
    map: Map = null,
    maxLines: js.UndefOr[Double] = js.undefined,
    showLabels: js.UndefOr[Boolean] = js.undefined,
    strokeStyle: Stroke = null,
    targetSize: js.UndefOr[Double] = js.undefined
  ): GraticuleOptions = {
    val __obj = js.Dynamic.literal()
    if (latLabelFormatter != null) __obj.updateDynamic("latLabelFormatter")(js.Any.fromFunction1(latLabelFormatter))
    if (!js.isUndefined(latLabelPosition)) __obj.updateDynamic("latLabelPosition")(latLabelPosition.get.asInstanceOf[js.Any])
    if (latLabelStyle != null) __obj.updateDynamic("latLabelStyle")(latLabelStyle.asInstanceOf[js.Any])
    if (lonLabelFormatter != null) __obj.updateDynamic("lonLabelFormatter")(js.Any.fromFunction1(lonLabelFormatter))
    if (!js.isUndefined(lonLabelPosition)) __obj.updateDynamic("lonLabelPosition")(lonLabelPosition.get.asInstanceOf[js.Any])
    if (lonLabelStyle != null) __obj.updateDynamic("lonLabelStyle")(lonLabelStyle.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLines)) __obj.updateDynamic("maxLines")(maxLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels.get.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(targetSize)) __obj.updateDynamic("targetSize")(targetSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraticuleOptions]
  }
}

