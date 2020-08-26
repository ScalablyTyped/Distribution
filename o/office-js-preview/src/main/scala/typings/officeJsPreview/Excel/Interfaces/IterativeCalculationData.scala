package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `iterativeCalculation.toJSON()`. */
@js.native
trait IterativeCalculationData extends js.Object {
  /**
    *
    * True if Excel will use iteration to resolve circular references.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the maximum amount of change between each iteration as Excel resolves circular references.
    *
    * [Api set: ExcelApi 1.9]
    */
  var maxChange: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies the maximum number of iterations that Excel can use to resolve a circular reference.
    *
    * [Api set: ExcelApi 1.9]
    */
  var maxIteration: js.UndefOr[Double] = js.native
}

object IterativeCalculationData {
  @scala.inline
  def apply(): IterativeCalculationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IterativeCalculationData]
  }
  @scala.inline
  implicit class IterativeCalculationDataOps[Self <: IterativeCalculationData] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setMaxChange(value: Double): Self = this.set("maxChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxChange: Self = this.set("maxChange", js.undefined)
    @scala.inline
    def setMaxIteration(value: Double): Self = this.set("maxIteration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxIteration: Self = this.set("maxIteration", js.undefined)
  }
  
}

