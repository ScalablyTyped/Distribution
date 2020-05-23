package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetAllTopicsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAllTopicsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetAllTopicsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetAllTopicsEndpoint extends js.Object {
  var parameters: ReposGetAllTopicsEndpoint
  var request: ReposGetAllTopicsRequestOptions
  var response: OctokitResponse[ReposGetAllTopicsResponseData]
}

object ParametersReposGetAllTopicsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetAllTopicsEndpoint,
    request: ReposGetAllTopicsRequestOptions,
    response: OctokitResponse[ReposGetAllTopicsResponseData]
  ): ParametersReposGetAllTopicsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAllTopicsEndpoint]
  }
}

