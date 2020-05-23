package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.LicensesListCommonlyUsedEndpoint
import typings.octokitTypes.endpointsMod.LicensesListCommonlyUsedRequestOptions
import typings.octokitTypes.endpointsMod.LicensesListCommonlyUsedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersLicensesListCommonlyUsedEndpoint extends js.Object {
  var parameters: LicensesListCommonlyUsedEndpoint
  var request: LicensesListCommonlyUsedRequestOptions
  var response: OctokitResponse[LicensesListCommonlyUsedResponseData]
}

object ParametersLicensesListCommonlyUsedEndpoint {
  @scala.inline
  def apply(
    parameters: LicensesListCommonlyUsedEndpoint,
    request: LicensesListCommonlyUsedRequestOptions,
    response: OctokitResponse[LicensesListCommonlyUsedResponseData]
  ): ParametersLicensesListCommonlyUsedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersLicensesListCommonlyUsedEndpoint]
  }
}

