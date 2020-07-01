package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposDeleteEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `899` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposDeleteEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposDeleteResponseData]
}

object `899` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposDeleteEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposDeleteResponseData]
  ): `899` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`899`]
  }
}

