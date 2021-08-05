package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteWebhookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposDeleteWebhookEndpoint extends StObject {
  
  var parameters: ReposDeleteWebhookEndpoint
  
  var request: ReposDeleteWebhookRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposDeleteWebhookEndpoint {
  
  inline def apply(
    parameters: ReposDeleteWebhookEndpoint,
    request: ReposDeleteWebhookRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposDeleteWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteWebhookEndpoint]
  }
  
  extension [Self <: ParametersReposDeleteWebhookEndpoint](x: Self) {
    
    inline def setParameters(value: ReposDeleteWebhookEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposDeleteWebhookRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
