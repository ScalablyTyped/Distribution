package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsGetArtifactEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetArtifactResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `551` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsGetArtifactEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActionsGetArtifactResponseData]
}

object `551` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetArtifactEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetArtifactResponseData]
  ): `551` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`551`]
  }
}

