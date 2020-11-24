package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsBasedSli extends js.Object {
  
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
  implicit class WindowsBasedSliOps[Self <: WindowsBasedSli] (val x: Self) extends AnyVal {
    
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
    def setGoodBadMetricFilter(value: String): Self = this.set("goodBadMetricFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoodBadMetricFilter: Self = this.set("goodBadMetricFilter", js.undefined)
    
    @scala.inline
    def setGoodTotalRatioThreshold(value: PerformanceThreshold): Self = this.set("goodTotalRatioThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoodTotalRatioThreshold: Self = this.set("goodTotalRatioThreshold", js.undefined)
    
    @scala.inline
    def setMetricMeanInRange(value: MetricRange): Self = this.set("metricMeanInRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricMeanInRange: Self = this.set("metricMeanInRange", js.undefined)
    
    @scala.inline
    def setMetricSumInRange(value: MetricRange): Self = this.set("metricSumInRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricSumInRange: Self = this.set("metricSumInRange", js.undefined)
    
    @scala.inline
    def setWindowPeriod(value: String): Self = this.set("windowPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowPeriod: Self = this.set("windowPeriod", js.undefined)
  }
}
