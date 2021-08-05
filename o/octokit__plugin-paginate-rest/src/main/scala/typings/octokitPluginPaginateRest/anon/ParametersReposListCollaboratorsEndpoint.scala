package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListCollaboratorsEndpoint
import typings.octokitTypes.endpointsMod.ReposListCollaboratorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListCollaboratorsEndpoint extends StObject {
  
  var parameters: ReposListCollaboratorsEndpoint
  
  var response: OctokitResponse[ReposListCollaboratorsResponseData]
}
object ParametersReposListCollaboratorsEndpoint {
  
  inline def apply(
    parameters: ReposListCollaboratorsEndpoint,
    response: OctokitResponse[ReposListCollaboratorsResponseData]
  ): ParametersReposListCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCollaboratorsEndpoint]
  }
  
  extension [Self <: ParametersReposListCollaboratorsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListCollaboratorsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListCollaboratorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
