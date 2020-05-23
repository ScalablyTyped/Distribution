package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateUsingTemplateEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateUsingTemplateRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateUsingTemplateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateUsingTemplateEndpoint extends js.Object {
  var parameters: ReposCreateUsingTemplateEndpoint
  var request: ReposCreateUsingTemplateRequestOptions
  var response: OctokitResponse[ReposCreateUsingTemplateResponseData]
}

object ParametersReposCreateUsingTemplateEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateUsingTemplateEndpoint,
    request: ReposCreateUsingTemplateRequestOptions,
    response: OctokitResponse[ReposCreateUsingTemplateResponseData]
  ): ParametersReposCreateUsingTemplateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateUsingTemplateEndpoint]
  }
}

