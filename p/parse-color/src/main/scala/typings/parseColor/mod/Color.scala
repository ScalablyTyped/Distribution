package typings.parseColor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var cmyk: js.Tuple4[Double, Double, Double, Double] = js.native
  var cmyka: js.Tuple5[Double, Double, Double, Double, Double] = js.native
  var hex: String = js.native
  var hsl: js.Tuple3[Double, Double, Double] = js.native
  var hsla: js.Tuple4[Double, Double, Double, Double] = js.native
  var hsv: js.Tuple3[Double, Double, Double] = js.native
  var hsva: js.Tuple4[Double, Double, Double, Double] = js.native
  var keyword: String = js.native
  var rgb: js.Tuple3[Double, Double, Double] = js.native
  var rgba: js.Tuple4[Double, Double, Double, Double] = js.native
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
    val __obj = js.Dynamic.literal(cmyk = cmyk.asInstanceOf[js.Any], cmyka = cmyka.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsla = hsla.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], hsva = hsva.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any], rgba = rgba.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCmyk(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("cmyk", value.asInstanceOf[js.Any])
    @scala.inline
    def setCmyka(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = this.set("cmyka", value.asInstanceOf[js.Any])
    @scala.inline
    def setHex(value: String): Self = this.set("hex", value.asInstanceOf[js.Any])
    @scala.inline
    def setHsl(value: js.Tuple3[Double, Double, Double]): Self = this.set("hsl", value.asInstanceOf[js.Any])
    @scala.inline
    def setHsla(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("hsla", value.asInstanceOf[js.Any])
    @scala.inline
    def setHsv(value: js.Tuple3[Double, Double, Double]): Self = this.set("hsv", value.asInstanceOf[js.Any])
    @scala.inline
    def setHsva(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("hsva", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    @scala.inline
    def setRgb(value: js.Tuple3[Double, Double, Double]): Self = this.set("rgb", value.asInstanceOf[js.Any])
    @scala.inline
    def setRgba(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("rgba", value.asInstanceOf[js.Any])
  }
  
}

