package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsGetMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsGetMembershipForUserEndpoint extends js.Object {
  var parameters: OrgsGetMembershipForUserEndpoint = js.native
  var request: OrgsGetMembershipForUserRequestOptions = js.native
  var response: OctokitResponse[OrgsGetMembershipForUserResponseData] = js.native
}

object ParametersOrgsGetMembershipForUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsGetMembershipForUserEndpoint,
    request: OrgsGetMembershipForUserRequestOptions,
    response: OctokitResponse[OrgsGetMembershipForUserResponseData]
  ): ParametersOrgsGetMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsGetMembershipForUserEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsGetMembershipForUserEndpointOps[Self <: ParametersOrgsGetMembershipForUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsGetMembershipForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OrgsGetMembershipForUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsGetMembershipForUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

