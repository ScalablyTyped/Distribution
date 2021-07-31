package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionInOrgRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsCreateForTeamDiscussionInOrgEndpoint extends StObject {
  
  var parameters: ReactionsCreateForTeamDiscussionInOrgEndpoint
  
  var request: ReactionsCreateForTeamDiscussionInOrgRequestOptions
  
  var response: OctokitResponse[ReactionsCreateForTeamDiscussionInOrgResponseData]
}
object ParametersReactionsCreateForTeamDiscussionInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsCreateForTeamDiscussionInOrgEndpoint,
    request: ReactionsCreateForTeamDiscussionInOrgRequestOptions,
    response: OctokitResponse[ReactionsCreateForTeamDiscussionInOrgResponseData]
  ): ParametersReactionsCreateForTeamDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForTeamDiscussionInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsCreateForTeamDiscussionInOrgEndpointMutableBuilder[Self <: ParametersReactionsCreateForTeamDiscussionInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsCreateForTeamDiscussionInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsCreateForTeamDiscussionInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForTeamDiscussionInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
