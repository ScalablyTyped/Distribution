package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemoveOutsideCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemoveOutsideCollaboratorRequestOptions
import typings.octokitTypes.endpointsMod.OrgsRemoveOutsideCollaboratorResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsRemoveOutsideCollaboratorEndpoint extends StObject {
  
  var parameters: OrgsRemoveOutsideCollaboratorEndpoint = js.native
  
  var request: OrgsRemoveOutsideCollaboratorRequestOptions = js.native
  
  var response: OctokitResponse[OrgsRemoveOutsideCollaboratorResponseData] = js.native
}
object ParametersOrgsRemoveOutsideCollaboratorEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsRemoveOutsideCollaboratorEndpoint,
    request: OrgsRemoveOutsideCollaboratorRequestOptions,
    response: OctokitResponse[OrgsRemoveOutsideCollaboratorResponseData]
  ): ParametersOrgsRemoveOutsideCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemoveOutsideCollaboratorEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsRemoveOutsideCollaboratorEndpointMutableBuilder[Self <: ParametersOrgsRemoveOutsideCollaboratorEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsRemoveOutsideCollaboratorEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsRemoveOutsideCollaboratorRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsRemoveOutsideCollaboratorResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
