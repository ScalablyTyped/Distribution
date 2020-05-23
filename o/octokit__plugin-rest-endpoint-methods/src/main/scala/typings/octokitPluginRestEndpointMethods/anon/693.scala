package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.InteractionsAddOrUpdateRestrictionsForOrgEndpoint
import typings.octokitTypes.endpointsMod.InteractionsAddOrUpdateRestrictionsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `693` extends js.Object {
  var parameters: RequestParameters with (Omit[InteractionsAddOrUpdateRestrictionsForOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[InteractionsAddOrUpdateRestrictionsForOrgResponseData]
}

object `693` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[InteractionsAddOrUpdateRestrictionsForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[InteractionsAddOrUpdateRestrictionsForOrgResponseData]
  ): `693` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`693`]
  }
}

