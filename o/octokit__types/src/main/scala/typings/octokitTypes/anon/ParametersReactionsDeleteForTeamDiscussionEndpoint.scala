package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteForTeamDiscussionEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteForTeamDiscussionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsDeleteForTeamDiscussionEndpoint extends StObject {
  
  var parameters: ReactionsDeleteForTeamDiscussionEndpoint
  
  var request: ReactionsDeleteForTeamDiscussionRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReactionsDeleteForTeamDiscussionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsDeleteForTeamDiscussionEndpoint,
    request: ReactionsDeleteForTeamDiscussionRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReactionsDeleteForTeamDiscussionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForTeamDiscussionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsDeleteForTeamDiscussionEndpointMutableBuilder[Self <: ParametersReactionsDeleteForTeamDiscussionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsDeleteForTeamDiscussionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsDeleteForTeamDiscussionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
