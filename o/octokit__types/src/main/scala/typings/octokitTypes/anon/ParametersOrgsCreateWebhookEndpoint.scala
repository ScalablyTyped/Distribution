package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCreateWebhookEndpoint
import typings.octokitTypes.endpointsMod.OrgsCreateWebhookRequestOptions
import typings.octokitTypes.endpointsMod.OrgsCreateWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsCreateWebhookEndpoint extends StObject {
  
  var parameters: OrgsCreateWebhookEndpoint = js.native
  
  var request: OrgsCreateWebhookRequestOptions = js.native
  
  var response: OctokitResponse[OrgsCreateWebhookResponseData] = js.native
}
object ParametersOrgsCreateWebhookEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsCreateWebhookEndpoint,
    request: OrgsCreateWebhookRequestOptions,
    response: OctokitResponse[OrgsCreateWebhookResponseData]
  ): ParametersOrgsCreateWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCreateWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsCreateWebhookEndpointMutableBuilder[Self <: ParametersOrgsCreateWebhookEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsCreateWebhookEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsCreateWebhookRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsCreateWebhookResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
