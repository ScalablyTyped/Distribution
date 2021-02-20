package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsAddOrUpdateProjectPermissionsInOrgEndpoint extends StObject {
  
  var parameters: TeamsAddOrUpdateProjectPermissionsInOrgEndpoint = js.native
  
  var request: TeamsAddOrUpdateProjectPermissionsInOrgRequestOptions = js.native
  
  var response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsInOrgResponseData] = js.native
}
object ParametersTeamsAddOrUpdateProjectPermissionsInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateProjectPermissionsInOrgEndpoint,
    request: TeamsAddOrUpdateProjectPermissionsInOrgRequestOptions,
    response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsInOrgResponseData]
  ): ParametersTeamsAddOrUpdateProjectPermissionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateProjectPermissionsInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsAddOrUpdateProjectPermissionsInOrgEndpointMutableBuilder[Self <: ParametersTeamsAddOrUpdateProjectPermissionsInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsAddOrUpdateProjectPermissionsInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsAddOrUpdateProjectPermissionsInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsAddOrUpdateProjectPermissionsInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
