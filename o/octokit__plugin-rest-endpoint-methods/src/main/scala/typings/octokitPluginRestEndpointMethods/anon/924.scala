package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetCommitActivityStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommitActivityStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `924` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetCommitActivityStatsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetCommitActivityStatsResponseData]
}

object `924` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetCommitActivityStatsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCommitActivityStatsResponseData]
  ): `924` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`924`]
  }
}

