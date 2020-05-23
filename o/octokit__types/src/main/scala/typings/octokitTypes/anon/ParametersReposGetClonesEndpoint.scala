package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetClonesEndpoint
import typings.octokitTypes.endpointsMod.ReposGetClonesRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetClonesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetClonesEndpoint extends js.Object {
  var parameters: ReposGetClonesEndpoint
  var request: ReposGetClonesRequestOptions
  var response: OctokitResponse[ReposGetClonesResponseData]
}

object ParametersReposGetClonesEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetClonesEndpoint,
    request: ReposGetClonesRequestOptions,
    response: OctokitResponse[ReposGetClonesResponseData]
  ): ParametersReposGetClonesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetClonesEndpoint]
  }
}

