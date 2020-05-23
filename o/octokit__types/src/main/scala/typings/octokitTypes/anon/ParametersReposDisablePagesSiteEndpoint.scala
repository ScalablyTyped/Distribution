package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDisablePagesSiteEndpoint
import typings.octokitTypes.endpointsMod.ReposDisablePagesSiteRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDisablePagesSiteEndpoint extends js.Object {
  var parameters: ReposDisablePagesSiteEndpoint
  var request: ReposDisablePagesSiteRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDisablePagesSiteEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDisablePagesSiteEndpoint,
    request: ReposDisablePagesSiteRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDisablePagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDisablePagesSiteEndpoint]
  }
}

