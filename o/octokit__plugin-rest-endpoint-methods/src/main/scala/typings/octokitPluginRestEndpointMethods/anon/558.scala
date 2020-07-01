package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `558` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsGetSelfHostedRunnerForOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActionsGetSelfHostedRunnerForOrgResponseData]
}

object `558` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetSelfHostedRunnerForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetSelfHostedRunnerForOrgResponseData]
  ): `558` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`558`]
  }
}

