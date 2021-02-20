package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableSearch extends StObject {
  
  var classes: js.UndefOr[js.Object] = js.native
  
  var onHide: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var onSearch: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var options: js.UndefOr[MUIDataTableOptions] = js.native
  
  var searchText: js.UndefOr[String] = js.native
}
object MUIDataTableSearch {
  
  @scala.inline
  def apply(): MUIDataTableSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableSearch]
  }
  
  @scala.inline
  implicit class MUIDataTableSearchMutableBuilder[Self <: MUIDataTableSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setOnHide(value: /* args */ js.Any => _): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnSearch(value: /* args */ js.Any => _): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
  }
}
