package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetDeploymentStatusEndpoint
import typings.octokitTypes.endpointsMod.ReposGetDeploymentStatusRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetDeploymentStatusResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetDeploymentStatusEndpoint extends StObject {
  
  var parameters: ReposGetDeploymentStatusEndpoint
  
  var request: ReposGetDeploymentStatusRequestOptions
  
  var response: OctokitResponse[ReposGetDeploymentStatusResponseData]
}
object ParametersReposGetDeploymentStatusEndpoint {
  
  inline def apply(
    parameters: ReposGetDeploymentStatusEndpoint,
    request: ReposGetDeploymentStatusRequestOptions,
    response: OctokitResponse[ReposGetDeploymentStatusResponseData]
  ): ParametersReposGetDeploymentStatusEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetDeploymentStatusEndpoint]
  }
  
  extension [Self <: ParametersReposGetDeploymentStatusEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetDeploymentStatusEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetDeploymentStatusRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetDeploymentStatusResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
