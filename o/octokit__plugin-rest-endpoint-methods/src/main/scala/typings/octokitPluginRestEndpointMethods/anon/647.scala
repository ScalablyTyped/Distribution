package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ChecksListForSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksListForSuiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `647` extends js.Object {
  var parameters: RequestParameters with (Omit[ChecksListForSuiteEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ChecksListForSuiteResponseData]
}

object `647` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ChecksListForSuiteEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksListForSuiteResponseData]
  ): `647` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`647`]
  }
}

