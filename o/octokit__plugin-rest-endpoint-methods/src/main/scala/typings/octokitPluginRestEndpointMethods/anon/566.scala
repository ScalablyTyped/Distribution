package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `566` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsListOrgSecretsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActionsListOrgSecretsResponseData]
}

object `566` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsListOrgSecretsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListOrgSecretsResponseData]
  ): `566` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`566`]
  }
}

