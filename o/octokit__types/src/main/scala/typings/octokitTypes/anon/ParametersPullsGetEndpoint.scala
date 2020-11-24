package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsGetEndpoint
import typings.octokitTypes.endpointsMod.PullsGetRequestOptions
import typings.octokitTypes.endpointsMod.PullsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsGetEndpoint extends js.Object {
  
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
  implicit class ParametersPullsGetEndpointOps[Self <: ParametersPullsGetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: PullsGetEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsGetRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsGetResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
