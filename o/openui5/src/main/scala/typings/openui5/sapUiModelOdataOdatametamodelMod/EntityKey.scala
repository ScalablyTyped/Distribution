package typings.openui5.sapUiModelOdataOdatametamodelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityKey extends StObject {
  
  /**
    * The references to the properties defining the entity type's key
    */
  var propertyRef: js.Array[PropertyRef]
}
object EntityKey {
  
  inline def apply(propertyRef: js.Array[PropertyRef]): EntityKey = {
    val __obj = js.Dynamic.literal(propertyRef = propertyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityKey] (val x: Self) extends AnyVal {
    
    inline def setPropertyRef(value: js.Array[PropertyRef]): Self = StObject.set(x, "propertyRef", value.asInstanceOf[js.Any])
    
    inline def setPropertyRefVarargs(value: PropertyRef*): Self = StObject.set(x, "propertyRef", js.Array(value*))
  }
}
