package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsResponse201Data
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `894` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposCreateOrUpdateFileContentsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[
    ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
  ]
}

object `894` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateOrUpdateFileContentsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[
      ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
    ]
  ): `894` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`894`]
  }
}

