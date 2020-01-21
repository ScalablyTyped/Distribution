package typings.mendixmodelsdk.commonMod.common

import typings.mendixmodelsdk.deltasDeltasMod._PrimitiveValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of an RGB color.
  */
trait IColor extends _PrimitiveValue {
  var blue: Double
  var green: Double
  var red: Double
}

object IColor {
  @scala.inline
  def apply(blue: Double, green: Double, red: Double): IColor = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IColor]
  }
}

