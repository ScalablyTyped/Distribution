package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsDeleteWebhookEndpoint
import typings.octokitTypes.endpointsMod.OrgsDeleteWebhookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsDeleteWebhookEndpoint extends StObject {
  
  var parameters: OrgsDeleteWebhookEndpoint
  
  var request: OrgsDeleteWebhookRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersOrgsDeleteWebhookEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsDeleteWebhookEndpoint,
    request: OrgsDeleteWebhookRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersOrgsDeleteWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsDeleteWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsDeleteWebhookEndpointMutableBuilder[Self <: ParametersOrgsDeleteWebhookEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsDeleteWebhookEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsDeleteWebhookRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
