package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommitRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetCommitEndpoint extends js.Object {
  var parameters: ReposGetCommitEndpoint
  var request: ReposGetCommitRequestOptions
  var response: OctokitResponse[ReposGetCommitResponseData]
}

object ParametersReposGetCommitEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetCommitEndpoint,
    request: ReposGetCommitRequestOptions,
    response: OctokitResponse[ReposGetCommitResponseData]
  ): ParametersReposGetCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCommitEndpoint]
  }
}

