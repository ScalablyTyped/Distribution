package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposPingWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposPingWebhookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposPingWebhookEndpoint extends StObject {
  
  var parameters: ReposPingWebhookEndpoint
  
  var request: ReposPingWebhookRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposPingWebhookEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposPingWebhookEndpoint,
    request: ReposPingWebhookRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposPingWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposPingWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposPingWebhookEndpointMutableBuilder[Self <: ParametersReposPingWebhookEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposPingWebhookEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposPingWebhookRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
