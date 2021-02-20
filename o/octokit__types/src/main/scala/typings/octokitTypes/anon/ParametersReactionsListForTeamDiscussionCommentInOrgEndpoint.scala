package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentInOrgRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint extends StObject {
  
  var parameters: ReactionsListForTeamDiscussionCommentInOrgEndpoint = js.native
  
  var request: ReactionsListForTeamDiscussionCommentInOrgRequestOptions = js.native
  
  var response: OctokitResponse[ReactionsListForTeamDiscussionCommentInOrgResponseData] = js.native
}
object ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsListForTeamDiscussionCommentInOrgEndpoint,
    request: ReactionsListForTeamDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[ReactionsListForTeamDiscussionCommentInOrgResponseData]
  ): ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsListForTeamDiscussionCommentInOrgEndpointMutableBuilder[Self <: ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsListForTeamDiscussionCommentInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsListForTeamDiscussionCommentInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForTeamDiscussionCommentInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
