package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListLanguagesEndpoint
import typings.octokitTypes.endpointsMod.ReposListLanguagesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListLanguagesEndpoint extends js.Object {
  var parameters: ReposListLanguagesEndpoint
  var response: OctokitResponse[ReposListLanguagesResponseData]
}

object ParametersReposListLanguagesEndpoint {
  @scala.inline
  def apply(parameters: ReposListLanguagesEndpoint, response: OctokitResponse[ReposListLanguagesResponseData]): ParametersReposListLanguagesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListLanguagesEndpoint]
  }
}

