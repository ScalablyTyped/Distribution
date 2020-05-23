package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ChecksGetSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksGetSuiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `644` extends js.Object {
  var parameters: RequestParameters with (Omit[ChecksGetSuiteEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ChecksGetSuiteResponseData]
}

object `644` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ChecksGetSuiteEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksGetSuiteResponseData]
  ): `644` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`644`]
  }
}

