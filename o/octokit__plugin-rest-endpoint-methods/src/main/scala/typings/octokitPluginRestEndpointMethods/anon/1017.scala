package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsEndpoint
import typings.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1017` extends js.Object {
  var parameters: RequestParameters with (Omit[SearchIssuesAndPullRequestsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[SearchIssuesAndPullRequestsResponseData]
}

object `1017` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[SearchIssuesAndPullRequestsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[SearchIssuesAndPullRequestsResponseData]
  ): `1017` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1017`]
  }
}

