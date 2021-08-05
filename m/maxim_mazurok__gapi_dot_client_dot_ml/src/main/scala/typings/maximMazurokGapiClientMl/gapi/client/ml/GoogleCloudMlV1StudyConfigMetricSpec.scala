package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1StudyConfigMetricSpec extends StObject {
  
  /** Required. The optimization goal of the metric. */
  var goal: js.UndefOr[String] = js.undefined
  
  /** Required. The name of the metric. */
  var metric: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1StudyConfigMetricSpec {
  
  inline def apply(): GoogleCloudMlV1StudyConfigMetricSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1StudyConfigMetricSpec]
  }
  
  extension [Self <: GoogleCloudMlV1StudyConfigMetricSpec](x: Self) {
    
    inline def setGoal(value: String): Self = StObject.set(x, "goal", value.asInstanceOf[js.Any])
    
    inline def setGoalUndefined: Self = StObject.set(x, "goal", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
  }
}
