package typings.officeJsPreview.Excel

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
  var automatic: js.UndefOr[Boolean] = js.undefined
  var average: js.UndefOr[Boolean] = js.undefined
  var count: js.UndefOr[Boolean] = js.undefined
  var countNumbers: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Boolean] = js.undefined
  var min: js.UndefOr[Boolean] = js.undefined
  var product: js.UndefOr[Boolean] = js.undefined
  var standardDeviation: js.UndefOr[Boolean] = js.undefined
  var standardDeviationP: js.UndefOr[Boolean] = js.undefined
  var sum: js.UndefOr[Boolean] = js.undefined
  var variance: js.UndefOr[Boolean] = js.undefined
  var varianceP: js.UndefOr[Boolean] = js.undefined
}

object Subtotals {
  @scala.inline
  def apply(
    automatic: js.UndefOr[Boolean] = js.undefined,
    average: js.UndefOr[Boolean] = js.undefined,
    count: js.UndefOr[Boolean] = js.undefined,
    countNumbers: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Boolean] = js.undefined,
    min: js.UndefOr[Boolean] = js.undefined,
    product: js.UndefOr[Boolean] = js.undefined,
    standardDeviation: js.UndefOr[Boolean] = js.undefined,
    standardDeviationP: js.UndefOr[Boolean] = js.undefined,
    sum: js.UndefOr[Boolean] = js.undefined,
    variance: js.UndefOr[Boolean] = js.undefined,
    varianceP: js.UndefOr[Boolean] = js.undefined
  ): Subtotals = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automatic)) __obj.updateDynamic("automatic")(automatic.asInstanceOf[js.Any])
    if (!js.isUndefined(average)) __obj.updateDynamic("average")(average.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(countNumbers)) __obj.updateDynamic("countNumbers")(countNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(product)) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (!js.isUndefined(standardDeviation)) __obj.updateDynamic("standardDeviation")(standardDeviation.asInstanceOf[js.Any])
    if (!js.isUndefined(standardDeviationP)) __obj.updateDynamic("standardDeviationP")(standardDeviationP.asInstanceOf[js.Any])
    if (!js.isUndefined(sum)) __obj.updateDynamic("sum")(sum.asInstanceOf[js.Any])
    if (!js.isUndefined(variance)) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    if (!js.isUndefined(varianceP)) __obj.updateDynamic("varianceP")(varianceP.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subtotals]
  }
}

