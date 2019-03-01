package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDelta extends js.Object {
  /**
    * The ID of the unit (containing an element or property value) to which the delta is to be applied.
    */
  var unitId: java.lang.String
}

object IDelta {
  @scala.inline
  def apply(unitId: java.lang.String): IDelta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unitId")(unitId)
    __obj.asInstanceOf[IDelta]
  }
}

