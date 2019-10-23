package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a scoped collection of tables. For each table its top-left corner is considered its anchor location and the tables are sorted top to bottom and then left to right.
  *
  * [Api set: ExcelApi 1.9]
  */
trait TableScopedCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the AutoFilter object of the table.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFilter: js.UndefOr[AutoFilterLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents a collection of all the columns in the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  var columns: js.UndefOr[TableColumnCollectionLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates whether the first column contains special formatting.
    *
    * [Api set: ExcelApi 1.3]
    */
  var highlightFirstColumn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates whether the last column contains special formatting.
    *
    * [Api set: ExcelApi 1.3]
    */
  var highlightLastColumn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns a value that uniquely identifies the table in a given workbook. The value of the identifier remains the same even when the table is renamed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns a numeric id.
    *
    * [Api set: ExcelApi 1.8]
    */
  var legacyId: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Name of the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents a collection of all the rows in the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  var rows: js.UndefOr[TableRowCollectionLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates whether the columns show banded formatting in which odd columns are highlighted differently from even ones to make reading the table easier.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showBandedColumns: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates whether the rows show banded formatting in which odd rows are highlighted differently from even ones to make reading the table easier.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showBandedRows: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates whether the filter buttons are visible at the top of each column header. Setting this is only allowed if the table contains a header row.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showFilterButton: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates whether the header row is visible or not. This value can be set to show or remove the header row.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showHeaders: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates whether the total row is visible or not. This value can be set to show or remove the total row.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showTotals: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the sorting for the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  var sort: js.UndefOr[TableSortLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Constant value that represents the Table style. Possible values are: "TableStyleLight1" through "TableStyleLight21", "TableStyleMedium1" through "TableStyleMedium28", "TableStyleDark1" through "TableStyleDark11". A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The worksheet containing the current table.
    *
    * [Api set: ExcelApi 1.2]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}

object TableScopedCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    autoFilter: AutoFilterLoadOptions = null,
    columns: TableColumnCollectionLoadOptions = null,
    highlightFirstColumn: js.UndefOr[Boolean] = js.undefined,
    highlightLastColumn: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    legacyId: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    rows: TableRowCollectionLoadOptions = null,
    showBandedColumns: js.UndefOr[Boolean] = js.undefined,
    showBandedRows: js.UndefOr[Boolean] = js.undefined,
    showFilterButton: js.UndefOr[Boolean] = js.undefined,
    showHeaders: js.UndefOr[Boolean] = js.undefined,
    showTotals: js.UndefOr[Boolean] = js.undefined,
    sort: TableSortLoadOptions = null,
    style: js.UndefOr[Boolean] = js.undefined,
    worksheet: WorksheetLoadOptions = null
  ): TableScopedCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (autoFilter != null) __obj.updateDynamic("autoFilter")(autoFilter)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (!js.isUndefined(highlightFirstColumn)) __obj.updateDynamic("highlightFirstColumn")(highlightFirstColumn)
    if (!js.isUndefined(highlightLastColumn)) __obj.updateDynamic("highlightLastColumn")(highlightLastColumn)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(legacyId)) __obj.updateDynamic("legacyId")(legacyId)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (!js.isUndefined(showBandedColumns)) __obj.updateDynamic("showBandedColumns")(showBandedColumns)
    if (!js.isUndefined(showBandedRows)) __obj.updateDynamic("showBandedRows")(showBandedRows)
    if (!js.isUndefined(showFilterButton)) __obj.updateDynamic("showFilterButton")(showFilterButton)
    if (!js.isUndefined(showHeaders)) __obj.updateDynamic("showHeaders")(showHeaders)
    if (!js.isUndefined(showTotals)) __obj.updateDynamic("showTotals")(showTotals)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style)
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet)
    __obj.asInstanceOf[TableScopedCollectionLoadOptions]
  }
}

