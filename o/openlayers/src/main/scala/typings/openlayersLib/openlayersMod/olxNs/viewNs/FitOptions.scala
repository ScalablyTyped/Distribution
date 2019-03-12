package typings
package openlayersLib.openlayersMod.olxNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitOptions extends js.Object {
  var callback: js.UndefOr[openlayersLib.openlayersMod.olxNs.animationNs.AnimateCallback] = js.undefined
  var constrainResolution: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ scala.Double, scala.Double]] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minResolution: js.UndefOr[scala.Double] = js.undefined
  var nearest: js.UndefOr[scala.Boolean] = js.undefined
  var padding: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var size: js.UndefOr[openlayersLib.openlayersMod.Size] = js.undefined
}

object FitOptions {
  @scala.inline
  def apply(
    callback: openlayersLib.openlayersMod.olxNs.animationNs.AnimateCallback = null,
    constrainResolution: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    easing: /* t */ scala.Double => scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minResolution: scala.Int | scala.Double = null,
    nearest: js.UndefOr[scala.Boolean] = js.undefined,
    padding: js.Array[scala.Double] = null,
    size: openlayersLib.openlayersMod.Size = null
  ): FitOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(constrainResolution)) __obj.updateDynamic("constrainResolution")(constrainResolution)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (!js.isUndefined(nearest)) __obj.updateDynamic("nearest")(nearest)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[FitOptions]
  }
}

