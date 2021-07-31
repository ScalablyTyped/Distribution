package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Table object, for use in `table.set({ ... })`. */
trait TableUpdateData extends StObject {
  
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
    * Name of the table.
    
    The set name of the table must follow the guidelines specified in the {@link https://support.office.com/article/Rename-an-Excel-table-FBF49A4F-82A3-43EB-8BA2-44D21233B114 | Rename an Excel table} article.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  
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
    * Constant value that represents the Table style. Possible values are: "TableStyleLight1" through "TableStyleLight21", "TableStyleMedium1" through "TableStyleMedium28", "TableStyleDark1" through "TableStyleDark11". A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: js.UndefOr[String] = js.undefined
}
object TableUpdateData {
  
  @scala.inline
  def apply(): TableUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableUpdateData]
  }
  
  @scala.inline
  implicit class TableUpdateDataMutableBuilder[Self <: TableUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlightFirstColumn(value: Boolean): Self = StObject.set(x, "highlightFirstColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightFirstColumnUndefined: Self = StObject.set(x, "highlightFirstColumn", js.undefined)
    
    @scala.inline
    def setHighlightLastColumn(value: Boolean): Self = StObject.set(x, "highlightLastColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightLastColumnUndefined: Self = StObject.set(x, "highlightLastColumn", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setShowBandedColumns(value: Boolean): Self = StObject.set(x, "showBandedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBandedColumnsUndefined: Self = StObject.set(x, "showBandedColumns", js.undefined)
    
    @scala.inline
    def setShowBandedRows(value: Boolean): Self = StObject.set(x, "showBandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBandedRowsUndefined: Self = StObject.set(x, "showBandedRows", js.undefined)
    
    @scala.inline
    def setShowFilterButton(value: Boolean): Self = StObject.set(x, "showFilterButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFilterButtonUndefined: Self = StObject.set(x, "showFilterButton", js.undefined)
    
    @scala.inline
    def setShowHeaders(value: Boolean): Self = StObject.set(x, "showHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHeadersUndefined: Self = StObject.set(x, "showHeaders", js.undefined)
    
    @scala.inline
    def setShowTotals(value: Boolean): Self = StObject.set(x, "showTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTotalsUndefined: Self = StObject.set(x, "showTotals", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
