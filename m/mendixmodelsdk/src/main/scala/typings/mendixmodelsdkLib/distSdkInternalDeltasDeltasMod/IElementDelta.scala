package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IElementDelta extends IDelta {
  var elementId: java.lang.String
}

object IElementDelta {
  @scala.inline
  def apply(elementId: java.lang.String, unitId: java.lang.String): IElementDelta = {
    val __obj = js.Dynamic.literal(elementId = elementId, unitId = unitId)
  
    __obj.asInstanceOf[IElementDelta]
  }
}

