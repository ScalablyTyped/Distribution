package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAttributeValuesItem extends StObject {
  
  // Determines whether the value is set as the default.
  var isDefault: js.UndefOr[Boolean] = js.undefined
  
  // The display name of the property displayed to the user in the user flow.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The value that is set when this item is selected.
  var value: js.UndefOr[NullableOption[String]] = js.undefined
}
object UserAttributeValuesItem {
  
  inline def apply(): UserAttributeValuesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAttributeValuesItem]
  }
  
  extension [Self <: UserAttributeValuesItem](x: Self) {
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
