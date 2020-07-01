package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposDeleteFileEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteFileResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `908` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposDeleteFileEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposDeleteFileResponseData]
}

object `908` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposDeleteFileEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposDeleteFileResponseData]
  ): `908` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`908`]
  }
}

