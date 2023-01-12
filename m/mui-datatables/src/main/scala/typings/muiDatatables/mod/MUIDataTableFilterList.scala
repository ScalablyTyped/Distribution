package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableFilterList extends StObject {
  
  var classes: js.UndefOr[js.Object] = js.undefined
  
  var columnNames: js.UndefOr[js.Array[typings.muiDatatables.anon.FilterType]] = js.undefined
  
  var customFilterListUpdate: js.UndefOr[js.Array[Any]] = js.undefined
  
  var filterList: js.Array[js.Array[String]]
  
  var filterListRenderers: js.UndefOr[js.Function1[/* e */ Any, js.Array[Any]]] = js.undefined
  
  var filterUpdate: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
  
  var options: MUIDataTableOptions
  
  var serverSideFilterList: js.UndefOr[Any] = js.undefined
}
object MUIDataTableFilterList {
  
  inline def apply(filterList: js.Array[js.Array[String]], options: MUIDataTableOptions): MUIDataTableFilterList = {
    val __obj = js.Dynamic.literal(filterList = filterList.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableFilterList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MUIDataTableFilterList] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColumnNames(value: js.Array[typings.muiDatatables.anon.FilterType]): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
    
    inline def setColumnNamesUndefined: Self = StObject.set(x, "columnNames", js.undefined)
    
    inline def setColumnNamesVarargs(value: typings.muiDatatables.anon.FilterType*): Self = StObject.set(x, "columnNames", js.Array(value*))
    
    inline def setCustomFilterListUpdate(value: js.Array[Any]): Self = StObject.set(x, "customFilterListUpdate", value.asInstanceOf[js.Any])
    
    inline def setCustomFilterListUpdateUndefined: Self = StObject.set(x, "customFilterListUpdate", js.undefined)
    
    inline def setCustomFilterListUpdateVarargs(value: Any*): Self = StObject.set(x, "customFilterListUpdate", js.Array(value*))
    
    inline def setFilterList(value: js.Array[js.Array[String]]): Self = StObject.set(x, "filterList", value.asInstanceOf[js.Any])
    
    inline def setFilterListRenderers(value: /* e */ Any => js.Array[Any]): Self = StObject.set(x, "filterListRenderers", js.Any.fromFunction1(value))
    
    inline def setFilterListRenderersUndefined: Self = StObject.set(x, "filterListRenderers", js.undefined)
    
    inline def setFilterListVarargs(value: js.Array[String]*): Self = StObject.set(x, "filterList", js.Array(value*))
    
    inline def setFilterUpdate(value: /* args */ Any => Any): Self = StObject.set(x, "filterUpdate", js.Any.fromFunction1(value))
    
    inline def setFilterUpdateUndefined: Self = StObject.set(x, "filterUpdate", js.undefined)
    
    inline def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setServerSideFilterList(value: Any): Self = StObject.set(x, "serverSideFilterList", value.asInstanceOf[js.Any])
    
    inline def setServerSideFilterListUndefined: Self = StObject.set(x, "serverSideFilterList", js.undefined)
  }
}
