package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActivityListReposWatchedByUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReposWatchedByUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListReposWatchedByUserEndpoint extends StObject {
  
  var parameters: ActivityListReposWatchedByUserEndpoint
  
  var response: OctokitResponse[ActivityListReposWatchedByUserResponseData]
}
object ParametersActivityListReposWatchedByUserEndpoint {
  
  inline def apply(
    parameters: ActivityListReposWatchedByUserEndpoint,
    response: OctokitResponse[ActivityListReposWatchedByUserResponseData]
  ): ParametersActivityListReposWatchedByUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListReposWatchedByUserEndpoint]
  }
  
  extension [Self <: ParametersActivityListReposWatchedByUserEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityListReposWatchedByUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActivityListReposWatchedByUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
