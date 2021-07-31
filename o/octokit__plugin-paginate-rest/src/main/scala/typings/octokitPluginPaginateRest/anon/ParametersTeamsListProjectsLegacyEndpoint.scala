package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListProjectsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListProjectsLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListProjectsLegacyEndpoint extends StObject {
  
  var parameters: TeamsListProjectsLegacyEndpoint
  
  var response: OctokitResponse[TeamsListProjectsLegacyResponseData]
}
object ParametersTeamsListProjectsLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListProjectsLegacyEndpoint,
    response: OctokitResponse[TeamsListProjectsLegacyResponseData]
  ): ParametersTeamsListProjectsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListProjectsLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListProjectsLegacyEndpointMutableBuilder[Self <: ParametersTeamsListProjectsLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListProjectsLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListProjectsLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
