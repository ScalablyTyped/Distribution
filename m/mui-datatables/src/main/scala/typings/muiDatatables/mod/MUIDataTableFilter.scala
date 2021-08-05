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
  
  inline def apply(filterData: js.Array[js.Any], options: MUIDataTableOptions): MUIDataTableFilter = {
    val __obj = js.Dynamic.literal(filterData = filterData.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableFilter]
  }
  
  extension [Self <: MUIDataTableFilter](x: Self) {
    
    inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setFilterData(value: js.Array[js.Any]): Self = StObject.set(x, "filterData", value.asInstanceOf[js.Any])
    
    inline def setFilterDataVarargs(value: js.Any*): Self = StObject.set(x, "filterData", js.Array(value :_*))
    
    inline def setFilterList(value: js.Array[js.Array[String]]): Self = StObject.set(x, "filterList", value.asInstanceOf[js.Any])
    
    inline def setFilterListUndefined: Self = StObject.set(x, "filterList", js.undefined)
    
    inline def setFilterListVarargs(value: js.Array[String]*): Self = StObject.set(x, "filterList", js.Array(value :_*))
    
    inline def setOnFilterReset(value: /* args */ js.Any => js.Any): Self = StObject.set(x, "onFilterReset", js.Any.fromFunction1(value))
    
    inline def setOnFilterResetUndefined: Self = StObject.set(x, "onFilterReset", js.undefined)
    
    inline def setOnFilterUpdate(value: /* args */ js.Any => js.Any): Self = StObject.set(x, "onFilterUpdate", js.Any.fromFunction1(value))
    
    inline def setOnFilterUpdateUndefined: Self = StObject.set(x, "onFilterUpdate", js.undefined)
    
    inline def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
