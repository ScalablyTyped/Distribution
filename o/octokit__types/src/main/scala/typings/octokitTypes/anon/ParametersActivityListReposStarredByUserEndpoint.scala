package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListReposStarredByUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByUserRequestOptions
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByUserResponse200Data
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListReposStarredByUserEndpoint extends StObject {
  
  var parameters: ActivityListReposStarredByUserEndpoint
  
  var request: ActivityListReposStarredByUserRequestOptions
  
  var response: OctokitResponse[
    ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
  ]
}
object ParametersActivityListReposStarredByUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListReposStarredByUserEndpoint,
    request: ActivityListReposStarredByUserRequestOptions,
    response: OctokitResponse[
      ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
    ]
  ): ParametersActivityListReposStarredByUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListReposStarredByUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListReposStarredByUserEndpointMutableBuilder[Self <: ParametersActivityListReposStarredByUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListReposStarredByUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListReposStarredByUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
