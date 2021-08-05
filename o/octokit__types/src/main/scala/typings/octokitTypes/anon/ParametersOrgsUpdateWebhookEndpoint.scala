package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsUpdateWebhookEndpoint
import typings.octokitTypes.endpointsMod.OrgsUpdateWebhookRequestOptions
import typings.octokitTypes.endpointsMod.OrgsUpdateWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsUpdateWebhookEndpoint extends StObject {
  
  var parameters: OrgsUpdateWebhookEndpoint
  
  var request: OrgsUpdateWebhookRequestOptions
  
  var response: OctokitResponse[OrgsUpdateWebhookResponseData]
}
object ParametersOrgsUpdateWebhookEndpoint {
  
  inline def apply(
    parameters: OrgsUpdateWebhookEndpoint,
    request: OrgsUpdateWebhookRequestOptions,
    response: OctokitResponse[OrgsUpdateWebhookResponseData]
  ): ParametersOrgsUpdateWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUpdateWebhookEndpoint]
  }
  
  extension [Self <: ParametersOrgsUpdateWebhookEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsUpdateWebhookEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsUpdateWebhookRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsUpdateWebhookResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
