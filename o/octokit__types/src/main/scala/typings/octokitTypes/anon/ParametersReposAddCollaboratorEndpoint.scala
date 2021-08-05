package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.ReposAddCollaboratorRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddCollaboratorResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposAddCollaboratorEndpoint extends StObject {
  
  var parameters: ReposAddCollaboratorEndpoint
  
  var request: ReposAddCollaboratorRequestOptions
  
  var response: OctokitResponse[ReposAddCollaboratorResponseData]
}
object ParametersReposAddCollaboratorEndpoint {
  
  inline def apply(
    parameters: ReposAddCollaboratorEndpoint,
    request: ReposAddCollaboratorRequestOptions,
    response: OctokitResponse[ReposAddCollaboratorResponseData]
  ): ParametersReposAddCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddCollaboratorEndpoint]
  }
  
  extension [Self <: ParametersReposAddCollaboratorEndpoint](x: Self) {
    
    inline def setParameters(value: ReposAddCollaboratorEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposAddCollaboratorRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposAddCollaboratorResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
