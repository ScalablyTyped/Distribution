package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivityListReposWatchedByUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReposWatchedByUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `600` extends js.Object {
  var parameters: RequestParameters with (Omit[ActivityListReposWatchedByUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActivityListReposWatchedByUserResponseData]
}

object `600` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActivityListReposWatchedByUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActivityListReposWatchedByUserResponseData]
  ): `600` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`600`]
  }
}

