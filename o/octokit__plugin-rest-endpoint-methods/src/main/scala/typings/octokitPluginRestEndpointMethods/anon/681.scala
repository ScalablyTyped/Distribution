package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitCreateTagEndpoint
import typings.octokitTypes.endpointsMod.GitCreateTagResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `681` extends js.Object {
  var parameters: RequestParameters with (Omit[GitCreateTagEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[GitCreateTagResponseData]
}

object `681` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitCreateTagEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitCreateTagResponseData]
  ): `681` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`681`]
  }
}

