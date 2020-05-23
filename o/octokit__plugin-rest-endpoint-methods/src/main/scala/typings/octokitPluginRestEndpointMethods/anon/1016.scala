package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.SearchCommitsEndpoint
import typings.octokitTypes.endpointsMod.SearchCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1016` extends js.Object {
  var parameters: RequestParameters with (Omit[SearchCommitsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[SearchCommitsResponseData]
}

object `1016` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[SearchCommitsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[SearchCommitsResponseData]
  ): `1016` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1016`]
  }
}

