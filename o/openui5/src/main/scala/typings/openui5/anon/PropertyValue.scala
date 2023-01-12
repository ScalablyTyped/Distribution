package typings.openui5.anon

import typings.openui5.sapMViewSettingsItemMod.ViewSettingsItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyValue extends StObject {
  
  /**
    * Instance of the item that changed.
    */
  var changedItem: js.UndefOr[ViewSettingsItem] = js.undefined
  
  /**
    * Key of the changed property.
    */
  var propertyKey: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the changed property.
    */
  var propertyValue: js.UndefOr[Any] = js.undefined
}
object PropertyValue {
  
  inline def apply(): PropertyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyValue] (val x: Self) extends AnyVal {
    
    inline def setChangedItem(value: ViewSettingsItem): Self = StObject.set(x, "changedItem", value.asInstanceOf[js.Any])
    
    inline def setChangedItemUndefined: Self = StObject.set(x, "changedItem", js.undefined)
    
    inline def setPropertyKey(value: String): Self = StObject.set(x, "propertyKey", value.asInstanceOf[js.Any])
    
    inline def setPropertyKeyUndefined: Self = StObject.set(x, "propertyKey", js.undefined)
    
    inline def setPropertyValue(value: Any): Self = StObject.set(x, "propertyValue", value.asInstanceOf[js.Any])
    
    inline def setPropertyValueUndefined: Self = StObject.set(x, "propertyValue", js.undefined)
  }
}
