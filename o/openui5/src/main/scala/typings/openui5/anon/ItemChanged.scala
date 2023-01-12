package typings.openui5.anon

import typings.openui5.sapMTabContainerItemMod.TabContainerItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemChanged extends StObject {
  
  /**
    * The item changed.
    */
  var itemChanged: js.UndefOr[TabContainerItem] = js.undefined
  
  /**
    * The key of the property.
    */
  var propertyKey: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the property.
    */
  var propertyValue: js.UndefOr[Any] = js.undefined
}
object ItemChanged {
  
  inline def apply(): ItemChanged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemChanged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemChanged] (val x: Self) extends AnyVal {
    
    inline def setItemChanged(value: TabContainerItem): Self = StObject.set(x, "itemChanged", value.asInstanceOf[js.Any])
    
    inline def setItemChangedUndefined: Self = StObject.set(x, "itemChanged", js.undefined)
    
    inline def setPropertyKey(value: String): Self = StObject.set(x, "propertyKey", value.asInstanceOf[js.Any])
    
    inline def setPropertyKeyUndefined: Self = StObject.set(x, "propertyKey", js.undefined)
    
    inline def setPropertyValue(value: Any): Self = StObject.set(x, "propertyValue", value.asInstanceOf[js.Any])
    
    inline def setPropertyValueUndefined: Self = StObject.set(x, "propertyValue", js.undefined)
  }
}
