package typings.nodeDashHueDashApi

import typings.nodeDashHueDashApi.nodeDashHueDashApiMod.ColorMode
import typings.nodeDashHueDashApi.nodeDashHueDashApiMod.LightAlert
import typings.nodeDashHueDashApi.nodeDashHueDashApiMod.LightEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alert extends js.Object {
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

object Anon_Alert {
  @scala.inline
  def apply(
    alert: LightAlert,
    bri: Double,
    on: Boolean,
    reachable: Boolean,
    colormode: ColorMode = null,
    ct: Int | Double = null,
    effect: LightEffect = null,
    hue: Int | Double = null,
    rgb: js.Array[Double] = null,
    sat: Int | Double = null,
    xy: js.Tuple2[Double, Double] = null
  ): Anon_Alert = {
    val __obj = js.Dynamic.literal(alert = alert, bri = bri, on = on, reachable = reachable)
    if (colormode != null) __obj.updateDynamic("colormode")(colormode)
    if (ct != null) __obj.updateDynamic("ct")(ct.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect)
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (rgb != null) __obj.updateDynamic("rgb")(rgb)
    if (sat != null) __obj.updateDynamic("sat")(sat.asInstanceOf[js.Any])
    if (xy != null) __obj.updateDynamic("xy")(xy)
    __obj.asInstanceOf[Anon_Alert]
  }
}

