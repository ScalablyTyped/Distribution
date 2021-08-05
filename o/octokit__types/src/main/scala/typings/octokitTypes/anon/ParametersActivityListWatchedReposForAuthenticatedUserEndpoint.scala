package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListWatchedReposForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityListWatchedReposForAuthenticatedUserEndpoint
  
  var request: ActivityListWatchedReposForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]
}
object ParametersActivityListWatchedReposForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: ActivityListWatchedReposForAuthenticatedUserEndpoint,
    request: ActivityListWatchedReposForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]
  ): ParametersActivityListWatchedReposForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListWatchedReposForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersActivityListWatchedReposForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityListWatchedReposForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActivityListWatchedReposForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
