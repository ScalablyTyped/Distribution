package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartBinType
import typings.officeJs.officeJsStrings.Auto
import typings.officeJs.officeJsStrings.BinCount
import typings.officeJs.officeJsStrings.BinWidth
import typings.officeJs.officeJsStrings.Category
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartBinOptions object, for use in `chartBinOptions.set({ ... })`. */
trait ChartBinOptionsUpdateData extends js.Object {
  /**
    *
    * Specifies if bin overflow is enabled in a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var allowOverflow: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if bin underflow is enabled in a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var allowUnderflow: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the bin count of a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the bin overflow value of a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var overflowValue: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the bin's type for a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[ChartBinType | Category | Auto | BinWidth | BinCount] = js.undefined
  /**
    *
    * Specifies the bin underflow value of a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underflowValue: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the bin width value of a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ChartBinOptionsUpdateData {
  @scala.inline
  def apply(
    allowOverflow: js.UndefOr[Boolean] = js.undefined,
    allowUnderflow: js.UndefOr[Boolean] = js.undefined,
    count: js.UndefOr[Double] = js.undefined,
    overflowValue: js.UndefOr[Double] = js.undefined,
    `type`: ChartBinType | Category | Auto | BinWidth | BinCount = null,
    underflowValue: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ChartBinOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowOverflow)) __obj.updateDynamic("allowOverflow")(allowOverflow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUnderflow)) __obj.updateDynamic("allowUnderflow")(allowUnderflow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowValue)) __obj.updateDynamic("overflowValue")(overflowValue.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(underflowValue)) __obj.updateDynamic("underflowValue")(underflowValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBinOptionsUpdateData]
  }
}

