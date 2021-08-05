package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemoveSamlSsoAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemoveSamlSsoAuthorizationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsRemoveSamlSsoAuthorizationEndpoint extends StObject {
  
  var parameters: OrgsRemoveSamlSsoAuthorizationEndpoint
  
  var request: OrgsRemoveSamlSsoAuthorizationRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersOrgsRemoveSamlSsoAuthorizationEndpoint {
  
  inline def apply(
    parameters: OrgsRemoveSamlSsoAuthorizationEndpoint,
    request: OrgsRemoveSamlSsoAuthorizationRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersOrgsRemoveSamlSsoAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemoveSamlSsoAuthorizationEndpoint]
  }
  
  extension [Self <: ParametersOrgsRemoveSamlSsoAuthorizationEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsRemoveSamlSsoAuthorizationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsRemoveSamlSsoAuthorizationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
