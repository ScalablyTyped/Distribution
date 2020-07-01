package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitignoreGetAllTemplatesEndpoint
import typings.octokitTypes.endpointsMod.GitignoreGetAllTemplatesRequestOptions
import typings.octokitTypes.endpointsMod.GitignoreGetAllTemplatesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGitignoreGetAllTemplatesEndpoint extends js.Object {
  var parameters: GitignoreGetAllTemplatesEndpoint
  var request: GitignoreGetAllTemplatesRequestOptions
  var response: OctokitResponse[GitignoreGetAllTemplatesResponseData]
}

object ParametersGitignoreGetAllTemplatesEndpoint {
  @scala.inline
  def apply(
    parameters: GitignoreGetAllTemplatesEndpoint,
    request: GitignoreGetAllTemplatesRequestOptions,
    response: OctokitResponse[GitignoreGetAllTemplatesResponseData]
  ): ParametersGitignoreGetAllTemplatesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitignoreGetAllTemplatesEndpoint]
  }
}

