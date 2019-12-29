package typings.muiDashDatatables.muiDashDatatablesMod

import typings.muiDashDatatables.muiDashDatatablesStrings.`false`
import typings.muiDashDatatables.muiDashDatatablesStrings.`true`
import typings.muiDashDatatables.muiDashDatatablesStrings.asc
import typings.muiDashDatatables.muiDashDatatablesStrings.desc
import typings.muiDashDatatables.muiDashDatatablesStrings.excluded
import typings.muiDashDatatables.muiDashDatatablesStrings.none
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableColumnOptions extends js.Object {
  var customBodyRender: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* tableMeta */ MUIDataTableMeta, 
      /* updateValue */ js.Function3[/* s */ js.Any, /* c */ js.Any, /* p */ js.Any, _], 
      String | ReactNode
    ]
  ] = js.undefined
  var customFilterListRender: js.UndefOr[js.Function1[/* value */ js.Any, String]] = js.undefined
  var customHeadRender: js.UndefOr[
    js.Function2[
      /* columnMeta */ MUIDataTableCustomHeadRenderer, 
      /* updateDirection */ js.Function1[/* params */ js.Any, _], 
      String | ReactNode
    ]
  ] = js.undefined
  var display: js.UndefOr[`true` | `false` | excluded] = js.undefined
  var download: js.UndefOr[Boolean] = js.undefined
  var empty: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[Boolean] = js.undefined
  var filterList: js.UndefOr[js.Array[String]] = js.undefined
  var filterOptions: js.UndefOr[MUIDataTableFilterOptions] = js.undefined
  var filterType: js.UndefOr[FilterType] = js.undefined
  var hint: js.UndefOr[String] = js.undefined
  var print: js.UndefOr[Boolean] = js.undefined
  var searchable: js.UndefOr[Boolean] = js.undefined
  var setCellHeaderProps: js.UndefOr[js.Function1[/* columnMeta */ MUIDataTableCustomHeadRenderer, js.Object]] = js.undefined
  var setCellProps: js.UndefOr[
    js.Function3[/* cellValue */ String, /* rowIndex */ Double, /* columnIndex */ Double, js.Object]
  ] = js.undefined
  var sort: js.UndefOr[Boolean] = js.undefined
  var sortDirection: js.UndefOr[asc | desc | none] = js.undefined
  var viewColumns: js.UndefOr[Boolean] = js.undefined
}

object MUIDataTableColumnOptions {
  @scala.inline
  def apply(
    customBodyRender: (/* value */ js.Any, /* tableMeta */ MUIDataTableMeta, /* updateValue */ js.Function3[/* s */ js.Any, /* c */ js.Any, /* p */ js.Any, _]) => String | ReactNode = null,
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
    print: js.UndefOr[Boolean] = js.undefined,
    searchable: js.UndefOr[Boolean] = js.undefined,
    setCellHeaderProps: /* columnMeta */ MUIDataTableCustomHeadRenderer => js.Object = null,
    setCellProps: (/* cellValue */ String, /* rowIndex */ Double, /* columnIndex */ Double) => js.Object = null,
    sort: js.UndefOr[Boolean] = js.undefined,
    sortDirection: asc | desc | none = null,
    viewColumns: js.UndefOr[Boolean] = js.undefined
  ): MUIDataTableColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (customBodyRender != null) __obj.updateDynamic("customBodyRender")(js.Any.fromFunction3(customBodyRender))
    if (customFilterListRender != null) __obj.updateDynamic("customFilterListRender")(js.Any.fromFunction1(customFilterListRender))
    if (customHeadRender != null) __obj.updateDynamic("customHeadRender")(js.Any.fromFunction2(customHeadRender))
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterList != null) __obj.updateDynamic("filterList")(filterList.asInstanceOf[js.Any])
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable.asInstanceOf[js.Any])
    if (setCellHeaderProps != null) __obj.updateDynamic("setCellHeaderProps")(js.Any.fromFunction1(setCellHeaderProps))
    if (setCellProps != null) __obj.updateDynamic("setCellProps")(js.Any.fromFunction3(setCellProps))
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(viewColumns)) __obj.updateDynamic("viewColumns")(viewColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableColumnOptions]
  }
}

