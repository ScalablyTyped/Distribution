package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReactionsListForTeamDiscussionLegacyEndpoint extends StObject {
  
  var parameters: ReactionsListForTeamDiscussionLegacyEndpoint
  
  var response: OctokitResponse[ReactionsListForTeamDiscussionLegacyResponseData]
}
object ParametersReactionsListForTeamDiscussionLegacyEndpoint {
  
  inline def apply(
    parameters: ReactionsListForTeamDiscussionLegacyEndpoint,
    response: OctokitResponse[ReactionsListForTeamDiscussionLegacyResponseData]
  ): ParametersReactionsListForTeamDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForTeamDiscussionLegacyEndpoint]
  }
  
  extension [Self <: ParametersReactionsListForTeamDiscussionLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: ReactionsListForTeamDiscussionLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReactionsListForTeamDiscussionLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
