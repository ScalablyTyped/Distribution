package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeletePagesSiteEndpoint
import typings.octokitTypes.endpointsMod.ReposDeletePagesSiteRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeletePagesSiteEndpoint extends js.Object {
  var parameters: ReposDeletePagesSiteEndpoint
  var request: ReposDeletePagesSiteRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDeletePagesSiteEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeletePagesSiteEndpoint,
    request: ReposDeletePagesSiteRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeletePagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeletePagesSiteEndpoint]
  }
}

