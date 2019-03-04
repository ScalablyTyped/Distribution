package typings
package polishedLib.libTypesColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HslaColor extends js.Object {
  var alpha: scala.Double
  var hue: scala.Double
  var lightness: scala.Double
  var saturation: scala.Double
}

object HslaColor {
  @scala.inline
  def apply(alpha: scala.Double, hue: scala.Double, lightness: scala.Double, saturation: scala.Double): HslaColor = {
    val __obj = js.Dynamic.literal(alpha = alpha, hue = hue, lightness = lightness, saturation = saturation)
  
    __obj.asInstanceOf[HslaColor]
  }
}

