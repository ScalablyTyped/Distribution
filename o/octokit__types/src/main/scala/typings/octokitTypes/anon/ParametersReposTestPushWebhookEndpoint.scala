package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposTestPushWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposTestPushWebhookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposTestPushWebhookEndpoint extends StObject {
  
  var parameters: ReposTestPushWebhookEndpoint
  
  var request: ReposTestPushWebhookRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposTestPushWebhookEndpoint {
  
  inline def apply(
    parameters: ReposTestPushWebhookEndpoint,
    request: ReposTestPushWebhookRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposTestPushWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposTestPushWebhookEndpoint]
  }
  
  extension [Self <: ParametersReposTestPushWebhookEndpoint](x: Self) {
    
    inline def setParameters(value: ReposTestPushWebhookEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposTestPushWebhookRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
