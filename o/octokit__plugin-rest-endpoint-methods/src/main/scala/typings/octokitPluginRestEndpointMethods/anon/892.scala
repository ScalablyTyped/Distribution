package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `892` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposCreateInOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposCreateInOrgResponseData]
}

object `892` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateInOrgResponseData]
  ): `892` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`892`]
  }
}

