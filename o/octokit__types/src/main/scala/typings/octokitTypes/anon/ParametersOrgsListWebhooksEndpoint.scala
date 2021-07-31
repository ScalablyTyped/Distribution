package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListWebhooksEndpoint
import typings.octokitTypes.endpointsMod.OrgsListWebhooksRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListWebhooksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListWebhooksEndpoint extends StObject {
  
  var parameters: OrgsListWebhooksEndpoint
  
  var request: OrgsListWebhooksRequestOptions
  
  var response: OctokitResponse[OrgsListWebhooksResponseData]
}
object ParametersOrgsListWebhooksEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListWebhooksEndpoint,
    request: OrgsListWebhooksRequestOptions,
    response: OctokitResponse[OrgsListWebhooksResponseData]
  ): ParametersOrgsListWebhooksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListWebhooksEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListWebhooksEndpointMutableBuilder[Self <: ParametersOrgsListWebhooksEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListWebhooksEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsListWebhooksRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListWebhooksResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
