package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionInOrgRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsListForTeamDiscussionInOrgEndpoint extends StObject {
  
  var parameters: ReactionsListForTeamDiscussionInOrgEndpoint
  
  var request: ReactionsListForTeamDiscussionInOrgRequestOptions
  
  var response: OctokitResponse[ReactionsListForTeamDiscussionInOrgResponseData]
}
object ParametersReactionsListForTeamDiscussionInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsListForTeamDiscussionInOrgEndpoint,
    request: ReactionsListForTeamDiscussionInOrgRequestOptions,
    response: OctokitResponse[ReactionsListForTeamDiscussionInOrgResponseData]
  ): ParametersReactionsListForTeamDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForTeamDiscussionInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsListForTeamDiscussionInOrgEndpointMutableBuilder[Self <: ParametersReactionsListForTeamDiscussionInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsListForTeamDiscussionInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsListForTeamDiscussionInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForTeamDiscussionInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
