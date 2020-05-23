package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `923` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetCommitEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetCommitResponseData]
}

object `923` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetCommitEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCommitResponseData]
  ): `923` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`923`]
  }
}

