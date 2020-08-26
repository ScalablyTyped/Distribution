package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `table.toJSON()`. */
@js.native
trait TableData extends js.Object {
  /**
    *
    * Represents the AutoFilter object of the table.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFilter: js.UndefOr[AutoFilterData] = js.native
  /**
    *
    * Represents a collection of all the columns in the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columns: js.UndefOr[js.Array[TableColumnData]] = js.native
  /**
    *
    * Specifies if the first column contains special formatting.
    *
    * [Api set: ExcelApi 1.3]
    */
  var highlightFirstColumn: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the last column contains special formatting.
    *
    * [Api set: ExcelApi 1.3]
    */
  var highlightLastColumn: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns a value that uniquely identifies the table in a given workbook. The value of the identifier remains the same even when the table is renamed.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Returns a numeric id.
    *
    * [Api set: ExcelApi 1.8]
    */
  var legacyId: js.UndefOr[String] = js.native
  /**
    *
    * Name of the table.
    
    The set name of the table must follow the guidelines specified in the {@link https://support.office.com/article/Rename-an-Excel-table-FBF49A4F-82A3-43EB-8BA2-44D21233B114 | Rename an Excel table} article.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Represents a collection of all the rows in the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rows: js.UndefOr[js.Array[TableRowData]] = js.native
  /**
    *
    * Specifies if the columns show banded formatting in which odd columns are highlighted differently from even ones to make reading the table easier.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showBandedColumns: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the rows show banded formatting in which odd rows are highlighted differently from even ones to make reading the table easier.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showBandedRows: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the filter buttons are visible at the top of each column header. Setting this is only allowed if the table contains a header row.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showFilterButton: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the header row is visible. This value can be set to show or remove the header row.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showHeaders: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the total row is visible. This value can be set to show or remove the total row.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showTotals: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the sorting for the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  var sort: js.UndefOr[TableSortData] = js.native
  /**
    *
    * Constant value that represents the Table style. Possible values are: "TableStyleLight1" through "TableStyleLight21", "TableStyleMedium1" through "TableStyleMedium28", "TableStyleDark1" through "TableStyleDark11". A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: js.UndefOr[String] = js.native
}

object TableData {
  @scala.inline
  def apply(): TableData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableData]
  }
  @scala.inline
  implicit class TableDataOps[Self <: TableData] (val x: Self) extends AnyVal {
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
    def setAutoFilter(value: AutoFilterData): Self = this.set("autoFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFilter: Self = this.set("autoFilter", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: TableColumnData*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[TableColumnData]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setHighlightFirstColumn(value: Boolean): Self = this.set("highlightFirstColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightFirstColumn: Self = this.set("highlightFirstColumn", js.undefined)
    @scala.inline
    def setHighlightLastColumn(value: Boolean): Self = this.set("highlightLastColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightLastColumn: Self = this.set("highlightLastColumn", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLegacyId(value: String): Self = this.set("legacyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegacyId: Self = this.set("legacyId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRowsVarargs(value: TableRowData*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[TableRowData]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setShowBandedColumns(value: Boolean): Self = this.set("showBandedColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBandedColumns: Self = this.set("showBandedColumns", js.undefined)
    @scala.inline
    def setShowBandedRows(value: Boolean): Self = this.set("showBandedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBandedRows: Self = this.set("showBandedRows", js.undefined)
    @scala.inline
    def setShowFilterButton(value: Boolean): Self = this.set("showFilterButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFilterButton: Self = this.set("showFilterButton", js.undefined)
    @scala.inline
    def setShowHeaders(value: Boolean): Self = this.set("showHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeaders: Self = this.set("showHeaders", js.undefined)
    @scala.inline
    def setShowTotals(value: Boolean): Self = this.set("showTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTotals: Self = this.set("showTotals", js.undefined)
    @scala.inline
    def setSort(value: TableSortData): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

