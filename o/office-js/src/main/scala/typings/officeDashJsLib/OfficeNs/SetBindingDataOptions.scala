package typings
package officeDashJsLib.OfficeNs

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

object SetBindingDataOptions {
  @scala.inline
  def apply(
    asyncContext: js.Any = null,
    cellFormat: js.Array[RangeFormatConfiguration] = null,
    coercionType: CoercionType | java.lang.String = null,
    columns: js.Array[java.lang.String] = null,
    rows: java.lang.String = null,
    startColumn: scala.Int | scala.Double = null,
    startRow: scala.Int | scala.Double = null,
    tableOptions: js.Object = null
  ): SetBindingDataOptions = {
    val __obj = js.Dynamic.literal()
    if (asyncContext != null) __obj.updateDynamic("asyncContext")(asyncContext)
    if (cellFormat != null) __obj.updateDynamic("cellFormat")(cellFormat)
    if (coercionType != null) __obj.updateDynamic("coercionType")(coercionType.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (startColumn != null) __obj.updateDynamic("startColumn")(startColumn.asInstanceOf[js.Any])
    if (startRow != null) __obj.updateDynamic("startRow")(startRow.asInstanceOf[js.Any])
    if (tableOptions != null) __obj.updateDynamic("tableOptions")(tableOptions)
    __obj.asInstanceOf[SetBindingDataOptions]
  }
}

