package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `560` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsGetWorkflowRunEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActionsGetWorkflowRunResponseData]
}

object `560` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetWorkflowRunEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetWorkflowRunResponseData]
  ): `560` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`560`]
  }
}

