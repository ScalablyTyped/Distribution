package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateInOrgRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateInOrgEndpoint extends js.Object {
  var parameters: ReposCreateInOrgEndpoint
  var request: ReposCreateInOrgRequestOptions
  var response: OctokitResponse[ReposCreateInOrgResponseData]
}

object ParametersReposCreateInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateInOrgEndpoint,
    request: ReposCreateInOrgRequestOptions,
    response: OctokitResponse[ReposCreateInOrgResponseData]
  ): ParametersReposCreateInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateInOrgEndpoint]
  }
}

