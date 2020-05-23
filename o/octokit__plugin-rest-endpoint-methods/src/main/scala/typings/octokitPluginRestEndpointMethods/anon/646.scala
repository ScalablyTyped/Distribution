package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ChecksListForRefEndpoint
import typings.octokitTypes.endpointsMod.ChecksListForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `646` extends js.Object {
  var parameters: RequestParameters with (Omit[ChecksListForRefEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ChecksListForRefResponseData]
}

object `646` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ChecksListForRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksListForRefResponseData]
  ): `646` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`646`]
  }
}

