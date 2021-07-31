package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListChildInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListChildInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListChildInOrgEndpoint extends StObject {
  
  var parameters: TeamsListChildInOrgEndpoint
  
  var response: OctokitResponse[TeamsListChildInOrgResponseData]
}
object ParametersTeamsListChildInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListChildInOrgEndpoint,
    response: OctokitResponse[TeamsListChildInOrgResponseData]
  ): ParametersTeamsListChildInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListChildInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListChildInOrgEndpointMutableBuilder[Self <: ParametersTeamsListChildInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListChildInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListChildInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
