package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetDeployKeyEndpoint
import typings.octokitTypes.endpointsMod.ReposGetDeployKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `928` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetDeployKeyEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetDeployKeyResponseData]
}

object `928` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetDeployKeyEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetDeployKeyResponseData]
  ): `928` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`928`]
  }
}

