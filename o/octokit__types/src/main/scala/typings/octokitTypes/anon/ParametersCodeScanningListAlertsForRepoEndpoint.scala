package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodeScanningListAlertsForRepoEndpoint
import typings.octokitTypes.endpointsMod.CodeScanningListAlertsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.CodeScanningListAlertsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersCodeScanningListAlertsForRepoEndpoint extends js.Object {
  var parameters: CodeScanningListAlertsForRepoEndpoint
  var request: CodeScanningListAlertsForRepoRequestOptions
  var response: OctokitResponse[CodeScanningListAlertsForRepoResponseData]
}

object ParametersCodeScanningListAlertsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: CodeScanningListAlertsForRepoEndpoint,
    request: CodeScanningListAlertsForRepoRequestOptions,
    response: OctokitResponse[CodeScanningListAlertsForRepoResponseData]
  ): ParametersCodeScanningListAlertsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodeScanningListAlertsForRepoEndpoint]
  }
}

