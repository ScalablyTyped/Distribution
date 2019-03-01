package typings
package nodeDashHueDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bri extends js.Object {
  var bri: scala.Double
  var colormode: nodeDashHueDashApiLib.nodeDashHueDashApiMod.ColorMode
  var ct: scala.Double
  var effect: nodeDashHueDashApiLib.nodeDashHueDashApiMod.LightEffect
  var hue: scala.Double
  var on: scala.Boolean
  var sat: scala.Double
  var xy: js.Tuple2[scala.Double, scala.Double]
}

object Anon_Bri {
  @scala.inline
  def apply(
    bri: scala.Double,
    colormode: nodeDashHueDashApiLib.nodeDashHueDashApiMod.ColorMode,
    ct: scala.Double,
    effect: nodeDashHueDashApiLib.nodeDashHueDashApiMod.LightEffect,
    hue: scala.Double,
    on: scala.Boolean,
    sat: scala.Double,
    xy: js.Tuple2[scala.Double, scala.Double]
  ): Anon_Bri = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bri")(bri)
    __obj.updateDynamic("colormode")(colormode)
    __obj.updateDynamic("ct")(ct)
    __obj.updateDynamic("effect")(effect)
    __obj.updateDynamic("hue")(hue)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("sat")(sat)
    __obj.updateDynamic("xy")(xy)
    __obj.asInstanceOf[Anon_Bri]
  }
}

