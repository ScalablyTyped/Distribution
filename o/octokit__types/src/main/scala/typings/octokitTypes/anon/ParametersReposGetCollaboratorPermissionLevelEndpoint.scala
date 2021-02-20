package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCollaboratorPermissionLevelEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCollaboratorPermissionLevelRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCollaboratorPermissionLevelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetCollaboratorPermissionLevelEndpoint extends StObject {
  
  var parameters: ReposGetCollaboratorPermissionLevelEndpoint = js.native
  
  var request: ReposGetCollaboratorPermissionLevelRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetCollaboratorPermissionLevelResponseData] = js.native
}
object ParametersReposGetCollaboratorPermissionLevelEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetCollaboratorPermissionLevelEndpoint,
    request: ReposGetCollaboratorPermissionLevelRequestOptions,
    response: OctokitResponse[ReposGetCollaboratorPermissionLevelResponseData]
  ): ParametersReposGetCollaboratorPermissionLevelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCollaboratorPermissionLevelEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetCollaboratorPermissionLevelEndpointMutableBuilder[Self <: ParametersReposGetCollaboratorPermissionLevelEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetCollaboratorPermissionLevelEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetCollaboratorPermissionLevelRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCollaboratorPermissionLevelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
