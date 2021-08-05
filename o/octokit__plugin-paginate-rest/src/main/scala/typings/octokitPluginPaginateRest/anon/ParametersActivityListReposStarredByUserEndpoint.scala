package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActivityListReposStarredByUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByUserResponse200Data
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListReposStarredByUserEndpoint extends StObject {
  
  var parameters: ActivityListReposStarredByUserEndpoint
  
  var response: OctokitResponse[
    ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
  ]
}
object ParametersActivityListReposStarredByUserEndpoint {
  
  inline def apply(
    parameters: ActivityListReposStarredByUserEndpoint,
    response: OctokitResponse[
      ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
    ]
  ): ParametersActivityListReposStarredByUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListReposStarredByUserEndpoint]
  }
  
  extension [Self <: ParametersActivityListReposStarredByUserEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityListReposStarredByUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: OctokitResponse[
          ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
