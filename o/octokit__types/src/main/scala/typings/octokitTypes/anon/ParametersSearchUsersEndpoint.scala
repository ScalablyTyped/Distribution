package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchUsersEndpoint
import typings.octokitTypes.endpointsMod.SearchUsersRequestOptions
import typings.octokitTypes.endpointsMod.SearchUsersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersSearchUsersEndpoint extends StObject {
  
  var parameters: SearchUsersEndpoint
  
  var request: SearchUsersRequestOptions
  
  var response: OctokitResponse[SearchUsersResponseData]
}
object ParametersSearchUsersEndpoint {
  
  inline def apply(
    parameters: SearchUsersEndpoint,
    request: SearchUsersRequestOptions,
    response: OctokitResponse[SearchUsersResponseData]
  ): ParametersSearchUsersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchUsersEndpoint]
  }
  
  extension [Self <: ParametersSearchUsersEndpoint](x: Self) {
    
    inline def setParameters(value: SearchUsersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: SearchUsersRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[SearchUsersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
