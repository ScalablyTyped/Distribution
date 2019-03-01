package typings
package polishedLib.libTypesColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbColor extends js.Object {
  var blue: scala.Double
  var green: scala.Double
  var red: scala.Double
}

object RgbColor {
  @scala.inline
  def apply(blue: scala.Double, green: scala.Double, red: scala.Double): RgbColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blue")(blue)
    __obj.updateDynamic("green")(green)
    __obj.updateDynamic("red")(red)
    __obj.asInstanceOf[RgbColor]
  }
}

