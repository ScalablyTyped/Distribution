package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteWebhookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeleteWebhookEndpoint extends StObject {
  
  var parameters: ReposDeleteWebhookEndpoint = js.native
  
  var request: ReposDeleteWebhookRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDeleteWebhookEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteWebhookEndpoint,
    request: ReposDeleteWebhookRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteWebhookEndpointMutableBuilder[Self <: ParametersReposDeleteWebhookEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeleteWebhookEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteWebhookRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
