package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsGetDiscussionCommentInOrgEndpoint extends StObject {
  
  var parameters: TeamsGetDiscussionCommentInOrgEndpoint
  
  var request: TeamsGetDiscussionCommentInOrgRequestOptions
  
  var response: OctokitResponse[TeamsGetDiscussionCommentInOrgResponseData]
}
object ParametersTeamsGetDiscussionCommentInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsGetDiscussionCommentInOrgEndpoint,
    request: TeamsGetDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[TeamsGetDiscussionCommentInOrgResponseData]
  ): ParametersTeamsGetDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetDiscussionCommentInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsGetDiscussionCommentInOrgEndpointMutableBuilder[Self <: ParametersTeamsGetDiscussionCommentInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsGetDiscussionCommentInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsGetDiscussionCommentInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsGetDiscussionCommentInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
