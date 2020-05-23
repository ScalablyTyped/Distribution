package typings.ol.viewMod

import typings.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitOptions extends js.Object {
  var callback: js.UndefOr[js.Function1[/* p0 */ Boolean, Unit]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* p0 */ Double, Double]] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var nearest: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[js.Array[Double]] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
}

object FitOptions {
  @scala.inline
  def apply(
    callback: /* p0 */ Boolean => Unit = null,
    duration: js.UndefOr[Double] = js.undefined,
    easing: /* p0 */ Double => Double = null,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minResolution: js.UndefOr[Double] = js.undefined,
    nearest: js.UndefOr[Boolean] = js.undefined,
    padding: js.Array[Double] = null,
    size: Size = null
  ): FitOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minResolution)) __obj.updateDynamic("minResolution")(minResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nearest)) __obj.updateDynamic("nearest")(nearest.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitOptions]
  }
}

