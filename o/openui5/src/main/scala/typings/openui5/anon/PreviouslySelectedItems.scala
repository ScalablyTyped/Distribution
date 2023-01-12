package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviouslySelectedItems extends StObject {
  
  /**
    * An array of the previously selected items.
    */
  var previouslySelectedItems: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * An array of the selected items.
    */
  var selectedItems: js.UndefOr[js.Array[Any]] = js.undefined
}
object PreviouslySelectedItems {
  
  inline def apply(): PreviouslySelectedItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviouslySelectedItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreviouslySelectedItems] (val x: Self) extends AnyVal {
    
    inline def setPreviouslySelectedItems(value: js.Array[Any]): Self = StObject.set(x, "previouslySelectedItems", value.asInstanceOf[js.Any])
    
    inline def setPreviouslySelectedItemsUndefined: Self = StObject.set(x, "previouslySelectedItems", js.undefined)
    
    inline def setPreviouslySelectedItemsVarargs(value: Any*): Self = StObject.set(x, "previouslySelectedItems", js.Array(value*))
    
    inline def setSelectedItems(value: js.Array[Any]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: Any*): Self = StObject.set(x, "selectedItems", js.Array(value*))
  }
}
