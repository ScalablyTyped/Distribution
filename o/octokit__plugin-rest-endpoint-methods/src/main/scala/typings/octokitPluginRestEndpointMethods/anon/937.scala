package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetParticipationStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetParticipationStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `937` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetParticipationStatsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetParticipationStatsResponseData]
}

object `937` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetParticipationStatsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetParticipationStatsResponseData]
  ): `937` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`937`]
  }
}

