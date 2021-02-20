package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateWebhookRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateWebhookEndpoint extends StObject {
  
  var parameters: ReposCreateWebhookEndpoint = js.native
  
  var request: ReposCreateWebhookRequestOptions = js.native
  
  var response: OctokitResponse[ReposCreateWebhookResponseData] = js.native
}
object ParametersReposCreateWebhookEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateWebhookEndpoint,
    request: ReposCreateWebhookRequestOptions,
    response: OctokitResponse[ReposCreateWebhookResponseData]
  ): ParametersReposCreateWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateWebhookEndpointMutableBuilder[Self <: ParametersReposCreateWebhookEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCreateWebhookEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateWebhookRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateWebhookResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
