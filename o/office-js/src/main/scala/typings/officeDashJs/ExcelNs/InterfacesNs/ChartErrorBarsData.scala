package typings.officeDashJs.ExcelNs.InterfacesNs

import typings.officeDashJs.ExcelNs.ChartErrorBarsInclude
import typings.officeDashJs.ExcelNs.ChartErrorBarsType
import typings.officeDashJs.officeDashJsStrings.Both
import typings.officeDashJs.officeDashJsStrings.Custom
import typings.officeDashJs.officeDashJsStrings.FixedValue
import typings.officeDashJs.officeDashJsStrings.MinusValues
import typings.officeDashJs.officeDashJsStrings.Percent
import typings.officeDashJs.officeDashJsStrings.PlusValues
import typings.officeDashJs.officeDashJsStrings.StDev
import typings.officeDashJs.officeDashJsStrings.StError
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
  var endStyleCap: js.UndefOr[Boolean] = js.undefined
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

object ChartErrorBarsData {
  @scala.inline
  def apply(
    endStyleCap: js.UndefOr[Boolean] = js.undefined,
    format: ChartErrorBarsFormatData = null,
    include: ChartErrorBarsInclude | Both | MinusValues | PlusValues = null,
    `type`: ChartErrorBarsType | FixedValue | Percent | StDev | StError | Custom = null,
    visible: js.UndefOr[Boolean] = js.undefined
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

