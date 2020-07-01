package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateCommitStatusEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateCommitStatusRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateCommitStatusResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateCommitStatusEndpoint extends js.Object {
  var parameters: ReposCreateCommitStatusEndpoint
  var request: ReposCreateCommitStatusRequestOptions
  var response: OctokitResponse[ReposCreateCommitStatusResponseData]
}

object ParametersReposCreateCommitStatusEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateCommitStatusEndpoint,
    request: ReposCreateCommitStatusRequestOptions,
    response: OctokitResponse[ReposCreateCommitStatusResponseData]
  ): ParametersReposCreateCommitStatusEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateCommitStatusEndpoint]
  }
}

