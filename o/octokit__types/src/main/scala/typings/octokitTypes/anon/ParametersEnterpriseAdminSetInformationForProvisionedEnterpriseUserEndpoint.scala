package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminSetInformationForProvisionedEnterpriseUserRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint extends js.Object {
  var parameters: EnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint = js.native
  var request: EnterpriseAdminSetInformationForProvisionedEnterpriseUserRequestOptions = js.native
  var response: OctokitResponse[EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData] = js.native
}

object ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint {
  @scala.inline
  def apply(
    parameters: EnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint,
    request: EnterpriseAdminSetInformationForProvisionedEnterpriseUserRequestOptions,
    response: OctokitResponse[EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData]
  ): ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint]
  }
  @scala.inline
  implicit class ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpointOps[Self <: ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: EnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: EnterpriseAdminSetInformationForProvisionedEnterpriseUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

