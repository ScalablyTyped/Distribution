package typings.openlayers.mod.olx.view

import typings.openlayers.mod.Size
import typings.openlayers.mod.olx.animation.AnimateCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitOptions extends js.Object {
  var callback: js.UndefOr[AnimateCallback] = js.undefined
  var constrainResolution: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var nearest: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[js.Array[Double]] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
}

object FitOptions {
  @scala.inline
  def apply(
    callback: /* completed */ Boolean => Unit = null,
    constrainResolution: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easing: /* t */ Double => Double = null,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minResolution: js.UndefOr[Double] = js.undefined,
    nearest: js.UndefOr[Boolean] = js.undefined,
    padding: js.Array[Double] = null,
    size: Size = null
  ): FitOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(constrainResolution)) __obj.updateDynamic("constrainResolution")(constrainResolution.get.asInstanceOf[js.Any])
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

