package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeleteElementDelta
  extends IElementDelta
     with Delta {
  var deltaType: mendixmodelsdkLib.mendixmodelsdkLibStrings.DELETE_ELEMENT
}

object IDeleteElementDelta {
  @scala.inline
  def apply(
    deltaType: mendixmodelsdkLib.mendixmodelsdkLibStrings.DELETE_ELEMENT,
    elementId: java.lang.String,
    unitId: java.lang.String
  ): IDeleteElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType, elementId = elementId, unitId = unitId)
  
    __obj.asInstanceOf[IDeleteElementDelta]
  }
}

