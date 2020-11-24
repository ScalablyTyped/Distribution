package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1Measurement extends js.Object {
  
  /** Output only. Time that the trial has been running at the point of this measurement. */
  var elapsedTime: js.UndefOr[String] = js.native
  
  /** Provides a list of metrics that act as inputs into the objective function. */
  var metrics: js.UndefOr[js.Array[GoogleCloudMlV1MeasurementMetric]] = js.native
  
  /** The number of steps a machine learning model has been trained for. Must be non-negative. */
  var stepCount: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1Measurement {
  
  @scala.inline
  def apply(): GoogleCloudMlV1Measurement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Measurement]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1MeasurementOps[Self <: GoogleCloudMlV1Measurement] (val x: Self) extends AnyVal {
    
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
    def setElapsedTime(value: String): Self = this.set("elapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElapsedTime: Self = this.set("elapsedTime", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: GoogleCloudMlV1MeasurementMetric*): Self = this.set("metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[GoogleCloudMlV1MeasurementMetric]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setStepCount(value: String): Self = this.set("stepCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepCount: Self = this.set("stepCount", js.undefined)
  }
}
