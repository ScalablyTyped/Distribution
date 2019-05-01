package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartBinOptions object, for use in "chartBinOptions.set({ ... })". */
trait ChartBinOptionsUpdateData extends js.Object {
  /**
    *
    * Returns or sets if bin overflow enabled in a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var allowOverflow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets if bin underflow enabled in a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var allowUnderflow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets count of bin of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets bin overflow value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var overflowValue: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets bin type of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartBinType | officeDashJsLib.officeDashJsLibStrings.Category | officeDashJsLib.officeDashJsLibStrings.Auto | officeDashJsLib.officeDashJsLibStrings.BinWidth | officeDashJsLib.officeDashJsLibStrings.BinCount
  ] = js.undefined
  /**
    *
    * Returns or sets bin underflow value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underflowValue: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets bin width value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ChartBinOptionsUpdateData {
  @scala.inline
  def apply(
    allowOverflow: js.UndefOr[scala.Boolean] = js.undefined,
    allowUnderflow: js.UndefOr[scala.Boolean] = js.undefined,
    count: scala.Int | scala.Double = null,
    overflowValue: scala.Int | scala.Double = null,
    `type`: officeDashJsLib.ExcelNs.ChartBinType | officeDashJsLib.officeDashJsLibStrings.Category | officeDashJsLib.officeDashJsLibStrings.Auto | officeDashJsLib.officeDashJsLibStrings.BinWidth | officeDashJsLib.officeDashJsLibStrings.BinCount = null,
    underflowValue: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
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

