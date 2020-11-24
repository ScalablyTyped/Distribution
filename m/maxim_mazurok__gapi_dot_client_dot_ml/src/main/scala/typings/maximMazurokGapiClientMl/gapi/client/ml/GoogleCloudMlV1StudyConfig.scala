package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1StudyConfig extends js.Object {
  
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
  implicit class GoogleCloudMlV1StudyConfigOps[Self <: GoogleCloudMlV1StudyConfig] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setAutomatedStoppingConfig(value: GoogleCloudMlV1AutomatedStoppingConfig): Self = this.set("automatedStoppingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomatedStoppingConfig: Self = this.set("automatedStoppingConfig", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: GoogleCloudMlV1StudyConfigMetricSpec*): Self = this.set("metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[GoogleCloudMlV1StudyConfigMetricSpec]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: GoogleCloudMlV1StudyConfigParameterSpec*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[GoogleCloudMlV1StudyConfigParameterSpec]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
