package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.GitignoreListTemplatesEndpoint
import typings.octokitTypes.endpointsMod.GitignoreListTemplatesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGitignoreListTemplatesEndpoint extends js.Object {
  var parameters: GitignoreListTemplatesEndpoint
  var response: OctokitResponse[GitignoreListTemplatesResponseData]
}

object ParametersGitignoreListTemplatesEndpoint {
  @scala.inline
  def apply(
    parameters: GitignoreListTemplatesEndpoint,
    response: OctokitResponse[GitignoreListTemplatesResponseData]
  ): ParametersGitignoreListTemplatesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitignoreListTemplatesEndpoint]
  }
}

