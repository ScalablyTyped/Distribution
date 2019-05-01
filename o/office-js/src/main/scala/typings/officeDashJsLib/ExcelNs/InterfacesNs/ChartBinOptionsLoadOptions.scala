package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the bon options only for histogram chart and pareto chart.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ChartBinOptionsLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
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
  var count: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets bin overflow value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var overflowValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets bin type of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets bin underflow value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underflowValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets bin width value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartBinOptionsLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    allowOverflow: js.UndefOr[scala.Boolean] = js.undefined,
    allowUnderflow: js.UndefOr[scala.Boolean] = js.undefined,
    count: js.UndefOr[scala.Boolean] = js.undefined,
    overflowValue: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: js.UndefOr[scala.Boolean] = js.undefined,
    underflowValue: js.UndefOr[scala.Boolean] = js.undefined,
    width: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartBinOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(allowOverflow)) __obj.updateDynamic("allowOverflow")(allowOverflow)
    if (!js.isUndefined(allowUnderflow)) __obj.updateDynamic("allowUnderflow")(allowUnderflow)
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count)
    if (!js.isUndefined(overflowValue)) __obj.updateDynamic("overflowValue")(overflowValue)
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(underflowValue)) __obj.updateDynamic("underflowValue")(underflowValue)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ChartBinOptionsLoadOptions]
  }
}

