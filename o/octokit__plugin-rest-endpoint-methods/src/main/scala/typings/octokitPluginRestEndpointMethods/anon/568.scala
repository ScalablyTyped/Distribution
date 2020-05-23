package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowRunsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowRunsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `568` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsListRepoWorkflowRunsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActionsListRepoWorkflowRunsResponseData]
}

object `568` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsListRepoWorkflowRunsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListRepoWorkflowRunsResponseData]
  ): `568` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`568`]
  }
}

