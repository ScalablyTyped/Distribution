package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesUnlockEndpoint
import typings.octokitTypes.endpointsMod.IssuesUnlockRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesUnlockEndpoint extends js.Object {
  var parameters: IssuesUnlockEndpoint
  var request: IssuesUnlockRequestOptions
  var response: OctokitResponse[_]
}

object ParametersIssuesUnlockEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesUnlockEndpoint,
    request: IssuesUnlockRequestOptions,
    response: OctokitResponse[_]
  ): ParametersIssuesUnlockEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUnlockEndpoint]
  }
}

