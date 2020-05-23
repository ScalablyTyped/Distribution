package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsListCommitsEndpoint
import typings.octokitTypes.endpointsMod.PullsListCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `843` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsListCommitsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsListCommitsResponseData]
}

object `843` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsListCommitsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListCommitsResponseData]
  ): `843` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`843`]
  }
}

