package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartErrorBarsInclude
import typings.officeJs.Excel.ChartErrorBarsType
import typings.officeJs.officeJsStrings.Both
import typings.officeJs.officeJsStrings.Custom
import typings.officeJs.officeJsStrings.FixedValue
import typings.officeJs.officeJsStrings.MinusValues
import typings.officeJs.officeJsStrings.Percent
import typings.officeJs.officeJsStrings.PlusValues
import typings.officeJs.officeJsStrings.StDev
import typings.officeJs.officeJsStrings.StError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartErrorBars object, for use in `chartErrorBars.set({ ... })`. */
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
    if (!js.isUndefined(endStyleCap)) __obj.updateDynamic("endStyleCap")(endStyleCap.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartErrorBarsUpdateData]
  }
}

