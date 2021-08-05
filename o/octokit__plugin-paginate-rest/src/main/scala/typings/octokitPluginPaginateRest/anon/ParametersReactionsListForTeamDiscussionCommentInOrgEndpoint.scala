package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint extends StObject {
  
  var parameters: ReactionsListForTeamDiscussionCommentInOrgEndpoint
  
  var response: OctokitResponse[ReactionsListForTeamDiscussionCommentInOrgResponseData]
}
object ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint {
  
  inline def apply(
    parameters: ReactionsListForTeamDiscussionCommentInOrgEndpoint,
    response: OctokitResponse[ReactionsListForTeamDiscussionCommentInOrgResponseData]
  ): ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint]
  }
  
  extension [Self <: ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: ReactionsListForTeamDiscussionCommentInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReactionsListForTeamDiscussionCommentInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
