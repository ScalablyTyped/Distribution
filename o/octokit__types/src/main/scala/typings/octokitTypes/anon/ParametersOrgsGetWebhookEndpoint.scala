package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsGetWebhookEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetWebhookRequestOptions
import typings.octokitTypes.endpointsMod.OrgsGetWebhookResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsGetWebhookEndpoint extends StObject {
  
  var parameters: OrgsGetWebhookEndpoint
  
  var request: OrgsGetWebhookRequestOptions
  
  var response: OctokitResponse[OrgsGetWebhookResponseData]
}
object ParametersOrgsGetWebhookEndpoint {
  
  inline def apply(
    parameters: OrgsGetWebhookEndpoint,
    request: OrgsGetWebhookRequestOptions,
    response: OctokitResponse[OrgsGetWebhookResponseData]
  ): ParametersOrgsGetWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsGetWebhookEndpoint]
  }
  
  extension [Self <: ParametersOrgsGetWebhookEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsGetWebhookEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsGetWebhookRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsGetWebhookResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
