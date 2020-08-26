package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint extends js.Object {
  var parameters: EnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint = js.native
  var response: OctokitResponse[EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData] with `12` = js.native
}

object ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint {
  @scala.inline
  def apply(
    parameters: EnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint,
    response: OctokitResponse[EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData] with `12`
  ): ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint]
  }
  @scala.inline
  implicit class ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpointOps[Self <: ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: EnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData] with `12`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

