package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateInformationAboutPagesSiteEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateInformationAboutPagesSiteRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposUpdateInformationAboutPagesSiteEndpoint extends js.Object {
  var parameters: ReposUpdateInformationAboutPagesSiteEndpoint
  var request: ReposUpdateInformationAboutPagesSiteRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposUpdateInformationAboutPagesSiteEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdateInformationAboutPagesSiteEndpoint,
    request: ReposUpdateInformationAboutPagesSiteRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposUpdateInformationAboutPagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateInformationAboutPagesSiteEndpoint]
  }
}

