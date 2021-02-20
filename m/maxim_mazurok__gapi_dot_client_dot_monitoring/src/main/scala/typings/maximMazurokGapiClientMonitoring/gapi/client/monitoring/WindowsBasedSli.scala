package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsBasedSli extends StObject {
  
  /** A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries with ValueType = BOOL. The window is good if any true values appear in the window. */
  var goodBadMetricFilter: js.UndefOr[String] = js.native
  
  /** A window is good if its performance is high enough. */
  var goodTotalRatioThreshold: js.UndefOr[PerformanceThreshold] = js.native
  
  /** A window is good if the metric's value is in a good range, averaged across returned streams. */
  var metricMeanInRange: js.UndefOr[MetricRange] = js.native
  
  /** A window is good if the metric's value is in a good range, summed across returned streams. */
  var metricSumInRange: js.UndefOr[MetricRange] = js.native
  
  /** Duration over which window quality is evaluated. Must be an integer fraction of a day and at least 60s. */
  var windowPeriod: js.UndefOr[String] = js.native
}
object WindowsBasedSli {
  
  @scala.inline
  def apply(): WindowsBasedSli = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsBasedSli]
  }
  
  @scala.inline
  implicit class WindowsBasedSliMutableBuilder[Self <: WindowsBasedSli] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoodBadMetricFilter(value: String): Self = StObject.set(x, "goodBadMetricFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoodBadMetricFilterUndefined: Self = StObject.set(x, "goodBadMetricFilter", js.undefined)
    
    @scala.inline
    def setGoodTotalRatioThreshold(value: PerformanceThreshold): Self = StObject.set(x, "goodTotalRatioThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoodTotalRatioThresholdUndefined: Self = StObject.set(x, "goodTotalRatioThreshold", js.undefined)
    
    @scala.inline
    def setMetricMeanInRange(value: MetricRange): Self = StObject.set(x, "metricMeanInRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricMeanInRangeUndefined: Self = StObject.set(x, "metricMeanInRange", js.undefined)
    
    @scala.inline
    def setMetricSumInRange(value: MetricRange): Self = StObject.set(x, "metricSumInRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricSumInRangeUndefined: Self = StObject.set(x, "metricSumInRange", js.undefined)
    
    @scala.inline
    def setWindowPeriod(value: String): Self = StObject.set(x, "windowPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowPeriodUndefined: Self = StObject.set(x, "windowPeriod", js.undefined)
  }
}
