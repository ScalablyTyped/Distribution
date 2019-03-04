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
    val __obj = js.Dynamic.literal(bri = bri, colormode = colormode, ct = ct, effect = effect, hue = hue, on = on, sat = sat, xy = xy)
  
    __obj.asInstanceOf[Anon_Bri]
  }
}

