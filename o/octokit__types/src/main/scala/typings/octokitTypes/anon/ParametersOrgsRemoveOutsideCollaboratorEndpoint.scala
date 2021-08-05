package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemoveOutsideCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemoveOutsideCollaboratorRequestOptions
import typings.octokitTypes.endpointsMod.OrgsRemoveOutsideCollaboratorResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsRemoveOutsideCollaboratorEndpoint extends StObject {
  
  var parameters: OrgsRemoveOutsideCollaboratorEndpoint
  
  var request: OrgsRemoveOutsideCollaboratorRequestOptions
  
  var response: OctokitResponse[OrgsRemoveOutsideCollaboratorResponseData]
}
object ParametersOrgsRemoveOutsideCollaboratorEndpoint {
  
  inline def apply(
    parameters: OrgsRemoveOutsideCollaboratorEndpoint,
    request: OrgsRemoveOutsideCollaboratorRequestOptions,
    response: OctokitResponse[OrgsRemoveOutsideCollaboratorResponseData]
  ): ParametersOrgsRemoveOutsideCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemoveOutsideCollaboratorEndpoint]
  }
  
  extension [Self <: ParametersOrgsRemoveOutsideCollaboratorEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsRemoveOutsideCollaboratorEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsRemoveOutsideCollaboratorRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsRemoveOutsideCollaboratorResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
