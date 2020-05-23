package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForOrgEndpoint
import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForOrgRequestOptions
import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersInteractionsGetRestrictionsForOrgEndpoint extends js.Object {
  var parameters: InteractionsGetRestrictionsForOrgEndpoint
  var request: InteractionsGetRestrictionsForOrgRequestOptions
  var response: OctokitResponse[InteractionsGetRestrictionsForOrgResponseData]
}

object ParametersInteractionsGetRestrictionsForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: InteractionsGetRestrictionsForOrgEndpoint,
    request: InteractionsGetRestrictionsForOrgRequestOptions,
    response: OctokitResponse[InteractionsGetRestrictionsForOrgResponseData]
  ): ParametersInteractionsGetRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsGetRestrictionsForOrgEndpoint]
  }
}

