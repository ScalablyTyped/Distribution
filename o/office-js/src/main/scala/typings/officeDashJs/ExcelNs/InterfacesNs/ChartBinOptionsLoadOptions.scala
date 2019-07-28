package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the bin options for histogram charts and pareto charts.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ChartBinOptionsLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
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
  var count: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets the bin overflow value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var overflowValue: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets the bin's type for a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets the bin underflow value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underflowValue: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets the bin width value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}

object ChartBinOptionsLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    allowOverflow: js.UndefOr[Boolean] = js.undefined,
    allowUnderflow: js.UndefOr[Boolean] = js.undefined,
    count: js.UndefOr[Boolean] = js.undefined,
    overflowValue: js.UndefOr[Boolean] = js.undefined,
    `type`: js.UndefOr[Boolean] = js.undefined,
    underflowValue: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Boolean] = js.undefined
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

