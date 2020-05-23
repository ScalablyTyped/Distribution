package typings.nodeHueApi.anon

import typings.nodeHueApi.mod.ColorMode
import typings.nodeHueApi.mod.LightAlert
import typings.nodeHueApi.mod.LightEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alert extends js.Object {
  var alert: LightAlert
  var bri: Double
  var colormode: js.UndefOr[ColorMode] = js.undefined
  var ct: js.UndefOr[Double] = js.undefined
  var effect: js.UndefOr[LightEffect] = js.undefined
  var hue: js.UndefOr[Double] = js.undefined
  var on: Boolean
  var reachable: Boolean
  var rgb: js.UndefOr[js.Array[Double]] = js.undefined
  var sat: js.UndefOr[Double] = js.undefined
  var xy: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object Alert {
  @scala.inline
  def apply(
    alert: LightAlert,
    bri: Double,
    on: Boolean,
    reachable: Boolean,
    colormode: ColorMode = null,
    ct: js.UndefOr[Double] = js.undefined,
    effect: LightEffect = null,
    hue: js.UndefOr[Double] = js.undefined,
    rgb: js.Array[Double] = null,
    sat: js.UndefOr[Double] = js.undefined,
    xy: js.Tuple2[Double, Double] = null
  ): Alert = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], bri = bri.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], reachable = reachable.asInstanceOf[js.Any])
    if (colormode != null) __obj.updateDynamic("colormode")(colormode.asInstanceOf[js.Any])
    if (!js.isUndefined(ct)) __obj.updateDynamic("ct")(ct.get.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(hue)) __obj.updateDynamic("hue")(hue.get.asInstanceOf[js.Any])
    if (rgb != null) __obj.updateDynamic("rgb")(rgb.asInstanceOf[js.Any])
    if (!js.isUndefined(sat)) __obj.updateDynamic("sat")(sat.get.asInstanceOf[js.Any])
    if (xy != null) __obj.updateDynamic("xy")(xy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
}

