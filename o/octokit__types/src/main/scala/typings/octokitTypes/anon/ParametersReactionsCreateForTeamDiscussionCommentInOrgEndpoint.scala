package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentInOrgRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsCreateForTeamDiscussionCommentInOrgEndpoint extends StObject {
  
  var parameters: ReactionsCreateForTeamDiscussionCommentInOrgEndpoint
  
  var request: ReactionsCreateForTeamDiscussionCommentInOrgRequestOptions
  
  var response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentInOrgResponseData]
}
object ParametersReactionsCreateForTeamDiscussionCommentInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsCreateForTeamDiscussionCommentInOrgEndpoint,
    request: ReactionsCreateForTeamDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentInOrgResponseData]
  ): ParametersReactionsCreateForTeamDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForTeamDiscussionCommentInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsCreateForTeamDiscussionCommentInOrgEndpointMutableBuilder[Self <: ParametersReactionsCreateForTeamDiscussionCommentInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsCreateForTeamDiscussionCommentInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsCreateForTeamDiscussionCommentInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForTeamDiscussionCommentInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
