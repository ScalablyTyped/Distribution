package typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDelta extends js.Object {
  /**
    * The ID of the unit (containing an element or property value) to which the delta is to be applied.
    */
  var unitId: String
}

object IDelta {
  @scala.inline
  def apply(unitId: String): IDelta = {
    val __obj = js.Dynamic.literal(unitId = unitId)
  
    __obj.asInstanceOf[IDelta]
  }
}

