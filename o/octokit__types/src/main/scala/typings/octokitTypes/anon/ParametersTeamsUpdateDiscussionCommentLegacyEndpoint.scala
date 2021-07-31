package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsUpdateDiscussionCommentLegacyEndpoint extends StObject {
  
  var parameters: TeamsUpdateDiscussionCommentLegacyEndpoint
  
  var request: TeamsUpdateDiscussionCommentLegacyRequestOptions
  
  var response: OctokitResponse[TeamsUpdateDiscussionCommentLegacyResponseData]
}
object ParametersTeamsUpdateDiscussionCommentLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsUpdateDiscussionCommentLegacyEndpoint,
    request: TeamsUpdateDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[TeamsUpdateDiscussionCommentLegacyResponseData]
  ): ParametersTeamsUpdateDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateDiscussionCommentLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsUpdateDiscussionCommentLegacyEndpointMutableBuilder[Self <: ParametersTeamsUpdateDiscussionCommentLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsUpdateDiscussionCommentLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsUpdateDiscussionCommentLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsUpdateDiscussionCommentLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
