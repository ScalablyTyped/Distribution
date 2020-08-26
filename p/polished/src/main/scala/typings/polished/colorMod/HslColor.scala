package typings.polished.colorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HslColor extends js.Object {
  var hue: Double = js.native
  var lightness: Double = js.native
  var saturation: Double = js.native
}

object HslColor {
  @scala.inline
  def apply(hue: Double, lightness: Double, saturation: Double): HslColor = {
    val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], lightness = lightness.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[HslColor]
  }
  @scala.inline
  implicit class HslColorOps[Self <: HslColor] (val x: Self) extends AnyVal {
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
    def setHue(value: Double): Self = this.set("hue", value.asInstanceOf[js.Any])
    @scala.inline
    def setLightness(value: Double): Self = this.set("lightness", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaturation(value: Double): Self = this.set("saturation", value.asInstanceOf[js.Any])
  }
  
}

