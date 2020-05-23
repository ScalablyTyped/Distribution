package typings.nodeHueApi.anon

import typings.nodeHueApi.mod.ColorMode
import typings.nodeHueApi.mod.LightEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bri extends js.Object {
  var bri: Double
  var colormode: ColorMode
  var ct: Double
  var effect: LightEffect
  var hue: Double
  var on: Boolean
  var sat: Double
  var xy: js.Tuple2[Double, Double]
}

object Bri {
  @scala.inline
  def apply(
    bri: Double,
    colormode: ColorMode,
    ct: Double,
    effect: LightEffect,
    hue: Double,
    on: Boolean,
    sat: Double,
    xy: js.Tuple2[Double, Double]
  ): Bri = {
    val __obj = js.Dynamic.literal(bri = bri.asInstanceOf[js.Any], colormode = colormode.asInstanceOf[js.Any], ct = ct.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], sat = sat.asInstanceOf[js.Any], xy = xy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bri]
  }
}

