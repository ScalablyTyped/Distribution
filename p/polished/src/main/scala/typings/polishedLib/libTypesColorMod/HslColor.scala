package typings
package polishedLib.libTypesColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HslColor extends js.Object {
  var hue: scala.Double
  var lightness: scala.Double
  var saturation: scala.Double
}

object HslColor {
  @scala.inline
  def apply(hue: scala.Double, lightness: scala.Double, saturation: scala.Double): HslColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hue")(hue)
    __obj.updateDynamic("lightness")(lightness)
    __obj.updateDynamic("saturation")(saturation)
    __obj.asInstanceOf[HslColor]
  }
}

