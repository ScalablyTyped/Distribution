package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemovePublicMembershipForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemovePublicMembershipForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsRemovePublicMembershipForAuthenticatedUserEndpoint extends js.Object {
  var parameters: OrgsRemovePublicMembershipForAuthenticatedUserEndpoint = js.native
  var request: OrgsRemovePublicMembershipForAuthenticatedUserRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersOrgsRemovePublicMembershipForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsRemovePublicMembershipForAuthenticatedUserEndpoint,
    request: OrgsRemovePublicMembershipForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsRemovePublicMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemovePublicMembershipForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsRemovePublicMembershipForAuthenticatedUserEndpointOps[Self <: ParametersOrgsRemovePublicMembershipForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsRemovePublicMembershipForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OrgsRemovePublicMembershipForAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

