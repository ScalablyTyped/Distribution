package typings
package mendixmodelsdkLib.distCommonMod.commonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a size, e.g. of an entity box.
  */
trait ISize
  extends mendixmodelsdkLib.distSdkInternalDeltasDeltasMod._PrimitiveValue {
  var height: scala.Double
  var width: scala.Double
}

object ISize {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): ISize = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[ISize]
  }
}

