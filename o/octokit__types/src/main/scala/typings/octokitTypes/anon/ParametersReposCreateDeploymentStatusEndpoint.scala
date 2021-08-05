package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateDeploymentStatusEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentStatusRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentStatusResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposCreateDeploymentStatusEndpoint extends StObject {
  
  var parameters: ReposCreateDeploymentStatusEndpoint
  
  var request: ReposCreateDeploymentStatusRequestOptions
  
  var response: OctokitResponse[ReposCreateDeploymentStatusResponseData]
}
object ParametersReposCreateDeploymentStatusEndpoint {
  
  inline def apply(
    parameters: ReposCreateDeploymentStatusEndpoint,
    request: ReposCreateDeploymentStatusRequestOptions,
    response: OctokitResponse[ReposCreateDeploymentStatusResponseData]
  ): ParametersReposCreateDeploymentStatusEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateDeploymentStatusEndpoint]
  }
  
  extension [Self <: ParametersReposCreateDeploymentStatusEndpoint](x: Self) {
    
    inline def setParameters(value: ReposCreateDeploymentStatusEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposCreateDeploymentStatusRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposCreateDeploymentStatusResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
