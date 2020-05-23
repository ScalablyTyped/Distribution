package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposTransferEndpoint
import typings.octokitTypes.endpointsMod.ReposTransferRequestOptions
import typings.octokitTypes.endpointsMod.ReposTransferResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposTransferEndpoint extends js.Object {
  var parameters: ReposTransferEndpoint
  var request: ReposTransferRequestOptions
  var response: OctokitResponse[ReposTransferResponseData]
}

object ParametersReposTransferEndpoint {
  @scala.inline
  def apply(
    parameters: ReposTransferEndpoint,
    request: ReposTransferRequestOptions,
    response: OctokitResponse[ReposTransferResponseData]
  ): ParametersReposTransferEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposTransferEndpoint]
  }
}

