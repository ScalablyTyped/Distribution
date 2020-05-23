package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListOutsideCollaboratorsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListOutsideCollaboratorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListOutsideCollaboratorsEndpoint extends js.Object {
  var parameters: OrgsListOutsideCollaboratorsEndpoint
  var response: OctokitResponse[OrgsListOutsideCollaboratorsResponseData]
}

object ParametersOrgsListOutsideCollaboratorsEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListOutsideCollaboratorsEndpoint,
    response: OctokitResponse[OrgsListOutsideCollaboratorsResponseData]
  ): ParametersOrgsListOutsideCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListOutsideCollaboratorsEndpoint]
  }
}

