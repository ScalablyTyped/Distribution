package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsRemoveCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ProjectsRemoveCollaboratorRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsRemoveCollaboratorEndpoint extends StObject {
  
  var parameters: ProjectsRemoveCollaboratorEndpoint = js.native
  
  var request: ProjectsRemoveCollaboratorRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersProjectsRemoveCollaboratorEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsRemoveCollaboratorEndpoint,
    request: ProjectsRemoveCollaboratorRequestOptions,
    response: OctokitResponse[_]
  ): ParametersProjectsRemoveCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsRemoveCollaboratorEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsRemoveCollaboratorEndpointMutableBuilder[Self <: ParametersProjectsRemoveCollaboratorEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsRemoveCollaboratorEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsRemoveCollaboratorRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
