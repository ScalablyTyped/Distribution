package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentLegacyEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentLegacyRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint extends StObject {
  
  var parameters: ReactionsListForTeamDiscussionCommentLegacyEndpoint
  
  var request: ReactionsListForTeamDiscussionCommentLegacyRequestOptions
  
  var response: OctokitResponse[ReactionsListForTeamDiscussionCommentLegacyResponseData]
}
object ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint {
  
  inline def apply(
    parameters: ReactionsListForTeamDiscussionCommentLegacyEndpoint,
    request: ReactionsListForTeamDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[ReactionsListForTeamDiscussionCommentLegacyResponseData]
  ): ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint]
  }
  
  extension [Self <: ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: ReactionsListForTeamDiscussionCommentLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReactionsListForTeamDiscussionCommentLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReactionsListForTeamDiscussionCommentLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
