package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListDeploymentsEndpoint
import typings.octokitTypes.endpointsMod.ReposListDeploymentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `973` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposListDeploymentsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposListDeploymentsResponseData]
}

object `973` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListDeploymentsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListDeploymentsResponseData]
  ): `973` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`973`]
  }
}

