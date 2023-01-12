package typings.openui5.anon

import typings.openui5.sapMIconTabFilterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousKey extends StObject {
  
  /**
    * The selected item
    */
  var item: js.UndefOr[default] = js.undefined
  
  /**
    * The key of the selected item
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The key of the previous selected item
    */
  var previousKey: js.UndefOr[String] = js.undefined
  
  /**
    * The selected item
    */
  var selectedItem: js.UndefOr[default] = js.undefined
  
  /**
    * The key of the selected item
    */
  var selectedKey: js.UndefOr[String] = js.undefined
}
object PreviousKey {
  
  inline def apply(): PreviousKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviousKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreviousKey] (val x: Self) extends AnyVal {
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setPreviousKey(value: String): Self = StObject.set(x, "previousKey", value.asInstanceOf[js.Any])
    
    inline def setPreviousKeyUndefined: Self = StObject.set(x, "previousKey", js.undefined)
    
    inline def setSelectedItem(value: default): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    inline def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
    
    inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
  }
}
