package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `570` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsListRunnerApplicationsForOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActionsListRunnerApplicationsForOrgResponseData]
}

object `570` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsListRunnerApplicationsForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListRunnerApplicationsForOrgResponseData]
  ): `570` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`570`]
  }
}

