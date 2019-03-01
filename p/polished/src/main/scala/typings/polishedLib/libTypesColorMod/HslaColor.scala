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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alpha")(alpha)
    __obj.updateDynamic("hue")(hue)
    __obj.updateDynamic("lightness")(lightness)
    __obj.updateDynamic("saturation")(saturation)
    __obj.asInstanceOf[HslaColor]
  }
}

