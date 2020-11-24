package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityMarkThreadAsReadEndpoint
import typings.octokitTypes.endpointsMod.ActivityMarkThreadAsReadRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityMarkThreadAsReadEndpoint extends js.Object {
  
  var parameters: ActivityMarkThreadAsReadEndpoint = js.native
  
  var request: ActivityMarkThreadAsReadRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityMarkThreadAsReadEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityMarkThreadAsReadEndpoint,
    request: ActivityMarkThreadAsReadRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityMarkThreadAsReadEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityMarkThreadAsReadEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityMarkThreadAsReadEndpointOps[Self <: ParametersActivityMarkThreadAsReadEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActivityMarkThreadAsReadEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityMarkThreadAsReadRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
