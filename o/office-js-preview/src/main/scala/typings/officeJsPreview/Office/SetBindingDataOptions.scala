package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for how to set the data in a binding.
  *
  * @remarks
  *
  * If the rows option is used, the value must be "thisRow".
  */
trait SetBindingDataOptions extends StObject {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[Any] = js.undefined
  
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
  var coercionType: js.UndefOr[CoercionType | String] = js.undefined
  
  /**
    * Only for table bindings in content add-ins for Access. Array of strings. Specifies the column names.
    *
    * **Important**: We no longer recommend that you create and use Access web apps and databases in SharePoint.
    * As an alternative, we recommend that you use {@link https://powerapps.microsoft.com/ | Microsoft PowerApps}
    * to build no-code business solutions for web and mobile devices.
    */
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Only for table bindings in content add-ins for Access. Specifies the pre-defined string "thisRow" to get data in the currently selected row.
    *
    * **Important**: We no longer recommend that you create and use Access web apps and databases in SharePoint.
    * As an alternative, we recommend that you use {@link https://powerapps.microsoft.com/ | Microsoft PowerApps}
    * to build no-code business solutions for web and mobile devices.
    */
  var rows: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the zero-based starting column for a subset of the data. Only for table or matrix bindings. If omitted, data is set starting in
    * the first column.
    */
  var startColumn: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the zero-based starting row for a subset of the data in the binding. Only for table or matrix bindings. If omitted, data is set
    * starting in the first row.
    */
  var startRow: js.UndefOr[Double] = js.undefined
  
  /**
    * For an inserted table, a list of key-value pairs that specify table formatting options, such as header row, total row, and banded rows.
    * Example: `{bandedRows: true,  filterButton: false}`
    */
  var tableOptions: js.UndefOr[js.Object] = js.undefined
}
object SetBindingDataOptions {
  
  inline def apply(): SetBindingDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetBindingDataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetBindingDataOptions] (val x: Self) extends AnyVal {
    
    inline def setAsyncContext(value: Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    inline def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
    
    inline def setCellFormat(value: js.Array[RangeFormatConfiguration]): Self = StObject.set(x, "cellFormat", value.asInstanceOf[js.Any])
    
    inline def setCellFormatUndefined: Self = StObject.set(x, "cellFormat", js.undefined)
    
    inline def setCellFormatVarargs(value: RangeFormatConfiguration*): Self = StObject.set(x, "cellFormat", js.Array(value*))
    
    inline def setCoercionType(value: CoercionType | String): Self = StObject.set(x, "coercionType", value.asInstanceOf[js.Any])
    
    inline def setCoercionTypeUndefined: Self = StObject.set(x, "coercionType", js.undefined)
    
    inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setRows(value: String): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    
    inline def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
    
    inline def setTableOptions(value: js.Object): Self = StObject.set(x, "tableOptions", value.asInstanceOf[js.Any])
    
    inline def setTableOptionsUndefined: Self = StObject.set(x, "tableOptions", js.undefined)
  }
}
