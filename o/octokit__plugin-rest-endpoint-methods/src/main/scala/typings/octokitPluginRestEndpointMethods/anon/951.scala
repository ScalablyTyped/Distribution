package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetPunchCardStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPunchCardStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `951` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetPunchCardStatsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetPunchCardStatsResponseData]
}

object `951` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetPunchCardStatsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetPunchCardStatsResponseData]
  ): `951` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`951`]
  }
}

