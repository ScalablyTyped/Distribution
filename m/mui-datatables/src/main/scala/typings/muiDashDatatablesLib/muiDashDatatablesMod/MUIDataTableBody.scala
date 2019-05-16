package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableBody extends js.Object {
  var classes: js.Object
  var columns: js.Array[MUIDataTableColumnDef]
  var count: scala.Double
  var data: js.Array[js.Object | js.Array[scala.Double] | js.Array[java.lang.String]]
  var filterList: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  var onRowClick: js.UndefOr[
    js.Function2[
      /* rowData */ js.Array[java.lang.String], 
      /* rowMeta */ muiDashDatatablesLib.Anon_DataIndexRowIndex, 
      scala.Unit
    ]
  ] = js.undefined
  var options: js.Object
  var searchText: js.UndefOr[java.lang.String] = js.undefined
  var selectRowUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var selectedRows: js.UndefOr[js.Object] = js.undefined
  var toggleExpandRow: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
}

object MUIDataTableBody {
  @scala.inline
  def apply(
    classes: js.Object,
    columns: js.Array[MUIDataTableColumnDef],
    count: scala.Double,
    data: js.Array[js.Object | js.Array[scala.Double] | js.Array[java.lang.String]],
    options: js.Object,
    filterList: js.Array[js.Array[java.lang.String]] = null,
    onRowClick: (/* rowData */ js.Array[java.lang.String], /* rowMeta */ muiDashDatatablesLib.Anon_DataIndexRowIndex) => scala.Unit = null,
    searchText: java.lang.String = null,
    selectRowUpdate: /* args */ js.Any => _ = null,
    selectedRows: js.Object = null,
    toggleExpandRow: /* args */ js.Any => _ = null
  ): MUIDataTableBody = {
    val __obj = js.Dynamic.literal(classes = classes, columns = columns, count = count, data = data, options = options)
    if (filterList != null) __obj.updateDynamic("filterList")(filterList)
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2(onRowClick))
    if (searchText != null) __obj.updateDynamic("searchText")(searchText)
    if (selectRowUpdate != null) __obj.updateDynamic("selectRowUpdate")(js.Any.fromFunction1(selectRowUpdate))
    if (selectedRows != null) __obj.updateDynamic("selectedRows")(selectedRows)
    if (toggleExpandRow != null) __obj.updateDynamic("toggleExpandRow")(js.Any.fromFunction1(toggleExpandRow))
    __obj.asInstanceOf[MUIDataTableBody]
  }
}

