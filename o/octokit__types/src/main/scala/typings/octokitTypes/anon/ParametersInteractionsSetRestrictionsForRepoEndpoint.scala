package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForRepoEndpoint
import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersInteractionsSetRestrictionsForRepoEndpoint extends js.Object {
  var parameters: InteractionsSetRestrictionsForRepoEndpoint
  var request: InteractionsSetRestrictionsForRepoRequestOptions
  var response: OctokitResponse[InteractionsSetRestrictionsForRepoResponseData]
}

object ParametersInteractionsSetRestrictionsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: InteractionsSetRestrictionsForRepoEndpoint,
    request: InteractionsSetRestrictionsForRepoRequestOptions,
    response: OctokitResponse[InteractionsSetRestrictionsForRepoResponseData]
  ): ParametersInteractionsSetRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsSetRestrictionsForRepoEndpoint]
  }
}

