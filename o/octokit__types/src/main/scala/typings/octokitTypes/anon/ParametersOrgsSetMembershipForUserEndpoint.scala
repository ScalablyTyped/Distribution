package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsSetMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsSetMembershipForUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsSetMembershipForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsSetMembershipForUserEndpoint extends js.Object {
  var parameters: OrgsSetMembershipForUserEndpoint = js.native
  var request: OrgsSetMembershipForUserRequestOptions = js.native
  var response: OctokitResponse[OrgsSetMembershipForUserResponseData] = js.native
}

object ParametersOrgsSetMembershipForUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsSetMembershipForUserEndpoint,
    request: OrgsSetMembershipForUserRequestOptions,
    response: OctokitResponse[OrgsSetMembershipForUserResponseData]
  ): ParametersOrgsSetMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsSetMembershipForUserEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsSetMembershipForUserEndpointOps[Self <: ParametersOrgsSetMembershipForUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsSetMembershipForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OrgsSetMembershipForUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsSetMembershipForUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

