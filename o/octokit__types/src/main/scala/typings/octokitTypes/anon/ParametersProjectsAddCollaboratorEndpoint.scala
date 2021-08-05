package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsAddCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ProjectsAddCollaboratorRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsAddCollaboratorEndpoint extends StObject {
  
  var parameters: ProjectsAddCollaboratorEndpoint
  
  var request: ProjectsAddCollaboratorRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersProjectsAddCollaboratorEndpoint {
  
  inline def apply(
    parameters: ProjectsAddCollaboratorEndpoint,
    request: ProjectsAddCollaboratorRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersProjectsAddCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsAddCollaboratorEndpoint]
  }
  
  extension [Self <: ParametersProjectsAddCollaboratorEndpoint](x: Self) {
    
    inline def setParameters(value: ProjectsAddCollaboratorEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ProjectsAddCollaboratorRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
