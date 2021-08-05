package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsListForUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListForUserEndpoint extends StObject {
  
  var parameters: OrgsListForUserEndpoint
  
  var request: OrgsListForUserRequestOptions
  
  var response: OctokitResponse[OrgsListForUserResponseData]
}
object ParametersOrgsListForUserEndpoint {
  
  inline def apply(
    parameters: OrgsListForUserEndpoint,
    request: OrgsListForUserRequestOptions,
    response: OctokitResponse[OrgsListForUserResponseData]
  ): ParametersOrgsListForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListForUserEndpoint]
  }
  
  extension [Self <: ParametersOrgsListForUserEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsListForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsListForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsListForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
