package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetDeploymentEndpoint
import typings.octokitTypes.endpointsMod.ReposGetDeploymentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `929` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetDeploymentEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetDeploymentResponseData]
}

object `929` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetDeploymentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetDeploymentResponseData]
  ): `929` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`929`]
  }
}

