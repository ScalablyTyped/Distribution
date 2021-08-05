package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListWatchedReposForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityListWatchedReposForAuthenticatedUserEndpoint
  
  var response: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]
}
object ParametersActivityListWatchedReposForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: ActivityListWatchedReposForAuthenticatedUserEndpoint,
    response: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]
  ): ParametersActivityListWatchedReposForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListWatchedReposForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersActivityListWatchedReposForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityListWatchedReposForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
