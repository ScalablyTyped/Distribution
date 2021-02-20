package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1StudyConfig extends StObject {
  
  /** The search algorithm specified for the study. */
  var algorithm: js.UndefOr[String] = js.native
  
  /** Configuration for automated stopping of unpromising Trials. */
  var automatedStoppingConfig: js.UndefOr[GoogleCloudMlV1AutomatedStoppingConfig] = js.native
  
  /** Metric specs for the study. */
  var metrics: js.UndefOr[js.Array[GoogleCloudMlV1StudyConfigMetricSpec]] = js.native
  
  /** Required. The set of parameters to tune. */
  var parameters: js.UndefOr[js.Array[GoogleCloudMlV1StudyConfigParameterSpec]] = js.native
}
object GoogleCloudMlV1StudyConfig {
  
  @scala.inline
  def apply(): GoogleCloudMlV1StudyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1StudyConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1StudyConfigMutableBuilder[Self <: GoogleCloudMlV1StudyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setAutomatedStoppingConfig(value: GoogleCloudMlV1AutomatedStoppingConfig): Self = StObject.set(x, "automatedStoppingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedStoppingConfigUndefined: Self = StObject.set(x, "automatedStoppingConfig", js.undefined)
    
    @scala.inline
    def setMetrics(value: js.Array[GoogleCloudMlV1StudyConfigMetricSpec]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: GoogleCloudMlV1StudyConfigMetricSpec*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[GoogleCloudMlV1StudyConfigParameterSpec]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: GoogleCloudMlV1StudyConfigParameterSpec*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
