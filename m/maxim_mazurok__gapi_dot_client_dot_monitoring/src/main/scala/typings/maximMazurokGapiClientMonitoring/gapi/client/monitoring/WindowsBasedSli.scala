package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsBasedSli extends StObject {
  
  /** A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries with ValueType = BOOL. The window is good if any true values appear in the window. */
  var goodBadMetricFilter: js.UndefOr[String] = js.undefined
  
  /** A window is good if its performance is high enough. */
  var goodTotalRatioThreshold: js.UndefOr[PerformanceThreshold] = js.undefined
  
  /** A window is good if the metric's value is in a good range, averaged across returned streams. */
  var metricMeanInRange: js.UndefOr[MetricRange] = js.undefined
  
  /** A window is good if the metric's value is in a good range, summed across returned streams. */
  var metricSumInRange: js.UndefOr[MetricRange] = js.undefined
  
  /** Duration over which window quality is evaluated. Must be an integer fraction of a day and at least 60s. */
  var windowPeriod: js.UndefOr[String] = js.undefined
}
object WindowsBasedSli {
  
  inline def apply(): WindowsBasedSli = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsBasedSli]
  }
  
  extension [Self <: WindowsBasedSli](x: Self) {
    
    inline def setGoodBadMetricFilter(value: String): Self = StObject.set(x, "goodBadMetricFilter", value.asInstanceOf[js.Any])
    
    inline def setGoodBadMetricFilterUndefined: Self = StObject.set(x, "goodBadMetricFilter", js.undefined)
    
    inline def setGoodTotalRatioThreshold(value: PerformanceThreshold): Self = StObject.set(x, "goodTotalRatioThreshold", value.asInstanceOf[js.Any])
    
    inline def setGoodTotalRatioThresholdUndefined: Self = StObject.set(x, "goodTotalRatioThreshold", js.undefined)
    
    inline def setMetricMeanInRange(value: MetricRange): Self = StObject.set(x, "metricMeanInRange", value.asInstanceOf[js.Any])
    
    inline def setMetricMeanInRangeUndefined: Self = StObject.set(x, "metricMeanInRange", js.undefined)
    
    inline def setMetricSumInRange(value: MetricRange): Self = StObject.set(x, "metricSumInRange", value.asInstanceOf[js.Any])
    
    inline def setMetricSumInRangeUndefined: Self = StObject.set(x, "metricSumInRange", js.undefined)
    
    inline def setWindowPeriod(value: String): Self = StObject.set(x, "windowPeriod", value.asInstanceOf[js.Any])
    
    inline def setWindowPeriodUndefined: Self = StObject.set(x, "windowPeriod", js.undefined)
  }
}
