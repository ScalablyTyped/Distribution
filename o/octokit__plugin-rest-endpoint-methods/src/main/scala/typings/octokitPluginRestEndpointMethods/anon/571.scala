package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `571` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsListSelectedReposForOrgSecretEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData]
}

object `571` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsListSelectedReposForOrgSecretEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData]
  ): `571` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`571`]
  }
}

