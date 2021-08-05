package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `table.toJSON()`. */
trait TableData extends StObject {
  
  /**
    *
    * Represents the AutoFilter object of the table.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFilter: js.UndefOr[AutoFilterData] = js.undefined
  
  /**
    *
    * Represents a collection of all the columns in the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columns: js.UndefOr[js.Array[TableColumnData]] = js.undefined
  
  /**
    *
    * Specifies if the first column contains special formatting.
    *
    * [Api set: ExcelApi 1.3]
    */
  var highlightFirstColumn: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the last column contains special formatting.
    *
    * [Api set: ExcelApi 1.3]
    */
  var highlightLastColumn: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns a value that uniquely identifies the table in a given workbook. The value of the identifier remains the same even when the table is renamed.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Returns a numeric id.
    *
    * [Api set: ExcelApi 1.8]
    */
  var legacyId: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Name of the table.
    
    The set name of the table must follow the guidelines specified in the {@link https://support.office.com/article/Rename-an-Excel-table-FBF49A4F-82A3-43EB-8BA2-44D21233B114 | Rename an Excel table} article.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents a collection of all the rows in the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rows: js.UndefOr[js.Array[TableRowData]] = js.undefined
  
  /**
    *
    * Specifies if the columns show banded formatting in which odd columns are highlighted differently from even ones to make reading the table easier.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showBandedColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the rows show banded formatting in which odd rows are highlighted differently from even ones to make reading the table easier.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showBandedRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the filter buttons are visible at the top of each column header. Setting this is only allowed if the table contains a header row.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showFilterButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the header row is visible. This value can be set to show or remove the header row.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showHeaders: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the total row is visible. This value can be set to show or remove the total row.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showTotals: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the sorting for the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  var sort: js.UndefOr[TableSortData] = js.undefined
  
  /**
    *
    * Constant value that represents the Table style. Possible values are: "TableStyleLight1" through "TableStyleLight21", "TableStyleMedium1" through "TableStyleMedium28", "TableStyleDark1" through "TableStyleDark11". A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The style applied to the Table.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var tableStyle: js.UndefOr[TableStyleData] = js.undefined
}
object TableData {
  
  inline def apply(): TableData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableData]
  }
  
  extension [Self <: TableData](x: Self) {
    
    inline def setAutoFilter(value: AutoFilterData): Self = StObject.set(x, "autoFilter", value.asInstanceOf[js.Any])
    
    inline def setAutoFilterUndefined: Self = StObject.set(x, "autoFilter", js.undefined)
    
    inline def setColumns(value: js.Array[TableColumnData]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: TableColumnData*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setHighlightFirstColumn(value: Boolean): Self = StObject.set(x, "highlightFirstColumn", value.asInstanceOf[js.Any])
    
    inline def setHighlightFirstColumnUndefined: Self = StObject.set(x, "highlightFirstColumn", js.undefined)
    
    inline def setHighlightLastColumn(value: Boolean): Self = StObject.set(x, "highlightLastColumn", value.asInstanceOf[js.Any])
    
    inline def setHighlightLastColumnUndefined: Self = StObject.set(x, "highlightLastColumn", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLegacyId(value: String): Self = StObject.set(x, "legacyId", value.asInstanceOf[js.Any])
    
    inline def setLegacyIdUndefined: Self = StObject.set(x, "legacyId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRows(value: js.Array[TableRowData]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: TableRowData*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    inline def setShowBandedColumns(value: Boolean): Self = StObject.set(x, "showBandedColumns", value.asInstanceOf[js.Any])
    
    inline def setShowBandedColumnsUndefined: Self = StObject.set(x, "showBandedColumns", js.undefined)
    
    inline def setShowBandedRows(value: Boolean): Self = StObject.set(x, "showBandedRows", value.asInstanceOf[js.Any])
    
    inline def setShowBandedRowsUndefined: Self = StObject.set(x, "showBandedRows", js.undefined)
    
    inline def setShowFilterButton(value: Boolean): Self = StObject.set(x, "showFilterButton", value.asInstanceOf[js.Any])
    
    inline def setShowFilterButtonUndefined: Self = StObject.set(x, "showFilterButton", js.undefined)
    
    inline def setShowHeaders(value: Boolean): Self = StObject.set(x, "showHeaders", value.asInstanceOf[js.Any])
    
    inline def setShowHeadersUndefined: Self = StObject.set(x, "showHeaders", js.undefined)
    
    inline def setShowTotals(value: Boolean): Self = StObject.set(x, "showTotals", value.asInstanceOf[js.Any])
    
    inline def setShowTotalsUndefined: Self = StObject.set(x, "showTotals", js.undefined)
    
    inline def setSort(value: TableSortData): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTableStyle(value: TableStyleData): Self = StObject.set(x, "tableStyle", value.asInstanceOf[js.Any])
    
    inline def setTableStyleUndefined: Self = StObject.set(x, "tableStyle", js.undefined)
  }
}
