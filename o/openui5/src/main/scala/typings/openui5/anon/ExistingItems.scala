package typings.openui5.anon

import typings.openui5.sapMP13nColumnsItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExistingItems extends StObject {
  
  /**
    * Contains `columnsItems` that needs to be changed in the model. Deprecated as of version 1.50, replaced
    * by new parameter `items`.
    */
  var existingItems: js.UndefOr[js.Array[default]] = js.undefined
  
  /**
    * Array contains an object for each item in `items` aggregation enriched with index and visibility information.
    * The item order reflects the current order of columns in the panel.
    */
  var items: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  /**
    * Contains `columnsItems` that needs to be created in the model. Deprecated as of version 1.50, replaced
    * by new parameter `items`.
    */
  var newItems: js.UndefOr[js.Array[default]] = js.undefined
}
object ExistingItems {
  
  inline def apply(): ExistingItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExistingItems]
  }
  
  extension [Self <: ExistingItems](x: Self) {
    
    inline def setExistingItems(value: js.Array[default]): Self = StObject.set(x, "existingItems", value.asInstanceOf[js.Any])
    
    inline def setExistingItemsUndefined: Self = StObject.set(x, "existingItems", js.undefined)
    
    inline def setExistingItemsVarargs(value: default*): Self = StObject.set(x, "existingItems", js.Array(value*))
    
    inline def setItems(value: js.Array[js.Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: js.Object*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNewItems(value: js.Array[default]): Self = StObject.set(x, "newItems", value.asInstanceOf[js.Any])
    
    inline def setNewItemsUndefined: Self = StObject.set(x, "newItems", js.undefined)
    
    inline def setNewItemsVarargs(value: default*): Self = StObject.set(x, "newItems", js.Array(value*))
  }
}
