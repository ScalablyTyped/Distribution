package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListIdPGroupsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListIdPGroupsInOrgEndpoint extends StObject {
  
  var parameters: TeamsListIdPGroupsInOrgEndpoint = js.native
  
  var request: TeamsListIdPGroupsInOrgRequestOptions = js.native
  
  var response: OctokitResponse[TeamsListIdPGroupsInOrgResponseData] = js.native
}
object ParametersTeamsListIdPGroupsInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListIdPGroupsInOrgEndpoint,
    request: TeamsListIdPGroupsInOrgRequestOptions,
    response: OctokitResponse[TeamsListIdPGroupsInOrgResponseData]
  ): ParametersTeamsListIdPGroupsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListIdPGroupsInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListIdPGroupsInOrgEndpointMutableBuilder[Self <: ParametersTeamsListIdPGroupsInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListIdPGroupsInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsListIdPGroupsInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListIdPGroupsInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
