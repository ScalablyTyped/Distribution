package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseGroupRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint extends js.Object {
  var parameters: EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint = js.native
  var request: EnterpriseAdminProvisionAndInviteEnterpriseGroupRequestOptions = js.native
  var response: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData] = js.native
}

object ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint {
  @scala.inline
  def apply(
    parameters: EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint,
    request: EnterpriseAdminProvisionAndInviteEnterpriseGroupRequestOptions,
    response: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData]
  ): ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint]
  }
  @scala.inline
  implicit class ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpointOps[Self <: ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: EnterpriseAdminProvisionAndInviteEnterpriseGroupRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

