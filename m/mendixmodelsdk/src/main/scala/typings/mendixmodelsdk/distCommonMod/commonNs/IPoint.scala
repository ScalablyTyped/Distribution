package typings.mendixmodelsdk.distCommonMod.commonNs

import typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod._PrimitiveValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a point.
  */
trait IPoint extends _PrimitiveValue {
  var x: Double
  var y: Double
}

object IPoint {
  @scala.inline
  def apply(x: Double, y: Double): IPoint = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[IPoint]
  }
}

