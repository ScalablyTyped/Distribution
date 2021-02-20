package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveProjectInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveProjectInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsRemoveProjectInOrgEndpoint extends StObject {
  
  var parameters: TeamsRemoveProjectInOrgEndpoint = js.native
  
  var request: TeamsRemoveProjectInOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsRemoveProjectInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsRemoveProjectInOrgEndpoint,
    request: TeamsRemoveProjectInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveProjectInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveProjectInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsRemoveProjectInOrgEndpointMutableBuilder[Self <: ParametersTeamsRemoveProjectInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsRemoveProjectInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsRemoveProjectInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
