package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitUpdateRefEndpoint
import typings.octokitTypes.endpointsMod.GitUpdateRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `690` extends js.Object {
  var parameters: RequestParameters with (Omit[GitUpdateRefEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[GitUpdateRefResponseData]
}

object `690` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitUpdateRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitUpdateRefResponseData]
  ): `690` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`690`]
  }
}

