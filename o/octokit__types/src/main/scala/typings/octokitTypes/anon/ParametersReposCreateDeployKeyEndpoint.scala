package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateDeployKeyEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateDeployKeyRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateDeployKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateDeployKeyEndpoint extends StObject {
  
  var parameters: ReposCreateDeployKeyEndpoint = js.native
  
  var request: ReposCreateDeployKeyRequestOptions = js.native
  
  var response: OctokitResponse[ReposCreateDeployKeyResponseData] = js.native
}
object ParametersReposCreateDeployKeyEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateDeployKeyEndpoint,
    request: ReposCreateDeployKeyRequestOptions,
    response: OctokitResponse[ReposCreateDeployKeyResponseData]
  ): ParametersReposCreateDeployKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateDeployKeyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateDeployKeyEndpointMutableBuilder[Self <: ParametersReposCreateDeployKeyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCreateDeployKeyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateDeployKeyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateDeployKeyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
