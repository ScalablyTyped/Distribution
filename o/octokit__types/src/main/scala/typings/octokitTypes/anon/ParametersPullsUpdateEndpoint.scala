package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsUpdateEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateRequestOptions
import typings.octokitTypes.endpointsMod.PullsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsUpdateEndpoint extends js.Object {
  
  var parameters: PullsUpdateEndpoint = js.native
  
  var request: PullsUpdateRequestOptions = js.native
  
  var response: OctokitResponse[PullsUpdateResponseData] = js.native
}
object ParametersPullsUpdateEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsUpdateEndpoint,
    request: PullsUpdateRequestOptions,
    response: OctokitResponse[PullsUpdateResponseData]
  ): ParametersPullsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsUpdateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsUpdateEndpointOps[Self <: ParametersPullsUpdateEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: PullsUpdateEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsUpdateRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsUpdateResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
