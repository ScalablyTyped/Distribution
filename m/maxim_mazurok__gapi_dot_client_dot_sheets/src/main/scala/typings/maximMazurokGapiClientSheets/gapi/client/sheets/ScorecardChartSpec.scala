package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScorecardChartSpec extends StObject {
  
  /**
    * The aggregation type for key and baseline chart data in scorecard chart. This field is not supported for data source charts. Use the ChartData.aggregateType field of the
    * key_value_data or baseline_value_data instead for data source charts. This field is optional.
    */
  var aggregateType: js.UndefOr[String] = js.undefined
  
  /** The data for scorecard baseline value. This field is optional. */
  var baselineValueData: js.UndefOr[ChartData] = js.undefined
  
  /** Formatting options for baseline value. This field is needed only if baseline_value_data is specified. */
  var baselineValueFormat: js.UndefOr[BaselineValueFormat] = js.undefined
  
  /** Custom formatting options for numeric key/baseline values in scorecard chart. This field is used only when number_format_source is set to CUSTOM. This field is optional. */
  var customFormatOptions: js.UndefOr[ChartCustomNumberFormatOptions] = js.undefined
  
  /** The data for scorecard key value. */
  var keyValueData: js.UndefOr[ChartData] = js.undefined
  
  /** Formatting options for key value. */
  var keyValueFormat: js.UndefOr[KeyValueFormat] = js.undefined
  
  /** The number format source used in the scorecard chart. This field is optional. */
  var numberFormatSource: js.UndefOr[String] = js.undefined
  
  /** Value to scale scorecard key and baseline value. For example, a factor of 10 can be used to divide all values in the chart by 10. This field is optional. */
  var scaleFactor: js.UndefOr[Double] = js.undefined
}
object ScorecardChartSpec {
  
  @scala.inline
  def apply(): ScorecardChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScorecardChartSpec]
  }
  
  @scala.inline
  implicit class ScorecardChartSpecMutableBuilder[Self <: ScorecardChartSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregateType(value: String): Self = StObject.set(x, "aggregateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateTypeUndefined: Self = StObject.set(x, "aggregateType", js.undefined)
    
    @scala.inline
    def setBaselineValueData(value: ChartData): Self = StObject.set(x, "baselineValueData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineValueDataUndefined: Self = StObject.set(x, "baselineValueData", js.undefined)
    
    @scala.inline
    def setBaselineValueFormat(value: BaselineValueFormat): Self = StObject.set(x, "baselineValueFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineValueFormatUndefined: Self = StObject.set(x, "baselineValueFormat", js.undefined)
    
    @scala.inline
    def setCustomFormatOptions(value: ChartCustomNumberFormatOptions): Self = StObject.set(x, "customFormatOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFormatOptionsUndefined: Self = StObject.set(x, "customFormatOptions", js.undefined)
    
    @scala.inline
    def setKeyValueData(value: ChartData): Self = StObject.set(x, "keyValueData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyValueDataUndefined: Self = StObject.set(x, "keyValueData", js.undefined)
    
    @scala.inline
    def setKeyValueFormat(value: KeyValueFormat): Self = StObject.set(x, "keyValueFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyValueFormatUndefined: Self = StObject.set(x, "keyValueFormat", js.undefined)
    
    @scala.inline
    def setNumberFormatSource(value: String): Self = StObject.set(x, "numberFormatSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatSourceUndefined: Self = StObject.set(x, "numberFormatSource", js.undefined)
    
    @scala.inline
    def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
  }
}
