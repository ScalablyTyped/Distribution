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
      java.lang.String | reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var customHeadRender: js.UndefOr[
    js.Function2[
      /* columnMeta */ MUIDataTableCustomHeadRenderer, 
      /* updateDirection */ js.Function1[/* params */ js.Any, _], 
      java.lang.String
    ]
  ] = js.undefined
  var display: js.UndefOr[
    muiDashDatatablesLib.muiDashDatatablesLibStrings.`true` | muiDashDatatablesLib.muiDashDatatablesLibStrings.`false` | muiDashDatatablesLib.muiDashDatatablesLibStrings.excluded
  ] = js.undefined
  var download: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  var filterList: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var filterOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var hint: js.UndefOr[java.lang.String] = js.undefined
  var setCellProps: js.UndefOr[
    js.Function3[
      /* cellValue */ java.lang.String, 
      /* rowIndex */ scala.Double, 
      /* columnIndex */ scala.Double, 
      js.Object
    ]
  ] = js.undefined
  var sort: js.UndefOr[scala.Boolean] = js.undefined
  var sortDirection: js.UndefOr[
    muiDashDatatablesLib.muiDashDatatablesLibStrings.asc | muiDashDatatablesLib.muiDashDatatablesLibStrings.desc
  ] = js.undefined
}

object MUIDataTableColumnOptions {
  @scala.inline
  def apply(
    customBodyRender: js.Function3[
      /* value */ js.Any, 
      /* tableMeta */ MUIDataTableMeta, 
      /* updateValue */ js.Function3[/* s */ js.Any, /* c */ js.Any, /* p */ js.Any, _], 
      java.lang.String | reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    customHeadRender: js.Function2[
      /* columnMeta */ MUIDataTableCustomHeadRenderer, 
      /* updateDirection */ js.Function1[/* params */ js.Any, _], 
      java.lang.String
    ] = null,
    display: muiDashDatatablesLib.muiDashDatatablesLibStrings.`true` | muiDashDatatablesLib.muiDashDatatablesLibStrings.`false` | muiDashDatatablesLib.muiDashDatatablesLibStrings.excluded = null,
    download: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    filterList: js.Array[java.lang.String] = null,
    filterOptions: js.Array[java.lang.String] = null,
    hint: java.lang.String = null,
    setCellProps: js.Function3[
      /* cellValue */ java.lang.String, 
      /* rowIndex */ scala.Double, 
      /* columnIndex */ scala.Double, 
      js.Object
    ] = null,
    sort: js.UndefOr[scala.Boolean] = js.undefined,
    sortDirection: muiDashDatatablesLib.muiDashDatatablesLibStrings.asc | muiDashDatatablesLib.muiDashDatatablesLibStrings.desc = null
  ): MUIDataTableColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (customBodyRender != null) __obj.updateDynamic("customBodyRender")(customBodyRender)
    if (customHeadRender != null) __obj.updateDynamic("customHeadRender")(customHeadRender)
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download)
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (filterList != null) __obj.updateDynamic("filterList")(filterList)
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (setCellProps != null) __obj.updateDynamic("setCellProps")(setCellProps)
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableColumnOptions]
  }
}

