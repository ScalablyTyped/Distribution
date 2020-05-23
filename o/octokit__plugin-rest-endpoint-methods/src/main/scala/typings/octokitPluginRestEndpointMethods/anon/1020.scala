package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.SearchTopicsEndpoint
import typings.octokitTypes.endpointsMod.SearchTopicsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1020` extends js.Object {
  var parameters: RequestParameters with (Omit[SearchTopicsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[SearchTopicsResponseData]
}

object `1020` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[SearchTopicsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[SearchTopicsResponseData]
  ): `1020` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1020`]
  }
}

