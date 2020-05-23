package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListCollaboratorsEndpoint
import typings.octokitTypes.endpointsMod.ReposListCollaboratorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListCollaboratorsEndpoint extends js.Object {
  var parameters: ReposListCollaboratorsEndpoint
  var response: OctokitResponse[ReposListCollaboratorsResponseData]
}

object ParametersReposListCollaboratorsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListCollaboratorsEndpoint,
    response: OctokitResponse[ReposListCollaboratorsResponseData]
  ): ParametersReposListCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCollaboratorsEndpoint]
  }
}

