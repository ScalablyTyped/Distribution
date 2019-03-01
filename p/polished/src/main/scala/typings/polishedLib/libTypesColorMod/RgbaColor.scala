package typings
package polishedLib.libTypesColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbaColor extends js.Object {
  var alpha: scala.Double
  var blue: scala.Double
  var green: scala.Double
  var red: scala.Double
}

object RgbaColor {
  @scala.inline
  def apply(alpha: scala.Double, blue: scala.Double, green: scala.Double, red: scala.Double): RgbaColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alpha")(alpha)
    __obj.updateDynamic("blue")(blue)
    __obj.updateDynamic("green")(green)
    __obj.updateDynamic("red")(red)
    __obj.asInstanceOf[RgbaColor]
  }
}

