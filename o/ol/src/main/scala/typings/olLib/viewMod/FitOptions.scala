package typings
package olLib.viewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitOptions extends js.Object {
  var callback: js.UndefOr[js.Function1[/* p0 */ scala.Boolean, scala.Unit]] = js.undefined
  var constrainResolution: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* p0 */ scala.Double, scala.Double]] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minResolution: js.UndefOr[scala.Double] = js.undefined
  var nearest: js.UndefOr[scala.Boolean] = js.undefined
  var padding: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var size: js.UndefOr[olLib.sizeMod.Size] = js.undefined
}

object FitOptions {
  @scala.inline
  def apply(
    callback: /* p0 */ scala.Boolean => scala.Unit = null,
    constrainResolution: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    easing: /* p0 */ scala.Double => scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minResolution: scala.Int | scala.Double = null,
    nearest: js.UndefOr[scala.Boolean] = js.undefined,
    padding: js.Array[scala.Double] = null,
    size: olLib.sizeMod.Size = null
  ): FitOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
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

