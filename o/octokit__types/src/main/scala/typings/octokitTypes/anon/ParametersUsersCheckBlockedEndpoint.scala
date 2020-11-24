package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCheckBlockedEndpoint
import typings.octokitTypes.endpointsMod.UsersCheckBlockedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersCheckBlockedEndpoint extends js.Object {
  
  var parameters: UsersCheckBlockedEndpoint = js.native
  
  var request: UsersCheckBlockedRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersUsersCheckBlockedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersCheckBlockedEndpoint,
    request: UsersCheckBlockedRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersCheckBlockedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCheckBlockedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersCheckBlockedEndpointOps[Self <: ParametersUsersCheckBlockedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: UsersCheckBlockedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersCheckBlockedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
