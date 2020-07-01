package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreatePagesSiteEndpoint
import typings.octokitTypes.endpointsMod.ReposCreatePagesSiteRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreatePagesSiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreatePagesSiteEndpoint extends js.Object {
  var parameters: ReposCreatePagesSiteEndpoint
  var request: ReposCreatePagesSiteRequestOptions
  var response: OctokitResponse[ReposCreatePagesSiteResponseData]
}

object ParametersReposCreatePagesSiteEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreatePagesSiteEndpoint,
    request: ReposCreatePagesSiteRequestOptions,
    response: OctokitResponse[ReposCreatePagesSiteResponseData]
  ): ParametersReposCreatePagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreatePagesSiteEndpoint]
  }
}

