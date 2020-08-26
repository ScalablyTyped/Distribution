package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsGetMembershipForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsGetMembershipForAuthenticatedUserEndpoint extends js.Object {
  var parameters: OrgsGetMembershipForAuthenticatedUserEndpoint = js.native
  var request: OrgsGetMembershipForAuthenticatedUserRequestOptions = js.native
  var response: OctokitResponse[OrgsGetMembershipForAuthenticatedUserResponseData] = js.native
}

object ParametersOrgsGetMembershipForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsGetMembershipForAuthenticatedUserEndpoint,
    request: OrgsGetMembershipForAuthenticatedUserRequestOptions,
    response: OctokitResponse[OrgsGetMembershipForAuthenticatedUserResponseData]
  ): ParametersOrgsGetMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsGetMembershipForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsGetMembershipForAuthenticatedUserEndpointOps[Self <: ParametersOrgsGetMembershipForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsGetMembershipForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OrgsGetMembershipForAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsGetMembershipForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

