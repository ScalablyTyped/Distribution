package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCollaboratorPermissionLevelEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCollaboratorPermissionLevelRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCollaboratorPermissionLevelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetCollaboratorPermissionLevelEndpoint extends StObject {
  
  var parameters: ReposGetCollaboratorPermissionLevelEndpoint
  
  var request: ReposGetCollaboratorPermissionLevelRequestOptions
  
  var response: OctokitResponse[ReposGetCollaboratorPermissionLevelResponseData]
}
object ParametersReposGetCollaboratorPermissionLevelEndpoint {
  
  inline def apply(
    parameters: ReposGetCollaboratorPermissionLevelEndpoint,
    request: ReposGetCollaboratorPermissionLevelRequestOptions,
    response: OctokitResponse[ReposGetCollaboratorPermissionLevelResponseData]
  ): ParametersReposGetCollaboratorPermissionLevelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCollaboratorPermissionLevelEndpoint]
  }
  
  extension [Self <: ParametersReposGetCollaboratorPermissionLevelEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetCollaboratorPermissionLevelEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetCollaboratorPermissionLevelRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetCollaboratorPermissionLevelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
