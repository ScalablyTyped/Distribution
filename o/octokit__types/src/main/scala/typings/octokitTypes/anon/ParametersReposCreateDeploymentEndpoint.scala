package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateDeploymentEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentResponse202Data
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentResponse409Data
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposCreateDeploymentEndpoint extends StObject {
  
  var parameters: ReposCreateDeploymentEndpoint
  
  var request: ReposCreateDeploymentRequestOptions
  
  var response: OctokitResponse[
    ReposCreateDeploymentResponseData | ReposCreateDeploymentResponse202Data | ReposCreateDeploymentResponse409Data
  ]
}
object ParametersReposCreateDeploymentEndpoint {
  
  inline def apply(
    parameters: ReposCreateDeploymentEndpoint,
    request: ReposCreateDeploymentRequestOptions,
    response: OctokitResponse[
      ReposCreateDeploymentResponseData | ReposCreateDeploymentResponse202Data | ReposCreateDeploymentResponse409Data
    ]
  ): ParametersReposCreateDeploymentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateDeploymentEndpoint]
  }
  
  extension [Self <: ParametersReposCreateDeploymentEndpoint](x: Self) {
    
    inline def setParameters(value: ReposCreateDeploymentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposCreateDeploymentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: OctokitResponse[
          ReposCreateDeploymentResponseData | ReposCreateDeploymentResponse202Data | ReposCreateDeploymentResponse409Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
