package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.LicensesGetForRepoEndpoint
import typings.octokitTypes.endpointsMod.LicensesGetForRepoRequestOptions
import typings.octokitTypes.endpointsMod.LicensesGetForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersLicensesGetForRepoEndpoint extends js.Object {
  var parameters: LicensesGetForRepoEndpoint = js.native
  var request: LicensesGetForRepoRequestOptions = js.native
  var response: OctokitResponse[LicensesGetForRepoResponseData] = js.native
}

object ParametersLicensesGetForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: LicensesGetForRepoEndpoint,
    request: LicensesGetForRepoRequestOptions,
    response: OctokitResponse[LicensesGetForRepoResponseData]
  ): ParametersLicensesGetForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersLicensesGetForRepoEndpoint]
  }
  @scala.inline
  implicit class ParametersLicensesGetForRepoEndpointOps[Self <: ParametersLicensesGetForRepoEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: LicensesGetForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: LicensesGetForRepoRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[LicensesGetForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

