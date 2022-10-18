package typings.openui5.anon

import typings.openui5.sapMP13nColumnsItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewItem extends StObject {
  
  /**
    * `columnsItem` that needs to be added in the model.
    */
  var newItem: js.UndefOr[default] = js.undefined
}
object NewItem {
  
  inline def apply(): NewItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewItem]
  }
  
  extension [Self <: NewItem](x: Self) {
    
    inline def setNewItem(value: default): Self = StObject.set(x, "newItem", value.asInstanceOf[js.Any])
    
    inline def setNewItemUndefined: Self = StObject.set(x, "newItem", js.undefined)
  }
}
