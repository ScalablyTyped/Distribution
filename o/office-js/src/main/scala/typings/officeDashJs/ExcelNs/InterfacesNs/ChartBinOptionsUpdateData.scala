package typings.officeDashJs.ExcelNs.InterfacesNs

import typings.officeDashJs.ExcelNs.ChartBinType
import typings.officeDashJs.officeDashJsStrings.Auto
import typings.officeDashJs.officeDashJsStrings.BinCount
import typings.officeDashJs.officeDashJsStrings.BinWidth
import typings.officeDashJs.officeDashJsStrings.Category
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartBinOptions object, for use in `chartBinOptions.set({ ... })`. */
trait ChartBinOptionsUpdateData extends js.Object {
  /**
    *
    * Specifies whether or not the bin overflow is enabled in a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var allowOverflow: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the bin underflow is enabled in a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var allowUnderflow: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets the bin count of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns or sets the bin overflow value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var overflowValue: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns or sets the bin's type for a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[ChartBinType | Category | Auto | BinWidth | BinCount] = js.undefined
  /**
    *
    * Returns or sets the bin underflow value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underflowValue: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns or sets the bin width value of a histogram chart or pareto chart. Read/Write.
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
    count: Int | Double = null,
    overflowValue: Int | Double = null,
    `type`: ChartBinType | Category | Auto | BinWidth | BinCount = null,
    underflowValue: Int | Double = null,
    width: Int | Double = null
  ): ChartBinOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowOverflow)) __obj.updateDynamic("allowOverflow")(allowOverflow)
    if (!js.isUndefined(allowUnderflow)) __obj.updateDynamic("allowUnderflow")(allowUnderflow)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (overflowValue != null) __obj.updateDynamic("overflowValue")(overflowValue.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underflowValue != null) __obj.updateDynamic("underflowValue")(underflowValue.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBinOptionsUpdateData]
  }
}

