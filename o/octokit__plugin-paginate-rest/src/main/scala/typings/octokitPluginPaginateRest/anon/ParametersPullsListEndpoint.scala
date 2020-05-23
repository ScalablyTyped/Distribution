package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListEndpoint
import typings.octokitTypes.endpointsMod.PullsListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsListEndpoint extends js.Object {
  var parameters: PullsListEndpoint
  var response: OctokitResponse[PullsListResponseData]
}

object ParametersPullsListEndpoint {
  @scala.inline
  def apply(parameters: PullsListEndpoint, response: OctokitResponse[PullsListResponseData]): ParametersPullsListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListEndpoint]
  }
}

