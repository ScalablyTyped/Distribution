package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookTable extends Entity {
  // Represents a collection of all the columns in the table. Read-only.
  var columns: js.UndefOr[js.Array[WorkbookTableColumn]] = js.native
  // Indicates whether the first column contains special formatting.
  var highlightFirstColumn: js.UndefOr[Boolean] = js.native
  // Indicates whether the last column contains special formatting.
  var highlightLastColumn: js.UndefOr[Boolean] = js.native
  /**
    * Legacy Id used in older Excle clients. The value of the identifier remains the same even when the table is renamed.
    * This property should be interpreted as an opaque string value and should not be parsed to any other type. Read-only.
    */
  var legacyId: js.UndefOr[String] = js.native
  // Name of the table.
  var name: js.UndefOr[String] = js.native
  // Represents a collection of all the rows in the table. Read-only.
  var rows: js.UndefOr[js.Array[WorkbookTableRow]] = js.native
  /**
    * Indicates whether the columns show banded formatting in which odd columns are highlighted differently from even ones to
    * make reading the table easier.
    */
  var showBandedColumns: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the rows show banded formatting in which odd rows are highlighted differently from even ones to make
    * reading the table easier.
    */
  var showBandedRows: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the filter buttons are visible at the top of each column header. Setting this is only allowed if the
    * table contains a header row.
    */
  var showFilterButton: js.UndefOr[Boolean] = js.native
  // Indicates whether the header row is visible or not. This value can be set to show or remove the header row.
  var showHeaders: js.UndefOr[Boolean] = js.native
  // Indicates whether the total row is visible or not. This value can be set to show or remove the total row.
  var showTotals: js.UndefOr[Boolean] = js.native
  // Represents the sorting for the table. Read-only.
  var sort: js.UndefOr[WorkbookTableSort] = js.native
  /**
    * Constant value that represents the Table style. The possible values are: TableStyleLight1 thru TableStyleLight21,
    * TableStyleMedium1 thru TableStyleMedium28, TableStyleStyleDark1 thru TableStyleStyleDark11. A custom user-defined style
    * present in the workbook can also be specified.
    */
  var style: js.UndefOr[String] = js.native
  // The worksheet containing the current table. Read-only.
  var worksheet: js.UndefOr[WorkbookWorksheet] = js.native
}

object WorkbookTable {
  @scala.inline
  def apply(): WorkbookTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookTable]
  }
  @scala.inline
  implicit class WorkbookTableOps[Self <: WorkbookTable] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: WorkbookTableColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[WorkbookTableColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
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
    def setLegacyId(value: String): Self = this.set("legacyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegacyId: Self = this.set("legacyId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRowsVarargs(value: WorkbookTableRow*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[WorkbookTableRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
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
    def setSort(value: WorkbookTableSort): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setWorksheet(value: WorkbookWorksheet): Self = this.set("worksheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorksheet: Self = this.set("worksheet", js.undefined)
  }
  
}

