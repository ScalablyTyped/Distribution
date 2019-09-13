package typings.muiDashDatatables.muiDashDatatablesMod

import typings.muiDashDatatables.muiDashDatatablesStrings.`false`
import typings.muiDashDatatables.muiDashDatatablesStrings.`true`
import typings.muiDashDatatables.muiDashDatatablesStrings.asc
import typings.muiDashDatatables.muiDashDatatablesStrings.desc
import typings.muiDashDatatables.muiDashDatatablesStrings.excluded
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
  var hint: js.UndefOr[String] = js.undefined
  var print: js.UndefOr[Boolean] = js.undefined
  var searchable: js.UndefOr[Boolean] = js.undefined
  var setCellProps: js.UndefOr[
    js.Function3[/* cellValue */ String, /* rowIndex */ Double, /* columnIndex */ Double, js.Object]
  ] = js.undefined
  var sort: js.UndefOr[Boolean] = js.undefined
  var sortDirection: js.UndefOr[asc | desc] = js.undefined
  var viewColumns: js.UndefOr[Boolean] = js.undefined
}

object MUIDataTableColumnOptions {
  @scala.inline
  def apply(
    customBodyRender: (/* value */ js.Any, /* tableMeta */ MUIDataTableMeta, /* updateValue */ js.Function3[/* s */ js.Any, /* c */ js.Any, /* p */ js.Any, _]) => String | ReactNode = null,
    customHeadRender: (/* columnMeta */ MUIDataTableCustomHeadRenderer, /* updateDirection */ js.Function1[/* params */ js.Any, _]) => String | ReactNode = null,
    display: `true` | `false` | excluded = null,
    download: js.UndefOr[Boolean] = js.undefined,
    empty: js.UndefOr[Boolean] = js.undefined,
    filter: js.UndefOr[Boolean] = js.undefined,
    filterList: js.Array[String] = null,
    filterOptions: MUIDataTableFilterOptions = null,
    hint: String = null,
    print: js.UndefOr[Boolean] = js.undefined,
    searchable: js.UndefOr[Boolean] = js.undefined,
    setCellProps: (/* cellValue */ String, /* rowIndex */ Double, /* columnIndex */ Double) => js.Object = null,
    sort: js.UndefOr[Boolean] = js.undefined,
    sortDirection: asc | desc = null,
    viewColumns: js.UndefOr[Boolean] = js.undefined
  ): MUIDataTableColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (customBodyRender != null) __obj.updateDynamic("customBodyRender")(js.Any.fromFunction3(customBodyRender))
    if (customHeadRender != null) __obj.updateDynamic("customHeadRender")(js.Any.fromFunction2(customHeadRender))
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download)
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty)
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (filterList != null) __obj.updateDynamic("filterList")(filterList)
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print)
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable)
    if (setCellProps != null) __obj.updateDynamic("setCellProps")(js.Any.fromFunction3(setCellProps))
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(viewColumns)) __obj.updateDynamic("viewColumns")(viewColumns)
    __obj.asInstanceOf[MUIDataTableColumnOptions]
  }
}

