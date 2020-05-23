package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposEnablePagesSiteEndpoint
import typings.octokitTypes.endpointsMod.ReposEnablePagesSiteRequestOptions
import typings.octokitTypes.endpointsMod.ReposEnablePagesSiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposEnablePagesSiteEndpoint extends js.Object {
  var parameters: ReposEnablePagesSiteEndpoint
  var request: ReposEnablePagesSiteRequestOptions
  var response: OctokitResponse[ReposEnablePagesSiteResponseData]
}

object ParametersReposEnablePagesSiteEndpoint {
  @scala.inline
  def apply(
    parameters: ReposEnablePagesSiteEndpoint,
    request: ReposEnablePagesSiteRequestOptions,
    response: OctokitResponse[ReposEnablePagesSiteResponseData]
  ): ParametersReposEnablePagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposEnablePagesSiteEndpoint]
  }
}

