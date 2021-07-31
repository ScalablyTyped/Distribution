package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListDeployKeysEndpoint
import typings.octokitTypes.endpointsMod.ReposListDeployKeysRequestOptions
import typings.octokitTypes.endpointsMod.ReposListDeployKeysResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListDeployKeysEndpoint extends StObject {
  
  var parameters: ReposListDeployKeysEndpoint
  
  var request: ReposListDeployKeysRequestOptions
  
  var response: OctokitResponse[ReposListDeployKeysResponseData]
}
object ParametersReposListDeployKeysEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListDeployKeysEndpoint,
    request: ReposListDeployKeysRequestOptions,
    response: OctokitResponse[ReposListDeployKeysResponseData]
  ): ParametersReposListDeployKeysEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListDeployKeysEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListDeployKeysEndpointMutableBuilder[Self <: ParametersReposListDeployKeysEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListDeployKeysEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListDeployKeysRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListDeployKeysResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
