package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableFilter extends StObject {
  
  var classes: js.UndefOr[js.Object] = js.undefined
  
  var filterData: js.Array[js.Any]
  
  var filterList: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  var onFilterReset: js.UndefOr[js.Function1[/* args */ js.Any, js.Any]] = js.undefined
  
  var onFilterUpdate: js.UndefOr[js.Function1[/* args */ js.Any, js.Any]] = js.undefined
  
  var options: MUIDataTableOptions
}
object MUIDataTableFilter {
  
  @scala.inline
  def apply(filterData: js.Array[js.Any], options: MUIDataTableOptions): MUIDataTableFilter = {
    val __obj = js.Dynamic.literal(filterData = filterData.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableFilter]
  }
  
  @scala.inline
  implicit class MUIDataTableFilterMutableBuilder[Self <: MUIDataTableFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setFilterData(value: js.Array[js.Any]): Self = StObject.set(x, "filterData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDataVarargs(value: js.Any*): Self = StObject.set(x, "filterData", js.Array(value :_*))
    
    @scala.inline
    def setFilterList(value: js.Array[js.Array[String]]): Self = StObject.set(x, "filterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterListUndefined: Self = StObject.set(x, "filterList", js.undefined)
    
    @scala.inline
    def setFilterListVarargs(value: js.Array[String]*): Self = StObject.set(x, "filterList", js.Array(value :_*))
    
    @scala.inline
    def setOnFilterReset(value: /* args */ js.Any => js.Any): Self = StObject.set(x, "onFilterReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFilterResetUndefined: Self = StObject.set(x, "onFilterReset", js.undefined)
    
    @scala.inline
    def setOnFilterUpdate(value: /* args */ js.Any => js.Any): Self = StObject.set(x, "onFilterUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFilterUpdateUndefined: Self = StObject.set(x, "onFilterUpdate", js.undefined)
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
