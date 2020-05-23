package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitCreateTreeEndpoint
import typings.octokitTypes.endpointsMod.GitCreateTreeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `682` extends js.Object {
  var parameters: RequestParameters with (Omit[GitCreateTreeEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[GitCreateTreeResponseData]
}

object `682` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitCreateTreeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitCreateTreeResponseData]
  ): `682` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`682`]
  }
}

