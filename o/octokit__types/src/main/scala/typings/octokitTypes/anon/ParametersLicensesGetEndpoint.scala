package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.LicensesGetEndpoint
import typings.octokitTypes.endpointsMod.LicensesGetRequestOptions
import typings.octokitTypes.endpointsMod.LicensesGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersLicensesGetEndpoint extends js.Object {
  var parameters: LicensesGetEndpoint
  var request: LicensesGetRequestOptions
  var response: OctokitResponse[LicensesGetResponseData]
}

object ParametersLicensesGetEndpoint {
  @scala.inline
  def apply(
    parameters: LicensesGetEndpoint,
    request: LicensesGetRequestOptions,
    response: OctokitResponse[LicensesGetResponseData]
  ): ParametersLicensesGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersLicensesGetEndpoint]
  }
}

