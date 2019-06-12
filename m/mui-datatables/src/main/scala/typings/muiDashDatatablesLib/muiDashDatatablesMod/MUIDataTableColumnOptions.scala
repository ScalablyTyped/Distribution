package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableColumnOptions extends js.Object {
  var customBodyRender: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* tableMeta */ MUIDataTableMeta, 
      /* updateValue */ js.Function3[/* s */ js.Any, /* c */ js.Any, /* p */ js.Any, _], 
      java.lang.String | reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var customHeadRender: js.UndefOr[
    js.Function2[
      /* columnMeta */ MUIDataTableCustomHeadRenderer, 
      /* updateDirection */ js.Function1[/* params */ js.Any, _], 
      java.lang.String | reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var display: js.UndefOr[Display] = js.undefined
  var download: js.UndefOr[scala.Boolean] = js.undefined
  var empty: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  var filterList: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var filterOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var filterType: js.UndefOr[FilterType] = js.undefined
  var hint: js.UndefOr[java.lang.String] = js.undefined
  var print: js.UndefOr[scala.Boolean] = js.undefined
  var searchable: js.UndefOr[scala.Boolean] = js.undefined
  var setCellProps: js.UndefOr[
    js.Function3[
      /* cellValue */ java.lang.String, 
      /* rowIndex */ scala.Double, 
      /* columnIndex */ scala.Double, 
      js.Object
    ]
  ] = js.undefined
  var sort: js.UndefOr[scala.Boolean] = js.undefined
  var sortDirection: js.UndefOr[SortDirection] = js.undefined
  var viewColumns: js.UndefOr[scala.Boolean] = js.undefined
}

object MUIDataTableColumnOptions {
  @scala.inline
  def apply(
    customBodyRender: (/* value */ js.Any, /* tableMeta */ MUIDataTableMeta, /* updateValue */ js.Function3[/* s */ js.Any, /* c */ js.Any, /* p */ js.Any, _]) => java.lang.String | reactLib.reactMod.ReactNode = null,
    customHeadRender: (/* columnMeta */ MUIDataTableCustomHeadRenderer, /* updateDirection */ js.Function1[/* params */ js.Any, _]) => java.lang.String | reactLib.reactMod.ReactNode = null,
    display: Display = null,
    download: js.UndefOr[scala.Boolean] = js.undefined,
    empty: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    filterList: js.Array[java.lang.String] = null,
    filterOptions: js.Array[java.lang.String] = null,
    filterType: FilterType = null,
    hint: java.lang.String = null,
    print: js.UndefOr[scala.Boolean] = js.undefined,
    searchable: js.UndefOr[scala.Boolean] = js.undefined,
    setCellProps: (/* cellValue */ java.lang.String, /* rowIndex */ scala.Double, /* columnIndex */ scala.Double) => js.Object = null,
    sort: js.UndefOr[scala.Boolean] = js.undefined,
    sortDirection: SortDirection = null,
    viewColumns: js.UndefOr[scala.Boolean] = js.undefined
  ): MUIDataTableColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (customBodyRender != null) __obj.updateDynamic("customBodyRender")(js.Any.fromFunction3(customBodyRender))
    if (customHeadRender != null) __obj.updateDynamic("customHeadRender")(js.Any.fromFunction2(customHeadRender))
    if (display != null) __obj.updateDynamic("display")(display)
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download)
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty)
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (filterList != null) __obj.updateDynamic("filterList")(filterList)
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions)
    if (filterType != null) __obj.updateDynamic("filterType")(filterType)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print)
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable)
    if (setCellProps != null) __obj.updateDynamic("setCellProps")(js.Any.fromFunction3(setCellProps))
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection)
    if (!js.isUndefined(viewColumns)) __obj.updateDynamic("viewColumns")(viewColumns)
    __obj.asInstanceOf[MUIDataTableColumnOptions]
  }
}

