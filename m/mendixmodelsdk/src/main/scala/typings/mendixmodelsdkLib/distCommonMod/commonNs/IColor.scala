package typings
package mendixmodelsdkLib.distCommonMod.commonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of an RGB color.
  */
trait IColor
  extends mendixmodelsdkLib.distSdkInternalDeltasDeltasMod._PrimitiveValue {
  var blue: scala.Double
  var green: scala.Double
  var red: scala.Double
}

object IColor {
  @scala.inline
  def apply(blue: scala.Double, green: scala.Double, red: scala.Double): IColor = {
    val __obj = js.Dynamic.literal(blue = blue, green = green, red = red)
  
    __obj.asInstanceOf[IColor]
  }
}

