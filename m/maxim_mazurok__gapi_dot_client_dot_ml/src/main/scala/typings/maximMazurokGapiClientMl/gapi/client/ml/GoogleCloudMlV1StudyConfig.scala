package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1StudyConfig extends StObject {
  
  /** The search algorithm specified for the study. */
  var algorithm: js.UndefOr[String] = js.undefined
  
  /** Configuration for automated stopping of unpromising Trials. */
  var automatedStoppingConfig: js.UndefOr[GoogleCloudMlV1AutomatedStoppingConfig] = js.undefined
  
  /** Metric specs for the study. */
  var metrics: js.UndefOr[js.Array[GoogleCloudMlV1StudyConfigMetricSpec]] = js.undefined
  
  /** Required. The set of parameters to tune. */
  var parameters: js.UndefOr[js.Array[GoogleCloudMlV1StudyConfigParameterSpec]] = js.undefined
}
object GoogleCloudMlV1StudyConfig {
  
  inline def apply(): GoogleCloudMlV1StudyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1StudyConfig]
  }
  
  extension [Self <: GoogleCloudMlV1StudyConfig](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setAutomatedStoppingConfig(value: GoogleCloudMlV1AutomatedStoppingConfig): Self = StObject.set(x, "automatedStoppingConfig", value.asInstanceOf[js.Any])
    
    inline def setAutomatedStoppingConfigUndefined: Self = StObject.set(x, "automatedStoppingConfig", js.undefined)
    
    inline def setMetrics(value: js.Array[GoogleCloudMlV1StudyConfigMetricSpec]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: GoogleCloudMlV1StudyConfigMetricSpec*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    inline def setParameters(value: js.Array[GoogleCloudMlV1StudyConfigParameterSpec]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: GoogleCloudMlV1StudyConfigParameterSpec*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
