package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1ExplanationConfig extends StObject {
  
  /**
    * Attributes credit by computing the Aumann-Shapley value taking advantage of the model's fully differentiable structure. Refer to this paper for more details:
    * https://arxiv.org/abs/1703.01365
    */
  var integratedGradientsAttribution: js.UndefOr[GoogleCloudMlV1IntegratedGradientsAttribution] = js.undefined
  
  /**
    * An attribution method that approximates Shapley values for features that contribute to the label being predicted. A sampling strategy is used to approximate the value rather than
    * considering all subsets of features.
    */
  var sampledShapleyAttribution: js.UndefOr[GoogleCloudMlV1SampledShapleyAttribution] = js.undefined
  
  /**
    * Attributes credit by computing the XRAI taking advantage of the model's fully differentiable structure. Refer to this paper for more details: https://arxiv.org/abs/1906.02825
    * Currently only implemented for models with natural image inputs.
    */
  var xraiAttribution: js.UndefOr[GoogleCloudMlV1XraiAttribution] = js.undefined
}
object GoogleCloudMlV1ExplanationConfig {
  
  inline def apply(): GoogleCloudMlV1ExplanationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ExplanationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudMlV1ExplanationConfig] (val x: Self) extends AnyVal {
    
    inline def setIntegratedGradientsAttribution(value: GoogleCloudMlV1IntegratedGradientsAttribution): Self = StObject.set(x, "integratedGradientsAttribution", value.asInstanceOf[js.Any])
    
    inline def setIntegratedGradientsAttributionUndefined: Self = StObject.set(x, "integratedGradientsAttribution", js.undefined)
    
    inline def setSampledShapleyAttribution(value: GoogleCloudMlV1SampledShapleyAttribution): Self = StObject.set(x, "sampledShapleyAttribution", value.asInstanceOf[js.Any])
    
    inline def setSampledShapleyAttributionUndefined: Self = StObject.set(x, "sampledShapleyAttribution", js.undefined)
    
    inline def setXraiAttribution(value: GoogleCloudMlV1XraiAttribution): Self = StObject.set(x, "xraiAttribution", value.asInstanceOf[js.Any])
    
    inline def setXraiAttributionUndefined: Self = StObject.set(x, "xraiAttribution", js.undefined)
  }
}
