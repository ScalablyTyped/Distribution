package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ReposAddCollaboratorRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddCollaboratorResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposAddCollaboratorEndpoint extends StObject {
  
  var parameters: ReposAddCollaboratorEndpoint = js.native
  
  var request: ReposAddCollaboratorRequestOptions = js.native
  
  var response: OctokitResponse[ReposAddCollaboratorResponseData] = js.native
}
object ParametersReposAddCollaboratorEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposAddCollaboratorEndpoint,
    request: ReposAddCollaboratorRequestOptions,
    response: OctokitResponse[ReposAddCollaboratorResponseData]
  ): ParametersReposAddCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddCollaboratorEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposAddCollaboratorEndpointMutableBuilder[Self <: ParametersReposAddCollaboratorEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposAddCollaboratorEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposAddCollaboratorRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposAddCollaboratorResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
