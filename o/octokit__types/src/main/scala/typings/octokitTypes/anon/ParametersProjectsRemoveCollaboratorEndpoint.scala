package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsRemoveCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ProjectsRemoveCollaboratorRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsRemoveCollaboratorEndpoint extends StObject {
  
  var parameters: ProjectsRemoveCollaboratorEndpoint
  
  var request: ProjectsRemoveCollaboratorRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersProjectsRemoveCollaboratorEndpoint {
  
  inline def apply(
    parameters: ProjectsRemoveCollaboratorEndpoint,
    request: ProjectsRemoveCollaboratorRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersProjectsRemoveCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsRemoveCollaboratorEndpoint]
  }
  
  extension [Self <: ParametersProjectsRemoveCollaboratorEndpoint](x: Self) {
    
    inline def setParameters(value: ProjectsRemoveCollaboratorEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ProjectsRemoveCollaboratorRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
