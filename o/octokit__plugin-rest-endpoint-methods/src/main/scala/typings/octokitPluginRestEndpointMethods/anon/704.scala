package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesCreateLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesCreateLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `704` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesCreateLabelEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesCreateLabelResponseData]
}

object `704` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesCreateLabelEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesCreateLabelResponseData]
  ): `704` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`704`]
  }
}

