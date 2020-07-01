package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesSetLabelsEndpoint
import typings.octokitTypes.endpointsMod.IssuesSetLabelsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `732` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesSetLabelsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesSetLabelsResponseData]
}

object `732` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesSetLabelsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesSetLabelsResponseData]
  ): `732` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`732`]
  }
}

