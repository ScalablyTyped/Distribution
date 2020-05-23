package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposReplaceAllTopicsEndpoint
import typings.octokitTypes.endpointsMod.ReposReplaceAllTopicsRequestOptions
import typings.octokitTypes.endpointsMod.ReposReplaceAllTopicsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposReplaceAllTopicsEndpoint extends js.Object {
  var parameters: ReposReplaceAllTopicsEndpoint
  var request: ReposReplaceAllTopicsRequestOptions
  var response: OctokitResponse[ReposReplaceAllTopicsResponseData]
}

object ParametersReposReplaceAllTopicsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposReplaceAllTopicsEndpoint,
    request: ReposReplaceAllTopicsRequestOptions,
    response: OctokitResponse[ReposReplaceAllTopicsResponseData]
  ): ParametersReposReplaceAllTopicsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposReplaceAllTopicsEndpoint]
  }
}

