package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Subtotals for the Pivot Field.
  *
  * [Api set: ExcelApi 1.8]
  */
trait Subtotals extends js.Object {
  /**
    *
    * If Automatic is set to true, then all other values will be ignored when setting the Subtotals.
    *
    * [Api set: ExcelApi 1.8]
    */
  var automatic: js.UndefOr[scala.Boolean] = js.undefined
  var average: js.UndefOr[scala.Boolean] = js.undefined
  var count: js.UndefOr[scala.Boolean] = js.undefined
  var countNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Boolean] = js.undefined
  var min: js.UndefOr[scala.Boolean] = js.undefined
  var product: js.UndefOr[scala.Boolean] = js.undefined
  var standardDeviation: js.UndefOr[scala.Boolean] = js.undefined
  var standardDeviationP: js.UndefOr[scala.Boolean] = js.undefined
  var sum: js.UndefOr[scala.Boolean] = js.undefined
  var variance: js.UndefOr[scala.Boolean] = js.undefined
  var varianceP: js.UndefOr[scala.Boolean] = js.undefined
}

object Subtotals {
  @scala.inline
  def apply(
    automatic: js.UndefOr[scala.Boolean] = js.undefined,
    average: js.UndefOr[scala.Boolean] = js.undefined,
    count: js.UndefOr[scala.Boolean] = js.undefined,
    countNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    max: js.UndefOr[scala.Boolean] = js.undefined,
    min: js.UndefOr[scala.Boolean] = js.undefined,
    product: js.UndefOr[scala.Boolean] = js.undefined,
    standardDeviation: js.UndefOr[scala.Boolean] = js.undefined,
    standardDeviationP: js.UndefOr[scala.Boolean] = js.undefined,
    sum: js.UndefOr[scala.Boolean] = js.undefined,
    variance: js.UndefOr[scala.Boolean] = js.undefined,
    varianceP: js.UndefOr[scala.Boolean] = js.undefined
  ): Subtotals = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automatic)) __obj.updateDynamic("automatic")(automatic)
    if (!js.isUndefined(average)) __obj.updateDynamic("average")(average)
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count)
    if (!js.isUndefined(countNumbers)) __obj.updateDynamic("countNumbers")(countNumbers)
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max)
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min)
    if (!js.isUndefined(product)) __obj.updateDynamic("product")(product)
    if (!js.isUndefined(standardDeviation)) __obj.updateDynamic("standardDeviation")(standardDeviation)
    if (!js.isUndefined(standardDeviationP)) __obj.updateDynamic("standardDeviationP")(standardDeviationP)
    if (!js.isUndefined(sum)) __obj.updateDynamic("sum")(sum)
    if (!js.isUndefined(variance)) __obj.updateDynamic("variance")(variance)
    if (!js.isUndefined(varianceP)) __obj.updateDynamic("varianceP")(varianceP)
    __obj.asInstanceOf[Subtotals]
  }
}

