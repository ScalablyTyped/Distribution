package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `559` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsGetWorkflowEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActionsGetWorkflowResponseData]
}

object `559` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetWorkflowEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetWorkflowResponseData]
  ): `559` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`559`]
  }
}

