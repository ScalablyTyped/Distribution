package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitCreateRefEndpoint
import typings.octokitTypes.endpointsMod.GitCreateRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `680` extends js.Object {
  var parameters: RequestParameters with (Omit[GitCreateRefEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[GitCreateRefResponseData]
}

object `680` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitCreateRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitCreateRefResponseData]
  ): `680` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`680`]
  }
}

