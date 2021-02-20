package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposTransferEndpoint
import typings.octokitTypes.endpointsMod.ReposTransferRequestOptions
import typings.octokitTypes.endpointsMod.ReposTransferResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposTransferEndpoint extends StObject {
  
  var parameters: ReposTransferEndpoint = js.native
  
  var request: ReposTransferRequestOptions = js.native
  
  var response: OctokitResponse[ReposTransferResponseData] = js.native
}
object ParametersReposTransferEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposTransferEndpoint,
    request: ReposTransferRequestOptions,
    response: OctokitResponse[ReposTransferResponseData]
  ): ParametersReposTransferEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposTransferEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposTransferEndpointMutableBuilder[Self <: ParametersReposTransferEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposTransferEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposTransferRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposTransferResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
