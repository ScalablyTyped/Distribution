package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableFilterList extends StObject {
  
  var classes: js.UndefOr[js.Object] = js.native
  
  var columnNames: js.UndefOr[js.Array[typings.muiDatatables.anon.FilterType]] = js.native
  
  var customFilterListUpdate: js.UndefOr[js.Array[_]] = js.native
  
  var filterList: js.Array[js.Array[String]] = js.native
  
  var filterListRenderers: js.UndefOr[js.Function1[/* e */ js.Any, js.Array[_]]] = js.native
  
  var filterUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var options: MUIDataTableOptions = js.native
  
  var serverSideFilterList: js.UndefOr[js.Any] = js.native
}
object MUIDataTableFilterList {
  
  @scala.inline
  def apply(filterList: js.Array[js.Array[String]], options: MUIDataTableOptions): MUIDataTableFilterList = {
    val __obj = js.Dynamic.literal(filterList = filterList.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableFilterList]
  }
  
  @scala.inline
  implicit class MUIDataTableFilterListMutableBuilder[Self <: MUIDataTableFilterList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setColumnNames(value: js.Array[typings.muiDatatables.anon.FilterType]): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNamesUndefined: Self = StObject.set(x, "columnNames", js.undefined)
    
    @scala.inline
    def setColumnNamesVarargs(value: typings.muiDatatables.anon.FilterType*): Self = StObject.set(x, "columnNames", js.Array(value :_*))
    
    @scala.inline
    def setCustomFilterListUpdate(value: js.Array[_]): Self = StObject.set(x, "customFilterListUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFilterListUpdateUndefined: Self = StObject.set(x, "customFilterListUpdate", js.undefined)
    
    @scala.inline
    def setCustomFilterListUpdateVarargs(value: js.Any*): Self = StObject.set(x, "customFilterListUpdate", js.Array(value :_*))
    
    @scala.inline
    def setFilterList(value: js.Array[js.Array[String]]): Self = StObject.set(x, "filterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterListRenderers(value: /* e */ js.Any => js.Array[_]): Self = StObject.set(x, "filterListRenderers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterListRenderersUndefined: Self = StObject.set(x, "filterListRenderers", js.undefined)
    
    @scala.inline
    def setFilterListVarargs(value: js.Array[String]*): Self = StObject.set(x, "filterList", js.Array(value :_*))
    
    @scala.inline
    def setFilterUpdate(value: /* args */ js.Any => _): Self = StObject.set(x, "filterUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterUpdateUndefined: Self = StObject.set(x, "filterUpdate", js.undefined)
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideFilterList(value: js.Any): Self = StObject.set(x, "serverSideFilterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideFilterListUndefined: Self = StObject.set(x, "serverSideFilterList", js.undefined)
  }
}
