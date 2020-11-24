package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksRerequestSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksRerequestSuiteRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksRerequestSuiteEndpoint extends js.Object {
  
  var parameters: ChecksRerequestSuiteEndpoint = js.native
  
  var request: ChecksRerequestSuiteRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersChecksRerequestSuiteEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksRerequestSuiteEndpoint,
    request: ChecksRerequestSuiteRequestOptions,
    response: OctokitResponse[_]
  ): ParametersChecksRerequestSuiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksRerequestSuiteEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksRerequestSuiteEndpointOps[Self <: ParametersChecksRerequestSuiteEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ChecksRerequestSuiteEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChecksRerequestSuiteRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
