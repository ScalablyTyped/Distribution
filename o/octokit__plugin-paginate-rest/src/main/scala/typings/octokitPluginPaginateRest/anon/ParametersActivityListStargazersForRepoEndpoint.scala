package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActivityListStargazersForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActivityListStargazersForRepoResponse200Data
import typings.octokitTypes.endpointsMod.ActivityListStargazersForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListStargazersForRepoEndpoint extends StObject {
  
  var parameters: ActivityListStargazersForRepoEndpoint
  
  var response: OctokitResponse[
    ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
  ]
}
object ParametersActivityListStargazersForRepoEndpoint {
  
  inline def apply(
    parameters: ActivityListStargazersForRepoEndpoint,
    response: OctokitResponse[
      ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
    ]
  ): ParametersActivityListStargazersForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListStargazersForRepoEndpoint]
  }
  
  extension [Self <: ParametersActivityListStargazersForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityListStargazersForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: OctokitResponse[
          ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
