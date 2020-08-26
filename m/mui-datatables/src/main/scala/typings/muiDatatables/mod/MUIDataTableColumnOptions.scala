package typings.muiDatatables.mod

import typings.muiDatatables.muiDatatablesStrings.`false`
import typings.muiDatatables.muiDatatablesStrings.`true`
import typings.muiDatatables.muiDatatablesStrings.asc
import typings.muiDatatables.muiDatatablesStrings.desc
import typings.muiDatatables.muiDatatablesStrings.excluded
import typings.muiDatatables.muiDatatablesStrings.none
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableColumnOptions extends js.Object {
  var customBodyRender: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* tableMeta */ MUIDataTableMeta, 
      /* updateValue */ js.Function1[/* value */ String, Unit], 
      String | ReactNode
    ]
  ] = js.native
  /**
    * Similar to and performing better than `customBodyRender`, however with the following caveats:
    * 1. The value returned from this function is not used for filtering, so the filter dialog will use the raw data from the data array.
    * 2. This method only gives you the dataIndex and rowIndex, leaving you to lookup the column value.
    */
  var customBodyRenderLite: js.UndefOr[js.Function2[/* dataIndex */ Double, /* rowIndex */ Double, String | ReactNode]] = js.native
  var customFilterListOptions: js.UndefOr[MUIDataTableCustomFilterListOptions] = js.native
  var customFilterListRender: js.UndefOr[js.Function1[/* value */ js.Any, String]] = js.native
  var customHeadRender: js.UndefOr[
    js.Function2[
      /* columnMeta */ MUIDataTableCustomHeadRenderer, 
      /* updateDirection */ js.Function1[/* params */ js.Any, _], 
      String | ReactNode
    ]
  ] = js.native
  var display: js.UndefOr[`true` | `false` | excluded] = js.native
  var download: js.UndefOr[Boolean] = js.native
  var empty: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[Boolean] = js.native
  var filterList: js.UndefOr[js.Array[String]] = js.native
  var filterOptions: js.UndefOr[MUIDataTableFilterOptions] = js.native
  var filterType: js.UndefOr[FilterType] = js.native
  var hint: js.UndefOr[String] = js.native
  var print: js.UndefOr[Boolean] = js.native
  var searchable: js.UndefOr[Boolean] = js.native
  var setCellHeaderProps: js.UndefOr[js.Function1[/* columnMeta */ MUIDataTableCustomHeadRenderer, js.Object]] = js.native
  var setCellProps: js.UndefOr[
    js.Function3[/* cellValue */ String, /* rowIndex */ Double, /* columnIndex */ Double, js.Object]
  ] = js.native
  var sort: js.UndefOr[Boolean] = js.native
  /** @deprecated use `sortOrder` instead */
  var sortDirection: js.UndefOr[asc | desc | none] = js.native
  var viewColumns: js.UndefOr[Boolean] = js.native
}

object MUIDataTableColumnOptions {
  @scala.inline
  def apply(): MUIDataTableColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableColumnOptions]
  }
  @scala.inline
  implicit class MUIDataTableColumnOptionsOps[Self <: MUIDataTableColumnOptions] (val x: Self) extends AnyVal {
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
    def setCustomBodyRender(
      value: (/* value */ js.Any, /* tableMeta */ MUIDataTableMeta, /* updateValue */ js.Function1[/* value */ String, Unit]) => String | ReactNode
    ): Self = this.set("customBodyRender", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCustomBodyRender: Self = this.set("customBodyRender", js.undefined)
    @scala.inline
    def setCustomBodyRenderLite(value: (/* dataIndex */ Double, /* rowIndex */ Double) => String | ReactNode): Self = this.set("customBodyRenderLite", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCustomBodyRenderLite: Self = this.set("customBodyRenderLite", js.undefined)
    @scala.inline
    def setCustomFilterListOptions(value: MUIDataTableCustomFilterListOptions): Self = this.set("customFilterListOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomFilterListOptions: Self = this.set("customFilterListOptions", js.undefined)
    @scala.inline
    def setCustomFilterListRender(value: /* value */ js.Any => String): Self = this.set("customFilterListRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomFilterListRender: Self = this.set("customFilterListRender", js.undefined)
    @scala.inline
    def setCustomHeadRender(
      value: (/* columnMeta */ MUIDataTableCustomHeadRenderer, /* updateDirection */ js.Function1[/* params */ js.Any, _]) => String | ReactNode
    ): Self = this.set("customHeadRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCustomHeadRender: Self = this.set("customHeadRender", js.undefined)
    @scala.inline
    def setDisplay(value: `true` | `false` | excluded): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setDownload(value: Boolean): Self = this.set("download", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    @scala.inline
    def setFilter(value: Boolean): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilterListVarargs(value: String*): Self = this.set("filterList", js.Array(value :_*))
    @scala.inline
    def setFilterList(value: js.Array[String]): Self = this.set("filterList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterList: Self = this.set("filterList", js.undefined)
    @scala.inline
    def setFilterOptions(value: MUIDataTableFilterOptions): Self = this.set("filterOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterOptions: Self = this.set("filterOptions", js.undefined)
    @scala.inline
    def setFilterType(value: FilterType): Self = this.set("filterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setPrint(value: Boolean): Self = this.set("print", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchable: Self = this.set("searchable", js.undefined)
    @scala.inline
    def setSetCellHeaderProps(value: /* columnMeta */ MUIDataTableCustomHeadRenderer => js.Object): Self = this.set("setCellHeaderProps", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCellHeaderProps: Self = this.set("setCellHeaderProps", js.undefined)
    @scala.inline
    def setSetCellProps(value: (/* cellValue */ String, /* rowIndex */ Double, /* columnIndex */ Double) => js.Object): Self = this.set("setCellProps", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSetCellProps: Self = this.set("setCellProps", js.undefined)
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setSortDirection(value: asc | desc | none): Self = this.set("sortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortDirection: Self = this.set("sortDirection", js.undefined)
    @scala.inline
    def setViewColumns(value: Boolean): Self = this.set("viewColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewColumns: Self = this.set("viewColumns", js.undefined)
  }
  
}

