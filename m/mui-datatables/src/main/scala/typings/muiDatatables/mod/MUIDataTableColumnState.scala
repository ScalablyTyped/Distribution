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

trait MUIDataTableColumnState extends MUIDataTableColumnOptions {
  var label: js.UndefOr[String] = js.undefined
  var name: String
}

object MUIDataTableColumnState {
  @scala.inline
  def apply(
    name: String,
    customBodyRender: (/* value */ js.Any, /* tableMeta */ MUIDataTableMeta, /* updateValue */ js.Function1[/* value */ String, Unit]) => String | ReactNode = null,
    customFilterListOptions: MUIDataTableCustomFilterListOptions = null,
    customFilterListRender: /* value */ js.Any => String = null,
    customHeadRender: (/* columnMeta */ MUIDataTableCustomHeadRenderer, /* updateDirection */ js.Function1[/* params */ js.Any, _]) => String | ReactNode = null,
    display: `true` | `false` | excluded = null,
    download: js.UndefOr[Boolean] = js.undefined,
    empty: js.UndefOr[Boolean] = js.undefined,
    filter: js.UndefOr[Boolean] = js.undefined,
    filterList: js.Array[String] = null,
    filterOptions: MUIDataTableFilterOptions = null,
    filterType: FilterType = null,
    hint: String = null,
    label: String = null,
    print: js.UndefOr[Boolean] = js.undefined,
    searchable: js.UndefOr[Boolean] = js.undefined,
    setCellHeaderProps: /* columnMeta */ MUIDataTableCustomHeadRenderer => js.Object = null,
    setCellProps: (/* cellValue */ String, /* rowIndex */ Double, /* columnIndex */ Double) => js.Object = null,
    sort: js.UndefOr[Boolean] = js.undefined,
    sortDirection: asc | desc | none = null,
    viewColumns: js.UndefOr[Boolean] = js.undefined
  ): MUIDataTableColumnState = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (customBodyRender != null) __obj.updateDynamic("customBodyRender")(js.Any.fromFunction3(customBodyRender))
    if (customFilterListOptions != null) __obj.updateDynamic("customFilterListOptions")(customFilterListOptions.asInstanceOf[js.Any])
    if (customFilterListRender != null) __obj.updateDynamic("customFilterListRender")(js.Any.fromFunction1(customFilterListRender))
    if (customHeadRender != null) __obj.updateDynamic("customHeadRender")(js.Any.fromFunction2(customHeadRender))
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download.get.asInstanceOf[js.Any])
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.get.asInstanceOf[js.Any])
    if (filterList != null) __obj.updateDynamic("filterList")(filterList.asInstanceOf[js.Any])
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print.get.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable.get.asInstanceOf[js.Any])
    if (setCellHeaderProps != null) __obj.updateDynamic("setCellHeaderProps")(js.Any.fromFunction1(setCellHeaderProps))
    if (setCellProps != null) __obj.updateDynamic("setCellProps")(js.Any.fromFunction3(setCellProps))
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.get.asInstanceOf[js.Any])
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(viewColumns)) __obj.updateDynamic("viewColumns")(viewColumns.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableColumnState]
  }
}

