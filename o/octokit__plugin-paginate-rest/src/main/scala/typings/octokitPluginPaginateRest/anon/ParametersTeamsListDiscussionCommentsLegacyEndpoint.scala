package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListDiscussionCommentsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListDiscussionCommentsLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListDiscussionCommentsLegacyEndpoint extends StObject {
  
  var parameters: TeamsListDiscussionCommentsLegacyEndpoint
  
  var response: OctokitResponse[TeamsListDiscussionCommentsLegacyResponseData]
}
object ParametersTeamsListDiscussionCommentsLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsListDiscussionCommentsLegacyEndpoint,
    response: OctokitResponse[TeamsListDiscussionCommentsLegacyResponseData]
  ): ParametersTeamsListDiscussionCommentsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListDiscussionCommentsLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsListDiscussionCommentsLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsListDiscussionCommentsLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListDiscussionCommentsLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
