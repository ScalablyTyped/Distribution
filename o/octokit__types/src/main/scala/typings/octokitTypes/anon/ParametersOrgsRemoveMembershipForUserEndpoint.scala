package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemoveMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemoveMembershipForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsRemoveMembershipForUserEndpoint extends js.Object {
  var parameters: OrgsRemoveMembershipForUserEndpoint = js.native
  var request: OrgsRemoveMembershipForUserRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersOrgsRemoveMembershipForUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsRemoveMembershipForUserEndpoint,
    request: OrgsRemoveMembershipForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsRemoveMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemoveMembershipForUserEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsRemoveMembershipForUserEndpointOps[Self <: ParametersOrgsRemoveMembershipForUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsRemoveMembershipForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OrgsRemoveMembershipForUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

