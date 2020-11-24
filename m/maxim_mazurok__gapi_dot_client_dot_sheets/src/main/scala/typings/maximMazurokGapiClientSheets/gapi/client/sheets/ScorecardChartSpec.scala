package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScorecardChartSpec extends js.Object {
  
  /**
    * The aggregation type for key and baseline chart data in scorecard chart. This field is not supported for data source charts. Use the ChartData.aggregateType field of the
    * key_value_data or baseline_value_data instead for data source charts. This field is optional.
    */
  var aggregateType: js.UndefOr[String] = js.native
  
  /** The data for scorecard baseline value. This field is optional. */
  var baselineValueData: js.UndefOr[ChartData] = js.native
  
  /** Formatting options for baseline value. This field is needed only if baseline_value_data is specified. */
  var baselineValueFormat: js.UndefOr[BaselineValueFormat] = js.native
  
  /** Custom formatting options for numeric key/baseline values in scorecard chart. This field is used only when number_format_source is set to CUSTOM. This field is optional. */
  var customFormatOptions: js.UndefOr[ChartCustomNumberFormatOptions] = js.native
  
  /** The data for scorecard key value. */
  var keyValueData: js.UndefOr[ChartData] = js.native
  
  /** Formatting options for key value. */
  var keyValueFormat: js.UndefOr[KeyValueFormat] = js.native
  
  /** The number format source used in the scorecard chart. This field is optional. */
  var numberFormatSource: js.UndefOr[String] = js.native
  
  /** Value to scale scorecard key and baseline value. For example, a factor of 10 can be used to divide all values in the chart by 10. This field is optional. */
  var scaleFactor: js.UndefOr[Double] = js.native
}
object ScorecardChartSpec {
  
  @scala.inline
  def apply(): ScorecardChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScorecardChartSpec]
  }
  
  @scala.inline
  implicit class ScorecardChartSpecOps[Self <: ScorecardChartSpec] (val x: Self) extends AnyVal {
    
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
    def setAggregateType(value: String): Self = this.set("aggregateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregateType: Self = this.set("aggregateType", js.undefined)
    
    @scala.inline
    def setBaselineValueData(value: ChartData): Self = this.set("baselineValueData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineValueData: Self = this.set("baselineValueData", js.undefined)
    
    @scala.inline
    def setBaselineValueFormat(value: BaselineValueFormat): Self = this.set("baselineValueFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineValueFormat: Self = this.set("baselineValueFormat", js.undefined)
    
    @scala.inline
    def setCustomFormatOptions(value: ChartCustomNumberFormatOptions): Self = this.set("customFormatOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFormatOptions: Self = this.set("customFormatOptions", js.undefined)
    
    @scala.inline
    def setKeyValueData(value: ChartData): Self = this.set("keyValueData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyValueData: Self = this.set("keyValueData", js.undefined)
    
    @scala.inline
    def setKeyValueFormat(value: KeyValueFormat): Self = this.set("keyValueFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyValueFormat: Self = this.set("keyValueFormat", js.undefined)
    
    @scala.inline
    def setNumberFormatSource(value: String): Self = this.set("numberFormatSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormatSource: Self = this.set("numberFormatSource", js.undefined)
    
    @scala.inline
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleFactor: Self = this.set("scaleFactor", js.undefined)
  }
}
