package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartErrorBars.toJSON()". */
trait ChartErrorBarsData extends js.Object {
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
  var format: js.UndefOr[ChartErrorBarsFormatData] = js.undefined
  /**
    *
    * Specifies which parts of the error bars to include.
    *
    * [Api set: ExcelApi 1.9]
    */
  var include: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartErrorBarsInclude | officeDashJsLib.officeDashJsLibStrings.Both | officeDashJsLib.officeDashJsLibStrings.MinusValues | officeDashJsLib.officeDashJsLibStrings.PlusValues
  ] = js.undefined
  /**
    *
    * The type of range marked by the error bars.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartErrorBarsType | officeDashJsLib.officeDashJsLibStrings.FixedValue | officeDashJsLib.officeDashJsLibStrings.Percent | officeDashJsLib.officeDashJsLibStrings.StDev | officeDashJsLib.officeDashJsLibStrings.StError | officeDashJsLib.officeDashJsLibStrings.Custom
  ] = js.undefined
  /**
    *
    * Specifies whether or not the error bars are displayed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartErrorBarsData {
  @scala.inline
  def apply(
    endStyleCap: js.UndefOr[scala.Boolean] = js.undefined,
    format: ChartErrorBarsFormatData = null,
    include: officeDashJsLib.ExcelNs.ChartErrorBarsInclude | officeDashJsLib.officeDashJsLibStrings.Both | officeDashJsLib.officeDashJsLibStrings.MinusValues | officeDashJsLib.officeDashJsLibStrings.PlusValues = null,
    `type`: officeDashJsLib.ExcelNs.ChartErrorBarsType | officeDashJsLib.officeDashJsLibStrings.FixedValue | officeDashJsLib.officeDashJsLibStrings.Percent | officeDashJsLib.officeDashJsLibStrings.StDev | officeDashJsLib.officeDashJsLibStrings.StError | officeDashJsLib.officeDashJsLibStrings.Custom = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartErrorBarsData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endStyleCap)) __obj.updateDynamic("endStyleCap")(endStyleCap)
    if (format != null) __obj.updateDynamic("format")(format)
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartErrorBarsData]
  }
}

