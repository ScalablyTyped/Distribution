package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCreateEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateRequestOptions
import typings.octokitTypes.endpointsMod.PullsCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsCreateEndpoint extends js.Object {
  var parameters: PullsCreateEndpoint
  var request: PullsCreateRequestOptions
  var response: OctokitResponse[PullsCreateResponseData]
}

object ParametersPullsCreateEndpoint {
  @scala.inline
  def apply(
    parameters: PullsCreateEndpoint,
    request: PullsCreateRequestOptions,
    response: OctokitResponse[PullsCreateResponseData]
  ): ParametersPullsCreateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCreateEndpoint]
  }
}

