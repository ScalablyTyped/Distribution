package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsCreateDiscussionCommentLegacyEndpoint extends StObject {
  
  var parameters: TeamsCreateDiscussionCommentLegacyEndpoint
  
  var request: TeamsCreateDiscussionCommentLegacyRequestOptions
  
  var response: OctokitResponse[TeamsCreateDiscussionCommentLegacyResponseData]
}
object ParametersTeamsCreateDiscussionCommentLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsCreateDiscussionCommentLegacyEndpoint,
    request: TeamsCreateDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[TeamsCreateDiscussionCommentLegacyResponseData]
  ): ParametersTeamsCreateDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateDiscussionCommentLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsCreateDiscussionCommentLegacyEndpointMutableBuilder[Self <: ParametersTeamsCreateDiscussionCommentLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsCreateDiscussionCommentLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCreateDiscussionCommentLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateDiscussionCommentLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
