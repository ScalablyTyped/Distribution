package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricRange extends js.Object {
  
  /** Range of values considered "good." For a one-sided range, set one bound to an infinite value. */
  var range: js.UndefOr[GoogleMonitoringV3Range] = js.native
  
  /** A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying the TimeSeries to use for evaluating window quality. */
  var timeSeries: js.UndefOr[String] = js.native
}
object MetricRange {
  
  @scala.inline
  def apply(): MetricRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricRange]
  }
  
  @scala.inline
  implicit class MetricRangeOps[Self <: MetricRange] (val x: Self) extends AnyVal {
    
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
    def setRange(value: GoogleMonitoringV3Range): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setTimeSeries(value: String): Self = this.set("timeSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSeries: Self = this.set("timeSeries", js.undefined)
  }
}
