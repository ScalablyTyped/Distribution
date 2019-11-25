package typings.polished.libTypesColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbaColor extends js.Object {
  var alpha: Double
  var blue: Double
  var green: Double
  var red: Double
}

object RgbaColor {
  @scala.inline
  def apply(alpha: Double, blue: Double, green: Double, red: Double): RgbaColor = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RgbaColor]
  }
}

