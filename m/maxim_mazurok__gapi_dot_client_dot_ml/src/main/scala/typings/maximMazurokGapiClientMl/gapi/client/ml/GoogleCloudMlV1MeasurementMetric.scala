package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1MeasurementMetric extends StObject {
  
  /** Required. Metric name. */
  var metric: js.UndefOr[String] = js.undefined
  
  /** Required. The value for this metric. */
  var value: js.UndefOr[Double] = js.undefined
}
object GoogleCloudMlV1MeasurementMetric {
  
  inline def apply(): GoogleCloudMlV1MeasurementMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1MeasurementMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudMlV1MeasurementMetric] (val x: Self) extends AnyVal {
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
