package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `565` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsListJobsForWorkflowRunEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData]
}

object `565` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsListJobsForWorkflowRunEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData]
  ): `565` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`565`]
  }
}

