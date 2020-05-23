package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodeScanningGetAlertEndpoint
import typings.octokitTypes.endpointsMod.CodeScanningGetAlertRequestOptions
import typings.octokitTypes.endpointsMod.CodeScanningGetAlertResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersCodeScanningGetAlertEndpoint extends js.Object {
  var parameters: CodeScanningGetAlertEndpoint
  var request: CodeScanningGetAlertRequestOptions
  var response: OctokitResponse[CodeScanningGetAlertResponseData]
}

object ParametersCodeScanningGetAlertEndpoint {
  @scala.inline
  def apply(
    parameters: CodeScanningGetAlertEndpoint,
    request: CodeScanningGetAlertRequestOptions,
    response: OctokitResponse[CodeScanningGetAlertResponseData]
  ): ParametersCodeScanningGetAlertEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodeScanningGetAlertEndpoint]
  }
}

