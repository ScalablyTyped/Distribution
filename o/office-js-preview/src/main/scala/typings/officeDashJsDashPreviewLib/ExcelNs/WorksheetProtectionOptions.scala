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

