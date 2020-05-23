package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposAddDeployKeyEndpoint
import typings.octokitTypes.endpointsMod.ReposAddDeployKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `875` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposAddDeployKeyEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposAddDeployKeyResponseData]
}

object `875` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposAddDeployKeyEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposAddDeployKeyResponseData]
  ): `875` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`875`]
  }
}

