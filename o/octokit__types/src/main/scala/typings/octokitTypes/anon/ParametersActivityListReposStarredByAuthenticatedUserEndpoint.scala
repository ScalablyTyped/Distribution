package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserResponse200Data
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListReposStarredByAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityListReposStarredByAuthenticatedUserEndpoint
  
  var request: ActivityListReposStarredByAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[
    ActivityListReposStarredByAuthenticatedUserResponseData | ActivityListReposStarredByAuthenticatedUserResponse200Data
  ]
}
object ParametersActivityListReposStarredByAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListReposStarredByAuthenticatedUserEndpoint,
    request: ActivityListReposStarredByAuthenticatedUserRequestOptions,
    response: OctokitResponse[
      ActivityListReposStarredByAuthenticatedUserResponseData | ActivityListReposStarredByAuthenticatedUserResponse200Data
    ]
  ): ParametersActivityListReposStarredByAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListReposStarredByAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListReposStarredByAuthenticatedUserEndpointMutableBuilder[Self <: ParametersActivityListReposStarredByAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListReposStarredByAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListReposStarredByAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          ActivityListReposStarredByAuthenticatedUserResponseData | ActivityListReposStarredByAuthenticatedUserResponse200Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
