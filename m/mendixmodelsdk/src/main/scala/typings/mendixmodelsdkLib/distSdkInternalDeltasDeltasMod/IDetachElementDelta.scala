package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetachElementDelta
  extends IElementDelta
     with Delta {
  var deltaType: mendixmodelsdkLib.mendixmodelsdkLibStrings.DETACH_ELEMENT
}

object IDetachElementDelta {
  @scala.inline
  def apply(
    deltaType: mendixmodelsdkLib.mendixmodelsdkLibStrings.DETACH_ELEMENT,
    elementId: java.lang.String,
    unitId: java.lang.String
  ): IDetachElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType, elementId = elementId, unitId = unitId)
  
    __obj.asInstanceOf[IDetachElementDelta]
  }
}

