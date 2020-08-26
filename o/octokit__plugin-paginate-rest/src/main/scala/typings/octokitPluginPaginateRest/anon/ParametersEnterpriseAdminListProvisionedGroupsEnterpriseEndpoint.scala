package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminListProvisionedGroupsEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint extends js.Object {
  var parameters: EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint = js.native
  var response: OctokitResponse[EnterpriseAdminListProvisionedGroupsEnterpriseResponseData] with `12` = js.native
}

object ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint {
  @scala.inline
  def apply(
    parameters: EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint,
    response: OctokitResponse[EnterpriseAdminListProvisionedGroupsEnterpriseResponseData] with `12`
  ): ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint]
  }
  @scala.inline
  implicit class ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpointOps[Self <: ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: EnterpriseAdminListProvisionedGroupsEnterpriseEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminListProvisionedGroupsEnterpriseResponseData] with `12`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

