package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionCut extends js.Object {
  
  /**
    * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries aggregating values. Must have ValueType = DISTRIBUTION and MetricKind = DELTA or
    * MetricKind = CUMULATIVE.
    */
  var distributionFilter: js.UndefOr[String] = js.native
  
  /** Range of values considered "good." For a one-sided range, set one bound to an infinite value. */
  var range: js.UndefOr[GoogleMonitoringV3Range] = js.native
}
object DistributionCut {
  
  @scala.inline
  def apply(): DistributionCut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionCut]
  }
  
  @scala.inline
  implicit class DistributionCutOps[Self <: DistributionCut] (val x: Self) extends AnyVal {
    
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
    def setDistributionFilter(value: String): Self = this.set("distributionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributionFilter: Self = this.set("distributionFilter", js.undefined)
    
    @scala.inline
    def setRange(value: GoogleMonitoringV3Range): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
