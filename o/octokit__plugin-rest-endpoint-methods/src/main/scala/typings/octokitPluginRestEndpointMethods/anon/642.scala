package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ChecksCreateSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksCreateSuiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `642` extends js.Object {
  var parameters: RequestParameters with (Omit[ChecksCreateSuiteEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ChecksCreateSuiteResponseData]
}

object `642` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ChecksCreateSuiteEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksCreateSuiteResponseData]
  ): `642` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`642`]
  }
}

