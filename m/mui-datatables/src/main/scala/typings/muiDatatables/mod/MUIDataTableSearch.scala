package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableSearch extends StObject {
  
  var classes: js.UndefOr[js.Object] = js.undefined
  
  var onHide: js.UndefOr[js.Function1[/* args */ js.Any, js.Any]] = js.undefined
  
  var onSearch: js.UndefOr[js.Function1[/* args */ js.Any, js.Any]] = js.undefined
  
  var options: js.UndefOr[MUIDataTableOptions] = js.undefined
  
  var searchText: js.UndefOr[String] = js.undefined
}
object MUIDataTableSearch {
  
  inline def apply(): MUIDataTableSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableSearch]
  }
  
  extension [Self <: MUIDataTableSearch](x: Self) {
    
    inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setOnHide(value: /* args */ js.Any => js.Any): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnSearch(value: /* args */ js.Any => js.Any): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
    
    inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
    
    inline def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    inline def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
  }
}
