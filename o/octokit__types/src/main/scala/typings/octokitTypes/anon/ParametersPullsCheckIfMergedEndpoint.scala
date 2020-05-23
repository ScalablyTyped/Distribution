package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCheckIfMergedEndpoint
import typings.octokitTypes.endpointsMod.PullsCheckIfMergedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsCheckIfMergedEndpoint extends js.Object {
  var parameters: PullsCheckIfMergedEndpoint
  var request: PullsCheckIfMergedRequestOptions
  var response: OctokitResponse[_]
}

object ParametersPullsCheckIfMergedEndpoint {
  @scala.inline
  def apply(
    parameters: PullsCheckIfMergedEndpoint,
    request: PullsCheckIfMergedRequestOptions,
    response: OctokitResponse[_]
  ): ParametersPullsCheckIfMergedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCheckIfMergedEndpoint]
  }
}

