package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetDeploymentStatusEndpoint
import typings.octokitTypes.endpointsMod.ReposGetDeploymentStatusResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `941` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetDeploymentStatusEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetDeploymentStatusResponseData]
}

object `941` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetDeploymentStatusEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetDeploymentStatusResponseData]
  ): `941` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`941`]
  }
}

