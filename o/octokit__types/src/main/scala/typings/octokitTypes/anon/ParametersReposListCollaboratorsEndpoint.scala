package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListCollaboratorsEndpoint
import typings.octokitTypes.endpointsMod.ReposListCollaboratorsRequestOptions
import typings.octokitTypes.endpointsMod.ReposListCollaboratorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListCollaboratorsEndpoint extends StObject {
  
  var parameters: ReposListCollaboratorsEndpoint
  
  var request: ReposListCollaboratorsRequestOptions
  
  var response: OctokitResponse[ReposListCollaboratorsResponseData]
}
object ParametersReposListCollaboratorsEndpoint {
  
  inline def apply(
    parameters: ReposListCollaboratorsEndpoint,
    request: ReposListCollaboratorsRequestOptions,
    response: OctokitResponse[ReposListCollaboratorsResponseData]
  ): ParametersReposListCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCollaboratorsEndpoint]
  }
  
  extension [Self <: ParametersReposListCollaboratorsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListCollaboratorsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposListCollaboratorsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListCollaboratorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
