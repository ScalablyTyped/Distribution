package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.UPDATE_PROPERTY_VALUE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUpdatePropertyValueDelta
  extends IElementDelta
     with Delta {
  var deltaType: UPDATE_PROPERTY_VALUE = js.native
  var mutator: Mutator = js.native
  var propertyName: String = js.native
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
  @scala.inline
  implicit class IUpdatePropertyValueDeltaOps[Self <: IUpdatePropertyValueDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeltaType(value: UPDATE_PROPERTY_VALUE): Self = this.set("deltaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMutator(value: Mutator): Self = this.set("mutator", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
  }
  
}

