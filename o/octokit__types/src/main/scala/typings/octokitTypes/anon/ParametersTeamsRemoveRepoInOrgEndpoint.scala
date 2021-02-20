package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveRepoInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveRepoInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsRemoveRepoInOrgEndpoint extends StObject {
  
  var parameters: TeamsRemoveRepoInOrgEndpoint = js.native
  
  var request: TeamsRemoveRepoInOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsRemoveRepoInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsRemoveRepoInOrgEndpoint,
    request: TeamsRemoveRepoInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveRepoInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveRepoInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsRemoveRepoInOrgEndpointMutableBuilder[Self <: ParametersTeamsRemoveRepoInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsRemoveRepoInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsRemoveRepoInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
