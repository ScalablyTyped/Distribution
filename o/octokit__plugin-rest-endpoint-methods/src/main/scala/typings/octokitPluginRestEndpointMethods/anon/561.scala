package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunUsageEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunUsageResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `561` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsGetWorkflowRunUsageEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActionsGetWorkflowRunUsageResponseData]
}

object `561` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetWorkflowRunUsageEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetWorkflowRunUsageResponseData]
  ): `561` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`561`]
  }
}

