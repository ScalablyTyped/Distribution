package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedItems extends StObject {
  
  /**
    * An array of the selected items.
    */
  var selectedItems: js.UndefOr[js.Array[Any]] = js.undefined
}
object SelectedItems {
  
  inline def apply(): SelectedItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedItems] (val x: Self) extends AnyVal {
    
    inline def setSelectedItems(value: js.Array[Any]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: Any*): Self = StObject.set(x, "selectedItems", js.Array(value*))
  }
}
