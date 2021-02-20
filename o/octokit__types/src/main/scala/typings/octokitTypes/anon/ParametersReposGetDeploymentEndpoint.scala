package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetDeploymentEndpoint
import typings.octokitTypes.endpointsMod.ReposGetDeploymentRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetDeploymentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetDeploymentEndpoint extends StObject {
  
  var parameters: ReposGetDeploymentEndpoint = js.native
  
  var request: ReposGetDeploymentRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetDeploymentResponseData] = js.native
}
object ParametersReposGetDeploymentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetDeploymentEndpoint,
    request: ReposGetDeploymentRequestOptions,
    response: OctokitResponse[ReposGetDeploymentResponseData]
  ): ParametersReposGetDeploymentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetDeploymentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetDeploymentEndpointMutableBuilder[Self <: ParametersReposGetDeploymentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetDeploymentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetDeploymentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetDeploymentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
