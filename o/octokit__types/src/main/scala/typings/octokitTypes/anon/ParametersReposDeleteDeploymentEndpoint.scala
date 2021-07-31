package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteDeploymentEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteDeploymentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposDeleteDeploymentEndpoint extends StObject {
  
  var parameters: ReposDeleteDeploymentEndpoint
  
  var request: ReposDeleteDeploymentRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposDeleteDeploymentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteDeploymentEndpoint,
    request: ReposDeleteDeploymentRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposDeleteDeploymentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteDeploymentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteDeploymentEndpointMutableBuilder[Self <: ParametersReposDeleteDeploymentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeleteDeploymentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteDeploymentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
