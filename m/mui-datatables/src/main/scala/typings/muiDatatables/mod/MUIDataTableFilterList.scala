package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableFilterList extends js.Object {
  
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
  implicit class MUIDataTableFilterListOps[Self <: MUIDataTableFilterList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilterListVarargs(value: js.Array[String]*): Self = this.set("filterList", js.Array(value :_*))
    
    @scala.inline
    def setFilterList(value: js.Array[js.Array[String]]): Self = this.set("filterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClasses(value: js.Object): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setColumnNamesVarargs(value: typings.muiDatatables.anon.FilterType*): Self = this.set("columnNames", js.Array(value :_*))
    
    @scala.inline
    def setColumnNames(value: js.Array[typings.muiDatatables.anon.FilterType]): Self = this.set("columnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnNames: Self = this.set("columnNames", js.undefined)
    
    @scala.inline
    def setCustomFilterListUpdateVarargs(value: js.Any*): Self = this.set("customFilterListUpdate", js.Array(value :_*))
    
    @scala.inline
    def setCustomFilterListUpdate(value: js.Array[_]): Self = this.set("customFilterListUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFilterListUpdate: Self = this.set("customFilterListUpdate", js.undefined)
    
    @scala.inline
    def setFilterListRenderers(value: /* e */ js.Any => js.Array[_]): Self = this.set("filterListRenderers", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilterListRenderers: Self = this.set("filterListRenderers", js.undefined)
    
    @scala.inline
    def setFilterUpdate(value: /* args */ js.Any => _): Self = this.set("filterUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilterUpdate: Self = this.set("filterUpdate", js.undefined)
    
    @scala.inline
    def setServerSideFilterList(value: js.Any): Self = this.set("serverSideFilterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSideFilterList: Self = this.set("serverSideFilterList", js.undefined)
  }
}
