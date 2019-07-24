package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookWorksheetProtectionOptions extends js.Object {
  // Represents the worksheet protection option of allowing using auto filter feature.
  var allowAutoFilter: js.UndefOr[scala.Boolean] = js.undefined
  // Represents the worksheet protection option of allowing deleting columns.
  var allowDeleteColumns: js.UndefOr[scala.Boolean] = js.undefined
  // Represents the worksheet protection option of allowing deleting rows.
  var allowDeleteRows: js.UndefOr[scala.Boolean] = js.undefined
  // Represents the worksheet protection option of allowing formatting cells.
  var allowFormatCells: js.UndefOr[scala.Boolean] = js.undefined
  // Represents the worksheet protection option of allowing formatting columns.
  var allowFormatColumns: js.UndefOr[scala.Boolean] = js.undefined
  // Represents the worksheet protection option of allowing formatting rows.
  var allowFormatRows: js.UndefOr[scala.Boolean] = js.undefined
  // Represents the worksheet protection option of allowing inserting columns.
  var allowInsertColumns: js.UndefOr[scala.Boolean] = js.undefined
  // Represents the worksheet protection option of allowing inserting hyperlinks.
  var allowInsertHyperlinks: js.UndefOr[scala.Boolean] = js.undefined
  // Represents the worksheet protection option of allowing inserting rows.
  var allowInsertRows: js.UndefOr[scala.Boolean] = js.undefined
  // Represents the worksheet protection option of allowing using pivot table feature.
  var allowPivotTables: js.UndefOr[scala.Boolean] = js.undefined
  // Represents the worksheet protection option of allowing using sort feature.
  var allowSort: js.UndefOr[scala.Boolean] = js.undefined
}

object WorkbookWorksheetProtectionOptions {
  @scala.inline
  def apply(
    allowAutoFilter: js.UndefOr[scala.Boolean] = js.undefined,
    allowDeleteColumns: js.UndefOr[scala.Boolean] = js.undefined,
    allowDeleteRows: js.UndefOr[scala.Boolean] = js.undefined,
    allowFormatCells: js.UndefOr[scala.Boolean] = js.undefined,
    allowFormatColumns: js.UndefOr[scala.Boolean] = js.undefined,
    allowFormatRows: js.UndefOr[scala.Boolean] = js.undefined,
    allowInsertColumns: js.UndefOr[scala.Boolean] = js.undefined,
    allowInsertHyperlinks: js.UndefOr[scala.Boolean] = js.undefined,
    allowInsertRows: js.UndefOr[scala.Boolean] = js.undefined,
    allowPivotTables: js.UndefOr[scala.Boolean] = js.undefined,
    allowSort: js.UndefOr[scala.Boolean] = js.undefined
  ): WorkbookWorksheetProtectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAutoFilter)) __obj.updateDynamic("allowAutoFilter")(allowAutoFilter)
    if (!js.isUndefined(allowDeleteColumns)) __obj.updateDynamic("allowDeleteColumns")(allowDeleteColumns)
    if (!js.isUndefined(allowDeleteRows)) __obj.updateDynamic("allowDeleteRows")(allowDeleteRows)
    if (!js.isUndefined(allowFormatCells)) __obj.updateDynamic("allowFormatCells")(allowFormatCells)
    if (!js.isUndefined(allowFormatColumns)) __obj.updateDynamic("allowFormatColumns")(allowFormatColumns)
    if (!js.isUndefined(allowFormatRows)) __obj.updateDynamic("allowFormatRows")(allowFormatRows)
    if (!js.isUndefined(allowInsertColumns)) __obj.updateDynamic("allowInsertColumns")(allowInsertColumns)
    if (!js.isUndefined(allowInsertHyperlinks)) __obj.updateDynamic("allowInsertHyperlinks")(allowInsertHyperlinks)
    if (!js.isUndefined(allowInsertRows)) __obj.updateDynamic("allowInsertRows")(allowInsertRows)
    if (!js.isUndefined(allowPivotTables)) __obj.updateDynamic("allowPivotTables")(allowPivotTables)
    if (!js.isUndefined(allowSort)) __obj.updateDynamic("allowSort")(allowSort)
    __obj.asInstanceOf[WorkbookWorksheetProtectionOptions]
  }
}

