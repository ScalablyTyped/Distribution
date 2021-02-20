package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteForTeamDiscussionCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteForTeamDiscussionCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsDeleteForTeamDiscussionCommentEndpoint extends StObject {
  
  var parameters: ReactionsDeleteForTeamDiscussionCommentEndpoint = js.native
  
  var request: ReactionsDeleteForTeamDiscussionCommentRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReactionsDeleteForTeamDiscussionCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsDeleteForTeamDiscussionCommentEndpoint,
    request: ReactionsDeleteForTeamDiscussionCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReactionsDeleteForTeamDiscussionCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForTeamDiscussionCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsDeleteForTeamDiscussionCommentEndpointMutableBuilder[Self <: ParametersReactionsDeleteForTeamDiscussionCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsDeleteForTeamDiscussionCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsDeleteForTeamDiscussionCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
