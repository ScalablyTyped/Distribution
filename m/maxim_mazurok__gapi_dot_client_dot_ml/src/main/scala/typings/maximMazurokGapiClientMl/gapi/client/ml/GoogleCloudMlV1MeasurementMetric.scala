package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1MeasurementMetric extends StObject {
  
  /** Required. Metric name. */
  var metric: js.UndefOr[String] = js.native
  
  /** Required. The value for this metric. */
  var value: js.UndefOr[Double] = js.native
}
object GoogleCloudMlV1MeasurementMetric {
  
  @scala.inline
  def apply(): GoogleCloudMlV1MeasurementMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1MeasurementMetric]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1MeasurementMetricMutableBuilder[Self <: GoogleCloudMlV1MeasurementMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
