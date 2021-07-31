package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListChildLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListChildLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListChildLegacyEndpoint extends StObject {
  
  var parameters: TeamsListChildLegacyEndpoint
  
  var response: OctokitResponse[TeamsListChildLegacyResponseData]
}
object ParametersTeamsListChildLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListChildLegacyEndpoint,
    response: OctokitResponse[TeamsListChildLegacyResponseData]
  ): ParametersTeamsListChildLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListChildLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListChildLegacyEndpointMutableBuilder[Self <: ParametersTeamsListChildLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListChildLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListChildLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
