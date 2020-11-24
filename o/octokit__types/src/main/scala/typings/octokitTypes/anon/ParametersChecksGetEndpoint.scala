package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksGetEndpoint
import typings.octokitTypes.endpointsMod.ChecksGetRequestOptions
import typings.octokitTypes.endpointsMod.ChecksGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksGetEndpoint extends js.Object {
  
  var parameters: ChecksGetEndpoint = js.native
  
  var request: ChecksGetRequestOptions = js.native
  
  var response: OctokitResponse[ChecksGetResponseData] = js.native
}
object ParametersChecksGetEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksGetEndpoint,
    request: ChecksGetRequestOptions,
    response: OctokitResponse[ChecksGetResponseData]
  ): ParametersChecksGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksGetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksGetEndpointOps[Self <: ParametersChecksGetEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ChecksGetEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChecksGetRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksGetResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
