package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsUpdateMembershipForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsUpdateMembershipForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsUpdateMembershipForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint extends js.Object {
  var parameters: OrgsUpdateMembershipForAuthenticatedUserEndpoint = js.native
  var request: OrgsUpdateMembershipForAuthenticatedUserRequestOptions = js.native
  var response: OctokitResponse[OrgsUpdateMembershipForAuthenticatedUserResponseData] = js.native
}

object ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsUpdateMembershipForAuthenticatedUserEndpoint,
    request: OrgsUpdateMembershipForAuthenticatedUserRequestOptions,
    response: OctokitResponse[OrgsUpdateMembershipForAuthenticatedUserResponseData]
  ): ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsUpdateMembershipForAuthenticatedUserEndpointOps[Self <: ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsUpdateMembershipForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OrgsUpdateMembershipForAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsUpdateMembershipForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

