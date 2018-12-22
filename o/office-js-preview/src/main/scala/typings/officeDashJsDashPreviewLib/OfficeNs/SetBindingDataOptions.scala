package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Provides options for how to set the data in a binding.
     *
     * @remarks
     * If the rows option is used, the value must be "thisRow".
     */

trait SetBindingDataOptions extends js.Object {
  /**
           * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
           */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  /**
           * Use only with binding type table and when a TableData object is passed for the data parameter. An array of objects that specify a range of 
           * columns, rows, or cells and specify, as key-value pairs, the cell formatting to apply to that range. 
           * 
           * Example: `[{cells: Office.Table.Data, format: {fontColor: "yellow"}}, {cells: {row: 3, column: 4}, format: {borderColor: "white", fontStyle: "bold"}}]`
           */
  var cellFormat: js.UndefOr[js.Array[RangeFormatConfiguration]] = js.undefined
  /**
           * Explicitly sets the shape of the data object. If not supplied is inferred from the data type.
           */
  var coercionType: js.UndefOr[CoercionType | java.lang.String] = js.undefined
  /**
          * Only for table bindings in content add-ins for Access. Array of strings. Specifies the column names.
          */
  var columns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
          * Only for table bindings in content add-ins for Access. Specifies the pre-defined string "thisRow" to get data in the currently selected row.
          */
  var rows: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Specifies the zero-based starting column for a subset of the data. Only for table or matrix bindings. If omitted, data is set starting in 
          * the first column.
          */
  var startColumn: js.UndefOr[scala.Double] = js.undefined
  /**
          * Specifies the zero-based starting row for a subset of the data in the binding. Only for table or matrix bindings. If omitted, data is set 
          * starting in the first row.
          */
  var startRow: js.UndefOr[scala.Double] = js.undefined
  /**
          * For an inserted table, a list of key-value pairs that specify table formatting options, such as header row, total row, and banded rows. 
          * Example: `{bandedRows: true,  filterButton: false}`
          */
  var tableOptions: js.UndefOr[js.Object] = js.undefined
}

