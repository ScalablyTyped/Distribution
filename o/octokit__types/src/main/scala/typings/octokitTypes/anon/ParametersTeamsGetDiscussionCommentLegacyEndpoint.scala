package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsGetDiscussionCommentLegacyEndpoint extends StObject {
  
  var parameters: TeamsGetDiscussionCommentLegacyEndpoint = js.native
  
  var request: TeamsGetDiscussionCommentLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsGetDiscussionCommentLegacyResponseData] = js.native
}
object ParametersTeamsGetDiscussionCommentLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsGetDiscussionCommentLegacyEndpoint,
    request: TeamsGetDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[TeamsGetDiscussionCommentLegacyResponseData]
  ): ParametersTeamsGetDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetDiscussionCommentLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsGetDiscussionCommentLegacyEndpointMutableBuilder[Self <: ParametersTeamsGetDiscussionCommentLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsGetDiscussionCommentLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsGetDiscussionCommentLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsGetDiscussionCommentLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
