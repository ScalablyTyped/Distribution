package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1ExplanationConfig extends js.Object {
  
  /**
    * Attributes credit by computing the Aumann-Shapley value taking advantage of the model's fully differentiable structure. Refer to this paper for more details:
    * https://arxiv.org/abs/1703.01365
    */
  var integratedGradientsAttribution: js.UndefOr[GoogleCloudMlV1IntegratedGradientsAttribution] = js.native
  
  /**
    * An attribution method that approximates Shapley values for features that contribute to the label being predicted. A sampling strategy is used to approximate the value rather than
    * considering all subsets of features.
    */
  var sampledShapleyAttribution: js.UndefOr[GoogleCloudMlV1SampledShapleyAttribution] = js.native
  
  /**
    * Attributes credit by computing the XRAI taking advantage of the model's fully differentiable structure. Refer to this paper for more details: https://arxiv.org/abs/1906.02825
    * Currently only implemented for models with natural image inputs.
    */
  var xraiAttribution: js.UndefOr[GoogleCloudMlV1XraiAttribution] = js.native
}
object GoogleCloudMlV1ExplanationConfig {
  
  @scala.inline
  def apply(): GoogleCloudMlV1ExplanationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ExplanationConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ExplanationConfigOps[Self <: GoogleCloudMlV1ExplanationConfig] (val x: Self) extends AnyVal {
    
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
    def setIntegratedGradientsAttribution(value: GoogleCloudMlV1IntegratedGradientsAttribution): Self = this.set("integratedGradientsAttribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegratedGradientsAttribution: Self = this.set("integratedGradientsAttribution", js.undefined)
    
    @scala.inline
    def setSampledShapleyAttribution(value: GoogleCloudMlV1SampledShapleyAttribution): Self = this.set("sampledShapleyAttribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampledShapleyAttribution: Self = this.set("sampledShapleyAttribution", js.undefined)
    
    @scala.inline
    def setXraiAttribution(value: GoogleCloudMlV1XraiAttribution): Self = this.set("xraiAttribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXraiAttribution: Self = this.set("xraiAttribution", js.undefined)
  }
}
