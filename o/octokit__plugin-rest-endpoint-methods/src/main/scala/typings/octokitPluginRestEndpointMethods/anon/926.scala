package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetContentsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetContentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `926` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetContentsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetContentsResponseData]
}

object `926` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetContentsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetContentsResponseData]
  ): `926` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`926`]
  }
}

