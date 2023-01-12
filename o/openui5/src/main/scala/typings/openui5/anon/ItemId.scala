package typings.openui5.anon

import typings.openui5.sapUiUnifiedMenuItemBaseMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemId extends StObject {
  
  /**
    * The selected item
    */
  var item: js.UndefOr[default] = js.undefined
  
  /**
    * The Id of the selected item
    */
  var itemId: js.UndefOr[String] = js.undefined
}
object ItemId {
  
  inline def apply(): ItemId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemId] (val x: Self) extends AnyVal {
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
