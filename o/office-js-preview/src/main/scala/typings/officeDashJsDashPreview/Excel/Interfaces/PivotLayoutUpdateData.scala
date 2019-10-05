package typings.officeDashJsDashPreview.Excel.Interfaces

import typings.officeDashJsDashPreview.Excel.PivotLayoutType
import typings.officeDashJsDashPreview.Excel.SubtotalLocationType
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AtBottom
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AtTop
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Compact
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Off
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Outline
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Tabular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotLayout object, for use in `pivotLayout.set({ ... })`. */
trait PivotLayoutUpdateData extends js.Object {
  /**
    *
    * Specifies whether formatting will be automatically formatted when it’s refreshed or when fields are moved
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether the field list can be shown in the UI.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var enableFieldList: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * This property indicates the PivotLayoutType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var layoutType: js.UndefOr[PivotLayoutType | Compact | Tabular | Outline] = js.undefined
  /**
    *
    * Specifies whether formatting is preserved when the report is refreshed or recalculated by operations such as pivoting, sorting, or changing page field items.
    *
    * [Api set: ExcelApi 1.9]
    */
  var preserveFormatting: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether the PivotTable report shows grand totals for columns.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showColumnGrandTotals: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether the PivotTable report shows grand totals for rows.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRowGrandTotals: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * This property indicates the SubtotalLocationType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotalLocation: js.UndefOr[SubtotalLocationType | AtTop | AtBottom | Off] = js.undefined
}

object PivotLayoutUpdateData {
  @scala.inline
  def apply(
    autoFormat: js.UndefOr[Boolean] = js.undefined,
    enableFieldList: js.UndefOr[Boolean] = js.undefined,
    layoutType: PivotLayoutType | Compact | Tabular | Outline = null,
    preserveFormatting: js.UndefOr[Boolean] = js.undefined,
    showColumnGrandTotals: js.UndefOr[Boolean] = js.undefined,
    showRowGrandTotals: js.UndefOr[Boolean] = js.undefined,
    subtotalLocation: SubtotalLocationType | AtTop | AtBottom | Off = null
  ): PivotLayoutUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFormat)) __obj.updateDynamic("autoFormat")(autoFormat)
    if (!js.isUndefined(enableFieldList)) __obj.updateDynamic("enableFieldList")(enableFieldList)
    if (layoutType != null) __obj.updateDynamic("layoutType")(layoutType.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFormatting)) __obj.updateDynamic("preserveFormatting")(preserveFormatting)
    if (!js.isUndefined(showColumnGrandTotals)) __obj.updateDynamic("showColumnGrandTotals")(showColumnGrandTotals)
    if (!js.isUndefined(showRowGrandTotals)) __obj.updateDynamic("showRowGrandTotals")(showRowGrandTotals)
    if (subtotalLocation != null) __obj.updateDynamic("subtotalLocation")(subtotalLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotLayoutUpdateData]
  }
}

