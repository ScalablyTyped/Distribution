package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsGetEndpoint
import typings.octokitTypes.endpointsMod.PullsGetRequestOptions
import typings.octokitTypes.endpointsMod.PullsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsGetEndpoint extends StObject {
  
  var parameters: PullsGetEndpoint = js.native
  
  var request: PullsGetRequestOptions = js.native
  
  var response: OctokitResponse[PullsGetResponseData] = js.native
}
object ParametersPullsGetEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsGetEndpoint,
    request: PullsGetRequestOptions,
    response: OctokitResponse[PullsGetResponseData]
  ): ParametersPullsGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsGetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsGetEndpointMutableBuilder[Self <: ParametersPullsGetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
