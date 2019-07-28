package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import typings.officeDashJsDashPreview.ExcelNs.ChartErrorBarsInclude
import typings.officeDashJsDashPreview.ExcelNs.ChartErrorBarsType
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Both
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Custom
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FixedValue
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MinusValues
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Percent
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PlusValues
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.StDev
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.StError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartErrorBars object, for use in "chartErrorBars.set({ ... })". */
trait ChartErrorBarsUpdateData extends js.Object {
  /**
    *
    * Specifies whether or not the error bars have an end style cap.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endStyleCap: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the formatting type of the error bars.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[ChartErrorBarsFormatUpdateData] = js.undefined
  /**
    *
    * Specifies which parts of the error bars to include.
    *
    * [Api set: ExcelApi 1.9]
    */
  var include: js.UndefOr[ChartErrorBarsInclude | Both | MinusValues | PlusValues] = js.undefined
  /**
    *
    * The type of range marked by the error bars.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[ChartErrorBarsType | FixedValue | Percent | StDev | StError | Custom] = js.undefined
  /**
    *
    * Specifies whether or not the error bars are displayed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ChartErrorBarsUpdateData {
  @scala.inline
  def apply(
    endStyleCap: js.UndefOr[Boolean] = js.undefined,
    format: ChartErrorBarsFormatUpdateData = null,
    include: ChartErrorBarsInclude | Both | MinusValues | PlusValues = null,
    `type`: ChartErrorBarsType | FixedValue | Percent | StDev | StError | Custom = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ChartErrorBarsUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endStyleCap)) __obj.updateDynamic("endStyleCap")(endStyleCap)
    if (format != null) __obj.updateDynamic("format")(format)
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartErrorBarsUpdateData]
  }
}

