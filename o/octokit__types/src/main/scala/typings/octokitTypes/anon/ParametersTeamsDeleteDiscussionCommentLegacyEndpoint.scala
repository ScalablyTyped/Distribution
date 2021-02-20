package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionCommentLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionCommentLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsDeleteDiscussionCommentLegacyEndpoint extends StObject {
  
  var parameters: TeamsDeleteDiscussionCommentLegacyEndpoint = js.native
  
  var request: TeamsDeleteDiscussionCommentLegacyRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsDeleteDiscussionCommentLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsDeleteDiscussionCommentLegacyEndpoint,
    request: TeamsDeleteDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsDeleteDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteDiscussionCommentLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsDeleteDiscussionCommentLegacyEndpointMutableBuilder[Self <: ParametersTeamsDeleteDiscussionCommentLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsDeleteDiscussionCommentLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsDeleteDiscussionCommentLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
