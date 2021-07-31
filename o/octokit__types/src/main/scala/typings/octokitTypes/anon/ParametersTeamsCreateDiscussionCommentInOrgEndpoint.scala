package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsCreateDiscussionCommentInOrgEndpoint extends StObject {
  
  var parameters: TeamsCreateDiscussionCommentInOrgEndpoint
  
  var request: TeamsCreateDiscussionCommentInOrgRequestOptions
  
  var response: OctokitResponse[TeamsCreateDiscussionCommentInOrgResponseData]
}
object ParametersTeamsCreateDiscussionCommentInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsCreateDiscussionCommentInOrgEndpoint,
    request: TeamsCreateDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[TeamsCreateDiscussionCommentInOrgResponseData]
  ): ParametersTeamsCreateDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateDiscussionCommentInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsCreateDiscussionCommentInOrgEndpointMutableBuilder[Self <: ParametersTeamsCreateDiscussionCommentInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsCreateDiscussionCommentInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCreateDiscussionCommentInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateDiscussionCommentInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
