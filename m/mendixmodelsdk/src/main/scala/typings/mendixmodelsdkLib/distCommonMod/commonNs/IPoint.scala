package typings
package mendixmodelsdkLib.distCommonMod.commonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a point.
  */
trait IPoint
  extends mendixmodelsdkLib.distSdkInternalDeltasDeltasMod._PrimitiveValue {
  var x: scala.Double
  var y: scala.Double
}

object IPoint {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): IPoint = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[IPoint]
  }
}

