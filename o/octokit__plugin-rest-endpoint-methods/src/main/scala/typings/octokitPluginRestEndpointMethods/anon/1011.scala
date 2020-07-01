package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposUpdateStatusCheckPotectionEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateStatusCheckPotectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1011` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposUpdateStatusCheckPotectionEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposUpdateStatusCheckPotectionResponseData]
}

object `1011` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposUpdateStatusCheckPotectionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposUpdateStatusCheckPotectionResponseData]
  ): `1011` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1011`]
  }
}

