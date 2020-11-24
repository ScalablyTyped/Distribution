package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityGetThreadEndpoint
import typings.octokitTypes.endpointsMod.ActivityGetThreadRequestOptions
import typings.octokitTypes.endpointsMod.ActivityGetThreadResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityGetThreadEndpoint extends js.Object {
  
  var parameters: ActivityGetThreadEndpoint = js.native
  
  var request: ActivityGetThreadRequestOptions = js.native
  
  var response: OctokitResponse[ActivityGetThreadResponseData] = js.native
}
object ParametersActivityGetThreadEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityGetThreadEndpoint,
    request: ActivityGetThreadRequestOptions,
    response: OctokitResponse[ActivityGetThreadResponseData]
  ): ParametersActivityGetThreadEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityGetThreadEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityGetThreadEndpointOps[Self <: ParametersActivityGetThreadEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActivityGetThreadEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityGetThreadRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityGetThreadResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
