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

