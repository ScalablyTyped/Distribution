package typings
package parseDashColorLib.parseDashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var cmyk: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  var cmyka: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]
  var hex: java.lang.String
  var hsl: js.Tuple3[scala.Double, scala.Double, scala.Double]
  var hsla: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  var hsv: js.Tuple3[scala.Double, scala.Double, scala.Double]
  var hsva: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  var keyword: java.lang.String
  var rgb: js.Tuple3[scala.Double, scala.Double, scala.Double]
  var rgba: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
}

object Color {
  @scala.inline
  def apply(
    cmyk: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    cmyka: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    hex: java.lang.String,
    hsl: js.Tuple3[scala.Double, scala.Double, scala.Double],
    hsla: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    hsv: js.Tuple3[scala.Double, scala.Double, scala.Double],
    hsva: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    keyword: java.lang.String,
    rgb: js.Tuple3[scala.Double, scala.Double, scala.Double],
    rgba: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  ): Color = {
    val __obj = js.Dynamic.literal(cmyk = cmyk, cmyka = cmyka, hex = hex, hsl = hsl, hsla = hsla, hsv = hsv, hsva = hsva, keyword = keyword, rgb = rgb, rgba = rgba)
  
    __obj.asInstanceOf[Color]
  }
}

