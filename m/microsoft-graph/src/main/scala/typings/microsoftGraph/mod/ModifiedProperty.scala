package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifiedProperty extends StObject {
  
  // Indicates the property name of the target attribute that was changed.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates the updated value for the propery.
  var newValue: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates the previous value (before the update) for the property.
  var oldValue: js.UndefOr[NullableOption[String]] = js.undefined
}
object ModifiedProperty {
  
  inline def apply(): ModifiedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifiedProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifiedProperty] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setNewValue(value: NullableOption[String]): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueNull: Self = StObject.set(x, "newValue", null)
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOldValue(value: NullableOption[String]): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueNull: Self = StObject.set(x, "oldValue", null)
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
