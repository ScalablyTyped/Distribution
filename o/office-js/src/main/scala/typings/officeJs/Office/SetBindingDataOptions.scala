package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for how to set the data in a binding.
  *
  * @remarks
  * 
  * If the rows option is used, the value must be "thisRow".
  */
@js.native
trait SetBindingDataOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  /**
    * Use only with binding type table and when a TableData object is passed for the data parameter. An array of objects that specify a range of 
    * columns, rows, or cells and specify, as key-value pairs, the cell formatting to apply to that range. 
    * 
    * Example: `[{cells: Office.Table.Data, format: {fontColor: "yellow"}}, {cells: {row: 3, column: 4}, format: {borderColor: "white", fontStyle: "bold"}}]`
    */
  var cellFormat: js.UndefOr[js.Array[RangeFormatConfiguration]] = js.native
  /**
    * Explicitly sets the shape of the data object. If not supplied is inferred from the data type.
    */
  var coercionType: js.UndefOr[CoercionType | String] = js.native
  /**
    * Only for table bindings in content add-ins for Access. Array of strings. Specifies the column names.
    * 
    * **Important**: We no longer recommend that you create and use Access web apps and databases in SharePoint.
    * As an alternative, we recommend that you use {@link https://powerapps.microsoft.com/ | Microsoft PowerApps}
    * to build no-code business solutions for web and mobile devices.
    */
  var columns: js.UndefOr[js.Array[String]] = js.native
  /**
    * Only for table bindings in content add-ins for Access. Specifies the pre-defined string "thisRow" to get data in the currently selected row.
    * 
    * **Important**: We no longer recommend that you create and use Access web apps and databases in SharePoint.
    * As an alternative, we recommend that you use {@link https://powerapps.microsoft.com/ | Microsoft PowerApps}
    * to build no-code business solutions for web and mobile devices.
    */
  var rows: js.UndefOr[String] = js.native
  /**
    * Specifies the zero-based starting column for a subset of the data. Only for table or matrix bindings. If omitted, data is set starting in 
    * the first column.
    */
  var startColumn: js.UndefOr[Double] = js.native
  /**
    * Specifies the zero-based starting row for a subset of the data in the binding. Only for table or matrix bindings. If omitted, data is set 
    * starting in the first row.
    */
  var startRow: js.UndefOr[Double] = js.native
  /**
    * For an inserted table, a list of key-value pairs that specify table formatting options, such as header row, total row, and banded rows. 
    * Example: `{bandedRows: true,  filterButton: false}`
    */
  var tableOptions: js.UndefOr[js.Object] = js.native
}

object SetBindingDataOptions {
  @scala.inline
  def apply(): SetBindingDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetBindingDataOptions]
  }
  @scala.inline
  implicit class SetBindingDataOptionsOps[Self <: SetBindingDataOptions] (val x: Self) extends AnyVal {
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
    def setAsyncContext(value: js.Any): Self = this.set("asyncContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncContext: Self = this.set("asyncContext", js.undefined)
    @scala.inline
    def setCellFormatVarargs(value: RangeFormatConfiguration*): Self = this.set("cellFormat", js.Array(value :_*))
    @scala.inline
    def setCellFormat(value: js.Array[RangeFormatConfiguration]): Self = this.set("cellFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellFormat: Self = this.set("cellFormat", js.undefined)
    @scala.inline
    def setCoercionType(value: CoercionType | String): Self = this.set("coercionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoercionType: Self = this.set("coercionType", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: String*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setRows(value: String): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartColumn: Self = this.set("startColumn", js.undefined)
    @scala.inline
    def setStartRow(value: Double): Self = this.set("startRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartRow: Self = this.set("startRow", js.undefined)
    @scala.inline
    def setTableOptions(value: js.Object): Self = this.set("tableOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableOptions: Self = this.set("tableOptions", js.undefined)
  }
  
}

