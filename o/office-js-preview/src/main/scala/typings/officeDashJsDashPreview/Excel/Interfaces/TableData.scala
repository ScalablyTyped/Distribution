package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `table.toJSON()`. */
trait TableData extends js.Object {
  /**
    *
    * Represents the AutoFilter object of the table. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFilter: js.UndefOr[AutoFilterData] = js.undefined
  /**
    *
    * Represents a collection of all the columns in the table. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columns: js.UndefOr[js.Array[TableColumnData]] = js.undefined
  /**
    *
    * Indicates whether the first column contains special formatting.
    *
    * [Api set: ExcelApi 1.3]
    */
  var highlightFirstColumn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates whether the last column contains special formatting.
    *
    * [Api set: ExcelApi 1.3]
    */
  var highlightLastColumn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns a value that uniquely identifies the table in a given workbook. The value of the identifier remains the same even when the table is renamed. Read-only.
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
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents a collection of all the rows in the table. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rows: js.UndefOr[js.Array[TableRowData]] = js.undefined
  /**
    *
    * Indicates whether the columns show banded formatting in which odd columns are highlighted differently from even ones to make reading the table easier.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showBandedColumns: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates whether the rows show banded formatting in which odd rows are highlighted differently from even ones to make reading the table easier.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showBandedRows: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates whether the filter buttons are visible at the top of each column header. Setting this is only allowed if the table contains a header row.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showFilterButton: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates whether the header row is visible or not. This value can be set to show or remove the header row.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showHeaders: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates whether the total row is visible or not. This value can be set to show or remove the total row.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showTotals: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the sorting for the table. Read-only.
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
}

object TableData {
  @scala.inline
  def apply(
    autoFilter: AutoFilterData = null,
    columns: js.Array[TableColumnData] = null,
    highlightFirstColumn: js.UndefOr[Boolean] = js.undefined,
    highlightLastColumn: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    legacyId: String = null,
    name: String = null,
    rows: js.Array[TableRowData] = null,
    showBandedColumns: js.UndefOr[Boolean] = js.undefined,
    showBandedRows: js.UndefOr[Boolean] = js.undefined,
    showFilterButton: js.UndefOr[Boolean] = js.undefined,
    showHeaders: js.UndefOr[Boolean] = js.undefined,
    showTotals: js.UndefOr[Boolean] = js.undefined,
    sort: TableSortData = null,
    style: String = null
  ): TableData = {
    val __obj = js.Dynamic.literal()
    if (autoFilter != null) __obj.updateDynamic("autoFilter")(autoFilter)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (!js.isUndefined(highlightFirstColumn)) __obj.updateDynamic("highlightFirstColumn")(highlightFirstColumn)
    if (!js.isUndefined(highlightLastColumn)) __obj.updateDynamic("highlightLastColumn")(highlightLastColumn)
    if (id != null) __obj.updateDynamic("id")(id)
    if (legacyId != null) __obj.updateDynamic("legacyId")(legacyId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (!js.isUndefined(showBandedColumns)) __obj.updateDynamic("showBandedColumns")(showBandedColumns)
    if (!js.isUndefined(showBandedRows)) __obj.updateDynamic("showBandedRows")(showBandedRows)
    if (!js.isUndefined(showFilterButton)) __obj.updateDynamic("showFilterButton")(showFilterButton)
    if (!js.isUndefined(showHeaders)) __obj.updateDynamic("showHeaders")(showHeaders)
    if (!js.isUndefined(showTotals)) __obj.updateDynamic("showTotals")(showTotals)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TableData]
  }
}

