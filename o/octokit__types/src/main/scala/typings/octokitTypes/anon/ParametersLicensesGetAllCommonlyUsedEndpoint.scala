package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.LicensesGetAllCommonlyUsedEndpoint
import typings.octokitTypes.endpointsMod.LicensesGetAllCommonlyUsedRequestOptions
import typings.octokitTypes.endpointsMod.LicensesGetAllCommonlyUsedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersLicensesGetAllCommonlyUsedEndpoint extends js.Object {
  var parameters: LicensesGetAllCommonlyUsedEndpoint
  var request: LicensesGetAllCommonlyUsedRequestOptions
  var response: OctokitResponse[LicensesGetAllCommonlyUsedResponseData]
}

object ParametersLicensesGetAllCommonlyUsedEndpoint {
  @scala.inline
  def apply(
    parameters: LicensesGetAllCommonlyUsedEndpoint,
    request: LicensesGetAllCommonlyUsedRequestOptions,
    response: OctokitResponse[LicensesGetAllCommonlyUsedResponseData]
  ): ParametersLicensesGetAllCommonlyUsedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersLicensesGetAllCommonlyUsedEndpoint]
  }
}

