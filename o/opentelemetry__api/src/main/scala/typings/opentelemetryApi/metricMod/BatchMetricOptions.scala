package typings.opentelemetryApi.metricMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchMetricOptions extends MetricOptions {
  
  /**
    * Indicates how long the batch metric should wait to update before cancel
    */
  var maxTimeoutUpdateMS: js.UndefOr[Double] = js.native
}
object BatchMetricOptions {
  
  @scala.inline
  def apply(): BatchMetricOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchMetricOptions]
  }
  
  @scala.inline
  implicit class BatchMetricOptionsOps[Self <: BatchMetricOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxTimeoutUpdateMS(value: Double): Self = this.set("maxTimeoutUpdateMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTimeoutUpdateMS: Self = this.set("maxTimeoutUpdateMS", js.undefined)
  }
}
