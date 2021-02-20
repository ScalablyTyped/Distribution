package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateWebhookRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposUpdateWebhookEndpoint extends StObject {
  
  var parameters: ReposUpdateWebhookEndpoint = js.native
  
  var request: ReposUpdateWebhookRequestOptions = js.native
  
  var response: OctokitResponse[ReposUpdateWebhookResponseData] = js.native
}
object ParametersReposUpdateWebhookEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposUpdateWebhookEndpoint,
    request: ReposUpdateWebhookRequestOptions,
    response: OctokitResponse[ReposUpdateWebhookResponseData]
  ): ParametersReposUpdateWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposUpdateWebhookEndpointMutableBuilder[Self <: ParametersReposUpdateWebhookEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposUpdateWebhookEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposUpdateWebhookRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateWebhookResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
