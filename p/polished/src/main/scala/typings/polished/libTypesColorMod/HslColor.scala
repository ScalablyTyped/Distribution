package typings.polished.libTypesColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HslColor extends js.Object {
  var hue: Double
  var lightness: Double
  var saturation: Double
}

object HslColor {
  @scala.inline
  def apply(hue: Double, lightness: Double, saturation: Double): HslColor = {
    val __obj = js.Dynamic.literal(hue = hue, lightness = lightness, saturation = saturation)
  
    __obj.asInstanceOf[HslColor]
  }
}

