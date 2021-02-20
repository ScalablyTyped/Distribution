package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsAddCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ProjectsAddCollaboratorRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsAddCollaboratorEndpoint extends StObject {
  
  var parameters: ProjectsAddCollaboratorEndpoint = js.native
  
  var request: ProjectsAddCollaboratorRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersProjectsAddCollaboratorEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsAddCollaboratorEndpoint,
    request: ProjectsAddCollaboratorRequestOptions,
    response: OctokitResponse[_]
  ): ParametersProjectsAddCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsAddCollaboratorEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsAddCollaboratorEndpointMutableBuilder[Self <: ParametersProjectsAddCollaboratorEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsAddCollaboratorEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsAddCollaboratorRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
