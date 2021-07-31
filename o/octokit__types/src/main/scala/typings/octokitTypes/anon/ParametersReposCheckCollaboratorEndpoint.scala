package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCheckCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ReposCheckCollaboratorRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposCheckCollaboratorEndpoint extends StObject {
  
  var parameters: ReposCheckCollaboratorEndpoint
  
  var request: ReposCheckCollaboratorRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposCheckCollaboratorEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCheckCollaboratorEndpoint,
    request: ReposCheckCollaboratorRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposCheckCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCheckCollaboratorEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCheckCollaboratorEndpointMutableBuilder[Self <: ParametersReposCheckCollaboratorEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCheckCollaboratorEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCheckCollaboratorRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
