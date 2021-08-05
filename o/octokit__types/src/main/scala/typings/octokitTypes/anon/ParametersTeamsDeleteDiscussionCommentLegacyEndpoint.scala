package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionCommentLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsDeleteDiscussionCommentLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsDeleteDiscussionCommentLegacyEndpoint extends StObject {
  
  var parameters: TeamsDeleteDiscussionCommentLegacyEndpoint
  
  var request: TeamsDeleteDiscussionCommentLegacyRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersTeamsDeleteDiscussionCommentLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsDeleteDiscussionCommentLegacyEndpoint,
    request: TeamsDeleteDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersTeamsDeleteDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteDiscussionCommentLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsDeleteDiscussionCommentLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsDeleteDiscussionCommentLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsDeleteDiscussionCommentLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
