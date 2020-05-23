package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GistsListForksEndpoint
import typings.octokitTypes.endpointsMod.GistsListForksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `671` extends js.Object {
  var parameters: RequestParameters with (Omit[GistsListForksEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[GistsListForksResponseData]
}

object `671` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsListForksEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsListForksResponseData]
  ): `671` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`671`]
  }
}

