package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableToolbar extends js.Object {
  var classes: js.UndefOr[js.Object] = js.native
  var columns: js.Array[MUIDataTableColumnDef] = js.native
  var data: js.UndefOr[js.Array[_]] = js.native
  var filterData: js.UndefOr[js.Any] = js.native
  var filterList: js.UndefOr[js.Array[js.Array[String]]] = js.native
  var filterUpdate: js.UndefOr[js.Any] = js.native
  var options: js.UndefOr[js.Object] = js.native
  var resetFilters: js.UndefOr[js.Any] = js.native
  var searchTextUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var setTableActions: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var tableRef: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var title: js.UndefOr[js.Any] = js.native
  var toggleViewColumn: js.UndefOr[js.Any] = js.native
}

object MUIDataTableToolbar {
  @scala.inline
  def apply(columns: js.Array[MUIDataTableColumnDef]): MUIDataTableToolbar = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableToolbar]
  }
  @scala.inline
  implicit class MUIDataTableToolbarOps[Self <: MUIDataTableToolbar] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: MUIDataTableColumnDef*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[MUIDataTableColumnDef]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setClasses(value: js.Object): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFilterData(value: js.Any): Self = this.set("filterData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterData: Self = this.set("filterData", js.undefined)
    @scala.inline
    def setFilterListVarargs(value: js.Array[String]*): Self = this.set("filterList", js.Array(value :_*))
    @scala.inline
    def setFilterList(value: js.Array[js.Array[String]]): Self = this.set("filterList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterList: Self = this.set("filterList", js.undefined)
    @scala.inline
    def setFilterUpdate(value: js.Any): Self = this.set("filterUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterUpdate: Self = this.set("filterUpdate", js.undefined)
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setResetFilters(value: js.Any): Self = this.set("resetFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetFilters: Self = this.set("resetFilters", js.undefined)
    @scala.inline
    def setSearchTextUpdate(value: /* args */ js.Any => _): Self = this.set("searchTextUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSearchTextUpdate: Self = this.set("searchTextUpdate", js.undefined)
    @scala.inline
    def setSetTableActions(value: /* args */ js.Any => _): Self = this.set("setTableActions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTableActions: Self = this.set("setTableActions", js.undefined)
    @scala.inline
    def setTableRef(value: /* args */ js.Any => _): Self = this.set("tableRef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTableRef: Self = this.set("tableRef", js.undefined)
    @scala.inline
    def setTitle(value: js.Any): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setToggleViewColumn(value: js.Any): Self = this.set("toggleViewColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleViewColumn: Self = this.set("toggleViewColumn", js.undefined)
  }
  
}

