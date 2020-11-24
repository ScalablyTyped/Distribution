package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksCreateEndpoint
import typings.octokitTypes.endpointsMod.ChecksCreateRequestOptions
import typings.octokitTypes.endpointsMod.ChecksCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksCreateEndpoint extends js.Object {
  
  var parameters: ChecksCreateEndpoint = js.native
  
  var request: ChecksCreateRequestOptions = js.native
  
  var response: OctokitResponse[ChecksCreateResponseData] = js.native
}
object ParametersChecksCreateEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksCreateEndpoint,
    request: ChecksCreateRequestOptions,
    response: OctokitResponse[ChecksCreateResponseData]
  ): ParametersChecksCreateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksCreateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksCreateEndpointOps[Self <: ParametersChecksCreateEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ChecksCreateEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChecksCreateRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksCreateResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
