package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityUnstarRepoForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityUnstarRepoForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityUnstarRepoForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityUnstarRepoForAuthenticatedUserEndpoint
  
  var request: ActivityUnstarRepoForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActivityUnstarRepoForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: ActivityUnstarRepoForAuthenticatedUserEndpoint,
    request: ActivityUnstarRepoForAuthenticatedUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActivityUnstarRepoForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityUnstarRepoForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersActivityUnstarRepoForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityUnstarRepoForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActivityUnstarRepoForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
