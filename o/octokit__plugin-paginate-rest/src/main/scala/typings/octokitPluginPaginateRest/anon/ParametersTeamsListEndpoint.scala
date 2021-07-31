package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListEndpoint
import typings.octokitTypes.endpointsMod.TeamsListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListEndpoint extends StObject {
  
  var parameters: TeamsListEndpoint
  
  var response: OctokitResponse[TeamsListResponseData]
}
object ParametersTeamsListEndpoint {
  
  @scala.inline
  def apply(parameters: TeamsListEndpoint, response: OctokitResponse[TeamsListResponseData]): ParametersTeamsListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListEndpointMutableBuilder[Self <: ParametersTeamsListEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
