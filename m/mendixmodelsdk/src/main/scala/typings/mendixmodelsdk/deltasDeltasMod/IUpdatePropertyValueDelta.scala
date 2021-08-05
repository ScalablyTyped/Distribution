package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.UPDATE_PROPERTY_VALUE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUpdatePropertyValueDelta
  extends StObject
     with IElementDelta
     with Delta {
  
  var deltaType: UPDATE_PROPERTY_VALUE
  
  var mutator: Mutator
  
  var propertyName: String
}
object IUpdatePropertyValueDelta {
  
  inline def apply(elementId: String, mutator: Mutator, propertyName: String, unitId: String): IUpdatePropertyValueDelta = {
    val __obj = js.Dynamic.literal(deltaType = "UPDATE_PROPERTY_VALUE", elementId = elementId.asInstanceOf[js.Any], mutator = mutator.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdatePropertyValueDelta]
  }
  
  extension [Self <: IUpdatePropertyValueDelta](x: Self) {
    
    inline def setDeltaType(value: UPDATE_PROPERTY_VALUE): Self = StObject.set(x, "deltaType", value.asInstanceOf[js.Any])
    
    inline def setMutator(value: Mutator): Self = StObject.set(x, "mutator", value.asInstanceOf[js.Any])
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
  }
}
