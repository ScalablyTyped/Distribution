package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposTestPushWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposTestPushWebhookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposTestPushWebhookEndpoint extends StObject {
  
  var parameters: ReposTestPushWebhookEndpoint = js.native
  
  var request: ReposTestPushWebhookRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposTestPushWebhookEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposTestPushWebhookEndpoint,
    request: ReposTestPushWebhookRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposTestPushWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposTestPushWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposTestPushWebhookEndpointMutableBuilder[Self <: ParametersReposTestPushWebhookEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposTestPushWebhookEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposTestPushWebhookRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
