package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsEndpoint
import typings.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersSearchIssuesAndPullRequestsEndpoint extends StObject {
  
  var parameters: SearchIssuesAndPullRequestsEndpoint
  
  var response: OctokitResponse[SearchIssuesAndPullRequestsResponseData] & `19`
}
object ParametersSearchIssuesAndPullRequestsEndpoint {
  
  @scala.inline
  def apply(
    parameters: SearchIssuesAndPullRequestsEndpoint,
    response: OctokitResponse[SearchIssuesAndPullRequestsResponseData] & `19`
  ): ParametersSearchIssuesAndPullRequestsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchIssuesAndPullRequestsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchIssuesAndPullRequestsEndpointMutableBuilder[Self <: ParametersSearchIssuesAndPullRequestsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: SearchIssuesAndPullRequestsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchIssuesAndPullRequestsResponseData] & `19`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
