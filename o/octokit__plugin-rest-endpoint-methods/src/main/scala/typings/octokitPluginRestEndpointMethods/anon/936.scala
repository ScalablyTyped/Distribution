package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetCommunityProfileMetricsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommunityProfileMetricsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `936` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetCommunityProfileMetricsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetCommunityProfileMetricsResponseData]
}

object `936` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetCommunityProfileMetricsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCommunityProfileMetricsResponseData]
  ): `936` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`936`]
  }
}

