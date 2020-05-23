package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveDeployKeyEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveDeployKeyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveDeployKeyEndpoint extends js.Object {
  var parameters: ReposRemoveDeployKeyEndpoint
  var request: ReposRemoveDeployKeyRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposRemoveDeployKeyEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveDeployKeyEndpoint,
    request: ReposRemoveDeployKeyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposRemoveDeployKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveDeployKeyEndpoint]
  }
}

