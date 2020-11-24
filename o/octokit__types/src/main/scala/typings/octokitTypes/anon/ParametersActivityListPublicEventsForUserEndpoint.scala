package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListPublicEventsForUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListPublicEventsForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListPublicEventsForUserEndpoint extends js.Object {
  
  var parameters: ActivityListPublicEventsForUserEndpoint = js.native
  
  var request: ActivityListPublicEventsForUserRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityListPublicEventsForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListPublicEventsForUserEndpoint,
    request: ActivityListPublicEventsForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListPublicEventsForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListPublicEventsForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListPublicEventsForUserEndpointOps[Self <: ParametersActivityListPublicEventsForUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActivityListPublicEventsForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListPublicEventsForUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
