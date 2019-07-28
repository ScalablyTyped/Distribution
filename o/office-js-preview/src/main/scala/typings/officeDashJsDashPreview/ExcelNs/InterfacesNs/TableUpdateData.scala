package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Table object, for use in "table.set({ ... })". */
trait TableUpdateData extends js.Object {
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
    * Name of the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
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
    * Constant value that represents the Table style. Possible values are: "TableStyleLight1" through "TableStyleLight21", "TableStyleMedium1" through "TableStyleMedium28", "TableStyleStyleDark1" through "TableStyleStyleDark11". A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: js.UndefOr[String] = js.undefined
}

object TableUpdateData {
  @scala.inline
  def apply(
    highlightFirstColumn: js.UndefOr[Boolean] = js.undefined,
    highlightLastColumn: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    showBandedColumns: js.UndefOr[Boolean] = js.undefined,
    showBandedRows: js.UndefOr[Boolean] = js.undefined,
    showFilterButton: js.UndefOr[Boolean] = js.undefined,
    showHeaders: js.UndefOr[Boolean] = js.undefined,
    showTotals: js.UndefOr[Boolean] = js.undefined,
    style: String = null
  ): TableUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(highlightFirstColumn)) __obj.updateDynamic("highlightFirstColumn")(highlightFirstColumn)
    if (!js.isUndefined(highlightLastColumn)) __obj.updateDynamic("highlightLastColumn")(highlightLastColumn)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(showBandedColumns)) __obj.updateDynamic("showBandedColumns")(showBandedColumns)
    if (!js.isUndefined(showBandedRows)) __obj.updateDynamic("showBandedRows")(showBandedRows)
    if (!js.isUndefined(showFilterButton)) __obj.updateDynamic("showFilterButton")(showFilterButton)
    if (!js.isUndefined(showHeaders)) __obj.updateDynamic("showHeaders")(showHeaders)
    if (!js.isUndefined(showTotals)) __obj.updateDynamic("showTotals")(showTotals)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TableUpdateData]
  }
}

