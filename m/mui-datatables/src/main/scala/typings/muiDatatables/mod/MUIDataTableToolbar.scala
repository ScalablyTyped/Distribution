package typings.muiDatatables.mod

import typings.muiDatatables.anon.Data
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableToolbar extends StObject {
  
  var classes: js.UndefOr[js.Object] = js.undefined
  
  var columnOrder: js.UndefOr[js.Array[Double]] = js.undefined
  
  var columns: js.Array[MUIDataTableColumnDef]
  
  var data: js.UndefOr[js.Array[MUIDataTableData]] = js.undefined
  
  var displayData: js.UndefOr[DisplayData] = js.undefined
  
  var filterData: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
  
  var filterList: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  var filterUpdate: js.UndefOr[js.Function1[/* args */ js.Any, js.Any]] = js.undefined
  
  var options: js.UndefOr[MUIDataTableOptions] = js.undefined
  
  var resetFilters: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var searchClose: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var searchText: js.UndefOr[ReactNode] = js.undefined
  
  var searchTextUpdate: js.UndefOr[js.Function1[/* args */ js.Any, js.Any]] = js.undefined
  
  var setTableActions: js.UndefOr[js.Function1[/* args */ js.Any, js.Any]] = js.undefined
  
  var tableRef: js.UndefOr[js.Function1[/* args */ js.Any, js.Any]] = js.undefined
  
  var title: js.UndefOr[ReactNode] = js.undefined
  
  var toggleViewColumn: js.UndefOr[js.Function1[/* a */ js.Any, js.Any]] = js.undefined
  
  var updateFilterByType: js.UndefOr[js.Function1[/* args */ js.Any, js.Any]] = js.undefined
}
object MUIDataTableToolbar {
  
  inline def apply(columns: js.Array[MUIDataTableColumnDef]): MUIDataTableToolbar = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableToolbar]
  }
  
  extension [Self <: MUIDataTableToolbar](x: Self) {
    
    inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColumnOrder(value: js.Array[Double]): Self = StObject.set(x, "columnOrder", value.asInstanceOf[js.Any])
    
    inline def setColumnOrderUndefined: Self = StObject.set(x, "columnOrder", js.undefined)
    
    inline def setColumnOrderVarargs(value: Double*): Self = StObject.set(x, "columnOrder", js.Array(value :_*))
    
    inline def setColumns(value: js.Array[MUIDataTableColumnDef]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: MUIDataTableColumnDef*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setData(value: js.Array[MUIDataTableData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: MUIDataTableData*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setDisplayData(value: DisplayData): Self = StObject.set(x, "displayData", value.asInstanceOf[js.Any])
    
    inline def setDisplayDataUndefined: Self = StObject.set(x, "displayData", js.undefined)
    
    inline def setDisplayDataVarargs(value: Data*): Self = StObject.set(x, "displayData", js.Array(value :_*))
    
    inline def setFilterData(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "filterData", value.asInstanceOf[js.Any])
    
    inline def setFilterDataUndefined: Self = StObject.set(x, "filterData", js.undefined)
    
    inline def setFilterDataVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "filterData", js.Array(value :_*))
    
    inline def setFilterList(value: js.Array[js.Array[String]]): Self = StObject.set(x, "filterList", value.asInstanceOf[js.Any])
    
    inline def setFilterListUndefined: Self = StObject.set(x, "filterList", js.undefined)
    
    inline def setFilterListVarargs(value: js.Array[String]*): Self = StObject.set(x, "filterList", js.Array(value :_*))
    
    inline def setFilterUpdate(value: /* args */ js.Any => js.Any): Self = StObject.set(x, "filterUpdate", js.Any.fromFunction1(value))
    
    inline def setFilterUpdateUndefined: Self = StObject.set(x, "filterUpdate", js.undefined)
    
    inline def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResetFilters(value: () => js.Any): Self = StObject.set(x, "resetFilters", js.Any.fromFunction0(value))
    
    inline def setResetFiltersUndefined: Self = StObject.set(x, "resetFilters", js.undefined)
    
    inline def setSearchClose(value: () => js.Any): Self = StObject.set(x, "searchClose", js.Any.fromFunction0(value))
    
    inline def setSearchCloseUndefined: Self = StObject.set(x, "searchClose", js.undefined)
    
    inline def setSearchText(value: ReactNode): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    inline def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    inline def setSearchTextUpdate(value: /* args */ js.Any => js.Any): Self = StObject.set(x, "searchTextUpdate", js.Any.fromFunction1(value))
    
    inline def setSearchTextUpdateUndefined: Self = StObject.set(x, "searchTextUpdate", js.undefined)
    
    inline def setSetTableActions(value: /* args */ js.Any => js.Any): Self = StObject.set(x, "setTableActions", js.Any.fromFunction1(value))
    
    inline def setSetTableActionsUndefined: Self = StObject.set(x, "setTableActions", js.undefined)
    
    inline def setTableRef(value: /* args */ js.Any => js.Any): Self = StObject.set(x, "tableRef", js.Any.fromFunction1(value))
    
    inline def setTableRefUndefined: Self = StObject.set(x, "tableRef", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setToggleViewColumn(value: /* a */ js.Any => js.Any): Self = StObject.set(x, "toggleViewColumn", js.Any.fromFunction1(value))
    
    inline def setToggleViewColumnUndefined: Self = StObject.set(x, "toggleViewColumn", js.undefined)
    
    inline def setUpdateFilterByType(value: /* args */ js.Any => js.Any): Self = StObject.set(x, "updateFilterByType", js.Any.fromFunction1(value))
    
    inline def setUpdateFilterByTypeUndefined: Self = StObject.set(x, "updateFilterByType", js.undefined)
  }
}
