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
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], lightness = lightness.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HslaColor]
  }
}

