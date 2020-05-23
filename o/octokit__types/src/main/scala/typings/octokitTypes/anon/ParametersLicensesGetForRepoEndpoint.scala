package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.LicensesGetForRepoEndpoint
import typings.octokitTypes.endpointsMod.LicensesGetForRepoRequestOptions
import typings.octokitTypes.endpointsMod.LicensesGetForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersLicensesGetForRepoEndpoint extends js.Object {
  var parameters: LicensesGetForRepoEndpoint
  var request: LicensesGetForRepoRequestOptions
  var response: OctokitResponse[LicensesGetForRepoResponseData]
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
}

