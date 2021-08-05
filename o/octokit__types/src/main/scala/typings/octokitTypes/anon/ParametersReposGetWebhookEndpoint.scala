package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetWebhookEndpoint
import typings.octokitTypes.endpointsMod.ReposGetWebhookRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetWebhookEndpoint extends StObject {
  
  var parameters: ReposGetWebhookEndpoint
  
  var request: ReposGetWebhookRequestOptions
  
  var response: OctokitResponse[ReposGetWebhookResponseData]
}
object ParametersReposGetWebhookEndpoint {
  
  inline def apply(
    parameters: ReposGetWebhookEndpoint,
    request: ReposGetWebhookRequestOptions,
    response: OctokitResponse[ReposGetWebhookResponseData]
  ): ParametersReposGetWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetWebhookEndpoint]
  }
  
  extension [Self <: ParametersReposGetWebhookEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetWebhookEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetWebhookRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetWebhookResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
