package typings
package nodeDashHueDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alert extends js.Object {
  var alert: nodeDashHueDashApiLib.nodeDashHueDashApiMod.LightAlert
  var bri: scala.Double
  var colormode: js.UndefOr[nodeDashHueDashApiLib.nodeDashHueDashApiMod.ColorMode] = js.undefined
  var ct: js.UndefOr[scala.Double] = js.undefined
  var effect: js.UndefOr[nodeDashHueDashApiLib.nodeDashHueDashApiMod.LightEffect] = js.undefined
  var hue: js.UndefOr[scala.Double] = js.undefined
  var on: scala.Boolean
  var reachable: scala.Boolean
  var rgb: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var sat: js.UndefOr[scala.Double] = js.undefined
  var xy: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
}

object Anon_Alert {
  @scala.inline
  def apply(
    alert: nodeDashHueDashApiLib.nodeDashHueDashApiMod.LightAlert,
    bri: scala.Double,
    on: scala.Boolean,
    reachable: scala.Boolean,
    colormode: nodeDashHueDashApiLib.nodeDashHueDashApiMod.ColorMode = null,
    ct: scala.Int | scala.Double = null,
    effect: nodeDashHueDashApiLib.nodeDashHueDashApiMod.LightEffect = null,
    hue: scala.Int | scala.Double = null,
    rgb: js.Array[scala.Double] = null,
    sat: scala.Int | scala.Double = null,
    xy: js.Tuple2[scala.Double, scala.Double] = null
  ): Anon_Alert = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alert")(alert)
    __obj.updateDynamic("bri")(bri)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("reachable")(reachable)
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

