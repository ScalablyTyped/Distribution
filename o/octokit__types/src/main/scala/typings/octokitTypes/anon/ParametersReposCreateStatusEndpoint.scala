package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateStatusEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateStatusRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateStatusResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateStatusEndpoint extends js.Object {
  var parameters: ReposCreateStatusEndpoint
  var request: ReposCreateStatusRequestOptions
  var response: OctokitResponse[ReposCreateStatusResponseData]
}

object ParametersReposCreateStatusEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateStatusEndpoint,
    request: ReposCreateStatusRequestOptions,
    response: OctokitResponse[ReposCreateStatusResponseData]
  ): ParametersReposCreateStatusEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateStatusEndpoint]
  }
}

