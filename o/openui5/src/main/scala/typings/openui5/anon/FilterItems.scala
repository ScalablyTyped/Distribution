package typings.openui5.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterItems extends StObject {
  
  /**
    * The selected filters items.
    */
  var filterItems: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * The currently selected `sap.ui.webc.fiori.SortItem` text attribute.
    */
  var sortBy: js.UndefOr[String] = js.undefined
  
  /**
    * The currently selected `sap.ui.webc.fiori.SortItem`.
    */
  var sortByItem: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * The selected sort order (true = descending, false = ascending).
    */
  var sortDescending: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current sort order selected.
    */
  var sortOrder: js.UndefOr[String] = js.undefined
}
object FilterItems {
  
  inline def apply(): FilterItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterItems] (val x: Self) extends AnyVal {
    
    inline def setFilterItems(value: js.Array[Any]): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
    
    inline def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
    
    inline def setFilterItemsVarargs(value: Any*): Self = StObject.set(x, "filterItems", js.Array(value*))
    
    inline def setSortBy(value: String): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByItem(value: HTMLElement): Self = StObject.set(x, "sortByItem", value.asInstanceOf[js.Any])
    
    inline def setSortByItemUndefined: Self = StObject.set(x, "sortByItem", js.undefined)
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortDescending(value: Boolean): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
    
    inline def setSortDescendingUndefined: Self = StObject.set(x, "sortDescending", js.undefined)
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
