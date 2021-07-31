package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsCheckPermissionsForProjectInOrgEndpoint extends StObject {
  
  var parameters: TeamsCheckPermissionsForProjectInOrgEndpoint
  
  var request: TeamsCheckPermissionsForProjectInOrgRequestOptions
  
  var response: OctokitResponse[TeamsCheckPermissionsForProjectInOrgResponseData]
}
object ParametersTeamsCheckPermissionsForProjectInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsCheckPermissionsForProjectInOrgEndpoint,
    request: TeamsCheckPermissionsForProjectInOrgRequestOptions,
    response: OctokitResponse[TeamsCheckPermissionsForProjectInOrgResponseData]
  ): ParametersTeamsCheckPermissionsForProjectInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCheckPermissionsForProjectInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsCheckPermissionsForProjectInOrgEndpointMutableBuilder[Self <: ParametersTeamsCheckPermissionsForProjectInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsCheckPermissionsForProjectInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCheckPermissionsForProjectInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCheckPermissionsForProjectInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
