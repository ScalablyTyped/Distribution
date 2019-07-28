package typings.polished.libTypesColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbColor extends js.Object {
  var blue: Double
  var green: Double
  var red: Double
}

object RgbColor {
  @scala.inline
  def apply(blue: Double, green: Double, red: Double): RgbColor = {
    val __obj = js.Dynamic.literal(blue = blue, green = green, red = red)
  
    __obj.asInstanceOf[RgbColor]
  }
}

