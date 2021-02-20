package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListIdPGroupsForOrgEndpoint extends StObject {
  
  var parameters: TeamsListIdPGroupsForOrgEndpoint = js.native
  
  var response: OctokitResponse[TeamsListIdPGroupsForOrgResponseData] with `7` = js.native
}
object ParametersTeamsListIdPGroupsForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListIdPGroupsForOrgEndpoint,
    response: OctokitResponse[TeamsListIdPGroupsForOrgResponseData] with `7`
  ): ParametersTeamsListIdPGroupsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListIdPGroupsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListIdPGroupsForOrgEndpointMutableBuilder[Self <: ParametersTeamsListIdPGroupsForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListIdPGroupsForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListIdPGroupsForOrgResponseData] with `7`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
