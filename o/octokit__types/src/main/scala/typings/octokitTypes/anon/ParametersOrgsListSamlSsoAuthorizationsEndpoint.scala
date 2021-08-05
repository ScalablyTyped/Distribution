package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListSamlSsoAuthorizationsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListSamlSsoAuthorizationsRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListSamlSsoAuthorizationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListSamlSsoAuthorizationsEndpoint extends StObject {
  
  var parameters: OrgsListSamlSsoAuthorizationsEndpoint
  
  var request: OrgsListSamlSsoAuthorizationsRequestOptions
  
  var response: OctokitResponse[OrgsListSamlSsoAuthorizationsResponseData]
}
object ParametersOrgsListSamlSsoAuthorizationsEndpoint {
  
  inline def apply(
    parameters: OrgsListSamlSsoAuthorizationsEndpoint,
    request: OrgsListSamlSsoAuthorizationsRequestOptions,
    response: OctokitResponse[OrgsListSamlSsoAuthorizationsResponseData]
  ): ParametersOrgsListSamlSsoAuthorizationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListSamlSsoAuthorizationsEndpoint]
  }
  
  extension [Self <: ParametersOrgsListSamlSsoAuthorizationsEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsListSamlSsoAuthorizationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsListSamlSsoAuthorizationsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsListSamlSsoAuthorizationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
