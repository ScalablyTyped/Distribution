package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Subtotals for the Pivot Field.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait Subtotals extends js.Object {
  /**
    *
    * If Automatic is set to true, then all other values will be ignored when setting the Subtotals.
    *
    * [Api set: ExcelApi 1.8]
    */
  var automatic: js.UndefOr[Boolean] = js.native
  var average: js.UndefOr[Boolean] = js.native
  var count: js.UndefOr[Boolean] = js.native
  var countNumbers: js.UndefOr[Boolean] = js.native
  var max: js.UndefOr[Boolean] = js.native
  var min: js.UndefOr[Boolean] = js.native
  var product: js.UndefOr[Boolean] = js.native
  var standardDeviation: js.UndefOr[Boolean] = js.native
  var standardDeviationP: js.UndefOr[Boolean] = js.native
  var sum: js.UndefOr[Boolean] = js.native
  var variance: js.UndefOr[Boolean] = js.native
  var varianceP: js.UndefOr[Boolean] = js.native
}

object Subtotals {
  @scala.inline
  def apply(): Subtotals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subtotals]
  }
  @scala.inline
  implicit class SubtotalsOps[Self <: Subtotals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutomatic(value: Boolean): Self = this.set("automatic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomatic: Self = this.set("automatic", js.undefined)
    @scala.inline
    def setAverage(value: Boolean): Self = this.set("average", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverage: Self = this.set("average", js.undefined)
    @scala.inline
    def setCount(value: Boolean): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setCountNumbers(value: Boolean): Self = this.set("countNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountNumbers: Self = this.set("countNumbers", js.undefined)
    @scala.inline
    def setMax(value: Boolean): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Boolean): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setProduct(value: Boolean): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    @scala.inline
    def setStandardDeviation(value: Boolean): Self = this.set("standardDeviation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardDeviation: Self = this.set("standardDeviation", js.undefined)
    @scala.inline
    def setStandardDeviationP(value: Boolean): Self = this.set("standardDeviationP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardDeviationP: Self = this.set("standardDeviationP", js.undefined)
    @scala.inline
    def setSum(value: Boolean): Self = this.set("sum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
    @scala.inline
    def setVariance(value: Boolean): Self = this.set("variance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariance: Self = this.set("variance", js.undefined)
    @scala.inline
    def setVarianceP(value: Boolean): Self = this.set("varianceP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVarianceP: Self = this.set("varianceP", js.undefined)
  }
  
}

