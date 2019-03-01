package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the options in sheet protection.
  *
  * [Api set: ExcelApi 1.2]
  */
trait WorksheetProtectionOptions extends js.Object {
  /**
    *
    * Represents the worksheet protection option of allowing using auto filter feature.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowAutoFilter: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing deleting columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowDeleteColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing deleting rows.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowDeleteRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing editing objects.
    *
    * [Api set: ExcelApi 1.7]
    */
  var allowEditObjects: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing editing scenarios.
    *
    * [Api set: ExcelApi 1.7]
    */
  var allowEditScenarios: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing formatting cells.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatCells: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing formatting columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing formatting rows.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing inserting columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing inserting hyperlinks.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertHyperlinks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing inserting rows.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing using PivotTable feature.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowPivotTables: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing using sort feature.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowSort: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of selection mode.
    *
    * [Api set: ExcelApi 1.7]
    */
  var selectionMode: js.UndefOr[
    ProtectionSelectionMode | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Normal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unlocked | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None
  ] = js.undefined
}

object WorksheetProtectionOptions {
  @scala.inline
  def apply(
    allowAutoFilter: js.UndefOr[scala.Boolean] = js.undefined,
    allowDeleteColumns: js.UndefOr[scala.Boolean] = js.undefined,
    allowDeleteRows: js.UndefOr[scala.Boolean] = js.undefined,
    allowEditObjects: js.UndefOr[scala.Boolean] = js.undefined,
    allowEditScenarios: js.UndefOr[scala.Boolean] = js.undefined,
    allowFormatCells: js.UndefOr[scala.Boolean] = js.undefined,
    allowFormatColumns: js.UndefOr[scala.Boolean] = js.undefined,
    allowFormatRows: js.UndefOr[scala.Boolean] = js.undefined,
    allowInsertColumns: js.UndefOr[scala.Boolean] = js.undefined,
    allowInsertHyperlinks: js.UndefOr[scala.Boolean] = js.undefined,
    allowInsertRows: js.UndefOr[scala.Boolean] = js.undefined,
    allowPivotTables: js.UndefOr[scala.Boolean] = js.undefined,
    allowSort: js.UndefOr[scala.Boolean] = js.undefined,
    selectionMode: ProtectionSelectionMode | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Normal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unlocked | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None = null
  ): WorksheetProtectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAutoFilter)) __obj.updateDynamic("allowAutoFilter")(allowAutoFilter)
    if (!js.isUndefined(allowDeleteColumns)) __obj.updateDynamic("allowDeleteColumns")(allowDeleteColumns)
    if (!js.isUndefined(allowDeleteRows)) __obj.updateDynamic("allowDeleteRows")(allowDeleteRows)
    if (!js.isUndefined(allowEditObjects)) __obj.updateDynamic("allowEditObjects")(allowEditObjects)
    if (!js.isUndefined(allowEditScenarios)) __obj.updateDynamic("allowEditScenarios")(allowEditScenarios)
    if (!js.isUndefined(allowFormatCells)) __obj.updateDynamic("allowFormatCells")(allowFormatCells)
    if (!js.isUndefined(allowFormatColumns)) __obj.updateDynamic("allowFormatColumns")(allowFormatColumns)
    if (!js.isUndefined(allowFormatRows)) __obj.updateDynamic("allowFormatRows")(allowFormatRows)
    if (!js.isUndefined(allowInsertColumns)) __obj.updateDynamic("allowInsertColumns")(allowInsertColumns)
    if (!js.isUndefined(allowInsertHyperlinks)) __obj.updateDynamic("allowInsertHyperlinks")(allowInsertHyperlinks)
    if (!js.isUndefined(allowInsertRows)) __obj.updateDynamic("allowInsertRows")(allowInsertRows)
    if (!js.isUndefined(allowPivotTables)) __obj.updateDynamic("allowPivotTables")(allowPivotTables)
    if (!js.isUndefined(allowSort)) __obj.updateDynamic("allowSort")(allowSort)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetProtectionOptions]
  }
}

