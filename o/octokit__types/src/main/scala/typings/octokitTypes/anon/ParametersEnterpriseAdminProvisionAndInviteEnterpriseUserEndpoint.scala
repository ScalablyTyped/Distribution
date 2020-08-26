package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseUserRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint extends js.Object {
  var parameters: EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint = js.native
  var request: EnterpriseAdminProvisionAndInviteEnterpriseUserRequestOptions = js.native
  var response: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseUserResponseData] = js.native
}

object ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint {
  @scala.inline
  def apply(
    parameters: EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint,
    request: EnterpriseAdminProvisionAndInviteEnterpriseUserRequestOptions,
    response: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseUserResponseData]
  ): ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint]
  }
  @scala.inline
  implicit class ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpointOps[Self <: ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: EnterpriseAdminProvisionAndInviteEnterpriseUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

