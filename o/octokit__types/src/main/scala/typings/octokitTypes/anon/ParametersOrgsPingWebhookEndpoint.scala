package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsPingWebhookEndpoint
import typings.octokitTypes.endpointsMod.OrgsPingWebhookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsPingWebhookEndpoint extends StObject {
  
  var parameters: OrgsPingWebhookEndpoint
  
  var request: OrgsPingWebhookRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersOrgsPingWebhookEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsPingWebhookEndpoint,
    request: OrgsPingWebhookRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersOrgsPingWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsPingWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsPingWebhookEndpointMutableBuilder[Self <: ParametersOrgsPingWebhookEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsPingWebhookEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsPingWebhookRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
