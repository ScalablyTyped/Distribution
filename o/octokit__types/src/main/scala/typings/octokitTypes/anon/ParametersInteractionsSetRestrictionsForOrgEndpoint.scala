package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForOrgEndpoint
import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForOrgRequestOptions
import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersInteractionsSetRestrictionsForOrgEndpoint extends js.Object {
  var parameters: InteractionsSetRestrictionsForOrgEndpoint
  var request: InteractionsSetRestrictionsForOrgRequestOptions
  var response: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData]
}

object ParametersInteractionsSetRestrictionsForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: InteractionsSetRestrictionsForOrgEndpoint,
    request: InteractionsSetRestrictionsForOrgRequestOptions,
    response: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData]
  ): ParametersInteractionsSetRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsSetRestrictionsForOrgEndpoint]
  }
}

