package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUpdatePropertyValueDelta
  extends IElementDelta
     with Delta {
  var deltaType: mendixmodelsdkLib.mendixmodelsdkLibStrings.UPDATE_PROPERTY_VALUE
  var mutator: Mutator
  var propertyName: java.lang.String
}

object IUpdatePropertyValueDelta {
  @scala.inline
  def apply(
    deltaType: mendixmodelsdkLib.mendixmodelsdkLibStrings.UPDATE_PROPERTY_VALUE,
    elementId: java.lang.String,
    mutator: Mutator,
    propertyName: java.lang.String,
    unitId: java.lang.String
  ): IUpdatePropertyValueDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType, elementId = elementId, mutator = mutator, propertyName = propertyName, unitId = unitId)
  
    __obj.asInstanceOf[IUpdatePropertyValueDelta]
  }
}

