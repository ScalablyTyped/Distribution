package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveCollaboratorRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposRemoveCollaboratorEndpoint extends StObject {
  
  var parameters: ReposRemoveCollaboratorEndpoint = js.native
  
  var request: ReposRemoveCollaboratorRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposRemoveCollaboratorEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposRemoveCollaboratorEndpoint,
    request: ReposRemoveCollaboratorRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposRemoveCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveCollaboratorEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposRemoveCollaboratorEndpointMutableBuilder[Self <: ParametersReposRemoveCollaboratorEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposRemoveCollaboratorEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposRemoveCollaboratorRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
