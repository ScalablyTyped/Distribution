package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionCommentInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsDeleteDiscussionCommentInOrgEndpoint extends StObject {
  
  var parameters: TeamsDeleteDiscussionCommentInOrgEndpoint
  
  var request: TeamsDeleteDiscussionCommentInOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersTeamsDeleteDiscussionCommentInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsDeleteDiscussionCommentInOrgEndpoint,
    request: TeamsDeleteDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersTeamsDeleteDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteDiscussionCommentInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsDeleteDiscussionCommentInOrgEndpointMutableBuilder[Self <: ParametersTeamsDeleteDiscussionCommentInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsDeleteDiscussionCommentInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsDeleteDiscussionCommentInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
