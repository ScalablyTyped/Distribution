package typings.nodeDashHueDashApi

import typings.nodeDashHueDashApi.nodeDashHueDashApiMod.ColorMode
import typings.nodeDashHueDashApi.nodeDashHueDashApiMod.LightEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bri extends js.Object {
  var bri: Double
  var colormode: ColorMode
  var ct: Double
  var effect: LightEffect
  var hue: Double
  var on: Boolean
  var sat: Double
  var xy: js.Tuple2[Double, Double]
}

object Anon_Bri {
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
  ): Anon_Bri = {
    val __obj = js.Dynamic.literal(bri = bri, colormode = colormode, ct = ct, effect = effect, hue = hue, on = on, sat = sat, xy = xy)
  
    __obj.asInstanceOf[Anon_Bri]
  }
}

