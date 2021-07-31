package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListIdPGroupsForLegacyEndpoint extends StObject {
  
  var parameters: TeamsListIdPGroupsForLegacyEndpoint
  
  var response: OctokitResponse[TeamsListIdPGroupsForLegacyResponseData] & `7`
}
object ParametersTeamsListIdPGroupsForLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListIdPGroupsForLegacyEndpoint,
    response: OctokitResponse[TeamsListIdPGroupsForLegacyResponseData] & `7`
  ): ParametersTeamsListIdPGroupsForLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListIdPGroupsForLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListIdPGroupsForLegacyEndpointMutableBuilder[Self <: ParametersTeamsListIdPGroupsForLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListIdPGroupsForLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListIdPGroupsForLegacyResponseData] & `7`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
