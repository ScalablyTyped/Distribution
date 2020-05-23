package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetCodeFrequencyStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCodeFrequencyStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `920` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetCodeFrequencyStatsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetCodeFrequencyStatsResponseData]
}

object `920` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetCodeFrequencyStatsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCodeFrequencyStatsResponseData]
  ): `920` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`920`]
  }
}

