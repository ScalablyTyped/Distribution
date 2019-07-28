package typings.polished.libTypesColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HslaColor extends js.Object {
  var alpha: Double
  var hue: Double
  var lightness: Double
  var saturation: Double
}

object HslaColor {
  @scala.inline
  def apply(alpha: Double, hue: Double, lightness: Double, saturation: Double): HslaColor = {
    val __obj = js.Dynamic.literal(alpha = alpha, hue = hue, lightness = lightness, saturation = saturation)
  
    __obj.asInstanceOf[HslaColor]
  }
}

