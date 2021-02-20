package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.UPDATE_PROPERTY_VALUE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IUpdatePropertyValueDeltaMutableBuilder[Self <: IUpdatePropertyValueDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeltaType(value: UPDATE_PROPERTY_VALUE): Self = StObject.set(x, "deltaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutator(value: Mutator): Self = StObject.set(x, "mutator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
  }
}
