package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

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
  var endStyleCap: js.UndefOr[scala.Boolean] = js.undefined
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
  var include: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsInclude | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Both | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MinusValues | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlusValues
  ] = js.undefined
  /**
    *
    * The type of range marked by the error bars.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FixedValue | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Percent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StDev | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StError | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Custom
  ] = js.undefined
  /**
    *
    * Specifies whether or not the error bars are displayed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartErrorBarsUpdateData {
  @scala.inline
  def apply(
    endStyleCap: js.UndefOr[scala.Boolean] = js.undefined,
    format: ChartErrorBarsFormatUpdateData = null,
    include: officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsInclude | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Both | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MinusValues | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlusValues = null,
    `type`: officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FixedValue | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Percent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StDev | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StError | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Custom = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
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

