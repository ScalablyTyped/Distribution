package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricRange extends StObject {
  
  /** Range of values considered "good." For a one-sided range, set one bound to an infinite value. */
  var range: js.UndefOr[GoogleMonitoringV3Range] = js.undefined
  
  /** A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying the TimeSeries to use for evaluating window quality. */
  var timeSeries: js.UndefOr[String] = js.undefined
}
object MetricRange {
  
  @scala.inline
  def apply(): MetricRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricRange]
  }
  
  @scala.inline
  implicit class MetricRangeMutableBuilder[Self <: MetricRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: GoogleMonitoringV3Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setTimeSeries(value: String): Self = StObject.set(x, "timeSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeriesUndefined: Self = StObject.set(x, "timeSeries", js.undefined)
  }
}
