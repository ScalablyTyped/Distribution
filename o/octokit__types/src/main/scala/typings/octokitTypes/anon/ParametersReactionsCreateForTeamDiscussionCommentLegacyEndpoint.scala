package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentLegacyEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint extends StObject {
  
  var parameters: ReactionsCreateForTeamDiscussionCommentLegacyEndpoint
  
  var request: ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions
  
  var response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentLegacyResponseData]
}
object ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint {
  
  inline def apply(
    parameters: ReactionsCreateForTeamDiscussionCommentLegacyEndpoint,
    request: ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentLegacyResponseData]
  ): ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint]
  }
  
  extension [Self <: ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: ReactionsCreateForTeamDiscussionCommentLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReactionsCreateForTeamDiscussionCommentLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
