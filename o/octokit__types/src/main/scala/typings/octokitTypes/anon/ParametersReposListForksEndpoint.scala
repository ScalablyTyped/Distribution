package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListForksEndpoint
import typings.octokitTypes.endpointsMod.ReposListForksRequestOptions
import typings.octokitTypes.endpointsMod.ReposListForksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListForksEndpoint extends StObject {
  
  var parameters: ReposListForksEndpoint = js.native
  
  var request: ReposListForksRequestOptions = js.native
  
  var response: OctokitResponse[ReposListForksResponseData] = js.native
}
object ParametersReposListForksEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListForksEndpoint,
    request: ReposListForksRequestOptions,
    response: OctokitResponse[ReposListForksResponseData]
  ): ParametersReposListForksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListForksEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListForksEndpointMutableBuilder[Self <: ParametersReposListForksEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListForksEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListForksRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListForksResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
