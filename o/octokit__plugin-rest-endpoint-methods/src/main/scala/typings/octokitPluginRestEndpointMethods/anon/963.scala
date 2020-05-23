package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListDeploymentStatusesEndpoint
import typings.octokitTypes.endpointsMod.ReposListDeploymentStatusesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `963` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposListDeploymentStatusesEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposListDeploymentStatusesResponseData]
}

object `963` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListDeploymentStatusesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListDeploymentStatusesResponseData]
  ): `963` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`963`]
  }
}

