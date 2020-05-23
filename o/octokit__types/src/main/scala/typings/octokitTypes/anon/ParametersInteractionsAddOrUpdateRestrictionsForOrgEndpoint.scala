package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsAddOrUpdateRestrictionsForOrgEndpoint
import typings.octokitTypes.endpointsMod.InteractionsAddOrUpdateRestrictionsForOrgRequestOptions
import typings.octokitTypes.endpointsMod.InteractionsAddOrUpdateRestrictionsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersInteractionsAddOrUpdateRestrictionsForOrgEndpoint extends js.Object {
  var parameters: InteractionsAddOrUpdateRestrictionsForOrgEndpoint
  var request: InteractionsAddOrUpdateRestrictionsForOrgRequestOptions
  var response: OctokitResponse[InteractionsAddOrUpdateRestrictionsForOrgResponseData]
}

object ParametersInteractionsAddOrUpdateRestrictionsForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: InteractionsAddOrUpdateRestrictionsForOrgEndpoint,
    request: InteractionsAddOrUpdateRestrictionsForOrgRequestOptions,
    response: OctokitResponse[InteractionsAddOrUpdateRestrictionsForOrgResponseData]
  ): ParametersInteractionsAddOrUpdateRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsAddOrUpdateRestrictionsForOrgEndpoint]
  }
}

