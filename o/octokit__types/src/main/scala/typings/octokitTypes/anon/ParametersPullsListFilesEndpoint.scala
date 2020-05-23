package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsListFilesEndpoint
import typings.octokitTypes.endpointsMod.PullsListFilesRequestOptions
import typings.octokitTypes.endpointsMod.PullsListFilesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsListFilesEndpoint extends js.Object {
  var parameters: PullsListFilesEndpoint
  var request: PullsListFilesRequestOptions
  var response: OctokitResponse[PullsListFilesResponseData]
}

object ParametersPullsListFilesEndpoint {
  @scala.inline
  def apply(
    parameters: PullsListFilesEndpoint,
    request: PullsListFilesRequestOptions,
    response: OctokitResponse[PullsListFilesResponseData]
  ): ParametersPullsListFilesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListFilesEndpoint]
  }
}

