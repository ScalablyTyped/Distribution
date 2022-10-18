package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemData extends StObject {
  
  /**
    * index of the changed filterItem
    */
  var index: js.UndefOr[int] = js.undefined
  
  /**
    * JSON object of the changed filterItem instance (in case of reason=="removed" the itemData parameter does
    * not exist)
    */
  var itemData: js.UndefOr[js.Object] = js.undefined
  
  /**
    * key of the changed filterItem
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * reason for the changeFilterItem event. Value can be added, updated or removed.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object ItemData {
  
  inline def apply(): ItemData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemData]
  }
  
  extension [Self <: ItemData](x: Self) {
    
    inline def setIndex(value: int): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setItemData(value: js.Object): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
