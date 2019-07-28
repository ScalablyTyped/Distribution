package typings.parseDashColor.parseDashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var cmyk: js.Tuple4[Double, Double, Double, Double]
  var cmyka: js.Tuple5[Double, Double, Double, Double, Double]
  var hex: String
  var hsl: js.Tuple3[Double, Double, Double]
  var hsla: js.Tuple4[Double, Double, Double, Double]
  var hsv: js.Tuple3[Double, Double, Double]
  var hsva: js.Tuple4[Double, Double, Double, Double]
  var keyword: String
  var rgb: js.Tuple3[Double, Double, Double]
  var rgba: js.Tuple4[Double, Double, Double, Double]
}

object Color {
  @scala.inline
  def apply(
    cmyk: js.Tuple4[Double, Double, Double, Double],
    cmyka: js.Tuple5[Double, Double, Double, Double, Double],
    hex: String,
    hsl: js.Tuple3[Double, Double, Double],
    hsla: js.Tuple4[Double, Double, Double, Double],
    hsv: js.Tuple3[Double, Double, Double],
    hsva: js.Tuple4[Double, Double, Double, Double],
    keyword: String,
    rgb: js.Tuple3[Double, Double, Double],
    rgba: js.Tuple4[Double, Double, Double, Double]
  ): Color = {
    val __obj = js.Dynamic.literal(cmyk = cmyk, cmyka = cmyka, hex = hex, hsl = hsl, hsla = hsla, hsv = hsv, hsva = hsva, keyword = keyword, rgb = rgb, rgba = rgba)
  
    __obj.asInstanceOf[Color]
  }
}

