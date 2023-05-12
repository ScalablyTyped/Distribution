package typings.openui5.anon

import typings.openui5.sapUiBaseManagedObjectMod.ManagedObject
import typings.openui5.sapUiModelTypeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Property extends StObject {
  
  /**
    * ManagedObject instance whose property initiated the model update.
    */
  var element: js.UndefOr[ManagedObject] = js.undefined
  
  /**
    * New value (external representation) as propagated to the model.
    *
    * **Note: **the model might modify (normalize) the value again and this modification will be stored in
    * the ManagedObject. The 'newValue' parameter of this event contains the value **before** such a normalization.
    */
  var newValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Old value (external representation) as previously stored in the ManagedObject.
    */
  var oldValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Name of the property for which the bound model property has been updated.
    */
  var property: js.UndefOr[String] = js.undefined
  
  /**
    * Data type used in the binding.
    */
  var `type`: js.UndefOr[default] = js.undefined
}
object Property {
  
  inline def apply(): Property = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Property]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
    
    inline def setElement(value: ManagedObject): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setType(value: default): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
