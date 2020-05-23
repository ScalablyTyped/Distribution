package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookWorksheetProtectionOptions extends js.Object {
  // Represents the worksheet protection option of allowing using auto filter feature.
  var allowAutoFilter: js.UndefOr[Boolean] = js.undefined
  // Represents the worksheet protection option of allowing deleting columns.
  var allowDeleteColumns: js.UndefOr[Boolean] = js.undefined
  // Represents the worksheet protection option of allowing deleting rows.
  var allowDeleteRows: js.UndefOr[Boolean] = js.undefined
  // Represents the worksheet protection option of allowing formatting cells.
  var allowFormatCells: js.UndefOr[Boolean] = js.undefined
  // Represents the worksheet protection option of allowing formatting columns.
  var allowFormatColumns: js.UndefOr[Boolean] = js.undefined
  // Represents the worksheet protection option of allowing formatting rows.
  var allowFormatRows: js.UndefOr[Boolean] = js.undefined
  // Represents the worksheet protection option of allowing inserting columns.
  var allowInsertColumns: js.UndefOr[Boolean] = js.undefined
  // Represents the worksheet protection option of allowing inserting hyperlinks.
  var allowInsertHyperlinks: js.UndefOr[Boolean] = js.undefined
  // Represents the worksheet protection option of allowing inserting rows.
  var allowInsertRows: js.UndefOr[Boolean] = js.undefined
  // Represents the worksheet protection option of allowing using pivot table feature.
  var allowPivotTables: js.UndefOr[Boolean] = js.undefined
  // Represents the worksheet protection option of allowing using sort feature.
  var allowSort: js.UndefOr[Boolean] = js.undefined
}

object WorkbookWorksheetProtectionOptions {
  @scala.inline
  def apply(
    allowAutoFilter: js.UndefOr[Boolean] = js.undefined,
    allowDeleteColumns: js.UndefOr[Boolean] = js.undefined,
    allowDeleteRows: js.UndefOr[Boolean] = js.undefined,
    allowFormatCells: js.UndefOr[Boolean] = js.undefined,
    allowFormatColumns: js.UndefOr[Boolean] = js.undefined,
    allowFormatRows: js.UndefOr[Boolean] = js.undefined,
    allowInsertColumns: js.UndefOr[Boolean] = js.undefined,
    allowInsertHyperlinks: js.UndefOr[Boolean] = js.undefined,
    allowInsertRows: js.UndefOr[Boolean] = js.undefined,
    allowPivotTables: js.UndefOr[Boolean] = js.undefined,
    allowSort: js.UndefOr[Boolean] = js.undefined
  ): WorkbookWorksheetProtectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAutoFilter)) __obj.updateDynamic("allowAutoFilter")(allowAutoFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeleteColumns)) __obj.updateDynamic("allowDeleteColumns")(allowDeleteColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeleteRows)) __obj.updateDynamic("allowDeleteRows")(allowDeleteRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFormatCells)) __obj.updateDynamic("allowFormatCells")(allowFormatCells.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFormatColumns)) __obj.updateDynamic("allowFormatColumns")(allowFormatColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFormatRows)) __obj.updateDynamic("allowFormatRows")(allowFormatRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInsertColumns)) __obj.updateDynamic("allowInsertColumns")(allowInsertColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInsertHyperlinks)) __obj.updateDynamic("allowInsertHyperlinks")(allowInsertHyperlinks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInsertRows)) __obj.updateDynamic("allowInsertRows")(allowInsertRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPivotTables)) __obj.updateDynamic("allowPivotTables")(allowPivotTables.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSort)) __obj.updateDynamic("allowSort")(allowSort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookWorksheetProtectionOptions]
  }
}

