package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesLockEndpoint
import typings.octokitTypes.endpointsMod.IssuesLockRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesLockEndpoint extends js.Object {
  var parameters: IssuesLockEndpoint
  var request: IssuesLockRequestOptions
  var response: OctokitResponse[_]
}

object ParametersIssuesLockEndpoint {
  @scala.inline
  def apply(parameters: IssuesLockEndpoint, request: IssuesLockRequestOptions, response: OctokitResponse[_]): ParametersIssuesLockEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesLockEndpoint]
  }
}

