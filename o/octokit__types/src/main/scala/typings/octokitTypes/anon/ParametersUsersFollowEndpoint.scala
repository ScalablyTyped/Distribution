package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersFollowEndpoint
import typings.octokitTypes.endpointsMod.UsersFollowRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersUsersFollowEndpoint extends js.Object {
  var parameters: UsersFollowEndpoint = js.native
  var request: UsersFollowRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersUsersFollowEndpoint {
  @scala.inline
  def apply(parameters: UsersFollowEndpoint, request: UsersFollowRequestOptions, response: OctokitResponse[_]): ParametersUsersFollowEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersFollowEndpoint]
  }
  @scala.inline
  implicit class ParametersUsersFollowEndpointOps[Self <: ParametersUsersFollowEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: UsersFollowEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: UsersFollowRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

