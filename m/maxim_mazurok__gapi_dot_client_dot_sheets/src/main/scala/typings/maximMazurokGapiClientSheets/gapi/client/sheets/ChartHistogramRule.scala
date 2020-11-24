package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartHistogramRule extends js.Object {
  
  /** The size of the buckets that are created. Must be positive. */
  var intervalSize: js.UndefOr[Double] = js.native
  
  /** The maximum value at which items are placed into buckets. Values greater than the maximum are grouped into a single bucket. If omitted, it is determined by the maximum item value. */
  var maxValue: js.UndefOr[Double] = js.native
  
  /**
    * The minimum value at which items are placed into buckets. Values that are less than the minimum are grouped into a single bucket. If omitted, it is determined by the minimum item
    * value.
    */
  var minValue: js.UndefOr[Double] = js.native
}
object ChartHistogramRule {
  
  @scala.inline
  def apply(): ChartHistogramRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartHistogramRule]
  }
  
  @scala.inline
  implicit class ChartHistogramRuleOps[Self <: ChartHistogramRule] (val x: Self) extends AnyVal {
    
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
    def setIntervalSize(value: Double): Self = this.set("intervalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntervalSize: Self = this.set("intervalSize", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
  }
}
