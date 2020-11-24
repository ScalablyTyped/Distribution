package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCheckBlockedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsCheckBlockedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsCheckBlockedUserEndpoint extends js.Object {
  
  var parameters: OrgsCheckBlockedUserEndpoint = js.native
  
  var request: OrgsCheckBlockedUserRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersOrgsCheckBlockedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsCheckBlockedUserEndpoint,
    request: OrgsCheckBlockedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsCheckBlockedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCheckBlockedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsCheckBlockedUserEndpointOps[Self <: ParametersOrgsCheckBlockedUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OrgsCheckBlockedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsCheckBlockedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
