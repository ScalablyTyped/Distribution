package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionCut extends StObject {
  
  /**
    * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries aggregating values. Must have ValueType = DISTRIBUTION and MetricKind = DELTA or
    * MetricKind = CUMULATIVE.
    */
  var distributionFilter: js.UndefOr[String] = js.undefined
  
  /** Range of values considered "good." For a one-sided range, set one bound to an infinite value. */
  var range: js.UndefOr[GoogleMonitoringV3Range] = js.undefined
}
object DistributionCut {
  
  @scala.inline
  def apply(): DistributionCut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionCut]
  }
  
  @scala.inline
  implicit class DistributionCutMutableBuilder[Self <: DistributionCut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionFilter(value: String): Self = StObject.set(x, "distributionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionFilterUndefined: Self = StObject.set(x, "distributionFilter", js.undefined)
    
    @scala.inline
    def setRange(value: GoogleMonitoringV3Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
