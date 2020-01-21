package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.UPDATE_PROPERTY_VALUE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUpdatePropertyValueDelta
  extends IElementDelta
     with Delta {
  var deltaType: UPDATE_PROPERTY_VALUE
  var mutator: Mutator
  var propertyName: String
}

object IUpdatePropertyValueDelta {
  @scala.inline
  def apply(
    deltaType: UPDATE_PROPERTY_VALUE,
    elementId: String,
    mutator: Mutator,
    propertyName: String,
    unitId: String
  ): IUpdatePropertyValueDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], mutator = mutator.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUpdatePropertyValueDelta]
  }
}

