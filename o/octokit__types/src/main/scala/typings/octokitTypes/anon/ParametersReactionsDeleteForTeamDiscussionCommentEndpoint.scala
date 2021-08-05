package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteForTeamDiscussionCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteForTeamDiscussionCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsDeleteForTeamDiscussionCommentEndpoint extends StObject {
  
  var parameters: ReactionsDeleteForTeamDiscussionCommentEndpoint
  
  var request: ReactionsDeleteForTeamDiscussionCommentRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReactionsDeleteForTeamDiscussionCommentEndpoint {
  
  inline def apply(
    parameters: ReactionsDeleteForTeamDiscussionCommentEndpoint,
    request: ReactionsDeleteForTeamDiscussionCommentRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReactionsDeleteForTeamDiscussionCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForTeamDiscussionCommentEndpoint]
  }
  
  extension [Self <: ParametersReactionsDeleteForTeamDiscussionCommentEndpoint](x: Self) {
    
    inline def setParameters(value: ReactionsDeleteForTeamDiscussionCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReactionsDeleteForTeamDiscussionCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
