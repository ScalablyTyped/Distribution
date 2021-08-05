package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveCollaboratorRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposRemoveCollaboratorEndpoint extends StObject {
  
  var parameters: ReposRemoveCollaboratorEndpoint
  
  var request: ReposRemoveCollaboratorRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposRemoveCollaboratorEndpoint {
  
  inline def apply(
    parameters: ReposRemoveCollaboratorEndpoint,
    request: ReposRemoveCollaboratorRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposRemoveCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveCollaboratorEndpoint]
  }
  
  extension [Self <: ParametersReposRemoveCollaboratorEndpoint](x: Self) {
    
    inline def setParameters(value: ReposRemoveCollaboratorEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposRemoveCollaboratorRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
