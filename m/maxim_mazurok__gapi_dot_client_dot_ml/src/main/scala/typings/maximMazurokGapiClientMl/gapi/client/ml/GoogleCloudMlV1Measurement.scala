package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1Measurement extends StObject {
  
  /** Output only. Time that the trial has been running at the point of this measurement. */
  var elapsedTime: js.UndefOr[String] = js.undefined
  
  /** Provides a list of metrics that act as inputs into the objective function. */
  var metrics: js.UndefOr[js.Array[GoogleCloudMlV1MeasurementMetric]] = js.undefined
  
  /** The number of steps a machine learning model has been trained for. Must be non-negative. */
  var stepCount: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1Measurement {
  
  inline def apply(): GoogleCloudMlV1Measurement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Measurement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudMlV1Measurement] (val x: Self) extends AnyVal {
    
    inline def setElapsedTime(value: String): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    inline def setElapsedTimeUndefined: Self = StObject.set(x, "elapsedTime", js.undefined)
    
    inline def setMetrics(value: js.Array[GoogleCloudMlV1MeasurementMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: GoogleCloudMlV1MeasurementMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setStepCount(value: String): Self = StObject.set(x, "stepCount", value.asInstanceOf[js.Any])
    
    inline def setStepCountUndefined: Self = StObject.set(x, "stepCount", js.undefined)
  }
}
