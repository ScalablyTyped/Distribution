package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForRepoEndpoint
import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersInteractionsGetRestrictionsForRepoEndpoint extends js.Object {
  var parameters: InteractionsGetRestrictionsForRepoEndpoint
  var request: InteractionsGetRestrictionsForRepoRequestOptions
  var response: OctokitResponse[InteractionsGetRestrictionsForRepoResponseData]
}

object ParametersInteractionsGetRestrictionsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: InteractionsGetRestrictionsForRepoEndpoint,
    request: InteractionsGetRestrictionsForRepoRequestOptions,
    response: OctokitResponse[InteractionsGetRestrictionsForRepoResponseData]
  ): ParametersInteractionsGetRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsGetRestrictionsForRepoEndpoint]
  }
}

