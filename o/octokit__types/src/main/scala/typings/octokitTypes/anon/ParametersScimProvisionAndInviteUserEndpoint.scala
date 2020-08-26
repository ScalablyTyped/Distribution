package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimProvisionAndInviteUserEndpoint
import typings.octokitTypes.endpointsMod.ScimProvisionAndInviteUserRequestOptions
import typings.octokitTypes.endpointsMod.ScimProvisionAndInviteUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersScimProvisionAndInviteUserEndpoint extends js.Object {
  var parameters: ScimProvisionAndInviteUserEndpoint = js.native
  var request: ScimProvisionAndInviteUserRequestOptions = js.native
  var response: OctokitResponse[ScimProvisionAndInviteUserResponseData] = js.native
}

object ParametersScimProvisionAndInviteUserEndpoint {
  @scala.inline
  def apply(
    parameters: ScimProvisionAndInviteUserEndpoint,
    request: ScimProvisionAndInviteUserRequestOptions,
    response: OctokitResponse[ScimProvisionAndInviteUserResponseData]
  ): ParametersScimProvisionAndInviteUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimProvisionAndInviteUserEndpoint]
  }
  @scala.inline
  implicit class ParametersScimProvisionAndInviteUserEndpointOps[Self <: ParametersScimProvisionAndInviteUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ScimProvisionAndInviteUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ScimProvisionAndInviteUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ScimProvisionAndInviteUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

