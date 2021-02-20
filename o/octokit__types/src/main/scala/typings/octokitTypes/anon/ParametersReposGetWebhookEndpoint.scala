package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposGetWebhookRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetWebhookEndpoint extends StObject {
  
  var parameters: ReposGetWebhookEndpoint = js.native
  
  var request: ReposGetWebhookRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetWebhookResponseData] = js.native
}
object ParametersReposGetWebhookEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetWebhookEndpoint,
    request: ReposGetWebhookRequestOptions,
    response: OctokitResponse[ReposGetWebhookResponseData]
  ): ParametersReposGetWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetWebhookEndpointMutableBuilder[Self <: ParametersReposGetWebhookEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetWebhookEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetWebhookRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetWebhookResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
