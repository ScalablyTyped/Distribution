package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowUsageEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowUsageResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `562` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsGetWorkflowUsageEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActionsGetWorkflowUsageResponseData]
}

object `562` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetWorkflowUsageEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetWorkflowUsageResponseData]
  ): `562` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`562`]
  }
}

