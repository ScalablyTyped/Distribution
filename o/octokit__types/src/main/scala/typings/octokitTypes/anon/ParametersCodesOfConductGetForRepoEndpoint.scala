package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodesOfConductGetForRepoEndpoint
import typings.octokitTypes.endpointsMod.CodesOfConductGetForRepoRequestOptions
import typings.octokitTypes.endpointsMod.CodesOfConductGetForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersCodesOfConductGetForRepoEndpoint extends js.Object {
  var parameters: CodesOfConductGetForRepoEndpoint
  var request: CodesOfConductGetForRepoRequestOptions
  var response: OctokitResponse[CodesOfConductGetForRepoResponseData]
}

object ParametersCodesOfConductGetForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: CodesOfConductGetForRepoEndpoint,
    request: CodesOfConductGetForRepoRequestOptions,
    response: OctokitResponse[CodesOfConductGetForRepoResponseData]
  ): ParametersCodesOfConductGetForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodesOfConductGetForRepoEndpoint]
  }
}

